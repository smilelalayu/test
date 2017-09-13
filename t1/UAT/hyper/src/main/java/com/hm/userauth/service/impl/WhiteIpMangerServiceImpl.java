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
import com.hm.userauth.dao.WhiteIpMangerMapper;
import com.hm.userauth.service.WhiteIpMangerService;
import com.hm.userauth.model.WhiteIp;

@Service
public class WhiteIpMangerServiceImpl extends BaseServiceImpl<WhiteIp, Long> implements WhiteIpMangerService {

    @Autowired
    private WhiteIpMangerMapper  whiteIpMapper;
    
    @Override
    public BaseMapper<WhiteIp, Long> getMapper() {
        
        return whiteIpMapper;
    }
    
    @Override
    public String getMybtaisMapperName() {
        return WhiteIpMangerMapper.class.getSimpleName();
    }
}
