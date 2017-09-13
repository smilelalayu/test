
package com.hm.validate.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gep.core.base.BaseMapper;
import com.gep.core.base.BaseServiceImpl;
import com.hm.validate.dao.ValidFormsMapper;
import com.hm.validate.model.ValidForms;
import com.hm.validate.service.ValidFormsService;

@Service
public class ValidFormsServiceImpl extends BaseServiceImpl<ValidForms, Long> implements ValidFormsService {

   @Autowired
   private ValidFormsMapper validFormsMapper;
    
    @Override
    public BaseMapper<ValidForms, Long> getMapper() {
        // TODO Auto-generated method stub
        return validFormsMapper;
    }
    @Override
    public String getMybtaisMapperName() {
        return ValidFormsMapper.class.getSimpleName();
    }
}
