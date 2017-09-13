/**
 * Copyright 2017 ECCloud Corporation. All rights reserved.
 *
 * --------------------------------------------------------
 * 此技术信息为本公司机密信息，未经本公司书面同意禁止向第三方披露.
 * 版权所有：9fchaoneng
 * --------------------------------------------------------
 */

package com.hm.userauth.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gep.core.base.BaseMapper;
import com.gep.core.base.BaseServiceImpl;
import com.hm.userauth.dao.UserAppMangerMapper;
import com.hm.userauth.model.UserApp;
import com.hm.userauth.service.UserAppMangerService;

@Service
public class UserAppMangerServiceImpl extends BaseServiceImpl<UserApp, Long> implements UserAppMangerService{

    @Autowired UserAppMangerMapper userAppMapper;
    
    @Override
    public BaseMapper<UserApp, Long> getMapper() {
        return userAppMapper;
    }

    @Override
    public String getMybtaisMapperName() {
        return UserAppMangerMapper.class.getSimpleName();
    }

	@Override
	public List<UserApp> getUserAppList(UserApp userApp) {
		
		return userAppMapper.getUserAppList(userApp);
	}
    
}
