package com.hm.bus.dao;


import java.util.List;

import org.springframework.stereotype.Repository;

import com.gep.core.base.BaseMapper;
import com.hm.bus.module.LnStatus;

@Repository
public interface LnStatusMapper extends BaseMapper<LnStatus, Long> {
    /**<b>selectByPTradeNo</b><br/>
     * 查找工单状态通过 交易代码
     * @param tradeNo
     * @return
     * @author 			zhoukailiang
     * @createDate 		2016年7月11日 下午5:45:46
     * @version 1.0		
     * @description		
     *
     */
    LnStatus selectByPTradeNo(String tradeNo);
    
    List<LnStatus> selectLnStatusList();
}