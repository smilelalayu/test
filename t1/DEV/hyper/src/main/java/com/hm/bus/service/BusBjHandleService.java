package com.hm.bus.service;

import com.hm.bus.util.Result;

/**
 * 调北京推BUS  #1182
 * @author w_jiangpengfei
 * @version v 0.1 2017/7/19 时间15:32 w_jiangpengfei Exp $
 */
public interface BusBjHandleService {
    public void handleBus(String lnAppAndBatchNO);

    public Result handleBusPosBL(String lnApp, boolean isswitch);

    public Result handleBusPosDBL(String lnApp) throws Exception;

    public Result handleBusCash(String lnApp) throws Exception;
}
