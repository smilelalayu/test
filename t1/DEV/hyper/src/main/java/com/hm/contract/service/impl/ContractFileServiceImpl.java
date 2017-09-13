package com.hm.contract.service.impl;



import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gep.core.util.BeanUtils;
import com.hm.contract.model.LnContracttInfo;
import com.hm.contract.service.ContractFileService;
import com.qz.model.LnContracttInfoDTO;
import com.qz.service.ContractService;

@Service
public class ContractFileServiceImpl  implements ContractFileService
{
	private final Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private ContractService contractService;
	
	

	@Override
	public List<LnContracttInfo> getContracttInfos(Long appId) {
		LnContracttInfoDTO ln = new LnContracttInfoDTO();
		ln.setAppId(appId);
		@SuppressWarnings("unchecked")
		List<LnContracttInfoDTO> infosDTO = (List<LnContracttInfoDTO>) contractService.selectContract(ln).getData();
		List<LnContracttInfo> infos = new ArrayList<LnContracttInfo>();
		for(LnContracttInfoDTO lndto : infosDTO){
			LnContracttInfo lc = new LnContracttInfo();
			BeanUtils.copyFields(lndto, lc);
			infos.add(lc);
		}
		return infos;
	}

}
