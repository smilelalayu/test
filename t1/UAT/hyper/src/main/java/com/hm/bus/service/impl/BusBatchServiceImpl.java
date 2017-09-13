package com.hm.bus.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.gep.core.base.BaseMapper;
import com.gep.core.base.BaseServiceImpl;
import com.gep.core.entity.Page;
import com.gep.core.util.InputChecker;
import com.gep.core.util.RedisUtils;
import com.hm.base.model.BaseInfo;
import com.hm.base.service.ProvinceCityService;
import com.hm.bus.constants.BusReturn;
import com.hm.bus.dao.BsProdectSeriesMapper;
import com.hm.bus.dao.BusBatchInfoMapper;
import com.hm.bus.dao.BusLnAppBatchMappingMapper;
import com.hm.bus.dao.BusLnAppCustInfoMapper;
import com.hm.bus.dao.BusLnAppMapper;
import com.hm.bus.dao.JjCodeMapper;
import com.hm.bus.dao.LnRiskFicoResultMapper;
import com.hm.bus.dao.SmConfigMapper;
import com.hm.bus.module.BusBatchInfo;
import com.hm.bus.module.BusLnApp;
import com.hm.bus.module.BusLnAppBatchMapping;
import com.hm.bus.service.BusBatchService;
import com.hm.bus.util.DateUtil;
import com.hm.bus.util.Result;

/**
 * @author liujie
 * @date 2017/1/12
 * @time 15:55
 * @desc
 */
@Service
public class BusBatchServiceImpl extends BaseServiceImpl<BusBatchInfo, Long>
implements BusBatchService{
	private static final Logger LOG = Logger
			.getLogger(BusBatchServiceImpl.class);

	@Autowired
	private BusLnAppBatchMappingMapper busLnAppBatchMappingMapper;
	@Autowired
	private BusLnAppCustInfoMapper busLnAppCustInfoMapper;
	@Autowired
	private JjCodeMapper jjCodeMapper;
	@Autowired
	private LnRiskFicoResultMapper lnRiskFicoResultMapper;
	@Autowired
	private BusBatchInfoMapper busBatchInfoMapper;
	@Autowired
	private BsProdectSeriesMapper bsProdectSeriesMapper;
	@Autowired
	private ProvinceCityService provinceCityService;
	@Autowired
	private BusLnAppMapper busLnAppMapper;
	@Autowired
	private SmConfigMapper smConfigMapper;

	
	public void init() {
		province2Redis();
		city2Redis();
		district2Redis();
	}

	@Override
	public Result send(String batchNo) {
//		Long length = redisService.listSize(BusReturn.BUS_REDIS_LIST);
		Integer length = RedisUtils.getLength(BusReturn.BUS_REDIS_LIST);
		if (length != null && length > 0) {
			return new Result(true, String.format("队列中还有%s单正在推送中。。。。", length));
		}
		toRedisByBatchNo(batchNo);
		/*
		 * province2Redis(); city2Redis(); district2Redis();
		 */
		List<String> lnAppList = busLnAppBatchMappingMapper
				.selectByBatchNo(batchNo);
		RedisUtils.removeObject(BusReturn.BUS_REDIS_LIST);
		RedisUtils.lPush(BusReturn.BUS_REDIS_LIST, lnAppList.toArray());
		return null;
	}

	@Override
	public void importBusBatch(String batchNo, String fileKey, String fileName,
			List<BusLnApp> lnAppList, String userID,String userName,String reqAppayDate) {

		BusBatchInfo busBatch = new BusBatchInfo();
		busBatch.setBatchNO(batchNo);
		busBatch.setFileKey(fileKey);
		busBatch.setFileName(fileName);
		busBatch.setUpdateTime(new Date());
		busBatch.setUpdateUser(userID);
		busBatch.setUpdateUserName(userName);
		busBatch.setAppayDate(null);
		//增加批次申请时间
		if (!StringUtils.isBlank(reqAppayDate)) {
			//DateUtil.toDate(reqAppayDate,"yyyy-MM-dd hh:mm:ss");
			Date appayDate = DateUtil.toDate(reqAppayDate,"yyyy/MM/dd HH:mm:ss");
			busBatch.setAppayDate(appayDate);
		}
		List<String> posAppIdsList = new ArrayList<String>();
		List<BusLnAppBatchMapping> busAppMapingList = new ArrayList<BusLnAppBatchMapping>();
		for (BusLnApp app : lnAppList) {
			BusLnAppBatchMapping busAppMaping = new BusLnAppBatchMapping();
			busAppMaping.setBatchNo(batchNo);
			busAppMaping.setLnAppId(app.getId());
			busAppMaping.setUpdateTime(new Date());
			busAppMapingList.add(busAppMaping);
			
//			if("POS".equals(app.getLoanType())){
			posAppIdsList.add(app.getId() + "");
//			}
		}
		//TODO 只导入POS贷
		busBatch.setTotal((long) posAppIdsList.size());
		busBatch.setTotalUnsent((long) posAppIdsList.size());
		// 插入批次表
		busBatchInfoMapper.insert(busBatch);
		// 插入批次关联表
		busLnAppBatchMappingMapper.insertList(busAppMapingList);
		
		//TODO 只更新POS贷状态,更新LnApp状态35->36
//		busLnAppMapper.batchUpdateAppState("36", posAppIdsList);
	}

	@Override
	public String getBatchNo() {
		String batchNo = "";
		SimpleDateFormat sdfTemp = new SimpleDateFormat("yyyyMMddHHmmss");
		boolean flag = true;
		while (flag) {
			// 前缀"BUSBT"
			batchNo = "BUSBT" + sdfTemp.format(new Date());
			BusBatchInfo btemp = busBatchInfoMapper.selectByPrimaryKey(batchNo);
			if (btemp == null) {
				flag = false;
				break;
			}
		}
		return batchNo;
	}

	private void smConfig2Redis() {
		List<Map<String, Object>> smConfigList = smConfigMapper
				.selectSmConfigMap();
		RedisUtils.removeObject(BusReturn.SM_CONFIG_REDIS_KEY);
		Map<String, String> map = new HashMap<String, String>();
		for (Map m : smConfigList) {
			if (m!=null&&!(m.get("confKey") == null)) {
				String key = m.get("confKey").toString();
				String value = JSON.toJSONString(m);
				map.put(key, value);
			}
		}
		RedisUtils.putAllObject(BusReturn.SM_CONFIG_REDIS_KEY, map , 31536000000L);
	}

	private void custInfo2Redis(String batchNo) {
		List<Map<String, Object>> custInfoList = busLnAppCustInfoMapper
				.selectAll(batchNo);// 客户贷款基本信息
		RedisUtils.removeObject(BusReturn.LN_APP_CUST_INFO_REDIS_KEY);
		Map<String, String> map = new HashMap<String, String>();
		for (Map m : custInfoList) {
			if (m!=null&&!(m.get("appId") == null)) {
				String key = m.get("appId").toString();
				String value = JSON.toJSONString(m);
				map.put(key, value);
			}
		}
		RedisUtils.putAllObject(BusReturn.LN_APP_CUST_INFO_REDIS_KEY, map , 31536000000L);
	}

	private void jjCode2Redis() {
		List<Map<String, Object>> jjCodeList = jjCodeMapper.selectJjCodeName();
		Map<String, String> map = new HashMap<String, String>();
		RedisUtils.removeObject(BusReturn.JJ_CODE_REDIS_KEY);
		for (Map m : jjCodeList) {
			if (m!=null&&!(m.get("code") == null)) {
				String key = m.get("code").toString();
				String value = JSON.toJSONString(m);
				map.put(key, value);
			}
		}
		RedisUtils.putAllObject(BusReturn.JJ_CODE_REDIS_KEY,  map , 31536000000L);
	}

	private void lrfr2Redis(String batchNo) {
		List<Map<String, Object>> lrfrList = lnRiskFicoResultMapper
				.selectByBatchNo(batchNo);// 信用评级
		Map<String, String> map = new HashMap<String, String>();
		RedisUtils.removeObject(BusReturn.LN_RISK_FICO_RESULT_REDIS_KEY);
		for (Map m : lrfrList) {
			if(m!=null) {
				String key = m.get("appId").toString();
				String value = JSON.toJSONString(m);
				map.put(key, value);
			}
		}
		RedisUtils.putAllObject(BusReturn.LN_RISK_FICO_RESULT_REDIS_KEY,  map , 31536000000L);
	}

	private void sbps2Redis() {
		List<Map<String, Object>> sbpsList = bsProdectSeriesMapper
				.selectAllReductionPeriod();// 产品减期
		Map<String, String> map = new HashMap<String, String>();
		RedisUtils.removeObject(BusReturn.BS_PRODECT_SERIES_REDIS_KEY);
		for (Map m : sbpsList) {
			if (m!=null&&!(m.get("id") == null)) {
				String key = m.get("id").toString();
				String value = JSON.toJSONString(m);
				map.put(key, value);
			}
		}
		RedisUtils.putAllObject(BusReturn.BS_PRODECT_SERIES_REDIS_KEY,  map , 31536000000L);
	}

	private void busProductRedis(String batchNo) {
		List<Map<String, Object>> busProductList = busLnAppMapper
				.selectBusProductIdByBatchNo(batchNo);
		Map<String, String> map = new HashMap<String, String>();
		RedisUtils.removeObject(BusReturn.BUS_PRODUCT_REDIS_KEY);
		for (Map m : busProductList) {
			if(m!=null) {
				String key = m.get("id").toString();
				String value = JSON.toJSONString(m);
				map.put(key, value);
			}
		}
		RedisUtils.putAllObject(BusReturn.BUS_PRODUCT_REDIS_KEY,  map , 31536000000L);
	}

	private void province2Redis() {
		List<BaseInfo> provinceList = provinceCityService
				.queryProvinceList();// 省
		LOG.info("hm初始化省：" + provinceList.size());
		Map<String, String> map = new HashMap<String, String>();
		RedisUtils.removeObject(BusReturn.PROVINCE_REDIS_KEY);
		for (BaseInfo m : provinceList) {
			if (!(m.getId() == null)) {
				String key = m.getId();
				String value = JSON.toJSONString(m);
				map.put(key, value);
			}
		}
		RedisUtils.putAllObject(BusReturn.PROVINCE_REDIS_KEY,  map , 31536000000L);
	}

	private void city2Redis() {
		List<BaseInfo> cityList = provinceCityService.queryCityList();// 市
		LOG.info("hm初始化市：" + cityList.size());
		Map<String, String> map = new HashMap<String, String>();
		RedisUtils.removeObject(BusReturn.CITY_REDIS_KEY);
		for (BaseInfo m : cityList) {
			if (!(m.getId() == null)) {
				String key = m.getId();
				String value = JSON.toJSONString(m);
				map.put(key, value);
			}
		}
		RedisUtils.putAllObject(BusReturn.CITY_REDIS_KEY,  map , 31536000000L);
	}

	private void district2Redis() {
		List<BaseInfo> districtList = provinceCityService
				.queryDistrictList();// 区
		Map<String, String> map = new HashMap<String, String>();
		LOG.info("hm初始化区：" + districtList.size());
		RedisUtils.removeObject(BusReturn.DISTRICT_REDIS_KEY);
		for (BaseInfo m : districtList) {
			if (!(m.getId() == null)) {
				String key = m.getId();
				String value = JSON.toJSONString(m);
				map.put(key, value);
			}
		}
		RedisUtils.putAllObject(BusReturn.DISTRICT_REDIS_KEY,  map , 31536000000L);
	}
	
	@Override
	public BaseMapper<BusBatchInfo, Long> getMapper() {
		return busBatchInfoMapper;
	}

	@Override
	public Page<BusBatchInfo> list(Page<BusBatchInfo> page) {

		BusBatchInfo t = page.getT();
		t.setIsNoParam(busBatchInfoIsNull(t) ? "true" : null);
		return super.list(page);
	}

	private boolean busBatchInfoIsNull(BusBatchInfo t) {
		if (InputChecker.isEmpty(t)) {
			return true;
		}

		if (InputChecker.isEmpty(t.getBatchNO())
				& InputChecker.isEmpty(t.getBeginDate())
				& InputChecker.isEmpty(t.getEndDate())
				& InputChecker.isEmpty(t.getTotal())) {
			return true;
		}

		return false;
	}

	@Override
	public BusBatchInfo selectByPrimaryKey(String batchNo) {
		return busBatchInfoMapper.selectByPrimaryKey(batchNo);
	}

	@Override
	public List<String> selectAppIdsByBatchNO(String batchNO) {
		List<String> ids = busBatchInfoMapper.selectAppIdsByBatchNO(batchNO);
		return ids.size() == 0 ? Collections.EMPTY_LIST : ids;
	}
	public void toRedisByBatchNo(String batchNo) {
		smConfig2Redis();
		custInfo2Redis(batchNo);
		jjCode2Redis();
		lrfr2Redis(batchNo);
		sbps2Redis();
		busProductRedis(batchNo);
	}


	@Override
	public void updateBeginDateAndSentToBusByBatchNO(String batchNO) {
		busBatchInfoMapper.updateBeginDateAndSentToBusByBatchNO(batchNO);
	}

	@Override
	public void reloadBaseInfo() {
		LOG.info("BusBatchServiceImpl reload begin to set base info  to redis!");
		this.init();
		LOG.info("BusBatchServiceImpl reload finish setting base info  to redis!");
	}
	
}
