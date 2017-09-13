package com.hm.appinfo.service.impl;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gep.core.base.BaseMapper;
import com.gep.core.base.BaseServiceImpl;
import com.gep.core.entity.Page;
import com.gep.core.entity.Result;
import com.gep.core.util.BeanUtils;
import com.gep.core.util.InputChecker;
import com.gep.core.util.ObjectUtils;
import com.gep.sys.model.UserInfo;
import com.gep.util.PropertyUtils;
import com.hm.appinfo.dao.LnAppAttachInfoHmMapper;
import com.hm.appinfo.dao.LnAppCashHmMapper;
import com.hm.appinfo.dao.LnAppHmMapper;
import com.hm.appinfo.dao.LnAppStatusHmMapper;
import com.hm.appinfo.dao.LnCommodityCodeHmMapper;
import com.hm.appinfo.model.LnApp;
import com.hm.appinfo.model.LnAppCash;
import com.hm.appinfo.model.LnAppStatus;
import com.hm.appinfo.model.LnAppStatusChangeLog;
import com.hm.appinfo.model.LnCommodityCode;
import com.hm.appinfo.service.LnAppService;
import com.hm.appinfo.service.LnAppStatusChangeLogService;
import com.hm.appinfo.service.SCService;
import com.hm.base.model.BankRecordInformation;
import com.hm.base.model.BaseInfo;
import com.hm.base.service.BankRecordInformationService;
import com.hm.base.service.ProvinceCityService;
import com.hm.contract.dao.QzContractAppHmMapper;
import com.hm.contract.dao.QzContractFileHmMapper;
import com.hm.product.service.BsProductService;
import com.hm.sys.constants.SysConstants;
import com.hm.sys.util.CommonUtils;
import com.sc.api.app.model.LnAppAttachInfo;
import com.sc.api.app.vo.LnAppSubsidiary;
import com.sc.api.model.SCRequest;
import com.sc.api.model.SCRequestBody;
import com.sc.api.model.SCRequestHeader;
import com.sc.api.model.SCResult;
import com.sc.api.service.LnAppOperationService;

@Service
public class LnAppServiceImpl extends BaseServiceImpl<LnApp, Long> implements LnAppService
{
	protected final Logger log = LoggerFactory.getLogger(getClass());

	@Autowired
	private LnAppHmMapper lnAppHmMapper;
	
	@Autowired
	private LnAppStatusHmMapper lnAppStatusMapper;
	
	@Autowired 
	private LnAppCashHmMapper lnAppCashHmMapper;
	
	@Autowired
	private SCService scService;

	@Autowired
	private BsProductService bsProductService;
	
	@Autowired
	private LnAppAttachInfoHmMapper lnAppAttachInfoHmMapper;
	
	@Autowired
	private LnCommodityCodeHmMapper lnCommodityCodeHmMapper;
	
	@Autowired
	private QzContractAppHmMapper qzContractAppHmMapper;
	
	@Autowired
	private QzContractFileHmMapper qzContractFileHmMapper;
	
	@Autowired
	private LnAppStatusChangeLogService statusChangeLogService;
	
	@Autowired
	private LnAppOperationService lnAppOperationService;
	
	@Autowired
	private ProvinceCityService provinceCityService;
	
	@Autowired
	private BankRecordInformationService bankRecordInformationService;
	
	@Override
	public BaseMapper<LnApp, Long> getMapper()
	{
		return lnAppHmMapper;
	}

	@Override
	public Page<LnApp> listUnionProcess(Page<LnApp> page) throws Exception
	{
		scService.queryLnAppList(page);
		return page;
	}
	
    @Override
    public LnApp getLnAppByIdUnionBankInfo(Long appId) throws Exception {
        LnApp app = new LnApp();
        app.setId(appId);
        //返回
        com.sc.api.app.model.LnApp lnAppSc = ObjectUtils.convertObject(scService.queryLnApp(app));
        LnApp lnApp = new LnApp();
        
        org.apache.commons.beanutils.PropertyUtils.copyProperties(lnApp,lnAppSc);
        
        if(StringUtils.isNoneBlank(lnApp.getRepaymentCity())){
        	BaseInfo ditrict = provinceCityService.queryDistrictByIdWithParent(lnApp.getRepaymentCity());
            if(null != ditrict){
            	String fullCityPath = CommonUtils.getFullPathFromdistinctInfo(ditrict);
            	if(StringUtils.isNoneBlank(fullCityPath)){
            		lnApp.setRepaymentCity(fullCityPath);
            	}
            }else {
                BaseInfo city = provinceCityService.queryCityByIdWithParent(lnApp.getRepaymentCity());
                if(city != null){
                	String fullCityPath = CommonUtils.getFullPathFromdistinctInfo(city);
                	if(StringUtils.isNoneBlank(fullCityPath)){
                		lnApp.setRepaymentCity(fullCityPath);
                	}
                }
            }
        }
        
        
        BankRecordInformation bank = new BankRecordInformation();
        bank.setCode(lnApp.getRepaymentBank());
        List<BankRecordInformation> bankList = bankRecordInformationService.list(bank);
        if(!InputChecker.isEmpty(bankList)){
        	lnApp.setRepaymentBank(bankList.get(0).getName());
        }
        if(SysConstants.LN_APP_STATE_70.equals(lnApp.getAppState())){
        	LnAppStatusChangeLog statusChangeLog = new LnAppStatusChangeLog();
    		statusChangeLog.setAppId(lnApp.getId());
    		statusChangeLog.setNewStatus(lnApp.getAppState());
    		LnAppStatusChangeLog stLog = statusChangeLogService.querNextStatusByNewStatus(statusChangeLog);
    		lnApp.setOldAppState(stLog.getStatus());
            mergeStatuName(lnApp);
        }
        return lnApp;
    }

	
    @Override
    public List<LnApp> listUnionBankInfo(LnApp t) throws Exception {
        List<LnApp> lnApps = lnAppHmMapper.listUnionBankInfo(t);
        mergeStatuName(lnApps);
        return lnApps;
    }
    
    /**
     * 嵌入工单状态名称,单个工单
     *
     * @param lnApp
     * @return
     */
    private LnApp mergeStatuName(LnApp lnApp) {
        if (null == lnApp) {
            return null;
        }
        List<LnAppStatus> lnStatusList = lnAppStatusMapper.list();
        if(!InputChecker.isEmpty(lnApp.getOldAppState())){
        	 mergeNextStatuName(lnApp,lnStatusList);
        }
        return mergeStatuName(lnApp, lnStatusList);
    }
    
    /**
     * 嵌入工单状态名称，列表
     *
     * @param lnApps
     * @return
     */
    private List<LnApp> mergeStatuName(List<LnApp> lnApps) {
        if (lnApps.size() == 0) {
            return lnApps;
        }
        List<LnAppStatus> lnStatusList = lnAppStatusMapper.list();
        for (LnApp lnApp : lnApps) {
            mergeStatuName(lnApp, lnStatusList);
        }
        return lnApps;
    }
    
    /**
     * 嵌入工单状态名称,单个工单
     *
     * @param lnApp
     * @param lnStatusList
     * @return
     */
    private LnApp mergeStatuName(LnApp lnApp, List<LnAppStatus> lnStatusList) {
        //优先匹配TrandeNo，没有TrandeNo则匹配Code
        if(InputChecker.isEmpty(lnApp.getAppStatusInner())) {
            for (LnAppStatus lnStatus : lnStatusList) {
                if (lnStatus.getCode().equals(lnApp.getAppState())) {
                    lnApp.setAppStatusName(lnStatus.getStatusDescOuter());
                    break;
                }
                if(!InputChecker.isEmpty(lnApp.getOldAppState())){
                	if(lnStatus.getCode().equals(lnApp.getOldAppState())){
                		lnApp.setOldAppStateName(lnStatus.getStatusDescOuter());
                		break;
                	}
                }
            }
        }
        else
        {
            for (LnAppStatus lnStatus : lnStatusList) {
                if (lnStatus.getTradeNo().equals(lnApp.getAppStatusInner())) {
                    lnApp.setAppStatusName(lnStatus.getStatusDescOuter());
                    break;
                }
                if(!InputChecker.isEmpty(lnApp.getOldAppState())){
                	if(lnStatus.getCode().equals(lnApp.getOldAppState())){
                		lnApp.setOldAppStateName(lnStatus.getStatusDescOuter());
                	}
                }
            }
            
        }
        return lnApp;
    }
    
    
    /**
     * 撤回撤销嵌入工单上一个状态名称
     *
     * @param lnApp
     * @param lnStatusList
     * @return
     */
    private LnApp mergeNextStatuName(LnApp lnApp, List<LnAppStatus> lnStatusList) {
        //优先匹配TrandeNo，没有TrandeNo则匹配Code
            for (LnAppStatus lnStatus : lnStatusList) {
                if(!InputChecker.isEmpty(lnApp.getOldAppState())){
                	if(lnStatus.getCode().equals(lnApp.getOldAppState())){
                		lnApp.setOldAppStateName(lnStatus.getStatusDescOuter());
                		break;
                	}
                }
            }
        return lnApp;
    }
    
    
	@Override
	public List<com.sc.api.app.model.LnApp> queryLnAppSC(LnApp lnApp) {
		return scService.queryLnApp(lnApp);
	}


	@Override
	public LnAppCash selectCashInfoByAppId(Long appId) {
		return lnAppCashHmMapper.selectByAppId(appId);
	}
	
	/**
	 * 修改状态为31待交易确认的工单
	 */
	@Override
	public Boolean updateAppStatus(LnApp lnApp,UserInfo userInfo) {
		Date date = null;
		Boolean flag = false;
		if(!InputChecker.isEmpty(lnApp)){
			LnApp appUpdate = new LnApp();
			
			appUpdate.setId(lnApp.getId());
			appUpdate.setAppState(lnApp.getNewAppState());
			appUpdate.setAppStateName(appUpdate.getAppStateName());
			appUpdate.setOldAppState(lnApp.getAppState());
			appUpdate.setClientSignedTime(date);
			appUpdate.setStoreSignedTime(date);
			appUpdate.setClientConStatus(null);
			appUpdate.setFirmConStatus(null);
			appUpdate.setAppStatusInner(SysConstants.TRADE_NO_CODE_A46);
			lnAppHmMapper.updateAppStatus(appUpdate);
			
			LnAppStatusChangeLog lnAppStatusChangeLog = new LnAppStatusChangeLog();
	        lnAppStatusChangeLog.setAppId(lnApp.getId());
	        lnAppStatusChangeLog.setStatus(lnApp.getAppState());
	        lnAppStatusChangeLog.setNewStatus(appUpdate.getAppState());
	        lnAppStatusChangeLog.setCreatedon(new Date());
	        lnAppStatusChangeLog.setCreatedby(userInfo.getUserName());
	        statusChangeLogService.insert(lnAppStatusChangeLog);
			
			qzContractAppHmMapper.delete(lnApp.getId());
			qzContractFileHmMapper.delete(lnApp.getId());
			
			//根据工单ID调用 SC 商品附件表信息
			Integer subType = LnAppSubsidiary.ATTACH_INFO;
    		LnAppSubsidiary lnAppSubsidiary = scService.queryLnAppSubsidiaryInfo(lnApp.getId(), subType);
			
    		List<LnAppAttachInfo> lnAttachInfoList = lnAppSubsidiary.getAttachInfos();
			if((!InputChecker.isEmpty(lnAttachInfoList))&& (lnAttachInfoList.size()>0)){
				for (LnAppAttachInfo lnAppAttachInfoSC : lnAttachInfoList) {
					//判断待中附件上传类型   Mid_Loan
					if(SysConstants.MID_LOAN.equals(lnAppAttachInfoSC.getSource())){
						com.hm.appinfo.model.LnAttachInfo lnAppAttachInfo =  new com.hm.appinfo.model.LnAttachInfo();
						lnAppAttachInfo.setAppId(lnAppAttachInfoSC.getAppId());
						lnAppAttachInfo.setId(lnAppAttachInfoSC.getId());
						lnAppAttachInfo.setSource(lnAppAttachInfoSC.getSource());
						lnAppAttachInfoHmMapper.attachDelete(lnAppAttachInfo);
					}
				}
			}
			
			// 根据工单号删除商品IEMI数据
			LnCommodityCode lnCommodityCode = new LnCommodityCode();
			lnCommodityCode.setAppId(lnApp.getId());
			List<LnCommodityCode> commodityCodeList = lnCommodityCodeHmMapper.list(lnCommodityCode);
			if((!InputChecker.isEmpty(commodityCodeList))&& (commodityCodeList.size()>0)){
				for (LnCommodityCode commodityCode : commodityCodeList) {
					lnCommodityCode.setId(commodityCode.getId());
					lnCommodityCodeHmMapper.attachDelete(lnCommodityCode);
				}
			}
			flag = true;
		}
		return flag;
	}
	
	
	public void updateBackCancelAppStatus(LnApp appDetail,UserInfo userInfo) throws Exception{
		LnApp lnApp = new LnApp();
		lnApp.setId(appDetail.getId());
		lnApp.setAppState(appDetail.getOldAppState());
		lnApp.setAppStatusName(appDetail.getOldAppStateName());
		if(SysConstants.LN_APP_STATE_31.equals(appDetail.getOldAppState())){
			if(SysConstants.IS_UPLOAD_ATTACH_NU.equals(appDetail.getIsUploadAttach())){
				lnApp.setAppStatusInner(SysConstants.TRADE_NO_CODE_31_NO);
			}else{
				lnApp.setAppStatusInner(SysConstants.TRADE_NO_CODE_31_YES);
			}
		}else if(SysConstants.LN_APP_STATE_20.equals(appDetail.getOldAppState())){
			lnApp.setAppStatusInner(SysConstants.TRADE_NO_CODE_A46);
		}else if(SysConstants.LN_APP_STATE_18.equals(appDetail.getOldAppState())){
			LnAppStatusChangeLog statusLog = new LnAppStatusChangeLog();
			statusLog.setAppId(appDetail.getId());
			statusLog.setNewStatus(appDetail.getOldAppState());
			LnAppStatusChangeLog stLog = statusChangeLogService.querNextStatusByNewStatus(statusLog);
			if(SysConstants.LN_APP_STATE_11.equals(stLog.getStatus())){
				lnApp.setAppStatusInner(SysConstants.TRADE_NO_CODE_A20);
			}else if(SysConstants.LN_APP_STATE_13.equals(stLog.getStatus())){
				lnApp.setAppStatusInner(SysConstants.TRADE_NO_CODE_A36);
			}else{
				lnApp.setAppStatusInner(SysConstants.TRADE_NO_CODE_A43);
			}
		}else{
			List<String> tradeNos = lnAppStatusMapper.getTradeNosByCode(appDetail.getOldAppState());
			if(!InputChecker.isEmpty(tradeNos)){
				lnApp.setAppStatusInner(tradeNos.get(0));
			}
		}
		lnAppHmMapper.update(lnApp);
		
		LnAppStatusChangeLog lnAppStatusChangeLog = new LnAppStatusChangeLog();
        lnAppStatusChangeLog.setAppId(appDetail.getId());
        lnAppStatusChangeLog.setStatus(appDetail.getAppState());
        lnAppStatusChangeLog.setNewStatus(appDetail.getOldAppState());
        lnAppStatusChangeLog.setCreatedon(new Date());
        lnAppStatusChangeLog.setCreatedby(userInfo.getUserName());
        statusChangeLogService.insert(lnAppStatusChangeLog);
	}
	
	/**
	 * @Method: runUpdateDelayRefuse
	 * @Description:工单延时拒绝
	 * @author fdl
	 * @throws Exception
	 */
	@Override
	public void runUpdateDelayRefuse() throws Exception {
		log.info(">>>>>>>>>>runUpdateDelayRefuse>>>>>>>>>");
		SCRequest request=new SCRequest();	
		SCRequestHeader header = new SCRequestHeader();
		header.setChannelCode(PropertyUtils.getConfig(SysConstants.SC_CHANNEL_CODE));
		request.setHeader(header);
		SCRequestBody body=new SCRequestBody();		
		body.setAction("UPDATE_DELAY_REFUSE");	
		body.put("isAsync", Boolean.TRUE);
		request.setBody(body);
		log.info("action="+body.getAction()+";isAsy="+body.get("isAsync"));
		SCResult  result  =lnAppOperationService.updateLnAppStatus(request);
		log.info("code="+result.getHeader().getCode()+"codeDes="+result.getHeader().getCodeDesc()+"msg="+result.getHeader().getMsg());
	}
	
	/**
	 * @Method: runUpdateRevoke
	 * @Description:工单撤销
	 * @author fdl
	 * @throws Exception
	 */
	@Override
	public void runUpdateRevoke() throws Exception {
		log.info(">>>>>>>>>>runUpdateRevoke>>>>>>>>>");
		SCRequest request=new SCRequest();	
		SCRequestHeader header = new SCRequestHeader();
		header.setChannelCode(PropertyUtils.getConfig(SysConstants.SC_CHANNEL_CODE));
		request.setHeader(header);
		SCRequestBody body=new SCRequestBody();		
		body.setAction("UPDATE_UNDO");
		body.put("isAsync", Boolean.TRUE);
		request.setBody(body);
		log.info("action="+body.getAction()+";isAsy="+body.get("isAsync"));
		SCResult  result  =lnAppOperationService.updateLnAppStatus(request);
		log.info("code="+result.getHeader().getCode()+"codeDes="+result.getHeader().getCodeDesc()+"msg="+result.getHeader().getMsg());
	}
	
	@Override
	public Result updateRevokeAppStatus(Long appId, UserInfo userInfo) throws Exception {
		log.info("LnAppServiceImpl revokeAppStatusManual start, appId={}",appId);

		Result rs = new Result(false);

		// 根据工单ID调用 SC 工单表信息
		LnApp lnAppQuery = new LnApp();
		lnAppQuery.setId(appId);
		List<com.sc.api.app.model.LnApp> lnAppList = this.queryLnAppSC(lnAppQuery);
		LnApp lnApp = null;
		if (CollectionUtils.isNotEmpty(lnAppList)) {
			lnApp = new LnApp();
			com.sc.api.app.model.LnApp lnAppSC = ObjectUtils.convertObject(lnAppList);
			BeanUtils.copyFields(lnAppSC, lnApp);
		}

		if (null == lnApp) {
			rs.setMessage("工单编号有误");
			return rs;
		}

		String appState = lnApp.getAppState();

		log.info("LnAppController revokeAppStatusManual appId={},appState={}", appId, appState);

		if (!(SysConstants.LN_APP_STATE_35.equals(appState) || SysConstants.LN_APP_STATE_36.equals(appState)
				|| SysConstants.LN_APP_STATE_32.equals(appState))) {
			rs.setMessage("此工单状态不允许撤销");
			return rs;
		}

		if (!InputChecker.isEmpty(lnApp) && !InputChecker.isEmpty(lnApp.getId())) {
			String updateAppState = SysConstants.LN_APP_STATE_70;
			LnApp lnAppUpdate = new LnApp();
			lnAppUpdate.setId(lnApp.getId());
			lnAppUpdate.setAppState(updateAppState);
			lnAppUpdate.setAppStatusName(lnAppUpdate.getAppStateName());
			List<String> tradeNos = lnAppStatusMapper.getTradeNosByCode(updateAppState);
			if (!InputChecker.isEmpty(tradeNos)) {
				lnAppUpdate.setAppStatusInner(tradeNos.get(0));
			}
			lnAppUpdate.setRevocationType(SysConstants.MANUAL_REVOCATION_TYPE);
			lnAppUpdate.setRevocationDesc(SysConstants.MANUAL_REVOCATION_DESC);
			lnAppHmMapper.update(lnAppUpdate);

			LnAppStatusChangeLog lnAppStatusChangeLog = new LnAppStatusChangeLog();
			lnAppStatusChangeLog.setAppId(lnApp.getId());
			lnAppStatusChangeLog.setStatus(lnApp.getAppState());
			lnAppStatusChangeLog.setNewStatus(updateAppState);
			lnAppStatusChangeLog.setCreatedon(new Date());
			lnAppStatusChangeLog.setCreatedby(userInfo.getUserName());
			statusChangeLogService.insert(lnAppStatusChangeLog);
			
			rs.setMessage("已撤销完成");
			rs.setSuccess(true);
		}
		log.info("LnAppServiceImpl revokeAppStatusManual End , appId={}",appId);

		return rs;
	}
	
}
