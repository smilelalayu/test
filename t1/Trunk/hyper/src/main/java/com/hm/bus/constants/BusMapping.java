package com.hm.bus.constants;

import java.util.HashMap;
import java.util.Map;

public class BusMapping {
	public static final Map<String, String> bank;
	public static final Map<String, String> repaymentType;
	public static final Map<String, String> degree;
	public static final Map<String, String> marry;
	public static final Map<String, String> unit;
	public static final Map<String, String> sex;
	public static final Map<String, String> duty;
	public static final Map<String, String> contactRelation;
	public static final Map<String, String> cashUnit;

	static {
		bank = createMap();
		repaymentType = createRepayType();
		degree = createDegree();
		marry = createMarry();
		unit = createUnit();
		cashUnit = createCashUnit();
		sex = createSex();
		duty = createDuty();
		contactRelation = createContactRelation();
	}

	private static Map<String, String> createMap() {
		Map<String, String> result = new HashMap<String, String>();
		result.put("0102", "102");
		result.put("0103", "105");
		result.put("0104", "104");
		result.put("0105", "103");
		result.put("0310", "310");
		result.put("0303", "303");
		result.put("0309", "309");
		result.put("0304", "304");
		result.put("0302", "302");
		result.put("0305", "305");
		result.put("0306", "306");
		result.put("0307", "307");
		result.put("0308", "308");
		result.put("0002", "403");
		result.put("0514", "514");
		return result;
	}

	private static Map<String, String> createRepayType() {
		Map<String, String> result = new HashMap<String, String>();
		result.put("1", "3");
		result.put("2", "1");
		return result;
	}

	private static Map<String, String> createDegree() {
		Map<String, String> result = new HashMap<String, String>();
		result.put("01", "B0301");
		result.put("02", "B0301");
		result.put("03", "B0303");
		result.put("04", "B0302");
		result.put("05", "B0304");
		result.put("06", "B0305");
		result.put("07", "B0306");
		return result;
	}

	private static Map<String, String> createMarry() {
		Map<String, String> result = new HashMap<String, String>();
		result.put("1", "B0501");
		result.put("2", "B0502");
		result.put("9", "B0506");
		return result;
	}

	private static Map<String, String> createUnit() {
		Map<String, String> result = new HashMap<String, String>();
		result.put("01", "B0907");
		result.put("02", "B0916");
		result.put("03", "B0901");
		result.put("04", "B0902");
		result.put("05", "B0904");
		result.put("06", "B0903");
		result.put("07", "B0908");
		result.put("99", "B0908");
		return result;
	}
	private static Map<String, String> createCashUnit() {
		Map<String, String> result = new HashMap<String, String>();
		result.put("01", "B0917");
		result.put("02", "B0916");
		result.put("03", "B0918");
		result.put("04", "B0913");
		result.put("05", "B0914");
		result.put("06", "B0915");
		result.put("99", "B0908");
		return result;
	}

	private static Map<String, String> createSex() {
		Map<String, String> result = new HashMap<String, String>();
		result.put("1", "N0201");
		result.put("2", "N0202");
		result.put("男", "N0201");
		result.put("女", "N0202");
		return result;
	}

	private static Map<String, String> createDuty() {
		Map<String, String> result = new HashMap<String, String>();
		result.put("01", "B2917");
		result.put("02", "B2916");
		result.put("03", "B2915");
		result.put("04", "B2914");
		result.put("05", "B2914");
		result.put("06", "B2914");
		result.put("07", "B2914");
		result.put("08", "B2914");
		result.put("09", "B2914");
		result.put("10", "B2914");
		result.put("11", "B2914");
		result.put("12", "B2914");
		result.put("13", "B2914");
		result.put("14", "B2914");
		result.put("15", "B2914");
		result.put("99", "B2914");
		return result;
	}

	private static Map<String, String> createContactRelation() {
		Map<String, String> result = new HashMap<String, String>();
		result.put("01", "F1001");
		result.put("02", "F1002");
		result.put("03", "F1006");
		result.put("04", "F1006");
		result.put("05", "F1006");
		result.put("06", "F1006");
		result.put("07", "F1006");
		result.put("08", "F1005");
		result.put("09", "F1004");
		result.put("10", "F1099");
		result.put("11", "F1099");
		return result;
	}
}
