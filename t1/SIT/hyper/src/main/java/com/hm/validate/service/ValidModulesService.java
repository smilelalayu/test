/**
 * Copyright 2017 ECCloud Corporation. All rights reserved.
 *
 * --------------------------------------------------------
 * 此技术信息为本公司机密信息，未经本公司书面同意禁止向第三方披露.
 * 版权所有：9fchaoneng
 * --------------------------------------------------------
 */

package com.hm.validate.service;

import com.gep.core.base.BaseService;
import com.hm.validate.model.ValidModules;

public interface ValidModulesService extends BaseService<ValidModules, Long>{
    public String getMybtaisMapperName();
}
