package com.hm.bus.dao;


import com.gep.core.base.BaseMapper;
import com.hm.bus.module.LnAppCashWhiteCust;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 用户数据访问接口 
 */
@Repository
public interface LnAppCashWhiteCustMapper extends BaseMapper<LnAppCashWhiteCust, Long>
{

	List<LnAppCashWhiteCust> getAlreadyExistIdcards();

	int insert(@Param("list") List<LnAppCashWhiteCust> list);
	
	/**
	 * @Method: queryByCardId
	 * @Description: 根据身份证查询白名单信息
	 * @author qiuyuan
	 * @param cardId
	 * @return
	 */
	LnAppCashWhiteCust queryByCardId(String cardId);

}