package com.hm.appinfo.dao;

import com.gep.core.base.BaseMapper;
import com.hm.appinfo.model.LnAppCash;

/**现金贷明细Mapper
 * @author zhoukailiang
 * @createDate 2016年11月1日 上午10:35:57
 * @version 1.0
 * @description
 *
 */
public interface LnAppCashHmMapper  extends BaseMapper<LnAppCash, Long>{

    LnAppCash selectByAppId(Long appId);

}