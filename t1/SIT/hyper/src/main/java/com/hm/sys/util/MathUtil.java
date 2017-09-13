package com.hm.sys.util;


import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;

public class MathUtil {

	public static String cutOrPut(String s, int len) {
		String ss = "";
		// System.out.println(s.getBytes().length);
		int i = len - s.getBytes().length;
		if (i == 0) {
			return s;
		}

		if (i < 0) {
			return s.substring(0, len);
		}

		for (int j = 0; j < i; j++) {
			ss = ss + " ";
		}

		return s + ss;
	}

	public static double add(double v1, double v2) {
		BigDecimal b1 = BigDecimal.valueOf(v1);
		BigDecimal b2 = BigDecimal.valueOf(v2);
		return b1.add(b2).doubleValue();
	}

	public static double sub(double v1, double v2) {
		BigDecimal b1 = BigDecimal.valueOf(v1);
		BigDecimal b2 = BigDecimal.valueOf(v2);
		return b1.subtract(b2).doubleValue();
	}

	public static BigDecimal add(BigDecimal b1, BigDecimal b2) {
		if (null == b1) {
			b1 = BigDecimal.ZERO;
		}
		if (null == b2) {
			b2 = BigDecimal.ZERO;
		}
		return b1.add(b2);
	}

	public static BigDecimal sub(BigDecimal b1, BigDecimal b2) {
		if (null == b1) {
			b1 = BigDecimal.ZERO;
		}
		if (null == b2) {
			b2 = BigDecimal.ZERO;
		}
		return b1.subtract(b2);
	}

	public static BigDecimal div(BigDecimal b1, BigDecimal b2) {
		return b1.divide(b2, 2, BigDecimal.ROUND_HALF_UP);
	}

	public static BigDecimal div4Dig(BigDecimal b1, BigDecimal b2) {
		if (null == b1) {
			b1 = BigDecimal.ZERO;
		}
		if (null == b2) {
			b2 = BigDecimal.ZERO;
		}
		return b1.divide(b2, 4, BigDecimal.ROUND_HALF_UP);
	}

	public static BigDecimal divRate(BigDecimal b1, BigDecimal b2) {
		if (null == b1) {
			b1 = BigDecimal.ZERO;
		}
		if (null == b2) {
			b2 = BigDecimal.ZERO;
		}
		return b1.divide(b2, 15, BigDecimal.ROUND_HALF_UP);
	}

	public static BigDecimal mul(BigDecimal b1, BigDecimal b2) {
		return b1.multiply(b2).setScale(2, BigDecimal.ROUND_HALF_UP);
	}

	public static BigDecimal mul4Dig(BigDecimal b1, BigDecimal b2) {
		return b1.multiply(b2).setScale(4, BigDecimal.ROUND_HALF_UP);
	}

	public static BigDecimal mulRate(BigDecimal b1, BigDecimal b2) {
		return b1.multiply(b2).setScale(15, BigDecimal.ROUND_HALF_UP);
	}

	public static Boolean isNul(String str) {
		if (null == str || "".equals(str.trim())) {
			return true;
		}
		return false;
	}

	public static Boolean isNulNum(Object obj) {
		if (obj instanceof BigDecimal) {
			BigDecimal num = (BigDecimal) obj;
			if (null == num || 0 == num.doubleValue()) {
				return true;
			}
		} else if (obj instanceof Double) {
			Double num = (Double) obj;
			if (null == num || 0 == num.doubleValue()) {
				return true;
			}
		} else if (obj instanceof Float) {
			Float num = (Float) obj;
			if (null == num || 0 == num.floatValue()) {
				return true;
			}
		} else if (obj instanceof Long) {
			Long num = (Long) obj;
			if (null == num || 0 == num.longValue()) {
				return true;
			}
		} else if (obj instanceof Integer) {
			Integer num = (Integer) obj;
			if (null == num || 0 == num.intValue()) {
				return true;
			}
		}

		return false;
	}

	public static List<BigDecimal> avg(BigDecimal amt, Integer trm) {
		List<BigDecimal> retList = new ArrayList<BigDecimal>();
		BigDecimal total = BigDecimal.ZERO;
		BigDecimal cur = MathUtil.div(amt, BigDecimal.valueOf(trm));
		for (int i = 0; i < trm; i++) {
			if (i == trm - 1) {
				retList.add(MathUtil.sub(amt, total));
			} else {
				retList.add(cur);
				total = MathUtil.add(total, cur);
			}
		}
		return retList;
	}

	public static List<BigDecimal> avgRate(BigDecimal amt, Integer trm) {
		List<BigDecimal> retList = new ArrayList<BigDecimal>();
		BigDecimal total = BigDecimal.ZERO;
		BigDecimal cur = MathUtil.divRate(amt, BigDecimal.valueOf(trm));
		for (int i = 0; i < trm; i++) {
			if (i == trm - 1) {
				retList.add(MathUtil.sub(amt, total));
			} else {
				retList.add(cur);
				total = MathUtil.add(total, cur);
			}
		}
		return retList;
	}

	// Type 0-日, 1-周, 2-月, 3-季, 4-年
	public static String calcNextDate(String now, String type) {
		if (isNul(now) || isNul(type)) {
			return null;
		}
		int dateTpye = 0;
		int amount = 0;
		if ("0".equals(type)) { // 0-日
			dateTpye = Calendar.DATE;
			amount = 1;
		} else if ("1".equals(type)) { // 1-周
			dateTpye = Calendar.DATE;
			amount = 7;
		} else if ("2".equals(type)) { // 2-月
			dateTpye = Calendar.MONTH;
			amount = 1;
		} else if ("3".equals(type)) { // 3-季
			dateTpye = Calendar.MONTH;
			amount = 3;
		} else if ("4".equals(type)) { // 4-年
			dateTpye = Calendar.MONTH;
			amount = 12;
		}
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.CHINA);
		Date date = null;
		try {
			date = simpleDateFormat.parse(now);
		} catch (ParseException e) {
		}
		Calendar calender = Calendar.getInstance();
		if (null != date) {
			calender.setTime(date);
		}
		calender.add(dateTpye, amount);
		return simpleDateFormat.format(calender.getTime()).toString();
	}

	// Type 0-日, 1-周, 2-月, 3-季, 4-年
	public static String addDate(String now, int days) {
		if (isNul(now)) {
			return null;
		}
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.CHINA);
		Date date = null;
		try {
			date = simpleDateFormat.parse(now);
		} catch (ParseException e) {
		}
		Calendar calender = Calendar.getInstance();
		if (null != date) {
			calender.setTime(date);
		}
		calender.add(Calendar.DATE, days);
		return simpleDateFormat.format(calender.getTime()).toString();
	}

	// add by ycf on 2014-05-07 begin
	public static String getCurrentTime(String pattern) {
		String time = null;
		try {
			DateFormat myformat = new SimpleDateFormat(pattern);
			time = myformat.format(new Date());
		} catch (Exception e) {
			// logger.debug(e);
		}
		return time;
	}

	public static String dateToStr(Date date, String format) {

		String dateStr = null;

		try {
			DateFormat myformat = new SimpleDateFormat(format);
			dateStr = myformat.format(date);

		} catch (Exception e) {
			// logger.debug(e);
		}
		return dateStr;
	}

	public static Date strToDate(String dateStr, String format) {

		Date date = null;

		try {
			DateFormat myformat = new SimpleDateFormat(format);
			date = myformat.parse(dateStr);

		} catch (Exception e) {
			// logger.debug(e);
		}
		return date;
	}

	// add by ycf on 2014-05-07 end

	// 返回两日期差距天数
	public static Long dateCompare(String dt1, String dt2) throws ParseException {
		SimpleDateFormat sf = new SimpleDateFormat("yyyyMMdd");
		Long dti1 = sf.parse(dt1).getTime();
		Long dti2 = sf.parse(dt2).getTime();

		return (dti1 - dti2) / 1000 / 60 / 60 / 24;
	}

	// 格式化BigDecimal
	public static String fmbd(BigDecimal bd) {
		return bd.setScale(2, BigDecimal.ROUND_HALF_UP).toString();
	}

	// added by ycf on 2014-05-27 begin
	public static Timestamp strToTimestamp(String strDate, String pattern) {
		DateFormat df = new SimpleDateFormat(pattern);

		try {
			return new Timestamp(df.parse(strDate).getTime());
		} catch (ParseException e) {
			/*
			 * if(logger.isDebugEnabled()){ logger.debug(e); }
			 */
		}
		return null;
	}

	// added by ycf on 2014-05-27 end

	public static String paramJoin(String[] strs) {
		return "'" + StringUtils.join(strs, "','") + "'";
	}

	// added by ycf on 2014-07-03 begin
	public static boolean isEmpty(Map<?, ?> map) {
		return (map == null || map.size() == 0);
	}

	public static boolean isNotEmpty(Map<?, ?> map) {
		return !isEmpty(map);
	}
    
	public static boolean isNumeric(String str){ 
		   Pattern pattern = Pattern.compile("[0-9]*"); 
		   Matcher isNum = pattern.matcher(str);
		   if( !isNum.matches() ){
		       return false; 
		   } 
		   return true; 
	}
	
	// added by ycf on 2014-07-03 end

	public static void main(String[] args) throws ParseException {
		// System.out.println(HPUtil.dateCompare("20141122", "20141116") < 7);
		// System.out.println(HPUtil.dateCompare("20141122", "20141116"));

		System.out.println(isNumeric("233"));
	}
}