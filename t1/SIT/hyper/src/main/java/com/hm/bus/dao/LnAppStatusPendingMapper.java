package com.hm.bus.dao;


import com.gep.core.base.BaseMapper;
import com.hm.bus.module.LnAppStatusPending;
import org.springframework.stereotype.Repository;

@Repository
public interface LnAppStatusPendingMapper extends BaseMapper<LnAppStatusPending, Long> {

    public int insertSelective(LnAppStatusPending lnAppStatusPending);
}