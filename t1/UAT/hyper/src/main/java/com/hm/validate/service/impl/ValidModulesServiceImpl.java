package com.hm.validate.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gep.core.base.BaseMapper;
import com.gep.core.base.BaseServiceImpl;
import com.hm.validate.dao.ValidModulesMapper;
import com.hm.validate.model.ValidModules;
import com.hm.validate.service.ValidModulesService;

@Service
public class ValidModulesServiceImpl extends BaseServiceImpl<ValidModules, Long>  implements ValidModulesService {

    @Autowired
    private ValidModulesMapper validModulesMapper;
    
    @Override
    public BaseMapper<ValidModules, Long> getMapper() {
        // TODO Auto-generated method stub
        return validModulesMapper;
    }
    @Override
    public String getMybtaisMapperName() {
        return ValidModulesMapper.class.getSimpleName();
    }
}
