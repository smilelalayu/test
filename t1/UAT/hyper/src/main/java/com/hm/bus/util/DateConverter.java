package com.hm.bus.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

import com.gep.core.util.StringUtil;

/**
 * SpringMVC时间转化
 * 
 * @author zhangyankun
 *
 */
public class DateConverter implements Converter<String, Date> {
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
	Date date = new Date();

	@Override
	public Date convert(String source) {
		try {
			if (StringUtil.isNotEmpty(source)) {
				date = sdf.parse(source);
			} else {
				date = null;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return date;
	}

}