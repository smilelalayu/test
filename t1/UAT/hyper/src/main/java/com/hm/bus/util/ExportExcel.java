package com.hm.bus.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;

import com.gep.util.PropertyUtils;


/**
 * 
 *<p>
 *	excel导出工具类
 *	本工具类主要用来导出sql查询数据<br/>
 *	
 *
 *</p>
 * @author songning
 * @datetime 2016年1月14日 下午4:38:31
 *
 */
public class ExportExcel {
	/**
	 * 构造方法私有化
	 */
	private ExportExcel(){
		
	}
	
	/**
	 * excel工作本集合
	 */
	private static Map<String,HSSFWorkbook> workbooks = new HashMap<String,HSSFWorkbook>();
	
	/**
	 * 
	 * <p>
	 * 	新建工作本
	 * </p>
	 * @author songning
	 * @datetime 2016年1月14日 下午5:23:41
	 *
	 * @param key
	 * @list 数据集合
	 */
	public static void newWorkbook(String key,List<String[]> list)throws Exception{
		//如果数据集合为空,则新建一个数据集合，集合个数为0
		if(list == null){
			list = new ArrayList<String[]>();
		}
		//如果关键字对应的工作本不存在则新建
		//存在则刷新excel行数据
		if(workbooks.get(key) == null){
			//工作本
			HSSFWorkbook workbook = new HSSFWorkbook();
			//表格
			HSSFSheet sheet = workbook.createSheet("sheet1");
			//加载表头标题字符串
			String headerStr = getConditionFromProp(key);
			//当表头数据为空或者空字符时，抛出异常
			if(AssertUtil.isBlank(headerStr)){
				throw new Exception("exportExcel.properties不存在"+key+"关键字,或关键字对应内容为空");
			}
			//表头标题数组
			String[] header = headerStr.split(",");
			//表头列数与第一行数据列数是否相等
			//相等则正确，不相等则错误
			if(list.size() > 0 && header.length != list.get(0).length){
				throw new Exception("excel表头列数与数据行单元格列数不一致");
			}
			//创建表头
			createTableHeader(workbook, sheet, header);
			//添加行
			createTableRow(workbook, sheet, list);
			//保存工作本
			workbooks.put(key, workbook);
		}else{
			//清空表格
			emptyTableRow(workbooks.get(key).getSheet("sheet1"));
			//添加行
			createTableRowByExistStyle(workbooks.get(key), workbooks.get(key).getSheet("sheet1"), list);
		}
		
	}
	
	/**
	 * 
	 * <p>
	 * 	从exportExcel.properties中获取excel表头数据
	 * </p>
	 * @author songning
	 * @datetime 2016年1月14日 下午5:05:45
	 *
	 * @param key 关键字
	 */
	private static String getConditionFromProp(String key){
		
//		Properties props = new Properties();
	    try {
//			String path = ConfigProperties.class.getClassLoader().getResource("exportExcel.properties").getPath();
//			InputStream in =  new FileInputStream(path);  
//			props.load(in);
//			String headerStr = (String) props.get(key);
	    	//TODO 重写方法
	    	String headerStr = PropertyUtils.getConfig("exportExcel",key);
	    	
			return headerStr;
	    } catch (Exception e) {
	    	e.printStackTrace();
	    }
		return null;
	}
	
	/**
	 * 
	 * <p>
	 * 	设置单元格样式
	 * </p>
	 * @author songning
	 * @datetime 2016年1月15日 下午2:36:56
	 *
	 * @param workbook
	 * @return
	 */
	private static HSSFCellStyle getCellStyle(HSSFWorkbook workbook){
		//新建单元格样式
		HSSFCellStyle style = workbook.createCellStyle();
		style.setFillForegroundColor(HSSFColor.LIGHT_GREEN.index);
		style.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
		//左右居中
		style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
		style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
		style.setBorderRight(HSSFCellStyle.BORDER_THIN);
		style.setBorderTop(HSSFCellStyle.BORDER_THIN);
		style.setBorderBottom(HSSFCellStyle.BORDER_THIN);
		//单元格字体
		HSSFFont font = workbook.createFont();
		//设置字体大小
		font.setFontHeightInPoints((short) 10);
		style.setFont(font);
		return style;
	}
	
	/**
	 * 
	 * <p>
	 * 获取已有的单元格样式
	 * </p>
	 * @author songning
	 * @datetime 2016年4月11日 上午10:42:57
	 *
	 * @param workbook
	 * @return
	 */
	private static HSSFCellStyle getExistCellStyle(HSSFWorkbook workbook){
		//workbook.getNumCellStyles获取workbook样式数目(包括标题栏样式和内容样式)
		//在本工具类中，先是创建标题栏样式然后创建内容样式，所以内容样式永远是最后一个，故先获取workbook样式数目然后减1得到内容样式索引
		return workbook.getCellStyleAt((short)(workbook.getNumCellStyles()-1));
	}
	
	/**
	 * 
	 * <p>
	 * 	设置标题样式
	 * </p>
	 * @author songning
	 * @datetime 2016年1月15日 下午2:42:00
	 *
	 * @param workbook
	 * @return
	 */
	private static HSSFCellStyle getTitleStyle(HSSFWorkbook workbook){
		//新建标题样式
		HSSFCellStyle style = workbook.createCellStyle();
		style.setFillForegroundColor(HSSFColor.LAVENDER.index);
		style.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
		//左右居中
		style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
		style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
		style.setBorderRight(HSSFCellStyle.BORDER_THIN);
		style.setBorderTop(HSSFCellStyle.BORDER_THIN);
		style.setBorderBottom(HSSFCellStyle.BORDER_THIN);
		style.setWrapText(true);
		//标题字体
		HSSFFont font = workbook.createFont();
		font.setFontName("Arial");
		//设置字体大小
		font.setFontHeightInPoints((short) 10);
		font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
		style.setFont(font);
		return style;
	}
	
	/**
	 * 
	 * <p>
	 * 	创建标题行
	 * </p>
	 * @author songning
	 * @datetime 2016年1月15日 下午2:59:33
	 *
	 * @param workbook
	 * @param sheet
	 * @param header
	 */
	private static void createTableHeader(HSSFWorkbook workbook,HSSFSheet sheet,String[] header){
		//获取标题栏样式(新建样式)
		HSSFCellStyle style = getTitleStyle(workbook);
		//标题行 行标为0
		HSSFRow headerRow = sheet.createRow( 0);
		for (int i = 0; i < header.length; i++) {
			//设置宽度
			sheet.setColumnWidth(i, 20*256);
			HSSFCell headerCell = headerRow.createCell(i);
			headerCell.setCellValue(header[i]);
			headerCell.setCellStyle(style);
		}
	}
	
	/**
	 * 
	 * <p>
	 * 	创建行
	 * </p>
	 * @author songning
	 * @datetime 2016年1月15日 下午3:03:04
	 *
	 * @param workbook
	 * @param sheet
	 * @param cells
	 */
	private static void createTableRow(HSSFWorkbook workbook,HSSFSheet sheet,List<String[]> cells){
		//获取单元格样式(新建单元格样式)
		HSSFCellStyle style = getCellStyle(workbook);
		//数据行  行标从1开始
		for(int i=1; i<=cells.size(); i++){
			// 创建第i行
			HSSFRow row = sheet.createRow( i);
			row.setHeight((short) (15.625 * 20));
			//遍历所有单元格
			for(int j=0; j<cells.get(i-1).length; j++){
				//创建第j个单元格
				HSSFCell cell = row.createCell(j);
				cell.setCellStyle(style);
				cell.setCellValue(cells.get(i-1)[j]);
			}
		}
	}
	
	/**
	 * 
	 * <p>
	 *  通过已有单元格样式创建行
	 * </p>
	 * @author songning
	 * @datetime 2016年4月11日 上午10:46:33
	 *
	 * @param workbook
	 * @param sheet
	 * @param cells
	 */
	private static void createTableRowByExistStyle(HSSFWorkbook workbook,HSSFSheet sheet,List<String[]> cells){
		//获取单元格样式(使用已经存在的单元格样式)
		HSSFCellStyle style = getExistCellStyle(workbook);
		//数据行  行标从1开始
		for(int i=1; i<=cells.size(); i++){
			// 创建第i行
			HSSFRow row = sheet.createRow( i);
			row.setHeight((short) (15.625 * 20));
			//遍历所有单元格
			for(int j=0; j<cells.get(i-1).length; j++){
				//创建第j个单元格
				HSSFCell cell = row.createCell(j);
				cell.setCellStyle(style);
				cell.setCellValue(cells.get(i-1)[j]);
			}
		}
	}
	
	/**
	 * 
	 * <p>
	 *  清空表数据
	 * </p>
	 * @author songning
	 * @datetime 2016年1月18日 上午10:14:08
	 *
	 * @param sheet
	 */
	private static void emptyTableRow(HSSFSheet sheet){
		//数据行 行标从1开始
		for(int i=1; i<=sheet.getLastRowNum(); i++){
			//通过行标取得行，然后删除
			HSSFRow row = sheet.getRow(i);
			sheet.removeRow(row);
		}
	}
	
	/**
	 * 
	 * <p>
	 * 	excel附件下载
	 * </p>
	 * @author songning
	 * @datetime 2016年1月18日 上午10:28:39
	 *
	 * @param response
	 * @key 关键字
	 */
	public static void export(HttpServletResponse response,String key)throws Exception{
		String fileName = getConditionFromProp(key+"FileName");
		//当导出文件名为空或者空字符时，抛出异常
		if(AssertUtil.isBlank(fileName)){
			throw new Exception("exportExcel.properties不存在"+key+"关键字,或关键字对应内容为空");
		}
		//下载excel文件名
		//设置文件名的utf-8编码,使中文名可以正常显示
		String targetFileName = fileName+TimeUtil.date2String(new Date(),TimeUtil.BASE_DATE_FORMAT);
		OutputStream out = response.getOutputStream();
		response.reset();
		//设置文件类型
		response.setContentType("application/vnd.ms-excel");
		response.setHeader("Content-disposition", "attachment; filename="+URLEncoder.encode(targetFileName, "UTF-8")+".xls");
		workbooks.get(key).getSheet("sheet1").setGridsPrinted(true);
		//文件下载
		workbooks.get(key).write(out);
		out.close();
	}
	
	public static String export(String key)throws Exception{
		String fileName = getConditionFromProp(key+"FileName");
		//当导出文件名为空或者空字符时，抛出异常
		if(AssertUtil.isBlank(fileName)){
			throw new Exception("exportExcel.properties不存在"+key+"关键字,或关键字对应内容为空");
		}
		//下载excel文件名
		//设置文件名的utf-8编码,使中文名可以正常显示
		//String path = ExportExcel.class.getResource("/").getPath()+fileName+".xls";
		String path = "/app/dailyExport/"+fileName+".xls";
		File file= new File(path);
		OutputStream out = new FileOutputStream(file);	
		workbooks.get(key).getSheet("sheet1").setGridsPrinted(true);
		//文件下载
		workbooks.get(key).write(out);
		out.close();
		return path;
	}

	/**
	 * 
	 * <p>
	 * 	数据格式转化<br/>
	 * 	由paginationList格式抽取指定字段组成List<String[]>格式
	 * </p>
	 * @author songning
	 * @datetime 2016年1月18日 下午12:01:23
	 *
	 * @param page
	 * @param key
	 * @return
	 */
	public static List<String[]> dataConvert(PaginationList page,String key) throws Exception{
		//返回结果保存集合
		List<String[]> result = new ArrayList<String[]>();
		//抽取字段字符串
		String columnStr = getConditionFromProp(key+"Column");
		//字段数组
		String[] columnArr = columnStr.split(",");
		//所有数据行
		List rows = page.getList();
		//遍历所有数据行
		for(Object obj:rows){
			String[] tempArr = new String[columnArr.length];
			for(int i=0; i<columnArr.length; i++){
				//根据抽取字段获取Field对象
				//如果返回的对象为空，则说明字段填写错误，如果返回对象不为空，则说明字段正确
				if(obj.getClass().getDeclaredField(columnArr[i]) != null){
					//获取字段对应get方法
					Method method = obj.getClass().getDeclaredMethod("get"+columnArr[i].substring(0,1).toUpperCase()+columnArr[i].substring(1));
					//调用get方法
					//如果返回值为null则返回null，如果不为null则转化为字符串返回
					tempArr[i] = method.invoke(obj) == null ? null:method.invoke(obj).toString();
				}else{
					throw new Exception(obj+",不存在字段:"+columnArr[i]);
				}
			}
			result.add(tempArr);
		}
		return result;
	}
	
	
	
	public static List<String[]> dataConvert(List rows,String key) throws Exception{
		//返回结果保存集合
		List<String[]> result = new ArrayList<String[]>();
		//抽取字段字符串
		String columnStr = getConditionFromProp(key+"Column");
		//字段数组
		String[] columnArr = columnStr.split(",");
		//遍历所有数据行
		for(Object obj:rows){
			String[] tempArr = new String[columnArr.length];
			for(int i=0; i<columnArr.length; i++){
				//根据抽取字段获取Field对象
				//如果返回的对象为空，则说明字段填写错误，如果返回对象不为空，则说明字段正确
				if(obj.getClass().getDeclaredField(columnArr[i]) != null){
					//获取字段对应get方法
					Method method = obj.getClass().getDeclaredMethod("get"+columnArr[i].substring(0,1).toUpperCase()+columnArr[i].substring(1));
					//调用get方法
					//如果返回值为null则返回null，如果不为null则转化为字符串返回
					tempArr[i] = method.invoke(obj) == null ? null:method.invoke(obj).toString();
				}else{
					throw new Exception(obj+",不存在字段:"+columnArr[i]);
				}
			}
			result.add(tempArr);
		}
		return result;
	}
	
	/**
	 * 读取excel模版
	 * @param fileName
	 * @return
	 */
	public static HSSFWorkbook readExcel(String fileName) throws Exception{
		HSSFWorkbook workbook = null;
		try {
			InputStream input = new FileInputStream(fileName);
			workbook = new HSSFWorkbook(input);
		} catch (FileNotFoundException e) {
			throw new Exception("模版文件:"+fileName+"不存在");
		} catch (IOException e) {
			throw new Exception("读取模版文件:"+fileName+"失败");
		}
		return workbook;
	}
	
	/**
	 * 自定义excel创建数据
	 * @param workbook 工作区
	 * @param sheet 第{n}个sheet
	 * @param cells list数据
	 * @param key 标识
	 * @param index 默认从第2行插入，如果要从第4行则index=2
	 */
	public static void createTableRowByTemplate(HSSFWorkbook workbook,HSSFSheet sheet,List<String[]> cells,String key,Integer index){
		//获取单元格样式(新建单元格样式)
		HSSFCellStyle style = getCellStyle(workbook);
		//数据行  行标从1开始
		for(int i=1; i<=cells.size(); i++){
			// 创建第i行
			HSSFRow row = sheet.createRow( (i+index));
			row.setHeight((short) (15.625 * 20));
			//遍历所有单元格
			for(int j=0; j<cells.get(i-1).length; j++){
				//创建第j个单元格
				HSSFCell cell = row.createCell(j);
				cell.setCellStyle(style);
				cell.setCellValue(cells.get(i-1)[j]);
			}
		}
		workbooks.put(key, workbook);
	}
	
	/**
	 * 导出多个sheet 的 excel 以第一个sheet为准
	 * @param response
	 * @param key
	 * @fileName 文件名
	 * @throws Exception
	 */
	public static void exportByTemplate(HttpServletResponse response,String key,String fileName)throws Exception{
		
		OutputStream out = response.getOutputStream();
		response.reset();
		//设置文件类型
		response.setContentType("application/vnd.ms-excel");
		response.setHeader("Content-disposition", "attachment; filename="+URLEncoder.encode(fileName, "UTF-8")+".xls");
		workbooks.get(key).getSheetAt(0).setGridsPrinted(true);
		//文件下载
		workbooks.get(key).write(out);
		out.close();
	}
}
