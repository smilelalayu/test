package com.hm.bus.util;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;

import com.gep.core.exceptoin.UncheckedException;
import com.gep.core.util.CollectionUtils;


/**
 * 
 * <p>Description: 一些常见的断言判断工具类,如字符串是否为空等,当断言失败时将抛出运行时异常</p>
 * @date 2016年1月8日
 * @author evan
 * @version 1.0
 * <p>Company:9fchaoneng</p>
 * <p>Copyright:Copyright(c)2015</p>
 */
public final class AssertUtil {

	/** 判断字符串全部为数字的正则表达式对象 */
	public static final Pattern ALL_DIGITAL_PATTER = Pattern.compile("^\\d*$");

	/** 判断是否包含特殊字符 */
	public static final Pattern CONTAIN_OF_OTHER_PREGEX3 = Pattern.compile("[^\\u4e00-\\u9fa5a-zA-Z0-9]");
	/** 检测是否是utf8字符 */
	public static final String UTF_REGEX = "[^\\f\\a\\v\\t\\r\\n\u0020-\u007E\u3400-\u4DB5\u4E00-\u9FA5\u9FA6-\u9FBB\uF900-\uFA2D\uFA30-\uFA6A\uFA70-\uFAD9\u20000-\u2A6D6\u2F800-\u2FA1D\uFF00-\uFFEF\u2E80-\u2EFF\u3000-\u303F\u31C0-\u31EF\u3040-\u309F\u30A0-\u30FF\u31F0-\u31FF\uAC00-\uD7AF\u1100-\u11FF\u3130-\u318F]";
	/** 检测是否是utf8字符 */
	public static final Pattern UTF_PATTER = Pattern.compile(UTF_REGEX);
	/** 日志记录属性常量 */
	private static final Logger LOG = Logger.getLogger(AssertUtil.class);
	/** 常用的一些特殊字符 */
	private static Set<String> specialCharSet = new HashSet<String>();
	/** 常用的一些特殊字符2 */
	private static Set<String> specialCharSet2 = new HashSet<String>();

	private AssertUtil() {
	}

	/**
	 * 断言obj对象不为null,如果为null将抛出运行时无效参数异常 调用方式
	 * 
	 * AssertUtil.assertNotNull(
	 * 
	 * @param obj 待断言的任何对象
	 * @param name 参数名称,用于记录日志用
	 * @exception IllegalArgumentException 当obj对象为null时抛出这个异常
	 */
	public static void assertNotNull(Object obj, String name) {
		if (obj == null) {
			final String error = "Failed assert " + name + " param is null.";
			LOG.error(error);
			throw new IllegalArgumentException(error);
		}
	}

	/**
	 * 断言obj对象为null,如果不为null将抛出运行时无效参数异常
	 * @param obj 待断言的对象
	 * @param name 参数名称,用于记录日志使用
	 * @exception IllegalArgumentException 当obj对象不为null时抛出这个异常
	 */
	public static void assertNull(Object obj, String name) {
		if (obj != null) {
			final String error = "Failed assert param is not null," + name + "=" + obj;
			LOG.error(error);
			throw new IllegalArgumentException("Failed assert param \"" + name + "\" is not null.");
		}
	}

	/**
	 * 断言集合对象或者字符串对象不为空,如果为null或者为empty将抛出运行时异常
	 * 
	 * @param t 集合对象或者String对象
	 * @param name 参数名称,用于记录日志用
	 * @exception IllegalArgumentException 当t对象为null时抛出这个异常
	 */
	public static <T> void assertNotEmpty(T t, String name) {
		if (t == null) {
			final String error = "Failed assert param \"" + name + "\" is null.";
			LOG.error(error);
			throw new IllegalArgumentException(error);
		} else if (t instanceof Collection) {
			@SuppressWarnings("rawtypes")
			Collection list = (Collection) t;
			if (list.isEmpty()) {
				final String error = "Failed assert param \"" + name + "\" is empty.";
				LOG.error(error);
				throw new IllegalArgumentException(error);
			}
		} else if (t instanceof String) {
			String str = (String) t;
			if (str.isEmpty()) {
				final String error = "Failed assert param \"" + name + "\" is empty.";
				LOG.error(error);
				throw new IllegalArgumentException(error);
			}
		}
	}

	/**
	 * 判断输入字符串参数据是否为空,不会抛出任何异常
	 * 
	 * @param str 待判断的对象
	 * @return 为null或者empty将返回true
	 */
	public static boolean isEmpty(String str) {
		boolean result = false;
		if (str == null || str.isEmpty()) {
			result = true;
		}
		return result;
	}

	/**
	 * 判断给定参数是否为null,为null将返回true.
	 * 
	 * @param obj 待判断参数
	 * @return 参数为null返回true
	 */
	public static boolean isNull(Object obj) {
		return obj == null ? true : false;
	}

	/**
	 * 判断输入字符串参数是否不为empty,不会抛出任何异常
	 * 
	 * @param str 待判断的参数
	 * @return 如果参数为null或者empty将返回false
	 */
	public static boolean isNotEmpty(String str) {
		return !isEmpty(str);
	}

	/**
	 * 判断字符串是否是全数字
	 * 
	 * @param str 待判断的字符串
	 * @return 如果字符串全部为数字,将返回true,否则返回false
	 */
	public static boolean isNumber(String str) {
		if (isEmpty(str)) {
			return false;
		}
		if (ALL_DIGITAL_PATTER.matcher(str).matches()) {
			return true;
		}
		return false;
	}

	/**
	 * 
	 * 判断目标字符串在源字符中是否存在,判断原则是先将src进行逗号分割 然后逐个和dest比较，如果相等将返回true
	 * 
	 * 主要使用场景是ip白名单控制判断.
	 * 
	 * @param src 源字符串，如果为null将返回false.
	 * @param dest 目标字符串，如果为null将返回false.
	 * @return 包含返回true,否则返回false.
	 */
	public static boolean isContains(String src, String dest) {
		if (isEmpty(src) || isEmpty(dest)) {
			return false;
		}
		String[] tempArray = src.split(",");
		for (String temp : tempArray) {
			if (isNotEmpty(temp) && temp.trim().equals(dest.trim())) {
				return true;
			}
		}
		return false;
	}

	/**
	 * 判断字符串是否是正确的utf8编码
	 * @param tmpstr 待检测的编码
	 * @return 符合返回true.
	 */
	public static boolean isRightUTF(String tmpstr) {
		if (isEmpty(tmpstr)) {
			return true;
		}
		boolean result = true;
		if (UTF_PATTER.matcher(tmpstr).find()) {
			result = false;
		}
		return result;
	}

	/**
	 * 检查是不是utf字符。 utf字符的特点是其中一个char数组应该大于255 只要有一个大于255,即认为是utf
	 * 
	 * @param str 待检测的字符串
	 */
	public static boolean checkIsUTF(String str) {
		char[] charstr = str.toCharArray();
		for (int i = 0; i < charstr.length; i++) {
			if (charstr[i] > 255) {
				return true;
			}
		}
		return false;
	}

	/**
	 * <p>
	 * 判断这个字符是否是空白字符 Checks if a String is whitespace, empty ("") or null.
	 * </p>
	 * 
	 * <pre>
	 * Tools.isBlank(null)      = true
	 * Tools.isBlank(&quot;&quot;)        = true
	 * Tools.isBlank(&quot; &quot;)       = true
	 * Tools.isBlank(&quot;bob&quot;)     = false
	 * Tools.isBlank(&quot;  bob  &quot;) = false
	 * </pre>
	 * 
	 * @param str the String to check, may be null
	 * @return <code>true</code> if the String is null, empty or whitespace
	 */
	public static boolean isBlank(String str) {
		if (isEmpty(str)) {
			return true;
		}
		int strLen = str.length();
		for (int i = 0; i < strLen; i++) {
			if (!Character.isWhitespace(str.charAt(i))) {
				return false;
			}
		}
		return true;
	}

	/**
	 * 判断是否包含有 < &gt ~!@#$%^&*()_+,.;/?'"[]{}\| 的字符判定是否为html非法代码
	 * 
	 * @param str 待检测的字符串
	 * @return true 包含非法字符
	 */
	public static boolean isContainOfHtml(String str) {
		boolean result = false;
		if (isNotEmpty(str)) {
			if (str.indexOf("<") > -1) {
				result = true;
			}
			if (str.indexOf("&gt") > -1) {
				result = true;
			}
		}
		return result;
	}

	/**
	 * 判断是否包含非法字符 不包含非法字符~!@#$%^&*()_+,.;/?'"[]{}\|
	 * @param src 待判断的字符串
	 * @return 如果存在非法字符将返回true
	 */
	public static boolean isContainOfOther(String src) {
		boolean temp = false;
		if (isNotEmpty(src)) {
			for (String str : specialCharSet) {
				if (src.indexOf(str) > -1) {
					temp = true;
					break;
				}
			}
		}
		return temp;
	}

	/**
	 * 判断是否包含非法字符
	 * 
	 * @param src 待检测的字符串
	 * @return 包含特殊字符返回true
	 */
	public static boolean isContainOfOther2(String src) {
		boolean temp = false;
		if (isNotEmpty(src)) {
			for (String str : specialCharSet2) {
				if (src.indexOf(str) > -1) {
					temp = true;
					break;
				}
			}
		}
		return temp;
	}

	/**
	 * 判断是否包含特殊字符
	 * @param src 待判断的字符串
	 * @return 包含特殊字符返回true
	 */
	public static boolean isContainOfOther3(String src) {
		Matcher m = CONTAIN_OF_OTHER_PREGEX3.matcher(src);
		if (m.find()) {
			return true;
		}
		return false;
	}

	/**
	 * 判断指定的字符串是否包含有中文.
	 * 
	 * @param str 待检测的字符串.
	 * @return 包含中文将返回true.
	 */
	public static boolean hasChinese(String str) {
		if (isEmpty(str)) {
			return false;
		}
		try {
			int lenun = str.getBytes("UTF-8").length;
			int lenen = str.getBytes("ISO-8859-1").length;
			return lenun != lenen;
		} catch (Exception e) {
			LOG.error("Failed check string has Chinese.", e);
		}
		return false;
	}

	/**
	 * 断言集合不为空。
	 * 
	 * @param collection
	 *            待判断的集合
	 * @param message
	 *            错误信息
	 */
	public static void notEmpty(Collection<?> collection, String message) {
		if (CollectionUtils.isEmpty(collection)) {
			throw new UncheckedException(message);
		}
	}

	/**
	 * 断言数组不为空。
	 * 
	 * @param array
	 *            待判断的数组
	 * @param message
	 *            错误信息
	 */
	public static void notEmpty(Object[] array, String message) {
		if (CollectionUtils.isEmpty(array)) {
			throw new UncheckedException(message);
		}
	}

	/**
	 * 断言数组不为空。
	 * 
	 * @param array
	 *            待判断的数组
	 */
	public static void notEmpty(Object[] array) {
		notEmpty(array, "断言失败: 数组不能是空");
	}

	/**
	 * 断言Map不为空。
	 * 
	 * @param map
	 *            待判断的Map
	 * @param message
	 *            错误信息
	 */
	public static void notEmpty(Map<?, ?> map, String message) {
		if (CollectionUtils.isEmpty(map)) {
			throw new UncheckedException(message);
		}
	}

	/**
	 * 断言Map不为空。
	 * 
	 * @param map
	 *            待判断的Map
	 */
	public static void notEmpty(Map<?, ?> map) {
		notEmpty(map, "断言失败: Map不能是空");
	}

	/**
	 * 初始化特殊字符集
	 */
	static {
		specialCharSet.add("<");
		specialCharSet.add("&");
		specialCharSet.add("~");
		specialCharSet.add("!");
		specialCharSet.add("@");
		specialCharSet.add("#");
		specialCharSet.add("$");
		specialCharSet.add("%");
		specialCharSet.add("*");
		specialCharSet.add("(");
		specialCharSet.add(")");
		specialCharSet.add("_");
		specialCharSet.add("+");
		specialCharSet.add(",");
		specialCharSet.add(".");
		specialCharSet.add(";");
		specialCharSet.add("/");
		specialCharSet.add("?");
		specialCharSet.add("`");
		specialCharSet.add("\"");
		specialCharSet.add("`");
		specialCharSet.add("[");
		specialCharSet.add("]");
		specialCharSet.add("{");
		specialCharSet.add("}");
		specialCharSet2.addAll(Collections.unmodifiableSet(specialCharSet));
		specialCharSet2.remove("@");
		specialCharSet2.remove("_");
		specialCharSet2.remove(".");
	}
}
