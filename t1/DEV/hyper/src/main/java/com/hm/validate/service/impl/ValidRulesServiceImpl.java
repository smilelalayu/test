package com.hm.validate.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gep.core.base.BaseMapper;
import com.gep.core.base.BaseServiceImpl;
import com.hm.validate.dao.ValidRulesMapper;
import com.hm.validate.model.ValidRules;
import com.hm.validate.service.ValidRulesService;

@Service
public class ValidRulesServiceImpl extends BaseServiceImpl<ValidRules, Long>  implements ValidRulesService{

    @Autowired
    private ValidRulesMapper validRulesMapper;
    
    @Override
    public BaseMapper<ValidRules, Long> getMapper() {
        // TODO Auto-generated method stub
        return validRulesMapper;
    }
    @Override
    public String getMybtaisMapperName() {
        return ValidRulesMapper.class.getSimpleName();
    }
}
