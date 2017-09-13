package com.hm.account.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gep.core.util.InputChecker;
import com.hm.account.model.CustAccFy;
import com.hm.account.model.CustAccFyLog;
import com.hm.account.service.CustAccFyLogService;
import com.hm.account.service.CustAccFyService;
import com.hm.account.service.FuiouService;
import com.hm.sys.constants.SysConstants;

@Service
public class FuiouServiceImpl implements FuiouService{
	
    /**
     * 富友信息表
     */
    @Autowired
    private CustAccFyService custAccFyService;
    
    @Autowired
    private CustAccFyLogService custAccFyLogService;

	private final Logger log = LoggerFactory.getLogger(this.getClass());

    /**
     * 获取富友开户结果 fuYouResult 1:成功，2:失败,3:异常
     */
	@Override
    public String getFuiouResult(String cardId) {
		log.info("FuiouServiceImpl getFuiouResult start cardId={}",cardId);
		String fuiouResult = SysConstants.FUIOU_RESULT_ERROR;
        CustAccFy custAccFy = new CustAccFy();
        custAccFy.setCardId(cardId);
        List<CustAccFy> custAccFyList = custAccFyService.list(custAccFy);
        if (!InputChecker.isEmpty(custAccFyList)) {
        	 fuiouResult = SysConstants.FUIOU_RESULT_SUCCESS;
        } else {
            CustAccFyLog custAccFyLog = new CustAccFyLog();
            custAccFyLog.setCardId(cardId);
            List<CustAccFyLog> custAccFyLogList = custAccFyLogService.list(custAccFyLog);
            if (custAccFyLogList.size() >= 3) {
            	fuiouResult = SysConstants.FUIOU_RESULT_FAIL;
            }
        }
        log.info("FuiouServiceImpl getFuiouResult start cardId={},fuiouResult={}",cardId,fuiouResult);
        return fuiouResult;

    }
}
