package com.hm.contract.service;

import java.util.List;

import com.hm.contract.model.LnContracttInfo;

public interface ContractFileService {

	 public static final String QZ_SUCCESS = "0000";//调用签章返回的成功码

     List<LnContracttInfo> getContracttInfos(Long appId);
    
}
