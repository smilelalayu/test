package com.hm.appinfo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gep.core.base.BaseMapper;
import com.hm.appinfo.model.LnAttachNode;
import com.hm.product.model.BsAttach;

public interface BsAttachHmMapper extends BaseMapper<BsAttach, Long>
{
	/**
	 * 
	 * <p>
	 * 	通过产品系列id查询对应附件列表
	 * </p>
	 * @author songning
	 * @datetime 2016年5月4日 上午11:22:56
	 *
	 * @param productSeriesId
	 * @param careeType
	 * @return
	 */
	public List<LnAttachNode> getAttachListBySeriesId(@Param(value="productSeriesId")Long productSeriesId,@Param(value="careeType")String careeType);
	
	/**
	 * 
	 * <p>
	 * 通过工单附件id数组查询对应附件列表
	 * </p>
	 * @author songning
	 * @datetime 2016年5月11日 上午11:41:59
	 *
	 * @param productSeriesId
	 * @param careeType
	 * @param ids
	 * @return
	 */
	public List<LnAttachNode> getAttachListByAttachids(@Param(value="productSeriesId")Long productSeriesId,@Param(value="careeType")String careeType,@Param(value="ids")Long[] ids);
	
	/**
	 * 
	 * <p>
	 * 通过工单id查询工单附件列表 
	 * </p>
	 * @author songning
	 * @datetime 2016年5月11日 上午11:47:59
	 *
	 * @param productSeriesId
	 * @param careeType
	 * @param appId
	 * @return
	 */
	public List<LnAttachNode> getAttachListByAppId(@Param(value="productSeriesId")Long productSeriesId,@Param(value="careeType")String careeType,@Param(value="appId")Long appId);
	
}