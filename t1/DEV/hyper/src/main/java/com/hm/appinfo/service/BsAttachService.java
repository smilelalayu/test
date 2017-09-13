package com.hm.appinfo.service;

import java.util.List;
import java.util.Map;

import com.gep.core.base.BaseService;
import com.hm.appinfo.model.LnAttachNode;
import com.hm.product.model.BsAttach;

public interface BsAttachService extends BaseService<BsAttach, Long>
{
	/**
	 * 
	 * <p>
	 * 通过工单id查询工单附件列表
	 * </p>
	 * @author songning
	 * @datetime 2016年5月11日 上午11:50:40
	 *
	 * @param productSeriesId
	 * @param careeType
	 * @param appId
	 * @return
	 * @throws Exception
	 */
	public Map<String,List<LnAttachNode>> getAttachListByAppId(Long productSeriesId,String careeType,Long appId)throws Exception;

}
