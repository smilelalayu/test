package com.hm.bus.util;

import java.io.UnsupportedEncodingException;

import org.apache.log4j.Logger;

/**
 * 
 * <p>Description: 功能描述：转换工具类,提供常用的几种数据类型转换,String转换int
 * String转换成long,String转换成double,String转换成float,GBK转换成ISO8859-1等等</p>
 * @date 2016年1月8日
 * @author evan
 * @version 1.0
 * <p>Company:9fchaoneng</p>
 * <p>Copyright:Copyright(c)2015</p>
 */
public final class ConverUtil {

	private static Logger log = Logger.getLogger(ConverUtil.class);

	/** 10进制转换64进制字符集 */
	private static final char[] DIGITS = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e',
			'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
			'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U',
			'V', 'W', 'X', 'Y', 'Z', '+', '/', };

	private ConverUtil() {
	}

	/**
	 * 把字符转换为字节，如果转换失败返回0
	 * 
	 * @param param 待转换的字符串
	 */
	public static byte string2Byte(String param) {
		if (AssertUtil.isEmpty(param)) {
			log.error("Failed convert String to byte,param is null.");
			return 0;
		}
		try {
			return Byte.parseByte(param);
		} catch (Exception e) {
			log.error("Failed conver String to byte,param=" + param);
		}
		return 0;
	}

	/**
	 * 把字符转换为短整数，如果失败返回0
	 * 
	 * @param param 待转换的字符串
	 */
	public static short string2Short(String param) {
		if (AssertUtil.isEmpty(param)) {
			log.error("Failed convert String to short,param is null.");
			return 0;
		}
		try {
			return Short.parseShort(param);
		} catch (Exception e) {
			log.error("Failed conver String to short,param=" + param);
		}
		return 0;
	}

	/**
	 * 把字符转换为短整数，如果转换失败返回默认值
	 * 
	 * @param param 待转换的字符串
	 * @param defaultvalue 默认值
	 */
	public static short string2Short(String param, short defaultvalue) {
		if (AssertUtil.isEmpty(param)) {
			return defaultvalue;
		}
		try {
			return Short.parseShort(param);
		} catch (Exception e) {
			log.error("Failed conver String to short,param=" + param);
		}
		return defaultvalue;
	}

	/**
	 * 把字符转换为整数，如果失败返回0
	 * 
	 * @param param 待转换的字符串
	 */
	public static int string2Int(String param) {
		if (AssertUtil.isEmpty(param)) {
			log.error("Failed convert String to int,param is null.");
			return 0;
		}
		try {
			return Integer.parseInt(param);
		} catch (Exception e) {
			log.error("Failed conver String to int,param=" + param);
		}
		return 0;
	}

	/**
	 * 把字符转换为整数，如果失败返回默认值
	 * 
	 * @param param 待转换的字符串
	 * @param defaultvalue 默认值
	 */
	public static int string2Int(String param, int defaultvalue) {
		if (AssertUtil.isEmpty(param)) {
			return defaultvalue;
		}
		try {
			return Integer.parseInt(param);
		} catch (Exception e) {
			log.error("Failed conver String to int,param=" + param);
		}
		return defaultvalue;
	}

	/**
	 * 把字符转换为长整数，如果转换失败返回0
	 * 
	 * @param param 待转换与的参数
	 */
	public static long string2Long(String param) {
		if (AssertUtil.isEmpty(param)) {
			log.error("Failed convert String to long,param is null.");
			return 0;
		}
		try {
			return Long.parseLong(param);
		} catch (Exception e) {
			log.error("Failed conver String to long,param=" + param);
		}
		return 0L;
	}

	/**
	 * 把字符转换为长整数，如果失败返回默认值
	 * 
	 * @param param 待转换的参数
	 * @param defaultvalue 默认值
	 */
	public static long string2Long(String param, long defaultvalue) {
		if (AssertUtil.isEmpty(param)) {
			return defaultvalue;
		}
		try {
			return Long.parseLong(param);
		} catch (Exception e) {
			log.error("Failed conver String to long,param=" + param);
		}
		return defaultvalue;
	}

	/**
	 * 把字符转换为整数，如果失败返回0
	 * 
	 * @param param 待转换的参数
	 * @param defaultvalue 默认值
	 */
	public static float string2Float(String param) {
		if (AssertUtil.isEmpty(param)) {
			log.error("Failed convert String to float,param is null.");
			return 0;
		}
		try {
			return Float.valueOf(param);
		} catch (Exception e) {
			log.error("Failed conver String to float,param=" + param);
		}
		return 0;
	}

	/**
	 * 把字符转换为整数，如果失败返回默认值
	 * 
	 * @param param 待转换的参数
	 * @param defaultvalue 默认值
	 */
	public static float string2Float(String param, float defaultvalue) {
		if (AssertUtil.isEmpty(param)) {
			return defaultvalue;
		}
		try {
			return Float.valueOf(param);
		} catch (Exception e) {
			log.error("Failed conver String to float,param=" + param);
		}
		return defaultvalue;
	}

	/**
	 * 将字符串转换成double类型值,转换失败返回0d.
	 * 
	 * @param param 待转换的值
	 * @return 转换后的double类型值
	 */
	public static double string2Double(String param) {
		if (AssertUtil.isEmpty(param)) {
			log.error("Failed convert String to double,param is null.");
			return 0;
		}
		try {
			return Double.parseDouble(param);
		} catch (Exception e) {
			log.error("Failed conver String to double,param=" + param);
		}
		return 0;
	}

	/**
	 * 将字符串转换成double类型值,转换失败返回默认值.
	 * 
	 * @param param 待转换的值
	 * @return 转换后的double类型值
	 */
	public static double string2Double(String param, double defaultvalue) {
		if (AssertUtil.isEmpty(param)) {
			return defaultvalue;
		}
		try {
			return Double.parseDouble(param);
		} catch (Exception e) {
			log.error("Failed conver String to double,param=" + param);
		}
		return defaultvalue;
	}

	/**
	 * 对象转化为字符串
	 * 
	 * @param obj 待转换的对象
	 * @return 该对象的字符串
	 */
	public static String object2String(Object obj) {
		return (obj == null) ? "" : obj.toString();
	}

	/**
	 * 将boolean类型的值转换成int类型,true转换成1,false转换成0
	 * 
	 * @param flag 待转换的布尔值
	 * @return 转换后对应的值
	 */
	public static int boolean2number(boolean flag) {
		return !flag ? 0 : 1;
	}

	/**
	 * 将null对象转换为空字符,如果不为null就原样输出 如：null--->""
	 * 
	 * @param str 待转换的字符串
	 * @return 转换后的字符串
	 */
	public static String null2Empty(String str) {
		String temp = str;
		if (AssertUtil.isEmpty(temp)) {
			temp = "";
		}
		return temp;
	}

	/**
	 * 将null对象转换成空白字符,如果str部位null就原样输出.
	 * 
	 * @param str 待转换的字符串
	 * @return 转换后的字符
	 */
	public static String null2Space(String str) {
		String temp = str;
		if (AssertUtil.isEmpty(str)) {
			temp = " ";
		}
		return temp;
	}

	/**
	 * 将字符串转换成boolean类型
	 * 
	 * @param str 待转换的字符串
	 * @return 转换后的boolean
	 */
	public static boolean string2Boolean(String str) {
		return str != null && str.equalsIgnoreCase("true");
	}

	/**
	 * 将int类型转换成boolean类型,1转换成true,其他值转换为false 1->true 0->false
	 * 
	 * @param number 待转换的值
	 * @return 转换后的boolean类型值
	 */
	public static boolean int2Boolean(int number) {
		return number == 1;
	}

	/**
	 * 将unicode字符串转换成GBK字符串,如果unicodeStr为null将返回null.
	 * 转换规则是先将unicodeStr根据ISO8859-1转换成字节,然后再将字节根据GBK转换成字符串
	 * 
	 * @param unicodeStr 待转换的字符串
	 * @return 返回转换后的字符串
	 */
	public static String string2GBK(String unicodeStr) {
		if (AssertUtil.isNull(unicodeStr)) {
			log.error("Failed create string instance,unicodeStr is null.");
			return null;
		}
		try {
			return new String(unicodeStr.getBytes("ISO8859_1"), "GBK");
		} catch (Exception ex) {
			log.error("Failed create string instance,unicodeStr=" + unicodeStr, ex);
		}
		return null;
	}

	/**
	 * 将GBK字符串转换成ISO8859-1字符串 转换规则先将str根据GBK转换成字节,然后根据字节转换成ISO8859-1
	 * 如果str为null将返回null,转换异常将返回null.
	 * 
	 * @param str 待转换的字符串
	 * @return 转换后的字符串
	 */
	public static String string2ISO8859(String str) {
		if (AssertUtil.isNull(str)) {
			return null;
		}
		try {
			return new String(str.getBytes("GBK"), "ISO8859_1");
		} catch (Exception ex) {
			log.error("Failed create string instance,unicodeStr=" + str + ",error=" + ex.getMessage());
		}
		return null;
	}

	/**
	 * 将布尔类型转换成字符串类型, 如：true->"true" false->"false"
	 * 
	 * @param b 布尔类型
	 * @return 返回转换后的值
	 */
	public static String boolean2String(boolean b) {
		return b ? "true" : "false";
	}

	/**
	 * 将字符串转换成utf-8字节数组,如果str为null或者转换失败将返回null对象.
	 * 
	 * @param str 待转换的字符串
	 * @return 转换后的字节数组
	 */
	public static byte[] getUTFBytes(String str) {
		if (AssertUtil.isEmpty(str)) {
			return null;
		}
		try {
			return str.getBytes("utf-8");
		} catch (UnsupportedEncodingException e) {
			log.error("Failed conver string to utf byte[]" + ",error=" + e.getMessage());
		}
		return null;
	}

	/**
	 * 把10进制的数字转换成64进制
	 * 
	 * @param number 需转换的10进制数
	 * @param shift 转换结果位数,调用时,实参写6
	 * @return 返回一个6位的64进制数.
	 */
	public static String compressNumber(long number, int shift) {
		char[] buf = new char[64];
		int charPos = 64;
		int radix = 1 << shift;
		long mask = radix - 1;
		do {
			buf[--charPos] = DIGITS[(int) (number & mask)];
			number >>>= shift;
		} while (number != 0);
		return new String(buf, charPos, (64 - charPos));
	}

	/**
	 * 把64进制的字符串转换成10进制数字
	 * 
	 * @param decompStr 待转换的64进制数.
	 * @return 转换后的10进制数.
	 */
	public static long unCompressNumber(String decompStr) {
		long result = 0;
		for (int i = decompStr.length() - 1; i >= 0; i--) {
			if (i == decompStr.length() - 1) {
				result += getCharIndexNum(decompStr.charAt(i));
				continue;
			}
			for (int j = 0; j < DIGITS.length; j++) {
				if (decompStr.charAt(i) == DIGITS[j]) {
					result += ((long) j) << 6 * (decompStr.length() - 1 - i);
				}
			}
		}
		return result;
	}

	/**
	 * 取得字符的ASCII码的数字码.
	 * 
	 * @param ch ASCII码.
	 * @return ASCII数字码
	 */
	private static long getCharIndexNum(char ch) {
		long temp = 0L;
		int num = ((int) ch);
		if (num >= 48 && num <= 57) {
			temp = num - 48;
		} else if (num >= 97 && num <= 122) {
			temp = num - 87;
		} else if (num >= 65 && num <= 90) {
			temp = num - 29;
		} else if (num == 43) {
			temp = 62L;
		} else if (num == 47) {
			temp = 63L;
		}
		return temp;
	}

}
