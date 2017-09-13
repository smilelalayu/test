package com.hm.bus.service.impl;

import com.gep.core.util.RedisUtils;
import com.gep.util.PropertyUtils;
import com.hm.bus.constants.BusReturn;
import com.hm.bus.service.BusAppSentService;
import com.hm.bus.service.BusBatchService;
import com.hm.bus.service.BusBjHandleService;
import com.hm.bus.service.BusHandleService;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author w_jiangpengfei
 * @version v 0.1 2017/7/20 时间10:46 w_jiangpengfei Exp $
 */
@Service
public class BusAppSentServiceImpl implements BusAppSentService, InitializingBean {

    private final static Logger LOG = Logger.getLogger(BusAppSentServiceImpl.class);

    @Autowired
    private ThreadPoolTaskExecutor threadPoolTaskExecutor;
    @Autowired
    private BusHandleService busHandleService;
    @Autowired
    private BusBjHandleService busBjHandleService;
    
    @Autowired
    private BusBatchService busBatchService;
    

    /**
     * 初始化
     * @throws Exception
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        threadPoolTaskExecutor.execute(
                new Runnable() {
                    public void run() {
                        busAppSent();
                    }
                }
        );
    }

    @Override
    public void busAppSent() {
        //获取推BUS开关
        String switchKey = PropertyUtils.getConfig("bus", "com.hm.bus.switch");
        if ("Y".equalsIgnoreCase(switchKey)) {
            for (; ; ) {
                try {
                    Thread.sleep(1000);
                    String lnAppAndBatchNO = RedisUtils.bRPop(BusReturn.BUS_REDIS_LIST, 0, TimeUnit.SECONDS);
                    //推送切换开关,开关默认是关着N
                    //N 调外联进行推BUS，Y调北京进行推BUS
                    
                    //获取是否直连北京接口开关(N:外联，Y:北京)
                    String directLinkSwitchKey = PropertyUtils.getConfig("bus", "com.hm.bus.direct.link.switch");
                    LOG.info("[BusAppSentServiceImpl] busAppSent method 是否直连北京开关:"+directLinkSwitchKey);
                    
                    //重新加载省份  城市  地区数据到REDIS
                    busBatchService.reloadBaseInfo();
                    
                    if ("N".equals(directLinkSwitchKey)) {
                        busHandleService.handleBus(lnAppAndBatchNO);
                    } else {
                        busBjHandleService.handleBus(lnAppAndBatchNO);
                    }
                } catch (Exception e) {
                    LOG.error("[BusAppSentServiceImpl] busAppSent method 推送BUS发生异常:" + e);
                }
            }
        }
    }
}