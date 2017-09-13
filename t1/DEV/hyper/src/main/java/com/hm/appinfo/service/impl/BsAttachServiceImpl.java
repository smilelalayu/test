package com.hm.appinfo.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gep.core.base.BaseMapper;
import com.gep.core.base.BaseServiceImpl;
import com.gep.core.util.InputChecker;
import com.hm.appinfo.dao.BsAttachHmMapper;
import com.hm.appinfo.model.LnAttachNode;
import com.hm.appinfo.service.BsAttachService;
import com.hm.product.model.BsAttach;
import com.hm.sys.constants.SysConstants;

@Service
public class BsAttachServiceImpl extends BaseServiceImpl<BsAttach, Long> implements BsAttachService
{
	@Autowired
	private BsAttachHmMapper mapper;

	@Override
	public BaseMapper<BsAttach, Long> getMapper()
	{
		return mapper;
	}

	@Override
	public Map<String,List<LnAttachNode>> getAttachListByAppId(Long productSeriesId, String careeType, Long appId)throws Exception {
		if(InputChecker.isEmpty(productSeriesId)){
			throw new Exception("产品系列id不能为空");
		}
		if(InputChecker.isEmpty(careeType)){
			throw new Exception("客户职业信息不能为空");
		}
		if(InputChecker.isEmpty(appId)){
			throw new Exception("工单id不能为空");
		}
		List<LnAttachNode> attList = mapper.getAttachListByAppId(productSeriesId, careeType, appId);
		return generateAttachTree(attList);
	}
	
	/**
	 * 
	 * <p>
	 * 组装附件树
	 * </p>
	 * @author songning
	 * @datetime 2016年5月11日 上午11:57:47
	 *
	 * @param attList
	 * @return
	 */
	private Map<String,List<LnAttachNode>> generateAttachTree(List<LnAttachNode> attList)throws Exception{
		//必填附件集合
		List<LnAttachNode> reqList = new ArrayList<>();
		//可选附件集合
		List<LnAttachNode> optList = new ArrayList<>();
		//多选一附件集合
		List<LnAttachNode> mulList = new ArrayList<>();
		//根据产品系列类型将附件分为3大类required(必填),optional(可选),multiselect(多选一,至少填一项)
		for(LnAttachNode att:attList){
			//必填附件,且层级为1
			if(SysConstants.AttachType.REQUIRED.equals(att.getChooseType()) && att.getAttachLevel() == 1){
				setDelete(att, reqList);
				reqList.add(att);
				continue;
			}
			//可选,层级为1
			if(SysConstants.AttachType.OPTIONAL.equals(att.getChooseType()) && att.getAttachLevel() == 1){
				optList.add(att);
				continue;
			}
			//可选,层级为2
			if(SysConstants.AttachType.OPTIONAL.equals(att.getChooseType()) && att.getAttachLevel() == 2){
				//添加叶子节点
				for(LnAttachNode att2:optList){
					if(att.getParentId().longValue() == att2.getAttachId().longValue()){
						setDelete(att, att2.getLeaf());
						att2.getLeaf().add(att);
						break;
					}
				}
				continue;
			}
			//多选一,层级为1
			if(SysConstants.AttachType.MULTISELECT.equals(att.getChooseType()) && att.getAttachLevel() == 1){
				mulList.add(att);
				continue;
			}
			//多选一,层级为2
			if(SysConstants.AttachType.MULTISELECT.equals(att.getChooseType()) && att.getAttachLevel() == 2){
				//添加叶子节点
				for(LnAttachNode att2:mulList){
					if(att.getParentId().longValue() == att2.getAttachId().longValue()){
						setDelete(att,att2.getLeaf());
						att2.getLeaf().add(att);
						break;
					}
				}
			}
		}
		Map<String,List<LnAttachNode>> attMap = new HashMap<>();
		attMap.put(SysConstants.AttachType.REQUIRED, reqList);
		attMap.put(SysConstants.AttachType.OPTIONAL, optList);
		attMap.put(SysConstants.AttachType.MULTISELECT, mulList);
		return attMap;
	}
	
	/**
	 * 
	 * <p>
	 * 判断是否已经存在相同附件<br/>
     * 如果已存在，允许删除该附件
	 * </p>
	 * @author songning
	 * @datetime 2016年5月11日 下午3:28:07
	 *
	 * @param att
	 * @param attList
	 */
	private void setDelete(LnAttachNode att,List<LnAttachNode> attList)throws Exception{
		for(LnAttachNode att2:attList){
			//附件类型相同
			/*
			 *取最新的修改的，批次号最大的贷前附件
			 */
			if(att2.getAttachCode().equals(att.getAttachCode()) && isBatchNoNotEmpty(att, att2) && isBatchNoBigger(att, att2)){
				attList.remove(att2);
				break;
			}
		}
	}

	private boolean isBatchNoBigger(LnAttachNode att, LnAttachNode att2) {
		return att.getBatchNo()>att2.getBatchNo();
	}

	private boolean isBatchNoNotEmpty(LnAttachNode att, LnAttachNode att2) {
		return !InputChecker.isEmpty(att.getBatchNo())&&!InputChecker.isEmpty(att2.getBatchNo());
	}
}
