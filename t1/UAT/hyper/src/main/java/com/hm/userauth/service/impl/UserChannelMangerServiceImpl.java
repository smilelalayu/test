/**
 * Copyright 2017 ECCloud Corporation. All rights reserved.
 *
 * --------------------------------------------------------
 * 此技术信息为本公司机密信息，未经本公司书面同意禁止向第三方披露.
 * 版权所有：9fchaoneng
 * --------------------------------------------------------
 */

package com.hm.userauth.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gep.core.base.BaseMapper;
import com.gep.core.base.BaseServiceImpl;
import com.hm.userauth.service.UserChannelMangerService;
import com.hm.userauth.dao.UserChannelMangerMapper;
import com.hm.userauth.model.UserChannel;

@Service
public class UserChannelMangerServiceImpl extends BaseServiceImpl<UserChannel, Long> implements UserChannelMangerService {

    @Autowired 
    private UserChannelMangerMapper userChannelMapper;
    
    @Override
    public BaseMapper<UserChannel, Long> getMapper() {
       
        return userChannelMapper;
    }
    @Override
    public String getMybtaisMapperName() {
        return UserChannelMangerMapper.class.getSimpleName();
    }
}
