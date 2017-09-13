package com.hm.bus.util;

import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;

import com.gep.core.util.CollectionUtils;
import com.gep.util.PropertyUtils;

/**
 * 
 * excel导出工具类 本工具类主要用来导出sql查询数据<br/>
 */
public class ExcelUtil {
	/**
	 * 构造方法私有化
	 */
	private ExcelUtil() {

	}

	/**
	 * 每页最多行数
	 */
	private static final int pageSize = 200000;

	/**
	 * excel工作本集合
	 */
	private static Map<String, SXSSFWorkbook> workbooks = new HashMap<String, SXSSFWorkbook>();

	public static List<String[]> dataConvert(List rows, String key) throws Exception {
		// 返回结果保存集合
		List<String[]> result = new ArrayList<String[]>();
		// 抽取字段字符串
		String columnStr = getConditionFromProp(key + "Column");
		// 字段数组
		String[] columnArr = columnStr.split(",");
		// 遍历所有数据行
		for (Object obj : rows) {
			String[] tempArr = new String[columnArr.length];
			for (int i = 0; i < columnArr.length; i++) {
				// 根据抽取字段获取Field对象
				// 如果返回的对象为空，则说明字段填写错误，如果返回对象不为空，则说明字段正确
				if (obj.getClass().getDeclaredField(columnArr[i]) != null) {
					// 获取字段对应get方法
					Method method = obj.getClass().getDeclaredMethod("get" + columnArr[i].substring(0, 1).toUpperCase() + columnArr[i].substring(1));
					// 调用get方法
					// 如果返回值为null则返回null，如果不为null则转化为字符串返回
					tempArr[i] = method.invoke(obj) == null ? null : method.invoke(obj).toString();
				} else {
					throw new Exception(obj + ",不存在字段:" + columnArr[i]);
				}
			}
			result.add(tempArr);
		}
		return result;
	}

	/**
	 * 
	 * <p>
	 * 新建工作本
	 * </p>
	 * 
	 * @author songning
	 * @datetime 2016年1月14日 下午5:23:41
	 *
	 * @param key
	 * @list 数据集合
	 */
	public static void newWorkbook(String key, List<String[]> list) throws Exception {
		// 如果数据集合为空,则新建一个数据集合，集合个数为0
		if (list == null) {
			list = new ArrayList<String[]>();
		}
		// 如果关键字对应的工作本不存在则新建
		// 存在则刷新excel行数据
		if (workbooks.get(key) != null) {
			// 清空表格
			emptyTableRow(workbooks.get(key));
		}
		// 加载表头标题字符串
		String headerStr = getConditionFromProp(key);
		// 当表头数据为空或者空字符时，抛出异常
		if (AssertUtil.isBlank(headerStr)) {
			throw new Exception("exportExcel.properties不存在" + key + "关键字,或关键字对应内容为空");
		}
		// 表头标题数组
		String[] header = headerStr.split(",");
		// 表头列数与第一行数据列数是否相等
		// 相等则正确，不相等则错误
		if (list.size() > 0 && header.length != list.get(0).length) {
			throw new Exception("excel表头列数与数据行单元格列数不一致");
		}
		// 记录总数
		int rowCount = list.size();
		// 总Sheet数
		int pageCount = (list.size() + pageSize - 1) / pageSize;
		// 工作本
		SXSSFWorkbook workbook = new SXSSFWorkbook();
		// 切割List
		List<List<String[]>> sheetList = CollectionUtils.subList(list, pageSize);

		for (int i = 0; i < pageCount; i++) {
			// 表格
			Sheet sheet = workbook.createSheet();
			// 创建表头
			createTableHeader(workbook, sheet, header);
			// 添加行
			createTableRow(workbook, sheet, sheetList.get(i));
			sheet.setPrintGridlines(true);
		}
		// 保存工作本
		workbooks.put(key, workbook);

	}

	/**
	 * 
	 * <p>
	 * excel附件下载
	 * </p>
	 * 
	 * @author songning
	 * @datetime 2016年1月18日 上午10:28:39
	 *
	 * @param response
	 * @key 关键字
	 */
	public static void export(HttpServletResponse response, String key) throws Exception {
		String fileName = getConditionFromProp(key + "FileName");
		// 当导出文件名为空或者空字符时，抛出异常
		if (AssertUtil.isBlank(fileName)) {
			throw new Exception("exportExcel.properties不存在" + key + "关键字,或关键字对应内容为空");
		}
		// 下载excel文件名
		// 设置文件名的utf-8编码,使中文名可以正常显示
		String targetFileName = fileName + TimeUtil.date2String(new Date(), TimeUtil.BASE_DATE_FORMAT);
		OutputStream out = response.getOutputStream();
		response.reset();
		// 设置文件类型
		response.setContentType("application/vnd.ms-excel");
		response.setHeader("Content-disposition", "attachment; filename=" + URLEncoder.encode(targetFileName, "UTF-8") + ".xlsx");
		// workbooks.get(key).getSheet("sheet1").setPrintGridlines(true);
		// 文件下载
		workbooks.get(key).write(out);
		out.close();
	}

	/**
	 * 从exportExcel.properties中获取excel表头数据
	 * 
	 * @param key
	 *            关键字
	 */
	private static String getConditionFromProp(String key) {
		try {
			// TODO 重写方法
			String headerStr = PropertyUtils.getConfig("exportExcel", key);
			return headerStr;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 
	 * <p>
	 * 设置单元格样式
	 * </p>
	 * 
	 * @author songning
	 * @datetime 2016年1月15日 下午2:36:56
	 *
	 * @param workbook
	 * @return
	 */
	private static CellStyle getCellStyle(SXSSFWorkbook workbook) {
		// 新建单元格样式
		CellStyle style = workbook.createCellStyle();
		style.setFillForegroundColor(IndexedColors.LIGHT_GREEN.index);
		style.setFillPattern(XSSFCellStyle.SOLID_FOREGROUND);
		// 左右居中
		style.setAlignment(XSSFCellStyle.ALIGN_CENTER);
		style.setBorderLeft(XSSFCellStyle.BORDER_THIN);
		style.setBorderRight(XSSFCellStyle.BORDER_THIN);
		style.setBorderTop(XSSFCellStyle.BORDER_THIN);
		style.setBorderBottom(XSSFCellStyle.BORDER_THIN);
		// 单元格字体
		Font font = workbook.createFont();
		// 设置字体大小
		font.setFontHeightInPoints((short) 10);
		style.setFont(font);
		return style;
	}

	/**
	 * 
	 * <p>
	 * 获取已有的单元格样式
	 * </p>
	 * 
	 * @author songning
	 * @datetime 2016年4月11日 上午10:42:57
	 *
	 * @param workbook
	 * @return
	 */
	private static CellStyle getExistCellStyle(SXSSFWorkbook workbook) {
		// workbook.getNumCellStyles获取workbook样式数目(包括标题栏样式和内容样式)
		// 在本工具类中，先是创建标题栏样式然后创建内容样式，所以内容样式永远是最后一个，故先获取workbook样式数目然后减1得到内容样式索引
		return workbook.getCellStyleAt((short) (workbook.getNumCellStyles() - 1));
	}

	/**
	 * 
	 * <p>
	 * 设置标题样式
	 * </p>
	 * 
	 * @author songning
	 * @datetime 2016年1月15日 下午2:42:00
	 *
	 * @param workbook
	 * @return
	 */
	private static CellStyle getTitleStyle(SXSSFWorkbook workbook) {
		// 新建标题样式
		CellStyle style = workbook.createCellStyle();
		style.setFillForegroundColor(IndexedColors.LAVENDER.index);
		style.setFillPattern(XSSFCellStyle.SOLID_FOREGROUND);
		// 左右居中
		style.setAlignment(XSSFCellStyle.ALIGN_CENTER);
		style.setBorderLeft(XSSFCellStyle.BORDER_THIN);
		style.setBorderRight(XSSFCellStyle.BORDER_THIN);
		style.setBorderTop(XSSFCellStyle.BORDER_THIN);
		style.setBorderBottom(XSSFCellStyle.BORDER_THIN);
		style.setWrapText(true);
		// 标题字体
		Font font = workbook.createFont();
		font.setFontName("Arial");
		// 设置字体大小
		font.setFontHeightInPoints((short) 10);
		font.setBoldweight(XSSFFont.BOLDWEIGHT_BOLD);
		style.setFont(font);
		return style;
	}

	/**
	 * 
	 * <p>
	 * 创建标题行
	 * </p>
	 * 
	 * @author songning
	 * @datetime 2016年1月15日 下午2:59:33
	 *
	 * @param workbook
	 * @param sheet
	 * @param header
	 */
	private static void createTableHeader(SXSSFWorkbook workbook, Sheet sheet, String[] header) {
		// 获取标题栏样式(新建样式)
		CellStyle style = getTitleStyle(workbook);
		// 标题行 行标为0
		Row headerRow = sheet.createRow(0);
		for (int i = 0; i < header.length; i++) {
			// 设置宽度
			sheet.setColumnWidth(i, 20 * 256);
			Cell headerCell = headerRow.createCell(i);
			headerCell.setCellValue(header[i]);
			headerCell.setCellStyle(style);
		}
	}

	/**
	 * 
	 * <p>
	 * 创建行
	 * </p>
	 * 
	 * @author songning
	 * @datetime 2016年1月15日 下午3:03:04
	 *
	 * @param workbook
	 * @param sheet
	 * @param cells
	 */
	private static void createTableRow(SXSSFWorkbook workbook, Sheet sheet, List<String[]> cells) {
		// 获取单元格样式(新建单元格样式)
		CellStyle style = getCellStyle(workbook);
		// 数据行 行标从1开始
		for (int i = 1; i <= cells.size(); i++) {
			// 创建第i行
			Row row = sheet.createRow(i);
			row.setHeight((short) (15.625 * 20));
			// 遍历所有单元格
			for (int j = 0; j < cells.get(i - 1).length; j++) {
				// 创建第j个单元格
				Cell cell = row.createCell(j);
				cell.setCellStyle(style);
				cell.setCellValue(cells.get(i - 1)[j]);
			}
		}
	}

	/**
	 * 
	 * <p>
	 * 清空表数据
	 * </p>
	 * 
	 * @author songning
	 * @datetime 2016年1月18日 上午10:14:08
	 *
	 * @param sheet
	 */
	private static void emptyTableRow(SXSSFWorkbook workbook) {
		for (int i = 0; i < workbook.getNumberOfSheets(); i++) {
				workbook.removeSheetAt(i);
		}

	}
}
