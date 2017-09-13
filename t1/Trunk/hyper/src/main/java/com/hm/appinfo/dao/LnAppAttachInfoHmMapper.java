
package com.hm.appinfo.dao;

import com.gep.core.base.BaseMapper;
import com.hm.appinfo.model.LnAttachInfo;

import org.springframework.stereotype.Repository;

/**
 * 
 * @author fdl
 *
 */
@Repository
public interface LnAppAttachInfoHmMapper extends BaseMapper<LnAttachInfo, Long> {
	
	int attachDelete(LnAttachInfo lnAttachInfo);

}
