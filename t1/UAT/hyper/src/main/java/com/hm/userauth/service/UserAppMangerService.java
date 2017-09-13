/**
 * Copyright 2017 ECCloud Corporation. All rights reserved.
 *
 * --------------------------------------------------------
 * 此技术信息为本公司机密信息，未经本公司书面同意禁止向第三方披露.
 * 版权所有：9fchaoneng
 * --------------------------------------------------------
 */

package com.hm.userauth.service;

import java.util.List;

import com.gep.core.base.BaseService;
import com.hm.userauth.model.UserApp;

public interface UserAppMangerService extends BaseService<UserApp, Long>{
    
    String getMybtaisMapperName();
    
    List<UserApp> getUserAppList(UserApp userApp);
    
    
}
