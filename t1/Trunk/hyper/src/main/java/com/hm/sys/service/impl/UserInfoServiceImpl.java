package com.hm.sys.service.impl;

import com.gep.core.base.BaseMapper;
import com.gep.core.base.BaseServiceImpl;
import com.gep.sys.dao.UserInfoMapper;
import com.gep.sys.model.UserInfo;
import com.hm.sys.service.UserInfoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by wangbaosheng on 2017/3/15.
 * 用户信息服务
 */
@Service
public class UserInfoServiceImpl extends BaseServiceImpl<UserInfo, Long> implements UserInfoService {
    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public BaseMapper<UserInfo, Long> getMapper() {
        return userInfoMapper;
    }
}
