package com.hm.bus.service;

import com.hm.bus.util.Result;

/**
 * 调外联推BUS #1182
 * Created by jiufu on 2017/1/12.
 */
public interface BusHandleService {

    public void handleBus(String lnAppAndBatchNO);

    public Result handleBusPosBL(String lnApp, boolean isswitch);

    public Result handleBusPosDBL(String lnApp) throws Exception;

    public Result handleBusCash(String lnApp) throws Exception;
}
