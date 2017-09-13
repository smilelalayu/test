package com.hm.bus.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;

/**
 * List工具类
 * 
 * @author leimeng E-mail: leimeng@9fchaoneng.com
 * @version 创建时间：2017年1月20日 上午11:33:02
 */
public class ListUtil {
	/**
	 * 分割List
	 *
	 * @param list
	 *            待分割的list
	 * @param pageSize
	 *            每段list的大小
	 * @return List<<List<T>>
	 */
	public static <T> List<List<T>> splitList(List<T> list, int pageSize) {
		int listSize = list.size(); // list的大小
		int page = (listSize + (pageSize - 1)) / pageSize;// 页数
		List<List<T>> listArray = new ArrayList<List<T>>();// 创建list数组,用来保存分割后的list
		for (int i = 0; i < page; i++) { // 按照数组大小遍历
			List<T> subList = new ArrayList<T>(); // 数组每一位放入一个分割后的list
			for (int j = 0; j < listSize; j++) {// 遍历待分割的list
				int pageIndex = ((j + 1) + (pageSize - 1)) / pageSize;// 当前记录的页码(第几页)
				if (pageIndex == (i + 1)) {// 当前记录的页码等于要放入的页码时
					subList.add(list.get(j)); // 放入list中的元素到分割后的list(subList)
				}
				if ((j + 1) == ((j + 1) * pageSize)) {// 当放满一页时退出当前循环
					break;
				}
			}
			listArray.add(subList);// 将分割后的list放入对应的数组的位中
		}
		return listArray;
	}

	/**
	 * 删除List中重复元素
	 * 
	 * @param list
	 * @return
	 */
	public static <T> List<T> removeDuplicate(List<T> list) {
		HashSet<T> set = new HashSet<T>(list);
		list.clear();
		list.addAll(set);
		return list;
	}

	/**
	 * 查找重复元素
	 * 
	 * @param list
	 * @return
	 */
	public static <T> List<T> findDuplicatea(List<T> list) {
		HashSet<T> set = new HashSet<T>(list);
		List<T> duplicateaElements = new ArrayList<T>();
		Collection rs = CollectionUtils.disjunction(list, set);
		duplicateaElements.addAll(rs);
		return duplicateaElements;
	}

	/**
	 * list转String
	 * 
	 * @param list
	 * @param separator
	 * @return
	 */
	public static String listToString(List list, String separator) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < list.size(); i++) {
			sb.append(list.get(i)).append(separator);
		}
		return sb.toString().substring(0, sb.toString().length() - 1);
	}

}
