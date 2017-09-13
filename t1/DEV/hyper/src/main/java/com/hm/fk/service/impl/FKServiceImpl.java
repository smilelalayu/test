package com.hm.fk.service.impl;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.fk.api.model.BusDataCheckModel;
import com.fk.api.model.BusRuleCheckModel;
import com.fk.api.model.FkTpModel;
import com.fk.api.model.LnAppModel;
import com.fk.api.model.LnCommodityInfoModel;
import com.fk.api.model.LnContractInfoModel;
import com.fk.api.reply.LnAppApiReply;
import com.fk.api.reply.RuleReply;
import com.fk.api.service.FkRuleApiService;
import com.fk.api.service.LnAppApiService;
import com.gep.core.entity.Result;
import com.gep.core.exceptoin.BusinessException;
import com.gep.core.util.BeanUtils;
import com.gep.core.util.DateUtils;
import com.gep.core.util.InputChecker;
import com.gep.core.util.ObjectUtils;
import com.gep.util.PropertyUtils;
import com.hm.account.service.FuiouService;
import com.hm.appinfo.model.LnApp;
import com.hm.appinfo.model.LnAppCalcInfo;
import com.hm.appinfo.model.LnAppCash;
import com.hm.appinfo.model.LnAppContactInfo;
import com.hm.appinfo.model.LnAppCustInfo;
import com.hm.appinfo.model.LnAssistCheckinfo;
import com.hm.appinfo.model.LnAttachInfo;
import com.hm.appinfo.model.LnCommodityInfo;
import com.hm.appinfo.service.LnAppCalcInfoService;
import com.hm.appinfo.service.LnAppService;
import com.hm.appinfo.service.SCService;
import com.hm.base.model.BankRecordInformation;
import com.hm.base.model.BaseInfo;
import com.hm.base.service.BankRecordInformationService;
import com.hm.base.service.ProvinceCityService;
import com.hm.bus.dao.BsProdectSeriesMapper;
import com.hm.bus.module.BsProdectSeries;
import com.hm.fk.service.FKService;
import com.hm.merchant.store.model.BsStore;
import com.hm.merchant.store.service.BsStoreService;
import com.hm.product.model.BsProduct;
import com.hm.product.model.GoodsDict;
import com.hm.product.service.BsProductService;
import com.hm.product.service.GoodsDictService;
import com.hm.repay.model.RepayPlan;
import com.hm.sys.constants.ErrorMsg;
import com.hm.sys.constants.SysConstants;
import com.sc.api.app.model.LnAppAttachInfo;
import com.sc.api.app.model.LnAppCommodityInfo;
import com.sc.api.app.vo.LnAppSubsidiary;
@Service
public class FKServiceImpl implements FKService{
	

	@Resource
	private LnAppApiService lnAppApiService;
	
	@Resource
	private FkRuleApiService fkRuleApiService;

	@Autowired
	private SCService scService;

	@Autowired
	private BsStoreService bsStoreService;

	@Autowired
	private BsProductService bsProductService;

	@Autowired
	private ProvinceCityService provinceCityService;

	/** 银行信息 */
	@Autowired
	private BankRecordInformationService bankRecordInformationService;

	/** 货物类别 */
	@Autowired
	private GoodsDictService goodsDictService;

	
	@Autowired
	private BsProdectSeriesMapper bsProdectSeriesMapper;
	
	@Autowired
	private FuiouService fuiouService;
	
	@Autowired
	private LnAppService lnAppService;
	
	@Autowired
	private LnAppCalcInfoService lnAppCalcInfoService;
	
	protected final Logger log = LoggerFactory.getLogger(getClass());
	/**
	 * 检查配置文件是否配置了门店
	 * @param store
	 * @return
	 */
    private boolean checkStore(BsStore store,Long appId){
    	boolean flag = true;
		return flag;
    }
    
    /**
     * 设值合同金额
     * @param appId
     */
    private BigDecimal getContractAmt(Long appId){
    	log.info("FKServiceImpl getContractAmt start,appId={}",appId);
    	BigDecimal contractAmt = new BigDecimal(0);
    	LnAppCalcInfo lnAppCalcInfo = new LnAppCalcInfo();
		LnAppSubsidiary lnAppSubsidiary = scService.queryLnAppSubsidiaryInfo(appId, LnAppSubsidiary.CALC_INFO);
		BeanUtils.copyFields(lnAppSubsidiary.getCalcInfo() ,lnAppCalcInfo);
		if (!InputChecker.isEmpty(lnAppCalcInfo)){
			contractAmt = lnAppCalcInfo.getContractAmt();//风控设置合同金额
		}
		log.info("FKServiceImpl getContractAmt start,appId={} , contractAmt={}",appId , contractAmt);
		return contractAmt;
    }
    
    
    /**
     * 构建风控所需要的model数据
     * @param model
     * @param lnApp
     * @param clientIp
     * @param loginName
     * @throws Exception 
     */
    private boolean contructLnAppModel(LnAppModel model,LnApp lnApp,String clientIp,String loginName) throws Exception{
    	try {
    		log.info("FKServiceImpl contructLnAppModel start,appId={},clientIp={},loginName={}",lnApp.getId(),clientIp,loginName);
    		Long appId = lnApp.getId();
    		BsStore store = bsStoreService.getBsStoreById(lnApp.getStoreId());
			// boolean flag = this.checkStore(store, appId);
			// if(!flag){
			// log.info("FKServiceImpl contructLnAppModel checkStore,appId={},flag={}",lnApp.getId(),flag);
			// return false;
			// }
    		model.setClientIp(clientIp);//客户端IP地址
    		model.setSa(loginName);// 销售代表
    		this.setLnappInfo(model, lnApp);
    		
    		log.info("FKServiceImpl contructLnAppModel appInfo ,appId={},model={}",lnApp.getId(),model.toString());
    		
    		//获取工单客户信息,工单协审信息,工单合同试算信息,工单联系人信息,工单附件信息,工单商品信息
    		int subType = LnAppSubsidiary.CUST_INFO|LnAppSubsidiary.ASSIST_CHECK_INFO|LnAppSubsidiary.CONTACTS_INFO|LnAppSubsidiary.CALC_INFO|LnAppSubsidiary.GOODS_INFO|LnAppSubsidiary.ATTACH_INFO;
    		LnAppSubsidiary lnAppSubsidiary = scService.queryLnAppSubsidiaryInfo(appId, subType);
    		//客户基本信息
//    		LnAppCustInfo custInfo = lnAppCustInfoService.listByAppId(appId);
    		LnAppCustInfo custInfo = new LnAppCustInfo();
    		BeanUtils.copyFields(lnAppSubsidiary.getCustInfo(), custInfo);
    		if(InputChecker.isEmpty(custInfo)){
    			log.info("FKServiceImpl contructLnAppModel custInfo empty ,appId={}",lnApp.getId());
    			return false;
    		}
    		//设值客户信息
    		this.setCustInfo(model, custInfo);
    		log.info("FKServiceImpl contructLnAppModel custInfo ,appId={}",lnApp.getId());
    		
    		//合同试算
    		LnAppCalcInfo lnAppCalcInfo = new LnAppCalcInfo();
    		BeanUtils.copyFields(lnAppSubsidiary.getCalcInfo() ,lnAppCalcInfo);
    		if(InputChecker.isEmpty(lnAppCalcInfo)){
    			log.info("FKServiceImpl contructLnAppModel lnAppContractInfo empty ,appId={}",lnApp.getId());
    			return false;
    		}
    		//设值合同金额
    		model.setContractAmt(lnAppCalcInfo.getContractAmt());
    		String productCategory = getProductCategory(lnApp.getProductSeriesId());
    		log.info("FKServiceImpl contructLnAppModel productCategory--------------->:"+productCategory);
    		model.setProductCategory(productCategory);
    		log.info("FKServiceImpl contructLnAppModel lnAppContractInfo ,appId={},npvAmt={}",lnApp.getId(),lnAppCalcInfo.getContractAmt());
    		
    		//设值附件信息
    		List<LnAttachInfo> lnAttachInfoList = new ArrayList<LnAttachInfo>();
    		List<LnAppAttachInfo> lnAttachInfoSCList = lnAppSubsidiary.getAttachInfos();
    		for(LnAppAttachInfo lnAppAttachInfo : lnAttachInfoSCList){
    			LnAttachInfo lnAttachInfo = new LnAttachInfo();
    			BeanUtils.copyFields(lnAppAttachInfo, lnAttachInfo);
    			lnAttachInfoList.add(lnAttachInfo);
    		}
    		if(InputChecker.isEmpty(lnAttachInfoList)){
    			log.info("FKServiceImpl contructLnAppModel lnAttachInfoList empty ,appId={}",lnApp.getId());
    			return false;
    		}
    		this.setlnAttachInfo(appId, model,lnAttachInfoList);
    		log.info("FKServiceImpl contructLnAppModel LnAttachInfo ,appId={}",lnApp.getId());
    		
    		//设值门店信息
    		this.setStoreInfo(store, model);
    		log.info("FKServiceImpl contructLnAppModel BsStore ,appId={}",lnApp.getId());
    		
    		//设值联系人信息
    		List<com.sc.api.app.model.LnAppContactInfo> lnAppContactInfoSCList = lnAppSubsidiary.getContactsInfos();
    		List<LnAppContactInfo> contractInfoList = new ArrayList<LnAppContactInfo>();
    		for(com.sc.api.app.model.LnAppContactInfo lnAppContactInfo : lnAppContactInfoSCList){
    			LnAppContactInfo lnContractInfo = new LnAppContactInfo();
    			BeanUtils.copyFields(lnAppContactInfo, lnContractInfo);
    			contractInfoList.add(lnContractInfo);
    		}
    		if(InputChecker.isEmpty(contractInfoList)){
    			log.info("FKServiceImpl contructLnAppModel LnContractInfo empty ,appId={}",lnApp.getId());
    			return false;
    		}
    		List<LnContractInfoModel> lnContractInfos = this.contructContracts(appId,contractInfoList);
    		model.setLnContractInfos(lnContractInfos);
    		log.info("FKServiceImpl contructLnAppModel LnContractInfo ,appId={}",lnApp.getId());
    		
    		//设值协审信息
//    		LnAssistCheckinfo assistCheckinfo = lnAssistCheckinfoService.listByAppId(appId);
    		LnAssistCheckinfo assistCheckinfo = new LnAssistCheckinfo();
    		BeanUtils.copyFields(lnAppSubsidiary.getAssistCheckInfo(), assistCheckinfo);
    		if(InputChecker.isEmpty(assistCheckinfo)){
    			log.info("FKServiceImpl contructLnAppModel LnAssistCheckinfo empty ,appId={}",lnApp.getId());
    			return false;
    		}
    		this.setAssistCheckInfo(model, assistCheckinfo);
    		log.info("FKServiceImpl contructLnAppModel LnAssistCheckinfo ,appId={}",lnApp.getId());
    		
            //设值产品信息
    		this.setProductInfo(lnApp, model);
    		log.info("FKServiceImpl contructLnAppModel BsProduct ,appId={}",lnApp.getId());
    		
            //设值贷款商品信息
    		List<LnCommodityInfo> commodityList = new ArrayList<LnCommodityInfo>();
    		List<LnAppCommodityInfo> lnAppCommodityInfoList = lnAppSubsidiary.getCommodityInfos();
    		for(LnAppCommodityInfo lnAppCommodityInfo : lnAppCommodityInfoList){
    			LnCommodityInfo lnCommodityInfo = new LnCommodityInfo();
    			BeanUtils.copyFields(lnAppCommodityInfo, lnCommodityInfo);
    			commodityList.add(lnCommodityInfo);
    		}
    		this.setCommodityInfos(model,appId,commodityList);
    		log.info("FKServiceImpl contructLnAppModel LnCommodityInfo ,appId={}",lnApp.getId());
    		
    		//构建还款信息
    		/*CalcInfo plan = contructRepayPlan(lnApp);
    		this.setRepayPlan(model, plan);*/
    		this.setCalcInfo(model,lnApp);
    		log.info("FKServiceImpl contructLnAppModel RepayPlan ,appId={}",lnApp.getId());
    		
    		log.info("FKServiceImpl contructLnAppModel End,appId={},clientIp={},loginName={},model={}",lnApp.getId(),clientIp,loginName,model.toString());
    		
		} catch (Exception e) {
			 throw new BusinessException("FKServiceImpl contructLnAppModel 构建model对象出错",e);
		}
		return true;
    }
    
	
	public Boolean lnAppRuleCheck(LnApp lnApp , String clientIp,String loginName,LnAppModel model) {
		Long appId  = lnApp.getId();
		log.info("FKServiceImpl lnAppRuleCheck start,appId={}",appId);
		try {
			if(InputChecker.isEmpty(lnApp.getId())){
				log.info("FKServiceImpl lnAppRuleCheck appId is null ");
				return false;
			}
			//调用接口时，构建风控系统需要的数据
			log.info("FKServiceImpl contructLnAppModel start,appId={},clientIp={},loginName={}",lnApp.getId(),clientIp,loginName);
			boolean flag = this.contructLnAppModel(model, lnApp, clientIp, loginName);
			//构建model出错，结束程序
			if(!flag){
				return false;
			}
			log.info("FKServiceImpl contructLnAppModel  end,appId={},flag={}",lnApp.getId(),flag);
			//调用风控系统dubbo接口
			log.info("lnAppApiService autoCheck start,appId={},  model = {} ",lnApp.getId(),  JSON.toJSONString(model));
			LnAppApiReply appiReply = lnAppApiService.autoCheck(model);
			log.info("lnAppApiService autoCheck end,appId={}",lnApp.getId());
			if(!InputChecker.isEmpty(appiReply)){
				log.info("FKServiceImpl lnAppRuleCheck code={},msg={},appId={}:", appiReply.getCode(), appiReply.getMsg(),appId);
			}
			return true;
		} catch (Exception e) {
			if(!InputChecker.isEmpty(appId)){
				log.info("FKServiceImpl lnAppRuleCheck exception update lnapp marker,appId={}",appId);
			}
			log.error("FKServiceImpl lnAppRuleCheck exception,appId={}:", appId);
			log.error("FKServiceImpl lnAppRuleCheck exception,", e);
			return false;
			 
		}
	}
	
	private void setLnappInfo(LnAppModel model,LnApp lnApp){
		model.setLnAppId(lnApp.getId());// 超能工单ID
		model.setWoBuildTime(lnApp.getWoBuildTime());// 申请时间
		model.setLoanMoney(lnApp.getLoanMoney());// 申请贷款金额
		model.setCustomerName(lnApp.getCustomerName());// 申请人姓名
		model.setCardId(lnApp.getCardId());// 申请人身份证号
		model.setMobile(lnApp.getMobile());// 手机号码
		model.setProductSeriesName(lnApp.getProductSeriesName());// 产品系列名称
		model.setRepaymentAcc(lnApp.getRepaymentAcc());// 客户银行账号
		model.setRepaymentBankNo(lnApp.getRepaymentBank());// 客户银行代码
		if(StringUtils.isNoneBlank(lnApp.getRepaymentCity())){
			BaseInfo ditrict = provinceCityService.queryDistrictByIdWithParent(lnApp.getRepaymentCity());
	        if(null != ditrict && ditrict.getParentBase() != null){
	        	lnApp.setRepaymentCity(ditrict.getParentBase().getName());
	        }else {
	            BaseInfo city = provinceCityService.queryCityById(lnApp.getRepaymentCity());
	            if(city != null){
	            	lnApp.setRepaymentCity(city.getName());
	            }
	        }
		}
		model.setGetBankTel(lnApp.getBankTel());// 银行卡开户手机号
		if(!InputChecker.isEmpty(lnApp.getUserEvaluate())){
			model.setUserEvaluate(Integer.parseInt(lnApp.getUserEvaluate()));// 其他信息
		}
//		model.setSa(loginName);// 销售代表
		model.setDownPaymentAmount(lnApp.getDownPaymentAmount());// 自付金额(元)
		model.setPeriods(lnApp.getPeriods());// 分期数
		Boolean buyInsurance = lnApp.getBuyInsurance();
		String buyInsurancekey = null;
		if(InputChecker.isEmpty(buyInsurance) == Boolean.FALSE){
			buyInsurancekey = buyInsurance.toString(); //是否购买保险
		}
		model.setBuyInsurance(getDescValue(buyInsurancekey, "true;false", "是;否"));// 购买保险
		DecimalFormat df = new DecimalFormat("0.00");
		if(!InputChecker.isEmpty(lnApp.getInterestRate())){
		   model.setInterestRate(new BigDecimal(df.format(lnApp.getInterestRate())));// 平息利率
		}
		model.setRepaymentType(getDescValue(lnApp.getRepaymentType(), "1;2", "自主还款;银行代扣"));// 还款类型
		model.setRepaymentAccName(lnApp.getRepaymentAccName());// 客户银行账户户名
		//获取客户开户行
		String repaymentBank = this.getRepayMentBank(lnApp);
		model.setRepaymentBank(repaymentBank);// 客户开户银行
	}
	 
	/**
	 * 设值门店信息
	 * @param store
	 * @param model
	 */
	private void setStoreInfo(BsStore store, LnAppModel model) {
		
		//start add zkl 2016.101.7 需求(473 R引擎接口文件增加门店性质)
		int storeCharacter = 0;//默认为0
		if(InputChecker.isEmpty(store.getStoreCharacter()) == Boolean.FALSE){
			storeCharacter = Integer.parseInt(store.getStoreCharacter().trim());
		}
		model.setStoreCharacter(storeCharacter); //门店性质
		BaseInfo provinceStore = provinceCityService.getProvinceById(store.getStoreProv());
		//特殊处理地方 39101831|河北省 风控系统要求2016/10/24
		model.setStoreProv(provinceStore.getId().concat("|").concat(provinceStore.getName()));// 门店所在省份
		model.setCreatedon(store.getCreatedon());// 门店创建时间
		BaseInfo storeCity = provinceCityService.queryCityById(store.getStoreCity());
		//特殊处理地方 1831|成都市 风控系统要求2016/10/24
		model.setStoreCity(storeCity.getId()+"|"+storeCity.getName());// 门店所在城市
		model.setActivedon(store.getActivedon());// 门店激活时间
		
		// 门店类型
		model.setMerchantTypeCode(PropertyUtils.getConfig(SysConstants.PARAMETER_NAME,SysConstants.PARAMETER_STORE_TYPE+store.getMerchantTypeCode()));
		
		model.setStoreCode(store.getStoreCode());// 门店代码
		model.setStoreName(store.getStoreName());// 门店名称
	}
	/**
	 * 设值协审信息
	 * @param model
	 * @param assistCheckinfo
	 */
	private void setAssistCheckInfo(LnAppModel model, LnAssistCheckinfo assistCheckinfo) {
		model.setCheckDebitCard(assistCheckinfo.getCheckDebitCard());// 申请表：已确认代扣还款借记卡卡号及背后本人签名
		model.setCheckApplyInfo(getDescValue(assistCheckinfo.getCheckApplyInfo(), "0;1", "是;否"));// 申请资料：申请资料已查看原件，复印件（影像件）与原件内容完全一致
		model.setMattersNeed(getDescValue(assistCheckinfo.getMattersNeed(), "0;1", "是;否"));// 告知事项：已明确告知客户贷款相关注意事项，并告知其还款义务
		model.setCheckMobile(getDescValue(assistCheckinfo.getCheckMobile(), "0;1", "是;否"));// 电话核实：客户手机号是否已核实
		model.setCheckTel(getDescValue(assistCheckinfo.getCheckTel(), "0;1", "是;否"));// 电话核实：单位电话是否已核实
		model.setCheckLinkmanTel(assistCheckinfo.getCheckLinkmanTel());// 电话核实：联系人电话是否已核实
		model.setCheckSocial(assistCheckinfo.getCheckSocial());// 网络核实：是否查询客户社保信息
		model.setCheckCompany(assistCheckinfo.getCheckCompany());// 网络核实：是否网络查询客户单位信息
		model.setAccompany(assistCheckinfo.getAccompany());// 陪同人数
		String accApply = assistCheckinfo.getAccApply();
 		model.setAccApply(getDescValue(accApply, "0;1", "否;是"));// 陪同人员是否有申请
		model.setAccName(assistCheckinfo.getAccName());// 陪同人员姓名
		model.setAccMobile(assistCheckinfo.getAccMobile());// 陪同人员手机号码
		model.setMobileBrand(assistCheckinfo.getMobileBrand());// 客户目前所
		model.setMobileState(assistCheckinfo.getMobileState());// 目前所用手机状态
		model.setStortFamKm(assistCheckinfo.getStortFamKm().intValue());// 门店与家庭
		model.setStortComKm(assistCheckinfo.getStortComKm().intValue());// 门店与工作
		model.setFamComKm(assistCheckinfo.getFamComKm().intValue());// 家庭住址与工作
	}
	/**
	 * 构建联系人信息
	 * @param appId
	 * @return
	 */
	private List<LnContractInfoModel> contructContracts(Long appId,List<LnAppContactInfo> contractInfoList) {
//		LnContractInfo contractInfoParam = new LnContractInfo();
//		contractInfoParam.setAppId(appId);
//		List<LnContractInfo> contractInfoList = lnContractInfoService.list(contractInfoParam);
//			List<LnContractInfo> contractInfoList = custInfo.getContractInfos();
		log.info("FKServiceImpl contructContracts start,appId={}",appId);
		List<LnContractInfoModel> lnContractInfoModelList = new ArrayList<LnContractInfoModel>();

		for (LnAppContactInfo contractInfo : contractInfoList) {
			LnContractInfoModel contractInfoModel = new LnContractInfoModel();
			contractInfoModel.setContractName(contractInfo.getContractName());// 联系人姓名
			contractInfoModel.setContractPhone(contractInfo.getContractPhone());// 联系人电话
			String contractType = contractInfo.getContractType();
			contractInfoModel.setContractType(getDescValue(contractType, "contactNonRelatives;contactRelatives", "非家庭联系人;家庭联系人"));// 联系人性质
			String contractProperty = PropertyUtils.getConfig(SysConstants.PARAMETER_NAME,SysConstants.PARAMETER_CONTACT_RELATIVES+contractInfo.getContractProperty());
			contractInfoModel.setContractClass(contractProperty);// 联系人类别
			contractInfoModel.setContractUnit(contractInfo.getContractUnit());// 联系人工作单位
			contractInfoModel.setContractAddress(contractInfo.getContractAddress());// 联系人地址
			log.info("FKServiceImpl contructContracts start,appId={},contractType={},contractProperty={}",appId,contractType,contractProperty);
			lnContractInfoModelList.add(contractInfoModel);
		}
		log.info("FKServiceImpl contructContracts End,appId={},",appId);
		return lnContractInfoModelList;
	}
	/**
	 * 设置客户信息
	 * @param model
	 * @param custInfo
	 */
	private void setCustInfo(LnAppModel model, LnAppCustInfo custInfo) {
		model.setCustomerSex(custInfo.getCustomerSex());// 客户性别
		model.setIssuingOrgan(custInfo.getIssuingOrgan());// 签发机关
		model.setIdentityCardValidityPeriod(
				DateUtils.formatDate(custInfo.getIdentityCardValidityPeriod(), "yyyy/MM/dd"));// 有效期至

		model.setCareerType(PropertyUtils.getConfig(SysConstants.PARAMETER_NAME,SysConstants.PARAMETER_OCCUPATION+custInfo.getCareer()));// 职业选择
		model.setDegree(PropertyUtils.getConfig(SysConstants.PARAMETER_NAME, SysConstants.PARAMETER_EDUCATION_LEVEL+custInfo.getDegree()));// 教育程度中文
		model.setDegreeVal(custInfo.getDegree());// 教育程度代码
		model.setLivephone(custInfo.getLivephone());// 住宅/宿舍电话
		model.setQuartersPhoneRegistrant(custInfo.getQuartersPhoneRegistrant());// 住宅电话登记人
		model.setEmaill(custInfo.getEmaill());// 电子邮件
		model.setWeixinCode(custInfo.getWeixinCode());// 微信号码
		model.setQqCode(custInfo.getQqCode());// QQ号码
		model.setSocialNumber(custInfo.getSocialNumber());// 社保（学生）号码
		model.setMarry(getDescValue(custInfo.getMarry(), "1;2;9", "未婚;已婚;其他"));// 婚姻状况
		model.setPartername(custInfo.getParterName());// 配偶姓名
		model.setMateAddress(custInfo.getMateAddress());// 配偶联系地址
		model.setMateMobel(custInfo.getMateMobel());// 配偶联系电话
		BaseInfo householdTown = provinceCityService.queryDistrictById(custInfo.getHouseholdTown());
		model.setLnAppCustInfohouseholdTown(householdTown.getName());// 户籍地址
		model.setHouseholdZhen(custInfo.getHouseholdZhen());// 镇
		model.setHouseholdStr(custInfo.getHouseholdStr());// 街道/路
		model.setHouseholdRidge(custInfo.getHouseholdRidge());// 小区/楼盘
		model.setHouseholdHome(custInfo.getHouseholdHome());// 栋/单元/房间号
		model.setHouseholdPostcode(custInfo.getHouseholdPostcode());// 邮编
		model.setAddreRegist(getDescValue(custInfo.getAddreRegist(), "0;1", "不同;相同"));// 现住址与户籍

		model.setLnAppCustInfoliveCondition(PropertyUtils.getConfig(SysConstants.PARAMETER_NAME, SysConstants.PARAMETER_HOUSING_SITUATION+custInfo.getLiveCondition()));// 住房状况
		model.setChildrenNumber("");// 子女数目
		BaseInfo liveTown = provinceCityService.queryDistrictById(custInfo.getLiveTown());
		model.setLnAppCustInfoliveTown(liveTown.getName());// 居住地址
		model.setMonthlyIncome(new BigDecimal(custInfo.getMonthlyIncome()));// 月收入（元）
		model.setOtherIncome(new BigDecimal(custInfo.getOtherIncome()));// 其他月收入（元）
		model.setFamilyIncome(new BigDecimal(custInfo.getFamilyIncome()));// 家庭月收入（元）
		model.setMonthlySpending(new BigDecimal(custInfo.getMonthlySpending()));// 月支出（元）
		model.setFirstworktime(custInfo.getFirstWorktime());// 首次工作/入学年份（年）
		model.setUnitname(custInfo.getUnitname());// 现单位/学校名称
		// 行业类别
		model.setIndustry(PropertyUtils.getConfig(SysConstants.PARAMETER_NAME, SysConstants.PARAMETER_INDUSTRY_CATEGORY+custInfo.getIndustry()));
		model.setUnitPhone(custInfo.getUnitPhone());// 单位电话
		model.setUnitExtPhone(custInfo.getUnitExtPhone());// 单位电话分机
		// 单位性质
		model.setUnittype(PropertyUtils.getConfig(SysConstants.PARAMETER_NAME, SysConstants.PARAMETER_UNIT_PROPERTY+custInfo.getUnittype()));
		model.setDepartment(custInfo.getDepartment());// 任职部门
		// 职位级别
		model.setDuty(PropertyUtils.getConfig(SysConstants.PARAMETER_NAME, SysConstants.PARAMETER_POSITION_LEVEL+custInfo.getDuty()));
		model.setUnitworktime(custInfo.getUnitWorktime());// 现单位工作时长/
																	// 距离毕业时长（月）
		if(!InputChecker.isEmpty(custInfo.getIsSocialSec())){
			model.setIsSocialSec(Integer.parseInt(custInfo.getIsSocialSec()));// 购买社保
		}
		BaseInfo unitTown = provinceCityService.queryDistrictById(custInfo.getUnitTown());
		model.setLnAppCustInfounitTown(unitTown.getName());// 单位地址
		model.setUnitTown(custInfo.getUnitZhen());// 镇
		model.setUnitStr(custInfo.getUnitStr());// 街道/路
		model.setUnitRidge(custInfo.getUnitRidge());// 小区/楼盘
		model.setUnitHome(custInfo.getUnitHome());// 栋/单元/房间号
		model.setUnitpostcode(custInfo.getUnitPostcode());// 单位邮编
	}
	/**
	 * 设值附件信息
	 * @param appId
	 * @param model
	 */
	private void setlnAttachInfo(Long appId, LnAppModel model,List<LnAttachInfo> lnAttachInfos) {
//		LnAttachInfo lnAttachInfo = new LnAttachInfo();
//		lnAttachInfo.setAppId(appId);
//		List<LnAttachInfo> lnAttachInfos = lnAttachInfoService.list(lnAttachInfo);
		int cardIdImage = 0;// 身份证正反面
		int bankPosImage = 0;// 银行卡+POS回单
		int socialCard = 0;// 社保卡
		for (LnAttachInfo attachInfo : lnAttachInfos) {
			// 1000001=身份证正反面,1000002=银行卡+POS回单,1000005=社保卡
			if (SysConstants.ID_CARD.equals(attachInfo.getAttachType())) {
				cardIdImage++;
			}
			if (SysConstants.BANK_CARD.equals(attachInfo.getAttachType())) {
				bankPosImage++;
			}
			if (SysConstants.SOCIAL_CARD.equals(attachInfo.getAttachType())) {
				socialCard++;
			}
		}
		if (0 == cardIdImage) {
			model.setCardIdImage("未上传");
		} else {
			model.setCardIdImage("只上传" + cardIdImage + "张");
		}
		if (0 == bankPosImage) {
			model.setBankPosImage("未上传");
		} else {
			model.setBankPosImage("只上传" + bankPosImage + "张");
		}
		if (0 == socialCard) {
			model.setSocialCard("未上传");
		} else {
			model.setSocialCard("只上传" + socialCard + "张");
		}
	}
	
	/**
	 * 获取客户开户行
	 * @param lnApp
	 * @return
	 */
	private String getRepayMentBank(LnApp lnApp) {
		BankRecordInformation bankRecordInformation = new BankRecordInformation();
		bankRecordInformation.setIsenable("Y");
		List<BankRecordInformation> bankList = bankRecordInformationService.list(bankRecordInformation);
		String repaymentBank = "";
		for (BankRecordInformation bank : bankList) {
			if (bank.getCode().equals(lnApp.getRepaymentBank())) {
				repaymentBank = bank.getName();
			}
		}
		return repaymentBank;
	}
	/**
	 * 设值还款信息
	 * @param model
	 * @param plan
	 */
	private void setRepayPlan(LnAppModel model, RepayPlan plan) {
		model.setRepaymentDay(plan.getRepyDay() + "号");// 月还款日
		model.setFirstDay(DateUtils.formatDate(plan.getFirstDayDate(), "yyyy/MM/dd"));// 首次还款日
		model.setMonthAmount(plan.getMonRepAmt());// 月还款额（元）
		model.setServiceCharge(plan.getTotalFee());// 服务费
		model.setMonthConsultServiceRate(plan.getConsultFee());// 月均咨询服务费率
	}
	/**
	 * 设值产品信息
	 * @param lnApp
	 * @param model
	 */
	private void setProductInfo(LnApp lnApp, LnAppModel model) {
		BsProduct product = bsProductService.getBsProductById(lnApp.getProductId());
		model.setProductCode(product.getProductCode());// 产品代码
		model.setProductName(product.getProductName());// 产品名称
		model.setDiscountRate(product.getDiscountRate());// 产品折扣比例
		
//		LnBusProductIdMapping lnBusProductIdMapping = ObjectUtils.convertObject(lnBusProductIdMappingService.listByProductCode(product.getProductCode()));
		model.setBusPrdId(lnApp.getBusProductId());// BUS产品ID
	}
	
    /**
     * 设值贷款商品信息
     * @param appId
     * @return List<LnCommodityInfoModel> 商品信息
     */
	private void setCommodityInfos(LnAppModel model,Long appId,List<LnCommodityInfo> infoList) {
		// 贷款商品主集合
//		LnCommodityInfo commodity = new LnCommodityInfo();
//		commodity.setAppId(appId);
//		List<LnCommodityInfo> infoList = lnCommodityInfoService.list(commodity);
		List<LnCommodityInfoModel> lnCommodityInfos = new ArrayList<LnCommodityInfoModel>();
		BigDecimal amountSum = new BigDecimal(0);// 商品总价格（元）
		for (LnCommodityInfo goodsReqs : infoList) {
			LnCommodityInfoModel commodityInfoModel = new LnCommodityInfoModel();
			List<GoodsDict> goodsCategories = goodsDictService.listByCode(goodsReqs.getCargoType());
			commodityInfoModel.setCargoType(goodsCategories.get(0).getName());
			commodityInfoModel.setCommodityClass(PropertyUtils.getConfig(SysConstants.PARAMETER_NAME, SysConstants.PARAMETER_GOOD_CATEGORY+goodsReqs.getCommodityClass()));
			//现金贷去掉了商品型号, 商品价格,商品品牌,商品总价
			commodityInfoModel.setCommodityType(goodsReqs.getCommodityType());
			commodityInfoModel.setAmount(goodsReqs.getCommodityPrice());
			//补全产品名称
			commodityInfoModel.setCommodityName(goodsReqs.getCommodityName());
			lnCommodityInfos.add(commodityInfoModel);
			if(!InputChecker.isEmpty(goodsReqs.getCommodityPrice())){
				amountSum = amountSum.add(goodsReqs.getCommodityPrice());
			} 
		}
		model.setLnCommodityInfos(lnCommodityInfos);
		model.setAmountSum(amountSum);
	}
	
    /**
     * 构建还款信息
     * @param lnApp
     * @return RepayPlan 还款计划对象
     */
	private void setCalcInfo(LnAppModel model,LnApp lnApp) throws Exception {
		LnAppCalcInfo calcInfo = lnAppCalcInfoService.selectByAppId(lnApp.getId());
		model.setRepaymentDay(lnApp.getRepaymentDay() + "号");// 月还款日
		model.setFirstDay(DateUtils.formatDate(lnApp.getFirstRepayDate(), "yyyy/MM/dd"));// 首次还款日
		model.setMonthAmount(calcInfo.getMonRepayAmt());// 月还款额（元）
		model.setServiceCharge(calcInfo.getTotalFee());// 服务费
		
		if(!InputChecker.isEmpty(calcInfo.getMonConsultRate())){
			model.setMonthConsultServiceRate(calcInfo.getMonConsultRate().setScale(2, BigDecimal.ROUND_HALF_UP).multiply(new BigDecimal(100)));// 月均咨询服务费率
    	}
	}
	
	/**<b>getDescValue</b><br/>
	 * 获取描述值
	 * @param key		指定Key值
	 * @param keys		key 字典 如1;2;3
	 * @param values    value 字典 是;否;其他
	 * @return
	 * @author 			zhoukailiang
	 * @createDate 		2016年10月24日 下午5:00:41
	 * @version 1.0		
	 * @description		
	 *
	 */
	private String getDescValue(String key,String keys, String values){
		String value = "";
		if(InputChecker.isEmpty(keys)){
			return value;
		}
		if(InputChecker.isEmpty(values)){
			return value;
		}
		String [] arrayKey = keys.split(";");
		String [] arrayVaule = values.split(";");
		
		for(int i =0 ; i< arrayKey.length ;i++){
			if(arrayKey[i].equals(key)){
				value = arrayVaule[i];
				break;
			}
		}
		return value;
	}
	/**
	 * 获取规则检查对象
	 * @param lnApp
	 * @return
	 */
	private BusRuleCheckModel getBusRuleCheckModel(LnApp lnApp,LnAppCalcInfo lnAppContractInfo,String busProductId){
		log.info("fkRuleApiService getBusRuleCheckModel start");
		BigDecimal approveAmt = new BigDecimal(0);
		BusRuleCheckModel busRuleCheckModel = new BusRuleCheckModel();
		busRuleCheckModel.setLnAppId(lnApp.getId());//工单号
		busRuleCheckModel.setCustomerName(lnApp.getCustomerName());//顾客姓名
		busRuleCheckModel.setIdCard(lnApp.getCardId());// 申请人身份证号
		busRuleCheckModel.setLoanMoney(lnApp.getLoanMoney());//贷款金额
		if(!InputChecker.isEmpty(lnAppContractInfo)){
			busRuleCheckModel.setContractAmt(lnAppContractInfo.getContractAmt());//合同金额
		}
		busRuleCheckModel.setBusPrdId(busProductId);//BUS产品ID
		busRuleCheckModel.setApproveAmt(approveAmt);//审批金额
		log.info("fkRuleApiService getBusRuleCheckModel end busRuleCheckModel{}",busRuleCheckModel.toString());
		return busRuleCheckModel;
	}
	
	/**
	 * 获取产品类型
	 * @param lnApp
	 * @return
	 */
	private String getProductCategory(Long productSeriesId){
        BsProdectSeries bsProdectSeriesParam = new BsProdectSeries();
        bsProdectSeriesParam.setId(productSeriesId);
        BsProdectSeries bsProdectSeries = ObjectUtils.convertObject(bsProdectSeriesMapper.list(bsProdectSeriesParam));
        String productCategory  = bsProdectSeries.getProductCategory();
		return productCategory;
	}
	/**
	 * 获得数据检查对象
	 * @param lnApp
	 * @return
	 */
	private BusDataCheckModel getBusDataCheckModel(LnApp lnApp,String busProductId){
		log.info("fkRuleApiService getBusDataCheckModel start");
		BusDataCheckModel busDataCheckModel = new BusDataCheckModel();
		busDataCheckModel.setLnAppId(lnApp.getId());// 工单号
		busDataCheckModel.setIdCard(lnApp.getCardId());// 申请人身份证号
//		busDataCheckModel.setBusPrdId(this.getBusProductId(lnApp));//BUS产品ID
		busDataCheckModel.setBusPrdId(busProductId);//BUS产品ID
		busDataCheckModel.setPhone(lnApp.getMobile());//手机号
		busDataCheckModel.setRepayBankCard(lnApp.getRepaymentAcc());//还款银行卡号
		log.info("fkRuleApiService getBusDataCheckModel end busDataCheckModel{}",busDataCheckModel.toString());
		return busDataCheckModel;
	}
	
	/**
	 *  
	 * 验证bus规则进件和数据检查
	 * @param rs
	 * @param lnApp
	 */
	@Override
	public Result validateBusRuleAndData(Result rs,LnApp lnApp) {
		String isBusCheck = PropertyUtils.getConfig(SysConstants.FILE_NAME_FK, "fk.isBusCheck");
		log.info("FKServiceImpl validateBusRuleAndData start,isBusCheck={}",isBusCheck);
		FkTpModel fkTpModel = new FkTpModel();
		rs.setData(fkTpModel);
		if(SysConstants.SWITCH_OPEN.equals(isBusCheck)){
			
			Long appId = lnApp.getId();
			log.info("FKServiceImpl validateBusRuleAndData start,appId={}",appId);
			try {
				//数据准备
				int subType = LnAppSubsidiary.CALC_INFO|LnAppSubsidiary.CUST_INFO;
				LnAppSubsidiary lnAppSubsidiary = scService.queryLnAppSubsidiaryInfo(appId, subType);
				
				LnAppCalcInfo lnAppCalcInfo = new LnAppCalcInfo();
				BeanUtils.copyFields(lnAppSubsidiary.getCalcInfo() ,lnAppCalcInfo);
				
				LnAppCustInfo lnAppCustInfo = new LnAppCustInfo();
				BeanUtils.copyFields(lnAppSubsidiary.getCustInfo(),lnAppCustInfo);
				
//				String busProductId = this.getBusProductId(lnApp);
				String busProductId = lnApp.getBusProductId();
				
				log.info("FKServiceImpl busRuleCheck start,appId={},busProductId={}",appId,busProductId);
				
				//构建BUS进件规则检查对象
				BusRuleCheckModel busRuleCheckModel = this.getBusRuleCheckModel(lnApp,lnAppCalcInfo,busProductId);
				log.info("fkRuleApiService busRuleCheck busRuleCheckModel appId={},idCard={},busPrdId={},customerName={},loanMoney={},contractAmt={},approveAmt={}",
						busRuleCheckModel.getLnAppId(),busRuleCheckModel.getIdCard(),busRuleCheckModel.getBusPrdId(),
						busRuleCheckModel.getCustomerName(),busRuleCheckModel.getLoanMoney(),
						busRuleCheckModel.getContractAmt(),busRuleCheckModel.getApproveAmt());
				
				//检查BUS规则
				RuleReply ruleCheck = fkRuleApiService.busRuleCheck(busRuleCheckModel);
				log.info("fkRuleApiService busRuleCheck end,appId={}",appId);
				if(ruleCheck == null){
					rs.setMessage(ErrorMsg.FK_ERROR_1);
					rs.setSuccess(false);
					return rs;
				}
				
				log.info("FKServiceImpl busDataCheck start,appId={},busProductId={}",appId,busProductId);
				//构建BUS数据检查对象
				BusDataCheckModel busDataCheckModel = this.getBusDataCheckModel(lnApp,busProductId);
				busDataCheckModel.setEmail(lnAppCustInfo.getEmaill()); //由于提交之前，email还没存如数据库，所以只有页面请求到后台的对象才有数据
				log.info("fkRuleApiService busDataCheck busDataCheckModel ,appId={},idCard={},busPrdId={},mail={},phone={},repayBankCard={}",busDataCheckModel.getLnAppId(),
						busDataCheckModel.getIdCard(),busDataCheckModel.getBusPrdId(),busDataCheckModel.getEmail(),busDataCheckModel.getPhone(),busDataCheckModel.getRepayBankCard());
				
				//检查BUS数据
				RuleReply dataCheck = fkRuleApiService.busDataCheck(busDataCheckModel);//数据
				log.info("fkRuleApiService busDataCheck end,appId={}",appId);
				if(dataCheck == null){
					rs.setMessage(ErrorMsg.FK_ERROR_1);
					rs.setSuccess(false);
					return rs;
				}
				
				String ruleCode = ruleCheck.getCode();
				String dateCode = dataCheck.getCode();
				log.info("fkRuleApiService setFkTpModel start,appId={},ruleCode={},ruleMsg={},dateCode={},dataMsg={}",appId,ruleCode,ruleCheck.getMsg(),dateCode,dataCheck.getMsg());
				
				if(this.isSetFkTpModel(ruleCode,dateCode)){
					fkTpModel.setBusRuleReult(ruleCode);
					fkTpModel.setBusRuleMsg(ruleCheck.getMsg());
					fkTpModel.setBusCheckReult(dateCode);
					fkTpModel.setBusCheckMsg(dataCheck.getMsg());
					rs.setData(fkTpModel);
					rs.setSuccess(true);
					return rs;
				}else{
					rs.setMessage(ErrorMsg.FK_ERROR_1);
					rs.setSuccess(false);
					return rs;
				}
				
			} catch (Exception e) {
				log.error("FKServiceImpl validateBusRuleAndData exception,appId={}:", appId);
				log.error("FKServiceImpl validateBusRuleAndData exception,", e);
				rs.setMessage(ErrorMsg.FK_ERROR_1);
				rs.setSuccess(false);
				return rs;
			}
		}else{
			rs.setSuccess(true);
			return rs;
		}
		
	}
	/**
	 * 只有规则和数据检查的值为成功或失败，才把FkTpModel对象属性赋值传给风控
	 * @param ruleCode
	 * @param dateCode
	 * @return
	 */
	private boolean isSetFkTpModel(String ruleCode,String dateCode){

         if(SysConstants.PARMAER_NULL.equals(ruleCode) || SysConstants.PARMAER_NULL.equals(dateCode)){ //参数为空
        	 return false;
         }
         if(SysConstants.BUS_NULL.equals(ruleCode) || SysConstants.BUS_NULL.equals(dateCode)){ //BUS返回结果为空
        	 return false;
         }
         if(SysConstants.ERROR_CODE.equals(ruleCode) || SysConstants.ERROR_CODE.equals(dateCode)){  //系统异常
        	 return false;
         }
		  return true;
	}
	
	
	@Override
	public Result reSendFK(String clientIp, Long appId ,String loginName,LnApp lnApp) {
		
		Result rs = new Result(false);
		
		if(!InputChecker.isEmpty(lnApp)){
			//验证bus进件规则和数据检查
			rs = this.validateBusRuleAndData(rs, lnApp);
			log.info("FKController validateBusRuleAndData appId={},returnFlag={}",appId,rs.isSuccess());
			if (!rs.isSuccess()) {
				return rs;
//				return returnFail(model, rs.getMessage(), "appinfo/appHM/list");
			}
			
			log.info("FKController reSendFk 开始进入重发异常工单到风控系统");
			LnAppModel lnAppModel = new LnAppModel();
			lnAppModel.setLoanType(lnApp.getLoanType());
			String fkChannelCode = PropertyUtils.getConfig(SysConstants.FILE_NAME_FK, lnApp.getLoanType()+SysConstants.CHANNEL_CODE_KEY);
			lnAppModel.setChannelCode(fkChannelCode);
			lnAppModel.setAppState(lnApp.getAppState());
			log.info("FKController reSendFk 异常工单号={},工单类型 ={},风控渠道={}",appId,lnApp.getLoanType(),fkChannelCode);
			
			// 验证bus规则进件和数据检查，如果成功或失败状态会设值FkTpModel
			FkTpModel tpModel = (FkTpModel) rs.getData();
			
			if(SysConstants.APP_CASH.equals(lnApp.getLoanType())){
				LnAppCash lnAppCash = lnAppService.selectCashInfoByAppId(appId);
				lnAppModel.setUseType(Integer.parseInt(lnAppCash.getUseType()));
				log.info("FKController reSendFk CASH 异常工单号={},工单类型 ={},贷款用途={}",appId,lnApp.getLoanType(),lnAppCash.getUseType());
			}
			
			if(SysConstants.APP_POS.equals(lnApp.getLoanType())|| SysConstants.APP_AGR.equals(lnApp.getLoanType())){
				//设置密码
				String userEvaluateCode = lnApp.getUserEvaluateCode();
				String captcha = PropertyUtils.getConfig(SysConstants.FILE_NAME_FK, "fk_user_evaluate_code_" + userEvaluateCode);
				lnAppModel.setCaptcha(captcha);
				log.info("FKController reSendFk POS 异常工单号={},工单类型 ={},captcha={}",appId,lnApp.getLoanType(),captcha);
			}
			
			//#1242  系统控制所有产品系列均需开富友账户！！！ 保理开户时，沿用“开户失败三次，则工单拒绝”规则，与反保理保持一致    
			tpModel.setFuYouResult(fuiouService.getFuiouResult(lnApp.getCardId()));
			log.info("FKController reSendFk CASH 异常工单号={},工单类型 ={}, fuYouResult={}", appId, lnApp.getLoanType(), tpModel.getFuYouResult());

			
			lnAppModel.setTpModel(tpModel);
			log.info("FKController reSendFk 开始发系统风控系统 lnAppFKService.lnAppRuleCheck");
			Boolean reSendFlag = this.lnAppRuleCheck(lnApp,clientIp,loginName,lnAppModel);
			log.info("FKController reSendFk 结束发系统风控系统 lnAppFKService.lnAppRuleCheck appId={},reSendFlag={}",appId,reSendFlag);
			if(!reSendFlag){
				rs.setMessage("重发风控失败");
				return rs;
//				return returnFail(model, "重发风控失败", "appinfo/appHM/list");
			}
			rs.setMessage("工单编号" + appId + "已成功发送");
			rs.setSuccess(true);
		}else{
			rs.setMessage("工单状态不正确,不允许重发风控");
			return rs;
//			return returnFail(model, "工单状态不正确", "appinfo/appHM/list");
		}
		return rs;
		
	}


}
