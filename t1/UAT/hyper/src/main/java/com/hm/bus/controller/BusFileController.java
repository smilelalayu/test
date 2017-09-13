package com.hm.bus.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.gep.core.base.BaseController;
import com.gep.core.util.StringUtil;
import com.gep.sys.util.UserUtils;
import com.gep.util.PropertyUtils;
import com.hm.bus.dao.BusLnAppMapper;
import com.hm.bus.module.BusBatchInfo;
import com.hm.bus.module.BusLnApp;
import com.hm.bus.module.BusSentLog;
import com.hm.bus.service.BusBatchService;
import com.hm.bus.service.BusLnAppService;
import com.hm.bus.service.BusSentLogService;
import com.hm.bus.util.ExcelUtil;
import com.hm.bus.util.FileUtil;
import com.hm.bus.util.ListUtil;
import com.hm.bus.util.OssOps;
import com.hm.bus.util.ResultInfo;

/**
 * 
 * @author leimeng E-mail: leimeng@9fchaoneng.com
 * @version 创建时间：2017年1月12日 上午10:34:58
 */
@Controller
@RequestMapping("/bus/file")
public class BusFileController extends BaseController {

	private static final Logger LOG = Logger.getLogger(BusFileController.class);

	@Autowired
	private BusLnAppService busLnAppService;

	@Autowired
	private BusBatchService busBatchService;

	@Autowired
	private BusLnAppMapper busLnAppMapper;
	
	@Autowired
	private BusSentLogService busSentLogService;

	/**
	 * 导出BUS工单表,默认全部导出
	 * 
	 * @param request
	 * @param response
	 * @param model
	 */
	@RequestMapping(value = "exp")
	public void exportBusFile(BusLnApp lnapp, HttpServletResponse response, ModelMap model) {
		LOG.info("[BusFileController] exportBusFile method begin...");

		List<BusLnApp> busLnAppList = busLnAppService.list(lnapp);
		
		LOG.info("[BusFileController] exportBusFile method 待导出BUS工单表笔数为" + busLnAppList.size());
		// key:是exportExcel.properties中的excel表头的key
		String key = "AppStatusUpdate";

		List<String[]> result;
		try {
			result = ExcelUtil.dataConvert(busLnAppList, key);
			// 新建工作本
			ExcelUtil.newWorkbook(key, result);
			// 导出excel
			ExcelUtil.export(response, key);
		} catch (Exception e) {
			LOG.error("[BusFileController] exportBusFile method 导出BUS工单表异常", e);
		} finally {
			busLnAppList.clear();
		}
		LOG.info("[BusFileController] exportBusFile method end...");
	}

	@RequestMapping(value = "imp")
	@ResponseBody
	public ResultInfo importBusFile(HttpServletRequest request, HttpServletResponse response, @RequestParam("file_data") MultipartFile file) {
		LOG.info("[BusFileController] importBusFile method begin...");
		ResultInfo rs = new ResultInfo();
		// TODO token 操作口令
		String token = PropertyUtils.getConfig("bus", "com.hm.bus.update.token");
		String reqToken = request.getParameter("token");
		String reqAppayDate = request.getParameter("appayDate");//增加申请时间
		// TODO 获取操作用户ID
		String userID = UserUtils.getLoginUserId() + "";
		String userName = UserUtils.getUserInfo().getUserName();
		List<String> lnAppIdList = new ArrayList<String>();
		List<Long> lnAppIdLongList = new ArrayList<Long>();
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		try {
			if (token.equals(reqToken)) {
				String line = null;
				String fileName = file.getOriginalFilename();

				String fileNameString = file.getOriginalFilename();
				String suffix = StringUtil.substringAfterLast(fileNameString, ".");

				if ("txt".equalsIgnoreCase(suffix) || "csv".equalsIgnoreCase(suffix)) {
					is = file.getInputStream();
					isr = new InputStreamReader(is);
					br = new BufferedReader(isr);
					while ((line = br.readLine()) != null) {
						lnAppIdList.add(line);
						lnAppIdLongList.add(Long.parseLong(line));
					}
				} else if ("xls".equalsIgnoreCase(suffix) || "xlsx".equalsIgnoreCase(suffix)) {
					is = file.getInputStream();
					if ("xlsx".equalsIgnoreCase(suffix)) {
						XSSFWorkbook workbook = new XSSFWorkbook(is);
						XSSFSheet sheet = workbook.getSheetAt(0);

						for (int j = 0; j < sheet.getLastRowNum() + 1; j++) {
							XSSFRow row = sheet.getRow(j);
							if (row!=null && row.getLastCellNum()>0) {
								XSSFCell cell = row.getCell(0);
								if (cell!=null){
									cell.setCellType(Cell.CELL_TYPE_STRING);
									try {
										if(StringUtil.isNotBlank(cell.getStringCellValue())){
											lnAppIdList.add(cell.getStringCellValue());
											lnAppIdLongList.add(Long.parseLong(cell.getStringCellValue()));
										}
									} catch (NumberFormatException e) {
										LOG.error("[BusFileController] importBusFile method EXCEL存在无效数据！" + cell.getStringCellValue());
									}
								}
							}
						}

					} else if ("xls".equalsIgnoreCase(suffix)) {
						HSSFWorkbook workbook = new HSSFWorkbook(is);
						HSSFSheet sheet = workbook.getSheetAt(0);

						for (int j = 0; j < sheet.getLastRowNum() + 1; j++) {
							HSSFRow row = sheet.getRow(j);
							if(row!=null && row.getLastCellNum()>0) {
								HSSFCell cell = row.getCell(0);
								if (cell!=null){
									cell.setCellType(Cell.CELL_TYPE_STRING);
									try {
										lnAppIdList.add(cell.getStringCellValue());
										lnAppIdLongList.add(Long.parseLong(cell.getStringCellValue()));
									} catch (NumberFormatException e) {
										LOG.error("[BusFileController] importBusFile method EXCEL存在无效数据！" + cell.getStringCellValue());
									}
								}
							}
						}
					}
				}

				if (lnAppIdList.size() > 0) {// 有数据时
					// 获取重复元素
					List<String> duplicateaList = ListUtil.findDuplicatea(lnAppIdList);
					if (duplicateaList.size() == 0) {// 无重复数据
						List<BusLnApp> busLnApps = busLnAppMapper.selectByIds(lnAppIdLongList);

						if (busLnApps.size() == lnAppIdList.size()) {// 所有都是有效数据

							List<String> stateErrList = new ArrayList<String>();
							for (BusLnApp app : busLnApps) {
								String appState = app.getAppState();
								if (!"35".equals(appState) && !"36".equals(appState)) {
									stateErrList.add(app.getId() + "");
								}
							}
							if (stateErrList.size() == 0) {// 所有状态都是35或36
								String fileKey = FileUtil.getOssId(request);
								String batchNo = busBatchService.getBatchNo();
								busBatchService.importBusBatch(batchNo, fileKey, fileName, busLnApps, userID, userName,reqAppayDate);
								rs.setStatus(true);
							}else {
								rs.setStatus(false);
								rs.setMessage("存在状态无效工单！" + ListUtil.listToString(stateErrList, ","));
								LOG.error("[BusFileController] importBusFile method 存在状态无效工单！" + ListUtil.listToString(stateErrList, ","));

							}
						} else {
							for (BusLnApp app : busLnApps) {
								lnAppIdList.remove(app.getId() + "");
							}
							rs.setStatus(false);
							rs.setMessage("存在无效工单号！" + ListUtil.listToString(lnAppIdList, ","));
							LOG.error("[BusFileController] importBusFile method 存在无效工单号！" + ListUtil.listToString(lnAppIdList, ","));
						}
					} else {
						rs.setStatus(false);
						rs.setMessage("存在重复工单！" + ListUtil.listToString(duplicateaList, ","));
						LOG.error("[BusFileController] importBusFile method 存在重复工单！" + ListUtil.listToString(duplicateaList, ","));
					}
				} else {
					rs.setStatus(false);
					rs.setMessage("导入数据为0条！");
					LOG.error("[BusFileController] importBusFile method 导入数据为0条！");

				}
			} else {
				rs.setStatus(false);
				rs.setMessage("口令不正确，更新失败！");
				LOG.error("[BusFileController] importBusFile method 口令不正确，更新失败！");
			}
		} catch (NumberFormatException e) {
			rs.setStatus(false);
			rs.setMessage("导入数据格式不正确！");
			LOG.error("[BusFileController] importBusFile method 导入待推BUS工单表异常!", e);
		} catch (Exception e) {
			rs.setStatus(false);
			rs.setMessage("导入失败！");
			LOG.error("[BusFileController] importBusFile method 导入待推BUS工单表异常!", e);
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					LOG.error("[BusFileController] importBusFile method 关闭BufferedReader异常", e);
				}
			}
			if (isr != null) {
				try {
					isr.close();
				} catch (IOException e) {
					LOG.error("[BusFileController] importBusFile method 关闭InputStreamReader异常", e);
				}
			}
			if (is != null) {
				try {
					is.close();
				} catch (IOException e) {
					LOG.error("[BusFileController] importBusFile method 关闭InputStream异常", e);
				}
			}
		}

		LOG.info("[BusFileController] importBusFile method end...");
		return rs;
	}

	@RequestMapping(value = "download")
	public void downloadFile(@RequestParam("BatchNO") String BatchNO, HttpServletRequest request, HttpServletResponse response) {
		LOG.info("[BusFileController] downloadFile method begin...");

		if (StringUtils.isBlank(BatchNO)) {
			LOG.error("[BusFileController] downloadFile method 参数 异常!");
		} else {
			BusBatchInfo busBatch = busBatchService.selectByPrimaryKey(BatchNO);
			String fileKey = busBatch.getFileKey();
			String fileName = busBatch.getFileName();
			FileUtil.getOssFile(fileName, fileKey, response);

			String bucketName = PropertyUtils.getConfig("oss.bucketname");
			InputStream input = OssOps.getObject(bucketName, fileKey);

			OutputStream out = null;
			try {
				response.reset();
				response.setContentType("application/octet-stream;");
				response.setHeader("Content-Disposition", "attachment; filename=" + URLEncoder.encode(fileName, "UTF-8"));
				out = response.getOutputStream();
				int len = 0;
				byte[] b = new byte[1024];
				while ((len = input.read(b)) != -1) {
					out.write(b, 0, len);
				}
				out.flush();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				if (out != null) {
					try {
						out.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				if (input != null) {
					try {
						input.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
		LOG.info("[BusFileController] downloadFile method end...");
	}
	
	/**
     * 导出推送日志
     * 
     * @param request
     * @param response
     * @param model
     */
    @RequestMapping(value = "sendLogExp")
    public void exportSendLogFile(BusSentLog busSentLog, HttpServletResponse response, ModelMap model) {
        LOG.info("[BusFileController] exportSendLogFile method begin...");

        List<BusSentLog> busSendLogList = busSentLogService.list(busSentLog);
        
        LOG.info("[BusFileController] exportSendLogFile method 待导出BUS推送日志笔数为" + busSendLogList.size());
        // key:是exportExcel.properties中的excel表头的key
        String key = "SendLogUpdate";

        List<String[]> result;
        try {
            result = ExcelUtil.dataConvert(busSendLogList, key);
            // 新建工作本
            ExcelUtil.newWorkbook(key, result);
            // 导出excel
            ExcelUtil.export(response, key);
        } catch (Exception e) {
            LOG.error("[BusFileController] exportSendLogFile method 导出BUS工单表异常", e);
        } finally {
            busSendLogList.clear();
        }
        LOG.info("[BusFileController] exportSendLogFile method end...");
    }
    
}
