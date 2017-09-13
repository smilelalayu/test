package com.hm.bus.service.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Service;

import com.gep.core.util.OssOpsUtils;
import com.gep.core.util.RedisUtils;
import com.gep.core.util.StringUtil;
import com.hm.bus.constants.BusReturn;
import com.hm.bus.module.BusBatchInfo;
import com.hm.bus.module.BusLnApp;
import com.hm.bus.service.BusBatchService;
import com.hm.bus.service.BusLnAppService;
import com.hm.bus.service.BusSentService;
import com.hm.bus.util.ExportExcel;
import com.hm.bus.util.ListUtil;
import com.hm.bus.util.Sent2RedisRunnable;
import com.hm.bus.util.SentBusRunnable;
import com.hm.model.RPCResult;
import com.hm.model.RpcException;
import com.hm.service.Task4HyperService;

/**
 * @author zhangyankun
 */
@Service("task4HyperService")
public class Task4HyperServiceImpl implements Task4HyperService {
	private static final Logger LOG = Logger.getLogger(Task4HyperServiceImpl.class);
	@Autowired
	private BusLnAppService busLnAppService;
	@Autowired
	private BusBatchService busBatchService;
	@Autowired
	private BusSentService busSentService;
	@Resource
	private ThreadPoolTaskExecutor threadPoolTaskExecutor;

	// 定时现金贷推送
	@Override
	public RPCResult cashSent2Bus() throws RpcException {
		RPCResult rpc = new RPCResult();
		LOG.info("[Task4HyperServiceImpl] exportExcel cashSent2Bus begin...");
		List<String> ids = busLnAppService.listCashAppIds();
		if (ids != null && ids.size() != 0) {
			// 生成excel文件
			File exportExcel = exportExcel(ids);
			// 上传oss,生成批次号
			String batchNO = importBusFile(exportExcel);

			if (batchNO != null) {
				// 推送工单
				threadPoolTaskExecutor.execute(new Sent2RedisRunnable(batchNO) {
					@Override
					public void run() {
						batchImp(this.getBatchNO());
					}
				});
				LOG.info("[Task4HyperServiceImpl] exportExcel cashSent2Bus end...");
				rpc.setStatus(true);
				rpc.setMsg("现金贷工单批次号:" + batchNO + "正常推送!");
			}
		} else {
			rpc.setStatus(false);
			rpc.setMsg("当前无符合条件的现金贷工单!");
		}
		return rpc;

	}

	// 定时生成还款计划
	public RPCResult repaymentPlan() throws RpcException {

		LOG.info("[Task4HyperServiceImpl] repaymentPlan method begin...");
		RPCResult rs = new RPCResult();
		try {
			String BUS_UPDATE_REPAYMENT_PLAN = RedisUtils.getObject("BUS_TASK", "BUS_UPDATE_REPAYMENT_PLAN");
			LOG.info("[Task4HyperServiceImpl] repaymentPlan method BUS_UPDATE_REPAYMENT_PLAN" + BUS_UPDATE_REPAYMENT_PLAN);
			/**
			 * 判断是否任务执行中<br>
			 * 如果没有,异步去执行任务<br>
			 * 如果有,直接跳过
			 */
			if ("false".equals(BUS_UPDATE_REPAYMENT_PLAN) || StringUtil.isBlank(BUS_UPDATE_REPAYMENT_PLAN)) {
				threadPoolTaskExecutor.execute(new Runnable() {
					@Override
					public void run() {
						busSentService.updateRepaymentPlan();
					}
				});
				rs.setStatus(true);
				rs.setMsg("启动生成还款计划任务成功!");
			} else {
				rs.setStatus(false);
				rs.setMsg("正在执行中,请稍等!");
			}

		} catch (Exception e) {
			rs.setStatus(false);
			rs.setMsg("启动确认放款状态任务失败!");
			LOG.error("[Task4HyperServiceImpl] repaymentPlan method 启动生成还款计划任务失败", e);
		}

		LOG.info("[Task4HyperServiceImpl] repaymentPlan method end");
		return rs;
	}

	// 确认放款状态及生成还款计划任务 32->50->isRepaymentSuccess
	@Override
	public RPCResult loanAndRepaymentConfirm() throws RpcException {
		LOG.info("[Task4HyperServiceImpl] LoanAndRepaymentConfirm method begin...");
		RPCResult rs = new RPCResult();
		try {

			String BUS_LOAN_CONFIRM = RedisUtils.getObject("BUS_TASK", "BUS_LOAN_CONFIRM");
			String BUS_UPDATE_REPAYMENT_PLAN = RedisUtils.getObject("BUS_TASK", "BUS_UPDATE_REPAYMENT_PLAN");
			LOG.info("[Task4HyperServiceImpl] LoanAndRepaymentConfirm method BUS_LOAN_CONFIRM:" + BUS_LOAN_CONFIRM + " ,BUS_UPDATE_REPAYMENT_PLAN" + BUS_UPDATE_REPAYMENT_PLAN);
			/**
			 * 判断是否任务执行中<br>
			 * 如果没有,异步去执行任务<br>
			 * 如果有,直接跳过
			 */
			if (!"true".equals(BUS_LOAN_CONFIRM) && !"true".equals(BUS_UPDATE_REPAYMENT_PLAN)) {

				threadPoolTaskExecutor.execute(new Runnable() {
					@Override
					public void run() {
						busSentService.loanConfirmTask();
						busSentService.updateRepaymentPlan();
					}
				});
				rs.setStatus(true);
				rs.setMsg("启动确认放款状态及任务成功!");


			} else {
				rs.setStatus(false);
				rs.setMsg("正在执行中,请稍等!");
			}
		} catch (Exception e) {
			rs.setStatus(false);
			rs.setMsg("启动确认放款状态任务失败!");
			LOG.error("[Task4HyperServiceImpl] LoanConfirm method 启动确认放款状态任务失败", e);
		}

		LOG.info("[Task4HyperServiceImpl] LoanConfirm method end");
		return rs;
	}

	// 生成excel
	public File exportExcel(List<String> ids) {
		LOG.info("[Task4HyperServiceImpl] exportExcel method begin...");
		// if (ids != null && ids.size() != 0) {
		Date date = new Date();
		DateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
		String dayTime = format.format(date);
		String expFileUrl = ExportExcel.class.getResource("/").getPath();
		String key = "现金贷定时" + dayTime + ".xlsx";
		String path = expFileUrl + key;
		SXSSFWorkbook wb = null;
		LOG.info("[Task4HyperServiceImpl] exportExcel method 待导出现金贷待推工单表笔数为" + ids.size());
		File file = null;
		// 新建工作本
		FileOutputStream output = null;
		try {
			file = new File(path);
			if (!file.exists()) {
				try {
					file.createNewFile();
				} catch (IOException e) {
					e.printStackTrace();
					LOG.error("[Task4HyperServiceImpl] exportExcel method 创建" + path + "失败");
					LOG.error("[Task4HyperServiceImpl] exportExcel method 异常" + e.getMessage());
				}
				output = new FileOutputStream(new File(path));

				// 读取的文件路径
				wb = new SXSSFWorkbook(10000);// 内存中保留 10000
												// 条数据，以免内存溢出，其余写入 硬盘

				Sheet sheet = wb.createSheet("待推现金贷" + dayTime);
				// Cell cell = row.createCell(i);
				for (int i = 0; i < ids.size(); i++) {
					Row row = sheet.createRow(i);
					Cell cell = row.createCell(0);
					cell.setCellType(XSSFCell.CELL_TYPE_STRING);// 文本格式
					sheet.setColumnWidth(i, 20 * 256); // 设置单元格宽度
					cell.setCellValue(ids.get(i));// 写入内容
				}
				wb.write(output);

				LOG.info("[Task4HyperServiceImpl] exportExcel method 待导出现金贷待推工单生成文件为:" + path);
				LOG.info("[Task4HyperServiceImpl] exportExcel method 待导出现金贷待推工单生成文件名称为:" + key);
			}

		} catch (Exception e) {
			e.printStackTrace();
			LOG.error("[Task4HyperServiceImpl] exportExcel method 异常" + e.getMessage());
		} finally {

			try {
				if (output != null) {
					output.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
				LOG.error("[Task4HyperServiceImpl] exportExcel method 待导出现金贷待推工单表异常" + e.getMessage());
			}
		}
		return file;
	}

	// 生成批次
	public String importBusFile(File file) {
		// 批次
		String batchNO = null;
		if (file != null) {
			// TODO 获取操作用户ID
			String userID = "";
			String userName = "系统定时";
			List<String> lnAppIdList = new ArrayList<String>();
			List<Long> lnAppIdLongList = new ArrayList<Long>();
			InputStream is = null;
			InputStreamReader isr = null;
			BufferedReader br = null;
			String line = null;
			try {
				String fileName = file.getPath();
				String fileNameString = file.getName();
				String suffix = StringUtil.substringAfterLast(fileNameString, ".");
				System.out.println(fileName);
				System.out.println(fileNameString);
				System.out.println(suffix);

				if ("txt".equalsIgnoreCase(suffix) || "csv".equalsIgnoreCase(suffix)) {
					is = new FileInputStream(file);
					isr = new InputStreamReader(is);
					br = new BufferedReader(isr);
					while ((line = br.readLine()) != null) {
						lnAppIdList.add(line);
						lnAppIdLongList.add(Long.parseLong(line));
					}
				} else if ("xls".equalsIgnoreCase(suffix) || "xlsx".equalsIgnoreCase(suffix)) {
					is = new FileInputStream(file);
					if ("xlsx".equalsIgnoreCase(suffix)) {
						XSSFWorkbook workbook = new XSSFWorkbook(is);
						XSSFSheet sheet = workbook.getSheetAt(0);
						// 获取表名，存入数组
						System.out.println("------>>>---正在读取Excel表数据，当前表：" + sheet.getSheetName());

						for (int j = 0; j < sheet.getLastRowNum() + 1; j++) {
							XSSFRow row = sheet.getRow(j);
							if (row != null && row.getLastCellNum() > 0) {
								XSSFCell cell = row.getCell(0);
								if (cell != null) {
									// cell.setCellType(1);
									try {

										System.out.println("==========开始读取=========");
										System.out.println(">>>>" + cell.getStringCellValue() + "<<<<<<");
										System.out.println(">>>>" + cell.getRichStringCellValue());
										if (StringUtil.isNotBlank(cell.getStringCellValue())) {
											lnAppIdList.add(cell.getStringCellValue());
											System.out.println("==========lnAppIdList=========" + cell.getStringCellValue());
											lnAppIdLongList.add(Long.parseLong(cell.getStringCellValue()));
											LOG.info("[Task4HyperServiceImpl] cashSent2Bus method 待推现金贷工单" + j + cell.getStringCellValue());
										}
									} catch (NumberFormatException e) {
										LOG.error("[Task4HyperServiceImpl] importBusFile method EXCEL存在无效数据！" + cell.getStringCellValue());
									}
								}
							}
						}

					} else if ("xls".equalsIgnoreCase(suffix)) {
						HSSFWorkbook workbook = new HSSFWorkbook(is);
						HSSFSheet sheet = workbook.getSheetAt(0);

						for (int j = 0; j < sheet.getLastRowNum() + 1; j++) {
							HSSFRow row = sheet.getRow(j);
							if (row != null && row.getLastCellNum() > 0) {
								HSSFCell cell = row.getCell(0);
								if (cell != null) {
									cell.setCellType(Cell.CELL_TYPE_STRING);
									try {
										lnAppIdList.add(cell.getStringCellValue());
										lnAppIdLongList.add(Long.parseLong(cell.getStringCellValue()));
									} catch (NumberFormatException e) {
										LOG.error("[Task4HyperServiceImpl] importBusFile method EXCEL存在无效数据！" + cell.getStringCellValue());
									}
								}
							}
						}
					}
				}

				if (lnAppIdList.size() > 0) {// 有数据时
					LOG.info("[Task4HyperServiceImpl] cashSent2Bus method 待推现金贷工单读取到的工单共:" + lnAppIdList.size() + "个");
					// 获取重复元素
					List<String> duplicateaList = ListUtil.findDuplicatea(lnAppIdList);
					if (duplicateaList.size() == 0) {// 无重复数据
						List<BusLnApp> busLnApps = busLnAppService.selectByIds(lnAppIdLongList);

						if (busLnApps.size() == lnAppIdList.size()) {// 所有都是有效数据

							List<String> stateErrList = new ArrayList<String>();
							for (BusLnApp app : busLnApps) {
								String appState = app.getAppState();
								if (!"35".equals(appState) && !"36".equals(appState)) {
									stateErrList.add(app.getId() + "");
								}
							}
							if (stateErrList.size() == 0) {// 所有状态都是35或36
								// 文件上传oss
								String fileKey = OssOpsUtils.uploadFile(fileName, "application/x-amf");
								// 删除本地文件
								if (file.isFile() && file.exists()) {// 路径为文件且不为空则进行删除
									file.delete();// 文件删除
								}
								LOG.info("[Task4HyperServiceImpl] cashSent2Bus method 上传生成的序号:" + fileKey);
								batchNO = busBatchService.getBatchNo();
								LOG.info("[Task4HyperServiceImpl] cashSent2Bus method 待推现金贷工单:" + fileNameString + " 生成的批次号是:" + batchNO);
								busBatchService.importBusBatch(batchNO, fileKey, fileNameString, busLnApps, userID, userName,"");
								System.out.println("==============fileKey===================");
								System.out.println("=================================" + fileKey + "=======================");
								System.out.println("================fileKey=================");
							} else {
								LOG.error("[Task4HyperServiceImpl] importBusFile method " + fileNameString + "存在状态无效工单！" + ListUtil.listToString(stateErrList, ","));

							}
						} else {
							for (BusLnApp app : busLnApps) {
								lnAppIdList.remove(app.getId() + "");
							}
							LOG.error("[Task4HyperServiceImpl] importBusFile method 存在无效工单号！" + ListUtil.listToString(lnAppIdList, ","));
						}
					} else {
						LOG.error("[Task4HyperServiceImpl] importBusFile method 存在重复工单！" + ListUtil.listToString(duplicateaList, ","));
					}
				} else {
					LOG.error("[Task4HyperServiceImpl] importBusFile method 导入数据为0条！");

				}
			} catch (NumberFormatException e) {
				LOG.error("[Task4HyperServiceImpl] importBusFile method 导入待推BUS工单表异常!", e);
			} catch (Exception e) {
				LOG.error("[Task4HyperServiceImpl] importBusFile method 导入待推BUS工单表异常!", e);
			} finally {
				if (br != null) {
					try {
						br.close();
					} catch (IOException e) {
						LOG.error("[Task4HyperServiceImpl] importBusFile method 关闭BufferedReader异常", e);
					}
				}
				if (isr != null) {
					try {
						isr.close();
					} catch (IOException e) {
						LOG.error("[Task4HyperServiceImpl] importBusFile method 关闭InputStreamReader异常", e);
					}
				}
				if (is != null) {
					try {
						is.close();
					} catch (IOException e) {
						LOG.error("[Task4HyperServiceImpl] importBusFile method 关闭InputStream异常", e);
					}
				}
			}

			LOG.info("[Task4HyperServiceImpl] importBusFile method end...");

		}
		return batchNO;
	}

	// 推送bus
	public RPCResult batchImp(String batchNO) {
		LOG.info("[Task4HyperServiceImpl] batchImp method begin...");
		for (int i = 0; i < 10; i++) {
			try {
				String bus_run_batch = RedisUtils.getObject("BUS_RUN_BATCH");
				LOG.info("[Task4HyperServiceImpl] batchImp method 批次号" + batchNO + " 第" + i + "次推送");
				if ("true".equalsIgnoreCase(bus_run_batch)) {

					LOG.info("[Task4HyperServiceImpl] batchImp method begin..." + "当前有批次正在推送BUS，请稍后操作!");
				} else {
					try {
						Integer length = RedisUtils.getLength(BusReturn.BUS_REDIS_LIST);
						LOG.info("[Task4HyperServiceImpl] batchImp method redisService.listSize:" + length);
						if (length != null && length > 0) {
							String busBatchNo = RedisUtils.getObject("BUS_BATCH_NO");
							if (StringUtils.isNotBlank(busBatchNo)) {
								if (batchNO.equals(busBatchNo)) {
									LOG.info("[Task4HyperServiceImpl] batchImp method " + "当前批次正在推送BUS!");
								} else {
									LOG.info("[Task4HyperServiceImpl] batchImp method " + "当前有批次正在推送BUS，请稍后操作!");
								}
							} else {
								LOG.info("[Task4HyperServiceImpl] batchImp method " + String.format("队列中还有%s单正在推送中,请稍后操作!", length));
							}
						} else {
							RedisUtils.putObject("BUS_RUN_BATCH", "true", 10L);
							if (StringUtils.isNotBlank(batchNO)) {
								List<String> ids = busBatchService.selectAppIdsByBatchNO(batchNO);
								List<String> lnAppList = new ArrayList<String>();
								if (ids != null && ids.size() > 0) {
									for (String id : ids) {
										lnAppList.add(id + "@" + batchNO);
									}
									// 存入批次号
									RedisUtils.putObject("BUS_BATCH_NO", batchNO);
									// 根据批次号查询此批工单是否已经推送过
									BusBatchInfo busBatchInfo = busBatchService.selectByPrimaryKey(batchNO);
									if (busBatchInfo != null && busBatchInfo.getBeginDate() == null) {
										// 更新LnApp状态35->36 (现金贷31->36 这里不用记录)
										// busLnAppService.updateBatchState35To36(ids);
										// 更新数据库当前批次的开始推送时间及sentToBus状态
										busBatchService.updateBeginDateAndSentToBusByBatchNO(batchNO);
									}
									busBatchService.toRedisByBatchNo(batchNO);
									threadPoolTaskExecutor.execute(new SentBusRunnable(lnAppList) {
										@Override
										public void run() {
											RedisUtils.lPush(BusReturn.BUS_REDIS_LIST, this.getLists().toArray());
										}
									});
									LOG.info("[Task4HyperServiceImpl] batchImp method " + String.format("队列中还有%s单正在推送中,请稍后操作!", length));
									LOG.info("[Task4HyperServiceImpl] batchImp method 批次号:" + batchNO + "待推工单共:" + ids.size() + "笔已加入待推BUS队列！");
								} else {
									LOG.info("[Task4HyperServiceImpl] batchImp method 批次号:" + batchNO + "未找到符合条件工单！");
								}
							} else {
								LOG.info("[Task4HyperServiceImpl] batchImp method 批次号不能为空");
							}
							break;
						}
					} catch (Exception e) {
						LOG.error("[Task4HyperServiceImpl] batchImp method 发送至BUS失败！", e);
					}

				}
				LOG.info("[Task4HyperServiceImpl] batchImp method end...");
				Thread.sleep(5 * 60 * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			LOG.info("[Task4HyperServiceImpl] batchImp method end...");

		}

		return null;
	}

}
