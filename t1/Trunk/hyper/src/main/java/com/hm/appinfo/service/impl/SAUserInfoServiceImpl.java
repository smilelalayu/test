package com.hm.appinfo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gep.core.base.BaseMapper;
import com.gep.core.base.BaseServiceImpl;
import com.hm.appinfo.dao.SAUserInfoMapper;
import com.hm.appinfo.model.SAUserInfo;
import com.hm.appinfo.service.SAUserInfoService;

/**
 * 
 * @ClassName: SAUserInfoServiceImpl
 * @Description: 销售用户service实现类
 * @author: fengdeliang
 * @date: 2017年5月15日
 */
@Service
public class SAUserInfoServiceImpl extends BaseServiceImpl<SAUserInfo, Long> implements SAUserInfoService {
    @Autowired
    private SAUserInfoMapper saUserInfoMapper;

    @Override
    public BaseMapper<SAUserInfo, Long> getMapper() {
        return saUserInfoMapper;
    }
}
