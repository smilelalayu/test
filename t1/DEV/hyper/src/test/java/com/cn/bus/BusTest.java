package com.cn.bus;

import java.util.ArrayList;
import java.util.List;

import com.hm.bus.service.BusAppSentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.gep.core.util.RedisUtils;
import com.hm.bus.constants.BusReturn;
import com.hm.bus.dao.BusLnAppBatchMappingMapper;
import com.hm.bus.dao.BusLnAppMapper;
import com.hm.bus.module.BusLnApp;
import com.hm.bus.module.BusLnAppBatchMapping;
import com.hm.bus.service.BusBatchService;
import com.hm.bus.service.BusHandleService;

/**
 * @author liujie
 * @date 2017/1/19
 * @time 10:01
 * @desc
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:applicationContext*.xml")
public class BusTest {

//	@Autowired
//	private BusHandleService busHandleService;
	@Autowired
	private BusLnAppMapper busLnAppMapper;
	@Autowired
	private BusBatchService busBatchService;
	@Autowired
	private BusAppSentService busAppSentService;
//	@Autowired
//	private RedisUtils RedisUtils;
	@Autowired
	private BusLnAppBatchMappingMapper busLnAppBatchMappingMapper;

	@Test
	public void poll() {

		String s = RedisUtils.lPop(BusReturn.BUS_REDIS_LIST);
		System.out.print(s);
	}

	@Test
	public void push() {
		List<String> lnAppList = new ArrayList<>();
		lnAppList.add("1234");
		lnAppList.add("5678");
		lnAppList.add("0000");
		RedisUtils.lPush(BusReturn.BUS_REDIS_LIST, lnAppList);
	}

	@Test
	public void busTest() {

		BusLnApp busLnApp = busLnAppMapper.selectByPrimaryKey(10135950L);
		String json = JSON.toJSONString(busLnApp);
//		busHandleService.handleBusPosBL(json,false);

	}

	@Test
	public void mapping() {

		List<BusLnAppBatchMapping> mappings = busLnAppBatchMappingMapper.selectByLnAppId("10000002");
		System.out.print(mappings);
	}

	/**
	 * redis生产消费测试
	 */
	@Test
	public void redisTest() {
		/*List<String> lnAppList = new ArrayList<String>();
		lnAppList.add("11111111");
		RedisUtils.clean(BusReturn.BUS_REDIS_LIST);
		RedisUtils.publishList(BusReturn.BUS_REDIS_LIST, lnAppList);*/

		String s = RedisUtils.lPop(BusReturn.BUS_REDIS_LIST);
		System.out.print(s);

	}

	@Test
	public void busTest1() {
		busAppSentService.busAppSent();
	}

	@Test
	public void sendTest() {
		busBatchService.send("BUSBT20170217120427");
	}
}
