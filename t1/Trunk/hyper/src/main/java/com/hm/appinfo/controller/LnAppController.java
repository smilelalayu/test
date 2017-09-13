package com.hm.appinfo.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.alibaba.fastjson.JSON;
import com.gep.core.base.BaseController;
import com.gep.core.entity.Page;
import com.gep.core.entity.Result;
import com.gep.core.util.BeanUtils;
import com.gep.core.util.CollectionUtils;
import com.gep.core.util.DateUtils;
import com.gep.core.util.InputChecker;
import com.gep.core.util.ObjectUtils;
import com.gep.core.util.RedisUtils;
import com.gep.sys.util.UserUtils;
import com.gep.util.PropertyUtils;
import com.hm.appinfo.model.LnApp;
import com.hm.appinfo.model.LnAppCustInfo;
import com.hm.appinfo.model.LnCommodityInfo;
import com.hm.appinfo.service.LnAppCustInfoService;
import com.hm.appinfo.service.LnAppService;
import com.hm.appinfo.service.LnStatusService;
import com.hm.appinfo.service.SCService;
import com.hm.contract.model.LnContracttInfo;
import com.hm.contract.service.ContractFileService;
import com.hm.merchant.store.model.BsStore;
import com.hm.merchant.store.service.BsStoreService;
import com.hm.product.model.GoodsDict;
import com.hm.product.service.GoodsDictService;
import com.hm.repay.model.RepayPlanVo;
import com.hm.sys.constants.SysConstants;
import com.sc.api.app.model.LnAppCalcInfo;
import com.sc.api.app.model.LnAppCommodityInfo;
import com.sc.api.app.vo.LnAppSubsidiary;

@Controller
@RequestMapping(value = "/appinfo/appHM")
public class LnAppController extends BaseController<LnApp> {
	
	@Autowired
	private LnAppService lnAppService;
	
	@Autowired
	private LnStatusService lnStatusService;
	
	@Autowired
	private SCService scService;
	
	@Autowired
	private BsStoreService bsStoreService;
	
	@Autowired
	private ContractFileService contractFileService;
	
	@Autowired
	private LnAppCustInfoService lnAppCustInfoService;
	
	/** 货物类别 */
	@Autowired
	private GoodsDictService goodsDictService;
	
	@RequestMapping(value = "initList")
	public String initList(ModelMap model)
	{
		try
		{	
			LnApp t = new LnApp();
			t.setStartTime(DateUtils.getDate());
			t.setEndTime(DateUtils.getDate());
			Page<LnApp> page = getPage(t);
			model.addAttribute("pageReq", page);
			//从Redis中获取重发万卡的结果
			getReSendWkResult(model);
			//工单状态下拉框
			model.addAttribute("appStatus", lnStatusService.listAppStatus());
			return "appinfo/list";
		}
		catch (Exception e)
		{
			log.error("LnAppController initList exception", e);
			return RETURN_FAIL;
		}
	}
	
	/**
	 * 工单列表
	 */
	@RequestMapping(value = "list")
	public String list(LnApp t, ModelMap model)
	{
		log.info("LnAppController list start>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>: app{ " + t.getId() + t.getBusAppid() + t.getFirmName()
				 + t.getCustomerName() + t.getCardId() + t.getSaName()+ t.getAppState() + t.getStartTime() + t.getEndTime() + " } ");
		try
		{
			
			Page<LnApp> page = getPage(t);
			page = lnAppService.listUnionProcess(page);
			
			//工单状态下拉框
			model.addAttribute("appStatus", lnStatusService.listAppStatus());
			
			log.info("LnAppController list end:>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> app{ " + t.getId() + t.getBusAppid() + t.getFirmName()
			+ t.getCustomerName() + t.getCardId() + t.getSaName()+ t.getAppState() + t.getStartTime() + t.getEndTime() + " } ");
			//获取是否有在发送万卡的标识，避免重复发送
			String flag = RedisUtils.getObject(SysConstants.RE_SEND_WK_REDIS);
			log.info("LnAppController list REDIS-RE_SEND_WK_FLAG:"+flag);
			model.addAttribute("reSendWkFlag",flag);
			model.addAttribute("pageReq", page);
			//从Redis中获取重发万卡的结果
			getReSendWkResult(model);
			return "appinfo/list";
		}
		catch (Exception e)
		{
			log.error("LnAppController  list   exception", e);
			return RETURN_FAIL;
		}
	}
	
	/**
     * @param t
     * @param model
     * @return
     * @throws Exception
     * @Method: loan
     * @Description: 贷款信息查询
     * @author qiuyuan
     */
    @RequestMapping(value = "detail")
    protected String detail(LnApp t, ModelMap model){
    	if (InputChecker.isEmpty(t.getId())) {
    		return returnFail(model, "工单编号不能为空", "appinfo/appHM/list");
        }
    	try{
    		 //查询参数回传
            String reqParm = getReqParms(t);
            model.addAttribute("reqParm", reqParm);
            //工单信息
            LnApp appDetail = lnAppService.getLnAppByIdUnionBankInfo(t.getId());
            if(appDetail.getAppState().equals(SysConstants.LN_APP_STATE_31) 
            		|| appDetail.getAppState().equals(SysConstants.LN_APP_STATE_70)
            		|| appDetail.getAppState().equals(SysConstants.LN_APP_STATE_35)
            		|| appDetail.getAppState().equals(SysConstants.LN_APP_STATE_36)
            		|| appDetail.getAppState().equals(SysConstants.LN_APP_STATE_32)){
            	appDetail.setAppStatesShow("Y");
            	appDetail.setIsSubmit("Y");
            }
            appDetail.setRepaymentType(PropertyUtils.getConfig(SysConstants.PARAMETER_NAME, SysConstants.PARAMETER_REPAYMENT_TYPE+appDetail.getRepaymentType()));
            model.addAttribute("lnApp", appDetail);

            // 门店性质
            Long storeId = appDetail.getStoreId();
            model.addAttribute("storeCharacter", getStoreCharacter(storeId));

            //商品信息
            Integer subType = LnAppSubsidiary.CUST_INFO|LnAppSubsidiary.GOODS_INFO|LnAppSubsidiary.CALC_INFO;
    		LnAppSubsidiary lnAppSubsidiary = scService.queryLnAppSubsidiaryInfo(t.getId(), subType);
    		
    		List<LnCommodityInfo> commodityList = new ArrayList<>();
    		List<LnAppCommodityInfo> lnAppCommodityInfoList = lnAppSubsidiary.getCommodityInfos();
    		if(null != lnAppCommodityInfoList && lnAppCommodityInfoList.isEmpty()){
    			for (LnAppCommodityInfo lnAppCommodityInfo : lnAppCommodityInfoList) {
    				LnCommodityInfo commodityInfo = new LnCommodityInfo();
        			BeanUtils.copyFields(lnAppCommodityInfo, commodityInfo);
        			//查询货物类别名称和商品類型名称
        			List<GoodsDict> goodsCategories = goodsDictService.listByCode(commodityInfo.getCargoType());
        			
        			commodityInfo.setCargoType(goodsCategories.get(0).getName());
        			commodityInfo.setCommodityClass(PropertyUtils.getConfig(SysConstants.PARAMETER_NAME, SysConstants.PARAMETER_GOOD_CATEGORY+commodityInfo.getCommodityClass()));
        			
        			commodityList.add(commodityInfo);
    			}
    			model.addAttribute("commoditys", commodityList);
    		}

            //客户信息
            LnAppCustInfo custInfo = new LnAppCustInfo();
            if(lnAppSubsidiary != null && lnAppSubsidiary.getCustInfo() != null){
            	BeanUtils.copyFields(lnAppSubsidiary.getCustInfo(), custInfo);
            }
    		
    		if(!InputChecker.isEmpty(custInfo)){
    			custInfo.setCareer(PropertyUtils.getConfig(SysConstants.PARAMETER_NAME,SysConstants.PARAMETER_OCCUPATION+custInfo.getCareer()));
    			model.addAttribute("custinfo", custInfo);
    		}
    		log.info("LnAppController loan custInfo empty ,appId={}",t.getId());
    		
            List<LnContracttInfo> queryLnContracttList = contractFileService.getContracttInfos(t.getId());
            model.addAttribute("contracttInfos", queryLnContracttList);
    		
    		//还款计划
            LnAppCalcInfo calcInfo = lnAppSubsidiary.getCalcInfo();
            if (!InputChecker.isEmpty(calcInfo)) {
                RepayPlanVo repayPlan = new RepayPlanVo();
                repayPlan.setInfoFee(calcInfo.getMonCreditRate());
                repayPlan.setMonthlyFee(calcInfo.getMonServiceFee());
                SimpleDateFormat sFormat = new SimpleDateFormat("yyyy/MM/dd");
                repayPlan.setFirstRepayDate(sFormat.format(calcInfo.getFirstDayDate()));
                repayPlan.setConsultFee(calcInfo.getMonConsultRate());
                repayPlan.setMonRepAmt(calcInfo.getMonRepayAmt());
                repayPlan.setMonRepayDay(calcInfo.getRepyDay());
                repayPlan.setMonRate(calcInfo.getMonLoanRate());
                model.addAttribute("repayPlan", repayPlan);
            }
            return "appinfo/detail_loan";
    	}catch(Exception e){
    		log.error("LnAppController  detail  exception", e);
    		return RETURN_FAIL;
    	}
    }
    
    public String getReqParms(LnApp ln) {
        String o = JSON.toJSON(ln).toString();
        log.info("LnAppQueryController getReqParms>>>>>>>>>>>>>>>>>>>>>>>ReqParms: " + o);
        StringBuilder sb = new StringBuilder();
        @SuppressWarnings("unchecked")
        Map<String, Object> lnappMap = JSON.parseObject(o, HashMap.class);
        lnappMap.put("appStatusByJjcode", null);
        String[] reqParm = lnappMap.toString().replace("{", "").replace("}", "").split(",");
        for (String parm : reqParm) {
            if (!parm.substring(parm.length() - 1).equals("=") && parm.indexOf("id=") < 0 && isContainStoreOrOrgn(parm)) {
            	sb.append("&");
                sb.append(parm.replace(" ", ""));
            }
        }
        return InputChecker.isEmpty(sb.toString()) ? null : sb.toString().substring(1);
    }

	private boolean isContainStoreOrOrgn(String parm) {
		return parm.indexOf("bsStores") < 0 && parm.indexOf("orgnInfos") < 0;
	}
    
    // 获取门店性质
    private String getStoreCharacter(Long storeId) {
        if (storeId == null) {
            return null;
        }
        // 门店性质
        String storeCharacter = null;
        BsStore queryStore = new BsStore();
        queryStore.setId(storeId);
        List<BsStore> retStore = bsStoreService.list(queryStore);
        if (isStoreCharacterNotEmpty(retStore)) {
        	storeCharacter = PropertyUtils.getConfig(SysConstants.PARAMETER_NAME, SysConstants.PARAMETER_STORE_CHARACTER+retStore.get(0).getStoreCharacter());
        }
        return storeCharacter;
    }

	private boolean isStoreCharacterNotEmpty(List<BsStore> retStore) {
		return null != retStore && null != retStore.get(0) && !InputChecker.isEmpty(retStore.get(0).getStoreCharacter());
	}
	
    /**
     * 确认交易失败，把工单状态从31改为20，并且删除ln_attach_info和ln_commodity_code表相关的数据
     * @param model
     * @param appId
     * @param appStatus
     * @return
     */
	@RequestMapping("reSetAppStatus") 
	public String reSetAppStatus(ModelMap model, @RequestParam("id") Long appId,String appStatus) {
		try{
			log.info("LnAppController reSetAppStatus start appId={}",appId);
			if(InputChecker.isEmpty(appId)){
				return returnFail(model, "工单编号不能为空", "appinfo/appHM/list");
			}
			
			if(SysConstants.LN_APP_STATE_20.equals(appStatus)){
				//根据工单ID调用 SC 工单表信息
				LnApp lnAppQuery = new LnApp();
				lnAppQuery.setId(appId);
				lnAppQuery.setAppState(SysConstants.LN_APP_STATE_31);
				//查询状态为31待交易确认的工单
				List<com.sc.api.app.model.LnApp> lnAppList = lnAppService.queryLnAppSC(lnAppQuery);
				LnApp lnApp = null;
				if(CollectionUtils.isNotEmpty(lnAppList)){
					lnApp = new LnApp();
					com.sc.api.app.model.LnApp lnAppSC = ObjectUtils.convertObject(lnAppList);
					BeanUtils.copyFields(lnAppSC, lnApp);
				}
				
				if(null == lnApp){
					return returnFail(model, "工单状态不正确", "appinfo/appHM/list");
				}
				
				log.info("LnAppController reSetAppStatus 开始重新生成合同");
				lnApp.setNewAppState(appStatus);
				//修改状态为31待交易确认的工单
				Boolean reSetFlag = lnAppService.updateAppStatus(lnApp,getUserInfo());
				
				if(!reSetFlag){
					return returnFail(model, "重新生成合同失败", "appinfo/appHM/list");
				}
				return returnSuccess(model, "工单编号" + appId + "状态已变为待生成合同", "appinfo/appHM/list");
			}
			return returnFail(model, "不允许变更此工单状态", "appinfo/appHM/list");
			
		}catch(Exception e){
			log.error("LnAppController reSetAppStatus Exception appId = {}", appId);
			log.error("LnAppController reSetAppStatus Exception: ", e);
			return RETURN_FAIL;
		}
	}
	
	private void getReSendWkResult(ModelMap model){
		//从Redis中获取重发万卡的结果
		final String userLoginName = UserUtils.getLoginName();
		String reSendWkResult = RedisUtils.getObject(SysConstants.RE_SEND_WK_RESULT+userLoginName);
		if(!InputChecker.isEmpty(reSendWkResult)){
			model.addAttribute("reSendWkResult", reSendWkResult);
			RedisUtils.removeObject(SysConstants.RE_SEND_WK_RESULT+userLoginName);
		}
	}

	
	@RequestMapping("backCancelAppStatus") 
	public String backCancelAppStatus(ModelMap model, @RequestParam("id") Long appId) {
		try{
			log.info("LnAppController backCancelAppStatus start appId={}",appId);
			if(InputChecker.isEmpty(appId)){
				return returnFail(model, "工单编号不能为空", "appinfo/appHM/list");
			}
			// 获取工单信息
			LnApp appDetail = lnAppService.getLnAppByIdUnionBankInfo(appId);
			if(appDetail == null){
				return returnFail(model, "工单编号有误", "appinfo/appHM/list");
			}
			if(!SysConstants.LN_APP_STATE_70.equals(appDetail.getAppState())){
				return returnFail(model, "工单编状态不是撤销状态", "appinfo/appHM/list");
			}
			lnAppService.updateBackCancelAppStatus(appDetail, getUserInfo());
			return returnSuccess(model, "工单编号" + appId + "已取消撤销", "appinfo/appHM/list");
		}catch(Exception e){
			log.error("LnAppController backCancelAppStatus Exception appId = {}", appId);
			log.error("LnAppController backCancelAppStatus Exception: ", e);
			return RETURN_FAIL;
		}
	}
	
	/**
	 * @Method: initList
	 * @Description: 工单延时拒绝
	 * @param pageReq
	 * @return
	 */
	@RequestMapping(value = "updateDelayRefuse")
	public String updateDelayRefuse(ModelMap model){
		log.info("LnAppController updateDelayRefuse start>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> ");
		try{
			lnAppService.runUpdateDelayRefuse();
			log.info("LnAppController updateDelayRefuse end>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> ");
			model.addAttribute("redirectURL", "appinfo/appHM/initList");
			return RETURN_SUCCESS;
		}
		catch (Exception e){
			log.error("LnAppController.updateDelayRefuse", e);
			return RETURN_FAIL;
		}
	}
	
	/**
	 * @Method: initList
	 * @Description: 工单撤销
	 * @param pageReq
	 * @return
	 */
	@RequestMapping(value = "updateRevoke")
	public String updateRevoke(ModelMap model){
		log.info("LnAppController updateRevoke start>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> ");
		try{
			lnAppService.runUpdateRevoke();
			log.info("LnAppController updateRevoke end>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> ");
			model.addAttribute("redirectURL", "appinfo/appHM/initList");
			return RETURN_SUCCESS;
		}
		catch (Exception e){
			log.error("LnAppController.updateRevoke", e);
			return RETURN_FAIL;
		}
	}
	
	/**
	 * @Method: initList
	 * @Description: 工单撤销(人工)
	 * @param pageReq
	 * @return
	 */
	@RequestMapping("revokeAppStatusManual") 
	public String revokeAppStatusManual(ModelMap model, @RequestParam("id") Long appId) {
		try{
			log.info("LnAppController revokeAppStatusManual start appId={}",appId);
			if(InputChecker.isEmpty(appId)){
				return returnFail(model, "工单编号不能为空", "appinfo/appHM/list");
			}
			
			Result rs  = lnAppService.updateRevokeAppStatus(appId, getUserInfo());
			log.info("LnAppController revokeAppStatusManual appId={},flag={},message={}",appId,rs.isSuccess(),rs.getMessage());
			
			if (!rs.isSuccess()) {
				return returnFail(model, "工单编号" + appId + "撤销失败,失败原因:"+rs.getMessage(), "appinfo/appHM/list");
			}
			return returnSuccess(model, "工单编号" + appId + "已撤销完成", "appinfo/appHM/list");
		}catch(Exception e){
			log.error("LnAppController revokeAppStatusManual Exception appId = {}", appId);
			log.error("LnAppController revokeAppStatusManual Exception: ", e);
			return RETURN_FAIL;
		}
	}
	
}
