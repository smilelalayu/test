package com.hm.onecard.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.math.NumberUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.doraemoney.core.utils.Base64;
import com.doraemoney.core.utils.SignUtil;
import com.fk.api.reply.LoanQuotaReply;
import com.fk.api.service.FkTpApiService;
import com.gep.core.base.BaseMapper;
import com.gep.core.base.BaseServiceImpl;
import com.gep.core.entity.Page;
import com.gep.core.util.BeanUtils;
import com.gep.core.util.HttpUtils;
import com.gep.core.util.InputChecker;
import com.gep.core.util.OssOpsUtils;
import com.gep.util.PropertyUtils;
import com.hm.appinfo.dao.LnAppHmMapper;
import com.hm.appinfo.model.LnApp;
import com.hm.appinfo.model.LnAppContactInfo;
import com.hm.appinfo.model.LnAppCustInfo;
import com.hm.appinfo.model.LnAttachNode;
import com.hm.appinfo.model.SAUserInfo;
import com.hm.appinfo.service.BsAttachService;
import com.hm.appinfo.service.LnAppContactsService;
import com.hm.appinfo.service.LnAppCustInfoService;
import com.hm.appinfo.service.LnAppService;
import com.hm.appinfo.service.SAUserInfoService;
import com.hm.base.model.BaseInfo;
import com.hm.base.model.JjCode;
import com.hm.base.model.SmConfig;
import com.hm.base.service.ProvinceCityService;
import com.hm.base.service.SmConfigService;
import com.hm.base.service.SysJjCodeService;
import com.hm.bus.util.DateUtil;
import com.hm.contract.model.LnContracttInfo;
import com.hm.contract.service.ContractFileService;
import com.hm.onecard.model.Attach;
import com.hm.onecard.model.BaseData;
import com.hm.onecard.model.CollectionAddress;
import com.hm.onecard.model.CollectionCustomer;
import com.hm.onecard.model.CollectionMobile;
import com.hm.onecard.model.Extend;
import com.hm.onecard.model.Quota;
import com.hm.onecard.service.LnAppOneCardService;
import com.hm.product.service.BsProductService;
import com.hm.sys.constants.SysConstants;
import com.hm.sys.util.CommonUtils;

@Service
public class LnAppOneCardServiceImpl extends BaseServiceImpl<LnApp, Long> implements LnAppOneCardService
{
	protected final Logger log = LoggerFactory.getLogger(getClass());

	@Autowired
	private LnAppHmMapper lnAppMapper;
	
	@Autowired
    private LnAppCustInfoService lnAppCustInfoService;
	
	@Autowired
    private BsAttachService bsAttachService;
	
	@Autowired
    private SmConfigService smConfigService;
	
	@Autowired
    private LnAppContactsService lnAppContactsService;
	
	@Autowired
    private FkTpApiService fkTpApiService;
	
	@Autowired
    private ContractFileService contractFileService;
	
	@Autowired
    private BsProductService bsProductService;
	
	@Autowired
    private LnAppService lnAppService;
	
	@Autowired
    private SAUserInfoService saUserInfoService;
	
	@Autowired
    protected SysJjCodeService jjCodeService;
	
	@Autowired
	private ProvinceCityService provinceCityService;
	
	@Override
	public BaseMapper<LnApp, Long> getMapper() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String reSendOneCardBatch() throws Exception {
		log.info("LnAppOneCardServiceImpl--reSendOneCardBatch----start");
		int succCont = 0;
		int failCont = 0;
		try {
			LnApp app =new LnApp();
			app.setIsSendWk(SysConstants.RE_SEND_WK_N);
			int pageSize=Integer.parseInt(PropertyUtils.getConfig("oneCard.pageSize"));
			int totalPages = Integer.parseInt(PropertyUtils.getConfig("oneCard.totalPageSize"));
			log.info("totalPages:"+totalPages);
			Page<LnApp> pageFirst = new Page<LnApp>();
			pageFirst.setPageSize(pageSize);
			pageFirst.calcOffset();
			lnAppMapper.listUnionProcess(pageFirst,app);
			if(totalPages>pageFirst.getTotalPages()){
				totalPages = pageFirst.getTotalPages();
			}
			for(int i=totalPages;i>0;i--){
				Page<LnApp> page = new Page<LnApp>();
				page.setPageSize(pageSize);
				page.setPageNo(i);
				page.calcOffset();
				List<LnApp> list = lnAppMapper.listUnionProcess(page,app);
				log.info("LnAppOneCardServiceImpl--sendWK--list totals:"+page.getTotalCount()+",page NO:"+page.getPageNo());
				for(LnApp t : list){
					Long appId = t.getId();
					try{
						
			            String url = PropertyUtils.getConfig("wk.sendInfo.path");
			            if (InputChecker.isEmpty(url)) {
			                log.info("LnAppOneCardServiceImpl--sendWK----url is null");
			                break;
			            }
						LoanQuotaReply loanQuotaReply = fkTpApiService.queryLoanQuota(appId);
						
		                log.error("LnAppOneCardServiceImpl--sendWK----调用风控接口获取贷款额度， 请求 appId = {}   返回结果 = {}！", appId,  loanQuotaReply != null ? JSON.toJSONString(loanQuotaReply) : null);
		                
			            if (!"0000".equals(loanQuotaReply.getCode()) || loanQuotaReply.getLoanQuotaVo() == null) {
			                log.error("LnAppOneCardServiceImpl--sendWK----调用风控接口获取贷款额度失败！");
			                throw new Exception();
			            } else if (loanQuotaReply.getLoanQuotaVo().getOneCardQuota().compareTo(BigDecimal.ZERO) < 1) {
			                log.info("LnAppOneCardServiceImpl--sendWK----oneCardQuota = " + loanQuotaReply.getLoanQuotaVo().getOneCardQuota());
			                throw new Exception();
			            }
			            
			            LnAppCustInfo custInfo = lnAppCustInfoService.listCustInfoUnionJjCode(appId);
			            if(InputChecker.isNull(custInfo)){
			            	log.info("LnAppOneCardServiceImpl--sendWK----appId's custInfo is null "+ String.valueOf(appId));
			            	throw new Exception();
			            }
			            
			            initCustomerBaseInfoPath(custInfo);
			            
			            CollectionCustomer customer = this.contructCsCustomer(custInfo, t);
			            List<CollectionAddress> addresss = this.ContructCsAddress(custInfo);
			            List<CollectionMobile> mobiles = this.ContructCsMobile(appId);
			            
			            //组装万卡发送数据
			            Extend we = genWkExtend(custInfo);
			            Quota wq = genWkQuota(t,loanQuotaReply);
			            Attach wa = genWkAttach(t, custInfo);
			            BaseData wd = genWkData(t, wa, we, wq, customer, addresss, mobiles);
			            
			            String data = JSON.toJSONString(wd);
			            
			            //发送万卡
			            Map<String, String> map = sendToOneCard(t,data,url);
		
			            /**
			             * 1 数据获取成功
			             * 0 数据获取失败
			             * 1001 必填参数为空
			             * 1005 参数签名未通过
			             * 2001 用户已存在
			             */
			            String status = map.get("status");
			            if ("1".equals(status) || "2001".equals(status)) {
			            	LnApp la = new LnApp();
			    			la.setId(appId);
			            	la.setIsSendWk("Y");
			            	lnAppService.update(la);
			            	succCont++;
			            }else{
			            	failCont++;
			            }
			            Thread.sleep(10);
					}catch(Exception e){
						failCont++;
			            log.error("LnAppOneCardServiceImpl--reSendOneCardBatch fall----appid="+String.valueOf(appId)+";exception", e);
			            continue;
					}
				}
			}
			log.info("LnAppOneCardServiceImpl--sendWK----result: success=" + succCont+",fail="+failCont+",run times:"+totalPages);
		}catch (Exception e) {
            log.error("LnAppOneCardServiceImpl--reSendOneCardBatch----exception",e);
        }
		return  "成功=" + succCont+",失败="+failCont;
	}
	

    private void initCustomerBaseInfoPath(LnAppCustInfo custInfo) {
		if(null != custInfo){
			if(StringUtils.isNotBlank(custInfo.getHouseholdTown())){
				BaseInfo baseInfo = provinceCityService.queryDistrictByIdWithParent(custInfo.getHouseholdTown());
				custInfo.setHouseholdTown(CommonUtils.getFullPathFromdistinctInfo(baseInfo, "-"));
			}
			
			if(StringUtils.isNotBlank(custInfo.getLiveTown())){
				BaseInfo baseInfo = provinceCityService.queryDistrictByIdWithParent(custInfo.getLiveTown());
				custInfo.setLiveTown(CommonUtils.getFullPathFromdistinctInfo(baseInfo, "-"));
			}
			
			if(StringUtils.isNotBlank(custInfo.getUnitTown())){
				BaseInfo baseInfo = provinceCityService.queryDistrictByIdWithParent(custInfo.getUnitTown());
				custInfo.setUnitTown(CommonUtils.getFullPathFromdistinctInfo(baseInfo, "-"));
			}

		}
	}


	private Map<String, String> sendToOneCard(LnApp t,String data,String url) throws Exception {
    	String cardId = t.getCardId();
        String phone = t.getMobile();
        String currentTime = System.currentTimeMillis() + "";
    	/**
         * 签名参数
        */
        Map<String, String> signParam = new HashMap<String, String>();
        signParam.put("proId", SysConstants.PROID);
        signParam.put("_t", currentTime);
        signParam.put("data", data);
        signParam.put("funCode", SysConstants.FUNCODE);
        signParam.put("mobile", Base64.encode(phone.getBytes()));
        signParam.put("certId", Base64.encode(cardId.getBytes()));

        /**
         * 接口入参
        */
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("funCode", SysConstants.FUNCODE);
        params.put("data", data);
        params.put("mobile", Base64.encode(phone.getBytes()));
        params.put("certId", Base64.encode(cardId.getBytes()));
        params.put("proId", SysConstants.PROID);
        params.put("_t", currentTime);
        params.put("sign", SignUtil.getSign(signParam, SignUtil.OPEN_SALT));

        log.info("LnAppOneCardServiceImpl--sendWK----send data" + JSON.toJSONString(params));

        @SuppressWarnings("deprecation")
        String jsonString = HttpUtils.URLPost(url, params, "UTF-8");
        log.info("LnAppOneCardServiceImpl--sendWK----return data" + jsonString);
        return  (Map<String, String>) JSON.parse(jsonString);
	}


	public String getOssUri(String ossId) throws Exception {
        String ossUrl = OssOpsUtils.getSignUrl(ossId);
        int inde = ossUrl.indexOf("?");
        return ossUrl.substring(0, inde);
    }
	
    
    private Extend genWkExtend(LnAppCustInfo custInfo) throws Exception{
    	
        LnAppContactInfo contracct = new LnAppContactInfo();
        contracct.setAppId(custInfo.getAppId());
        List<LnAppContactInfo> listContract = lnAppContactsService.listDetail(contracct);
        if (!InputChecker.isEmpty(listContract)) {
            contracct = listContract.get(0);
            contracct.setContractType(PropertyUtils.getConfig(SysConstants.PARAMETER_NAME,SysConstants.PARAMETER_CONTRACT_TYPE+contracct.getContractType()));
            contracct.setContractProperty(PropertyUtils.getConfig(SysConstants.PARAMETER_NAME,SysConstants.PARAMETER_CONTACT_RELATIVES+contracct.getContractProperty()));
        }
        
        String unitTown = custInfo.getUnitTown();
        String liveTown = custInfo.getLiveTown();
        if(InputChecker.isEmpty(unitTown)){
        	unitTown = "";
        }else{
        	unitTown = unitTown.replace("-", "");
        }
        if(InputChecker.isEmpty(liveTown)){
        	liveTown = "";
        }else{
        	liveTown = liveTown.replace("-", "");
        }
        Extend we = new Extend();
        we.setEmail(custInfo.getEmaill());
        we.setIndustry(custInfo.getIndustryType());
        we.setCompany(custInfo.getUnitname());
        we.setCompanyTel(custInfo.getUnitPhone());
        we.setCompanyAdd(unitTown + custInfo.getUnitZhen() + custInfo.getUnitStr() + custInfo.getUnitRidge() + custInfo.getUnitHome());
        we.setRelative(contracct.getContractProperty());
        we.setRelativeName(contracct.getContractName());
        we.setRelativePhone(contracct.getContractPhone());
        we.setMonthIncome(custInfo.getMonthlyIncome() + "");
        we.setProfession(custInfo.getCareerType());
        we.setDuty(PropertyUtils.getConfig("codeMessages", "duty." + custInfo.getDuty()));
        we.setEducation(PropertyUtils.getConfig("codeMessages", "eduDegree." + custInfo.getDegree()));
        we.setMarriage(PropertyUtils.getConfig("codeMessages", "marry." + custInfo.getMarry()));
        we.setAddress(liveTown + custInfo.getLiveZhen() + custInfo.getLiveStr() + custInfo.getLiveRidge() + custInfo.getLiveHome());
        return we;
    }
    
    private Quota genWkQuota(LnApp t, LoanQuotaReply loanQuotaReply) throws Exception{
    	 List<LnContracttInfo> queryLnContracttList = contractFileService.getContracttInfos(t.getId());
         StringBuffer listContractId = new StringBuffer("");
         StringBuffer listContractUrl = new StringBuffer("");
         for (LnContracttInfo lnContracttInfo : queryLnContracttList) {
        	 if(NumberUtils.isNumber(lnContracttInfo.getContractType())){
            	 int contractType = Integer.parseInt(lnContracttInfo.getContractType());
            	 if(contractType<90){
    	             if (listContractId.toString().equals("")) {
    	                 listContractId.append(lnContracttInfo.getContractName());
    	             } else {
    	                 listContractId.append("," + lnContracttInfo.getContractName());
    	             }
    	             if (listContractUrl.toString().equals("")) {
    	                 listContractUrl.append(getOssUri(lnContracttInfo.getOssId()));
    	             } else {
    	                 listContractUrl.append("," + getOssUri(lnContracttInfo.getOssId()));
    	             }
            	 }else{
            		 log.error("LnAppOneCardServiceImpl--sendWK----lnContracttInfo has not numberic ContractType,  contractInfo = {}--", JSON.toJSONString(lnContracttInfo));
            	 }
        	 }
         }

         log.info("LnAppOneCardServiceImpl--sendWK----contractUrl--" + listContractUrl.toString());
         
         SmConfig smConfig = smConfigService.getOption("cnname");
         
         Quota wq = new Quota();
         wq.setAppId(t.getId() + "");
         wq.setCountQuota(loanQuotaReply.getLoanQuotaVo().getCountQuota());
         wq.setUsedQuota(loanQuotaReply.getLoanQuotaVo().getUsedQuota());
         wq.setPeroid(t.getPeriods());
         wq.setChannel("1028");
         wq.setProductId(t.getBusProductId());
         if(t.getWoBuildTime() != null){
             wq.setBorrowDate(DateUtil.msFormatDateTime(t.getWoBuildTime(), "yyyy-MM-dd HH:mm:ss"));
         }
         wq.setContractId(listContractId.toString());
         wq.setContractUrl(listContractUrl.toString());
         if(t.getSignTime() != null){
             wq.setContractDate(DateUtil.msFormatDateTime(t.getSignTime(), "yyyy-MM-dd HH:mm:ss"));
         }

         if (SysConstants.APP_CASH.equals(t.getLoanType())) {
             wq.setProductName("超能借贷(交叉现金贷)");
         } else if (SysConstants.CAPITAL_TYPE_DBL.equals(t.getCapitalType())) {
             wq.setProductName("");
         } else {
             wq.setProductName(smConfig.getConfValue());
         }
         return wq;
    }
    
    /**
     * @param custInfo
     * @param lnApp
     * @return
     * @throws Exception
     * @description:组装CollectionCustomer
     */
    private CollectionCustomer contructCsCustomer(LnAppCustInfo custInfo, LnApp lnApp) throws Exception {
    	CollectionCustomer customer = new CollectionCustomer();
    	String [] liveAddArr = null;
    	String [] unitAddArr = null;
    	
    	if(StringUtils.isNotBlank(custInfo.getLiveTown())){
    		liveAddArr = custInfo.getLiveTown().split("-");
    	}
    	 
    	if(StringUtils.isNotBlank(custInfo.getUnitTown())){
    		unitAddArr = custInfo.getUnitTown().split("-");
    	}
    	
    	customer.setShopCode(getStrVal(lnApp.getStoreId()));
    	customer.setCertType("01");
    	customer.setCompanyTel(getStrVal(custInfo.getUnitPhone()));
    	customer.setCustomerCategory(SysConstants.COMMON);
    	customer.setCompanyName(getStrVal(custInfo.getUnitname()));
    	customer.setCountQuota(lnApp.getLoanMoney());
    	customer.setBirthdayDate(lnApp.getCardId().substring(6, 14));
    	customer.setEmail(custInfo.getEmaill());
    	customer.setGender(custInfo.getCustomerSex());
    	customer.setAreaCode("");
    	customer.setFamilyTel(getStrVal(custInfo.getLivephone()));
    	customer.setMobile(lnApp.getMobile());
    	customer.setForeignName("");
    	customer.setIndustryCategory(custInfo.getIndustry());
    	customer.setCustomerName(custInfo.getCustomerName());
    	customer.setAnnualSalary(getStrVal(custInfo.getMonthlyIncome()*12));
    	customer.setCustomerType("OC");
    	customer.setHousehodeProv("");
    	customer.setLivingProv( (StringUtils.isNotBlank(custInfo.getLiveTown()) ? custInfo.getLiveTown().replace("-", "") : "") + custInfo.getLiveZhen() + custInfo.getLiveStr() + custInfo.getLiveRidge() + custInfo.getLiveHome());
    	
    	if(null != liveAddArr && liveAddArr.length > 2){
    		customer.setLivingCity(liveAddArr[1]);
        	customer.setLiveCity(liveAddArr[1]);
    	}else{
    		log.error("LnAppOneCardServiceImpl contructCsCustomer liveAddArr can't find liveAddArr[1],  custInfo.getLiveTown() = {}", custInfo.getLiveTown());
    	}
    	
    	customer.setHouseholdPostcode(getStrVal(custInfo.getHouseholdPostcode()));
    	customer.setLivePostcode(getStrVal(custInfo.getLivePostcode()));
    	customer.setCompanyPostcode(getStrVal(custInfo.getUnitPostcode()));
    	
    	if(null != unitAddArr && unitAddArr.length > 2){
    		customer.setCompanyCity(getStrVal(unitAddArr[1])); 
    	}else{
    		log.error("LnAppOneCardServiceImpl contructCsCustomer unitAddArr can't find unitAddArr[1],  custInfo.getUnitTown() = {}", custInfo.getUnitTown());
    	}
    	
    	
    	customer.setRelativePhone(getStrVal(custInfo.getMateMobel()));
    	customer.setRelativePostcode("");
    	customer.setUnitType(custInfo.getIndustryType());
    	customer.setUnitCity((StringUtils.isNotBlank(custInfo.getLiveTown()) ? custInfo.getLiveTown().replace("-", "") : "") + custInfo.getLiveZhen() + custInfo.getLiveStr() + custInfo.getLiveRidge() + custInfo.getLiveHome());
    	customer.setDepartment("");
    	customer.setMateAddress("");
    	customer.setWechat(getStrVal(custInfo.getWeixinCode()));
        customer.setQqNumber(getStrVal(custInfo.getQqCode()));
    	return customer;
    }
    
    /**
     * @param custInfo
     * @return
     * @throws Exception
     * @description:组装CollectionAddress
     */
    public List<CollectionAddress> ContructCsAddress(LnAppCustInfo custInfo)throws Exception{
    	List<CollectionAddress> listAddress= new ArrayList<CollectionAddress>();
    	
    	CollectionAddress householdAddress = new CollectionAddress();
    	CollectionAddress liveAddress = new CollectionAddress();
    	CollectionAddress unitAddress = new CollectionAddress();
    	
    	String [] householdAddArr = null;
    	String [] liveAddArr = null;
    	String [] unitAddArr = null;
    	
    	if(StringUtils.isNotBlank(custInfo.getHouseholdTown())){
    		householdAddArr = custInfo.getHouseholdTown().split("-");
    	}
    	
    	if(StringUtils.isNotBlank(custInfo.getLiveTown())){
    		liveAddArr = custInfo.getLiveTown().split("-");
    	}
    	 
    	if(StringUtils.isNotBlank(custInfo.getUnitTown())){
    		unitAddArr = custInfo.getUnitTown().split("-");
    	}
    	
    	if(null != householdAddArr && householdAddArr.length > 2){
    		householdAddress.setAddress1(householdAddArr[0]);
        	householdAddress.setAddress2(householdAddArr[1]);
        	householdAddress.setAddress3(householdAddArr[2]);
        	householdAddress.setProvCode(householdAddArr[1]);
    	}else{
    		log.error("LnAppOneCardServiceImpl ContructCsAddress householdAddArr can't find householdAddArr[0][1][2],  custInfo.getHouseholdTown() = {}", custInfo.getHouseholdTown());
    	}
    	
    	householdAddress.setAddress4(custInfo.getHouseholdZhen()+custInfo.getHouseholdStr() + custInfo.getHouseholdRidge() + custInfo.getHouseholdHome());
    	householdAddress.setAddress5("");
    	householdAddress.setPostCode("");
    	householdAddress.setAddressType("H");
    	householdAddress.setAddressKey("");
    	householdAddress.setDealerCode("");
    	householdAddress.setIsForeignAddress("");
    	householdAddress.setUpdateDate("");
    	householdAddress.setUpdateTime("");
    	householdAddress.setIncreaseDate("");
    	householdAddress.setIncreaseTime("");
    	
    	BeanUtils.copyFields(householdAddress, liveAddress);
    	
    	if(null != liveAddArr && liveAddArr.length > 2){
    		liveAddress.setAddress1(liveAddArr[0]);
        	liveAddress.setAddress2(liveAddArr[1]);
        	liveAddress.setAddress3(liveAddArr[2]);
        	liveAddress.setProvCode(liveAddArr[1]);
    	}else{
    		log.error("LnAppOneCardServiceImpl ContructCsAddress liveAddArr can't find liveAddArr[0][1][2],  custInfo.getLiveTown() = {}", custInfo.getLiveTown());
    	}
    	
    	liveAddress.setAddress4(custInfo.getLiveZhen()+custInfo.getLiveStr() + custInfo.getLiveRidge() + custInfo.getLiveHome());
    	liveAddress.setAddressType("L");
    	
    	BeanUtils.copyFields(householdAddress, unitAddress);
    	
    	if(null != unitAddArr && unitAddArr.length > 2){
    		unitAddress.setAddress1(unitAddArr[0]);
        	unitAddress.setAddress2(unitAddArr[1]);
        	unitAddress.setAddress3(unitAddArr[2]);
        	unitAddress.setProvCode(unitAddArr[1]);
    	}else{
    		log.error("LnAppOneCardServiceImpl ContructCsAddress unitAddArr can't find unitAddArr[0][1][2],  custInfo.getUnitTown() = {}", custInfo.getUnitTown());
    	}
    	
    	unitAddress.setAddress4(custInfo.getUnitZhen()+custInfo.getUnitStr() + custInfo.getUnitRidge() + custInfo.getUnitHome());
    	unitAddress.setAddressType("C");
    	
    	listAddress.add(householdAddress);
    	listAddress.add(liveAddress);
    	listAddress.add(unitAddress);
    	
    	return listAddress;
    }
    
    /**
     * @param appId
     * @return
     * @throws Exception
     * @description:组装CollectionMobile
     */
    public List<CollectionMobile> ContructCsMobile(Long appId)throws Exception{
    	LnAppContactInfo contracct = new LnAppContactInfo();
        contracct.setAppId(appId);
        List<LnAppContactInfo> listContract = lnAppContactsService.list(contracct);
    	List<CollectionMobile> listCollectionMobile = new ArrayList<CollectionMobile>();
    	for (LnAppContactInfo lnContractInfo : listContract) {
    		CollectionMobile  collectionMobile= new CollectionMobile();
    		collectionMobile.setName(lnContractInfo.getContractName());
    		collectionMobile.setContractNO("");
    		collectionMobile.setContractPhone("");
    		collectionMobile.setContractPhone1("");
    		collectionMobile.setContractCompany("");
    		collectionMobile.setContractMobile(lnContractInfo.getContractPhone());
    		collectionMobile.setContractRelation(lnContractInfo.getContractProperty());
			if(SysConstants.JjGroupCode.CONTACT_RELATIVES.equals(lnContractInfo.getContractType())){
				  collectionMobile.setContractType("1");
			  }else{
				  collectionMobile.setContractType("0");
			  }
    		collectionMobile.setUpdateTime("");
    		collectionMobile.setContractAreaNo("");
    		listCollectionMobile.add(collectionMobile);
		}
    	return listCollectionMobile;
    }
    
    private BaseData genWkData(LnApp t, Attach wa,Extend we,Quota wq,CollectionCustomer customer,List<CollectionAddress> addresss,List<CollectionMobile> csMobile) throws Exception{
    	Long userId = t.getSa();
        //查询对应的用户信息
        SAUserInfo saUserInfo = new SAUserInfo();
        saUserInfo.setUserId(userId);
        List<SAUserInfo> users = saUserInfoService.list(saUserInfo);
        if (InputChecker.isEmpty(users)) {
            log.info("can not found userinfo where contructBaseData to send oneCard,userId=" + userId);
            throw new Exception();
        }
        BaseData wd = new BaseData();
        wd.setName(t.getCustomerName());
        wd.setMobile(t.getMobile());
        wd.setSaId(users.get(0).getLoginName());
        wd.setCertId(t.getCardId());
        wd.setCustType("1");
        wd.setExtend(we);
        wd.setQuota(wq);
        wd.setAttach(wa);
        wd.setCsCustomer(customer);
        wd.setCsAddress(addresss);
        wd.setCsMobile(csMobile);
    	return wd;
    }
    
    private Attach genWkAttach(LnApp t,LnAppCustInfo custInfo) throws Exception{
    	Map<String, List<LnAttachNode>> attMap = bsAttachService.getAttachListByAppId(t.getProductSeriesId(), custInfo.getCareer(), t.getId());
        List<LnAttachNode> listAttach = attMap.get(SysConstants.AttachType.REQUIRED);
        Attach wa = new Attach();
        for (LnAttachNode lnAttachNode : listAttach) {
            if (SysConstants.CARDIDCODE.equals(lnAttachNode.getAttachCode())) {
                if (InputChecker.isEmpty(wa.getFrontPhone())) {
                    wa.setFrontPhone(getOssUri(lnAttachNode.getOssId()));
                } else {
                    wa.setOtherPhone(getOssUri(lnAttachNode.getOssId()));
                }
            } else if (SysConstants.SALECUSTOMCODE.equals(lnAttachNode.getAttachCode())) {
                wa.setHandPhone(getOssUri(lnAttachNode.getOssId()));
            }
        }
        return wa;
    }
    
    protected String getJjName(String jjCodeGroupCode, String jjCode) {
        JjCode t = new JjCode();
        t.setGroupCode(jjCodeGroupCode);
        t.setCode(jjCode);
        t = jjCodeService.getJjCode(t);
        return t.getName();
    }
    
    public String getStrVal(Object b){
		return  b == null  ? "" : b.toString();
	}
}
