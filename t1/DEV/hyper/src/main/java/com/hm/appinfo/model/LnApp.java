package com.hm.appinfo.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.gep.core.util.InputChecker;
import com.gep.util.PropertyUtils;

/**
 * @ClassName: LnApp
 * @Description: 工单信息表
 * @author qiuyuan
 * @date 2016年4月11日 下午2:23:22
 * @Copyright (c) 2016, 9fchaoneng.com All Rights Reserved.
 */
public class LnApp implements Serializable
{

	private static final long serialVersionUID = 8793656293970759744L;
	/**
	 * 工单id
	 */
	private Long id;

	/**商户名称*/
	private String firmName;

	/**门店ID*/
	private Long storeId;

	/**门店名称*/
	private String shopName;

	/**产品系列ID*/
	private Long productSeriesId;

	/**产品系列名称*/
	private String productSeriesName;

	/**产品ID*/
	private Long productId;

	/**产品名称*/
	private String productName;

	/**身份证号*/
	private String cardId;

	/**手机号*/
	private String mobile;

	/**大区经理*/
	private Long l1Manager;

	/**省经理*/
	private Long l2Manager;

	/**市区经理*/
	private Long l3Manager;

	/**区域经理*/
	private Long l4Manager;

	/**销售经理*/
	private Long saleManager;

	/**销售代表*/
	private Long sa;

	/**工单状态*/
	private String appState;
	private String appStateName;
	
	// 修改前工单状态
	private String oldAppState;
	// 工单旧状态名称
	private String oldAppStateName;
	// 工单详情页传的工单状态
	private String newAppState;
	// 工单详情页-工单状态是否显示标记
	private String appStatesShow;
	// 工单详情页-提交按钮标记
	private String isSubmit;
	
	/**合同状态*/
	private String contractState;

	/**申请金额*/
	private BigDecimal loanMoney;

	/**用户评价*/
	private String userEvaluate;

	/**工单生成时间*/
	private Date woBuildTime;

	/**生成合同时间*/
	private Date createContTime;

	/**合同签订时间*/
	private Date signTime;

	/**机构组织编码*/
	private String orgCode;

	/**客户id*/
	private Long clientId;

	/**期数*/
	private Integer periods;

	/**平息利率*/
	private Double interestRate;

	/**罚息利率*/
	private Double penaltyRate;

	/**逾期管理费利率*/
	private Double lateExpeneseRate;

	/**计费规则*/
	private String billingRule;

	/**保费*/
	private BigDecimal premium;

	/**产品折扣比例*/
	private BigDecimal discountRate;

	/**SA奖金*/
	private BigDecimal saBonus;

	/**DSM奖金*/
	private BigDecimal dsmBonus;

	/**门店佣金比例*/
	private BigDecimal commissionRate;

	/**商品总价*/
	private BigDecimal amount;

	/**首付金额*/
	private BigDecimal downPaymentAmount;

	/**合同金额*/
	private BigDecimal contractAmount;

	/**服务费*/
	private BigDecimal serviceCharge;

	/**风险备用金利率*/
	private Double riskRate;

	/**风险备用金*/
	private BigDecimal riskAmount;

	/**其他费用*/
	private BigDecimal otherAmount;

	/**月还款额*/
	private BigDecimal monthAmount;

	/**首个还款日*/
	private Integer firstDay;

	/**还款日*/
	private Integer repaymentDay;

	/**还款类型*/
	private String repaymentType;

	/**还款账号*/
	private String repaymentAcc;

	/**还款户名*/
	private String repaymentAccName;

	/**还款银行*/
	private String repaymentBank;

	/**还款卡开户城市*/
	private String repaymentCity;

	/**放款账号*/
	private String paymentAcc;

	/**放款户名*/
	private String paymentAccName;

	/**放款银行*/
	private String paymentBank;

	/**放款支行*/
	private String paymentSubBank;

	/**放款卡开户城市*/
	private String paymentCity;

	/**还款支行*/
	private String repaymentSubBank;

	/**最后修改日期*/
	private Date lastUpdateTime;

	/**用户签章账号ID*/
	private Integer cfcId;

	/**确认交易时间*/
	private Date cofTraceTime;

	/**SA备注*/
	private String saRemark;

	/**富友账户名*/
	private String fyAccountName;

	/**富友账号*/
	private String fyAccountNo;

	/**Bus工单id*/
	private String busAppid;

	/**客户类型*/
	private String custType;

	/**自主还款户名*/
	private String selfRepayName;

	/**自主还款账号*/
	private String selfRepayAccount;

	/**自主还款银行*/
	private String selfRepayBank;

	/**创建人*/
	private String createdby;

	/**创建时间*/
	private Date createdon;

	/**修改人*/
	private String modifiedby;

	/**修改时间*/
	private Date modifiedon;

	/**乐观锁*/
	private Integer version;

	/**对账时间*/
	private Date checkAccTime;

	/**最小贷款额*/
	private BigDecimal minLoanAmount;

	/**最大贷款额*/
	private BigDecimal maxLoanAmount;

	/**首付比例*/
	private BigDecimal downPaymentRatio;

	/**首付类型*/
	private String downPaymentType;

	/**SA奖金类型*/
	private String saBonusType;

	/**月保费比例*/
	private BigDecimal monthlyPremiumRate;

	/**合同年利率*/
	private BigDecimal contrAnnualInterestRate;

	/**备用金比例*/
	private BigDecimal reserveRate;

	/**易宝绑卡ID*/
	private String ybBindId;

	/**合同编号*/
	private String contractNo;

	/**购买保险*/
	private Boolean buyInsurance;

	/**月咨询服务费率*/
	private Long monthConsultServiceRate;

	/**还款方式*/
	private String repaymentWay;

	/**客户签订时间*/
	private Date clientSignedTime;

	/**店家签订时间*/
	private Date storeSignedTime;

	/**易宝用户ID*/
	private String ybUserId;

	/**人工审核退回*/
	private Boolean checkReturn;

	/**证明材料提示信息*/
	private String attachTipInfo;

	/**银行开户手机号*/
	private String bankTel;

	/**易宝用户类型*/
	private String ybUserType;

	/**商品类型*/
	private String goodsType;

	/***/
	private String customerName;

	/**客户电子签章ID*/
	private Long clientCfcId;

	/**商户电子签章ID*/
	private Long firmCfcId;

	/**客户合同状态*/
	private String clientConStatus;

	/**商户合同状态*/
	private String firmConStatus;

	/**录入工单信息用户名*/
	private String saName;

	/***/
	private String appStatusName;

	/***/
	private String isUploadAttach;

	/***/
	private Date paidSuccessTime;

	/***/
	private String isRepaymentSuccess;

	/***/
	private String busRetInfo;

	/***/
	private Date sendBusTime;

	/***/
	private Integer revocationType;

	/***/
	private String revocationDesc;

	/***/
	private String proResult; //处理状态--用于监控后台的工单状态变更查询

	/***/
	private String roleSql;//根绝角色查询条件

	private Integer checkReturnCount;

	/**
	 * 工单ID模糊查询参数
	 */
	private String idParam;
	
	private String isNoParam;//是否有查询参数

	/**
	 * 工单表的真是状态，由于appState 字段很多时候会存储JJCODE里面的工单状态，所以新建该字段
	 */
	private String realAppStatus;
	
	/**
	 * 逾期天数
	 */
	private Integer overdueDayNum;


	/**
	 * 查询时间
	 */
	private String startTime;
	private String endTime;
	
	private Integer marker;//临时标记
	
	/**查询游标**/
	private Long nextCursor;
	
	private String storeCity;
	private String storeCode;
	private String singleCardTime;
	
	/**
	 * 贷款类型
	 */
	private String loanType;

	/**
	 * 资金类型
	 */
	private String capitalType;
	
	/**
	 * 协审验证码
	 */
	private String userEvaluateCode;
	
	private String busProductId;
	
	/*
	 * 推送万卡标识，y表示已推送
	 */
	private String isSendWk;
	
	/**
	 * 交易编码
	 * @mbggenerated
	 */
	private String appStatusInner;
	
	/**首个还款日*/
	private Date firstRepayDate;
	
	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public String getFirmName()
	{
		return firmName;
	}

	public void setFirmName(String firmName)
	{
		this.firmName = firmName == null ? null : firmName.trim();
	}

	public Long getStoreId()
	{
		return storeId;
	}

	public void setStoreId(Long storeId)
	{
		this.storeId = storeId;
	}

	public String getShopName()
	{
		return shopName;
	}

	public void setShopName(String shopName)
	{
		this.shopName = shopName == null ? null : shopName.trim();
	}

	public Long getProductSeriesId()
	{
		return productSeriesId;
	}

	public void setProductSeriesId(Long productSeriesId)
	{
		this.productSeriesId = productSeriesId;
	}

	public String getProductSeriesName()
	{
		return productSeriesName;
	}

	public void setProductSeriesName(String productSeriesName)
	{
		this.productSeriesName = productSeriesName == null ? null : productSeriesName.trim();
	}

	public Long getProductId()
	{
		return productId;
	}

	public void setProductId(Long productId)
	{
		this.productId = productId;
	}

	public String getProductName()
	{
		return productName;
	}

	public void setProductName(String productName)
	{
		this.productName = productName == null ? null : productName.trim();
	}

	public String getCardId()
	{
		return cardId;
	}

	public void setCardId(String cardId)
	{
		this.cardId = cardId == null ? null : cardId.trim();
	}

	public String getMobile()
	{
		return mobile;
	}

	public void setMobile(String mobile)
	{
		this.mobile = mobile == null ? null : mobile.trim();
	}

	public Long getL1Manager()
	{
		return l1Manager;
	}

	public void setL1Manager(Long l1Manager)
	{
		this.l1Manager = l1Manager;
	}

	public Long getL2Manager()
	{
		return l2Manager;
	}

	public void setL2Manager(Long l2Manager)
	{
		this.l2Manager = l2Manager;
	}

	public Long getL3Manager()
	{
		return l3Manager;
	}

	public void setL3Manager(Long l3Manager)
	{
		this.l3Manager = l3Manager;
	}

	public Long getL4Manager()
	{
		return l4Manager;
	}

	public void setL4Manager(Long l4Manager)
	{
		this.l4Manager = l4Manager;
	}

	public Long getSaleManager()
	{
		return saleManager;
	}

	public void setSaleManager(Long saleManager)
	{
		this.saleManager = saleManager;
	}

	public Long getSa()
	{
		return sa;
	}

	public void setSa(Long sa)
	{
		this.sa = sa;
	}

	public String getAppState()
	{
		return appState;
	}

	public void setAppState(String appState)
	{
		this.appState = appState == null ? null : appState.trim();
	}

	public BigDecimal getLoanMoney()
	{
		return loanMoney;
	}

	public void setLoanMoney(BigDecimal loanMoney)
	{
		this.loanMoney = loanMoney;
	}

	public String getUserEvaluate()
	{
		return userEvaluate;
	}

	public void setUserEvaluate(String userEvaluate)
	{
		this.userEvaluate = userEvaluate == null ? null : userEvaluate.trim();
	}

	public Date getWoBuildTime()
	{
		return woBuildTime;
	}

	public void setWoBuildTime(Date woBuildTime)
	{
		this.woBuildTime = woBuildTime;
	}

	public Date getCreateContTime()
	{
		return createContTime;
	}

	public void setCreateContTime(Date createContTime)
	{
		this.createContTime = createContTime;
	}

	public Date getSignTime()
	{
		return signTime;
	}

	public void setSignTime(Date signTime)
	{
		this.signTime = signTime;
	}

	public String getOrgCode()
	{
		return orgCode;
	}

	public void setOrgCode(String orgCode)
	{
		this.orgCode = orgCode == null ? null : orgCode.trim();
	}

	public Long getClientId()
	{
		return clientId;
	}

	public void setClientId(Long clientId)
	{
		this.clientId = clientId;
	}

	public Integer getPeriods()
	{
		return periods;
	}

	public void setPeriods(Integer periods)
	{
		this.periods = periods;
	}

	public Double getInterestRate()
	{
		return interestRate;
	}

	public void setInterestRate(Double interestRate)
	{
		this.interestRate = interestRate;
	}

	public Double getPenaltyRate()
	{
		return penaltyRate;
	}

	public void setPenaltyRate(Double penaltyRate)
	{
		this.penaltyRate = penaltyRate;
	}

	public Double getLateExpeneseRate()
	{
		return lateExpeneseRate;
	}

	public void setLateExpeneseRate(Double lateExpeneseRate)
	{
		this.lateExpeneseRate = lateExpeneseRate;
	}

	public String getBillingRule()
	{
		return billingRule;
	}

	public void setBillingRule(String billingRule)
	{
		this.billingRule = billingRule == null ? null : billingRule.trim();
	}

	public BigDecimal getPremium()
	{
		return premium;
	}

	public void setPremium(BigDecimal premium)
	{
		this.premium = premium;
	}

	public BigDecimal getDiscountRate()
	{
		return discountRate;
	}

	public void setDiscountRate(BigDecimal discountRate)
	{
		this.discountRate = discountRate;
	}

	public BigDecimal getSaBonus()
	{
		return saBonus;
	}

	public void setSaBonus(BigDecimal saBonus)
	{
		this.saBonus = saBonus;
	}

	public BigDecimal getDsmBonus()
	{
		return dsmBonus;
	}

	public void setDsmBonus(BigDecimal dsmBonus)
	{
		this.dsmBonus = dsmBonus;
	}

	public BigDecimal getCommissionRate()
	{
		return commissionRate;
	}

	public void setCommissionRate(BigDecimal commissionRate)
	{
		this.commissionRate = commissionRate;
	}

	public BigDecimal getAmount()
	{
		return amount;
	}

	public void setAmount(BigDecimal amount)
	{
		this.amount = amount;
	}

	public BigDecimal getDownPaymentAmount()
	{
		return downPaymentAmount;
	}

	public void setDownPaymentAmount(BigDecimal downPaymentAmount)
	{
		this.downPaymentAmount = downPaymentAmount;
	}

	public BigDecimal getContractAmount()
	{
		return contractAmount;
	}

	public void setContractAmount(BigDecimal contractAmount)
	{
		this.contractAmount = contractAmount;
	}

	public BigDecimal getServiceCharge()
	{
		return serviceCharge;
	}

	public void setServiceCharge(BigDecimal serviceCharge)
	{
		this.serviceCharge = serviceCharge;
	}

	public Double getRiskRate()
	{
		return riskRate;
	}

	public void setRiskRate(Double riskRate)
	{
		this.riskRate = riskRate;
	}

	public BigDecimal getRiskAmount()
	{
		return riskAmount;
	}

	public void setRiskAmount(BigDecimal riskAmount)
	{
		this.riskAmount = riskAmount;
	}

	public BigDecimal getOtherAmount()
	{
		return otherAmount;
	}

	public void setOtherAmount(BigDecimal otherAmount)
	{
		this.otherAmount = otherAmount;
	}

	public BigDecimal getMonthAmount()
	{
		return monthAmount;
	}

	public void setMonthAmount(BigDecimal monthAmount)
	{
		this.monthAmount = monthAmount;
	}

	public Integer getFirstDay()
	{
		return firstDay;
	}

	public void setFirstDay(Integer firstDay)
	{
		this.firstDay = firstDay;
	}

	public Integer getRepaymentDay()
	{
		return repaymentDay;
	}

	public void setRepaymentDay(Integer repaymentDay)
	{
		this.repaymentDay = repaymentDay;
	}

	public String getRepaymentType()
	{
		return repaymentType;
	}

	public void setRepaymentType(String repaymentType)
	{
		this.repaymentType = repaymentType == null ? null : repaymentType.trim();
	}

	public String getRepaymentAcc()
	{
		return repaymentAcc;
	}

	public void setRepaymentAcc(String repaymentAcc)
	{
		this.repaymentAcc = repaymentAcc == null ? null : repaymentAcc.trim();
	}

	public String getRepaymentAccName()
	{
		return repaymentAccName;
	}

	public void setRepaymentAccName(String repaymentAccName)
	{
		this.repaymentAccName = repaymentAccName == null ? null : repaymentAccName.trim();
	}

	public String getRepaymentBank()
	{
		return repaymentBank;
	}

	public void setRepaymentBank(String repaymentBank)
	{
		this.repaymentBank = repaymentBank == null ? null : repaymentBank.trim();
	}

	public String getRepaymentCity()
	{
		return repaymentCity;
	}

	public void setRepaymentCity(String repaymentCity)
	{
		this.repaymentCity = repaymentCity == null ? null : repaymentCity.trim();
	}

	public String getPaymentAcc()
	{
		return paymentAcc;
	}

	public void setPaymentAcc(String paymentAcc)
	{
		this.paymentAcc = paymentAcc == null ? null : paymentAcc.trim();
	}

	public String getPaymentAccName()
	{
		return paymentAccName;
	}

	public void setPaymentAccName(String paymentAccName)
	{
		this.paymentAccName = paymentAccName == null ? null : paymentAccName.trim();
	}

	public String getPaymentBank()
	{
		return paymentBank;
	}

	public void setPaymentBank(String paymentBank)
	{
		this.paymentBank = paymentBank == null ? null : paymentBank.trim();
	}

	public String getPaymentSubBank()
	{
		return paymentSubBank;
	}

	public void setPaymentSubBank(String paymentSubBank)
	{
		this.paymentSubBank = paymentSubBank == null ? null : paymentSubBank.trim();
	}

	public String getPaymentCity()
	{
		return paymentCity;
	}

	public void setPaymentCity(String paymentCity)
	{
		this.paymentCity = paymentCity == null ? null : paymentCity.trim();
	}

	public String getRepaymentSubBank()
	{
		return repaymentSubBank;
	}

	public void setRepaymentSubBank(String repaymentSubBank)
	{
		this.repaymentSubBank = repaymentSubBank == null ? null : repaymentSubBank.trim();
	}

	public Date getLastUpdateTime()
	{
		return lastUpdateTime;
	}

	public void setLastUpdateTime(Date lastUpdateTime)
	{
		this.lastUpdateTime = lastUpdateTime;
	}

	public Integer getCfcId()
	{
		return cfcId;
	}

	public void setCfcId(Integer cfcId)
	{
		this.cfcId = cfcId;
	}

	public Date getCofTraceTime()
	{
		return cofTraceTime;
	}

	public void setCofTraceTime(Date cofTraceTime)
	{
		this.cofTraceTime = cofTraceTime;
	}

	public String getSaRemark()
	{
		return saRemark;
	}

	public void setSaRemark(String saRemark)
	{
		this.saRemark = saRemark == null ? null : saRemark.trim();
	}

	public String getFyAccountName()
	{
		return fyAccountName;
	}

	public void setFyAccountName(String fyAccountName)
	{
		this.fyAccountName = fyAccountName == null ? null : fyAccountName.trim();
	}

	public String getFyAccountNo()
	{
		return fyAccountNo;
	}

	public void setFyAccountNo(String fyAccountNo)
	{
		this.fyAccountNo = fyAccountNo == null ? null : fyAccountNo.trim();
	}

	public String getBusAppid()
	{
		return busAppid;
	}

	public void setBusAppid(String busAppid)
	{
		this.busAppid = busAppid == null ? null : busAppid.trim();
	}

	public String getCustType()
	{
		return custType;
	}

	public void setCustType(String custType)
	{
		this.custType = custType == null ? null : custType.trim();
	}

	public String getSelfRepayName()
	{
		return selfRepayName;
	}

	public void setSelfRepayName(String selfRepayName)
	{
		this.selfRepayName = selfRepayName == null ? null : selfRepayName.trim();
	}

	public String getSelfRepayAccount()
	{
		return selfRepayAccount;
	}

	public void setSelfRepayAccount(String selfRepayAccount)
	{
		this.selfRepayAccount = selfRepayAccount == null ? null : selfRepayAccount.trim();
	}

	public String getSelfRepayBank()
	{
		return selfRepayBank;
	}

	public void setSelfRepayBank(String selfRepayBank)
	{
		this.selfRepayBank = selfRepayBank == null ? null : selfRepayBank.trim();
	}

	public String getCreatedby()
	{
		return createdby;
	}

	public void setCreatedby(String createdby)
	{
		this.createdby = createdby == null ? null : createdby.trim();
	}

	public Date getCreatedon()
	{
		return createdon;
	}

	public void setCreatedon(Date createdon)
	{
		this.createdon = createdon;
	}

	public String getModifiedby()
	{
		return modifiedby;
	}

	public void setModifiedby(String modifiedby)
	{
		this.modifiedby = modifiedby == null ? null : modifiedby.trim();
	}

	public Date getModifiedon()
	{
		return modifiedon;
	}

	public void setModifiedon(Date modifiedon)
	{
		this.modifiedon = modifiedon;
	}

	public Integer getVersion()
	{
		return version;
	}

	public void setVersion(Integer version)
	{
		this.version = version;
	}

	public Date getCheckAccTime()
	{
		return checkAccTime;
	}

	public void setCheckAccTime(Date checkAccTime)
	{
		this.checkAccTime = checkAccTime;
	}

	public BigDecimal getMinLoanAmount()
	{
		return minLoanAmount;
	}

	public void setMinLoanAmount(BigDecimal minLoanAmount)
	{
		this.minLoanAmount = minLoanAmount;
	}

	public BigDecimal getMaxLoanAmount()
	{
		return maxLoanAmount;
	}

	public void setMaxLoanAmount(BigDecimal maxLoanAmount)
	{
		this.maxLoanAmount = maxLoanAmount;
	}

	public BigDecimal getDownPaymentRatio()
	{
		return downPaymentRatio;
	}

	public void setDownPaymentRatio(BigDecimal downPaymentRatio)
	{
		this.downPaymentRatio = downPaymentRatio;
	}

	public String getDownPaymentType()
	{
		return downPaymentType;
	}

	public void setDownPaymentType(String downPaymentType)
	{
		this.downPaymentType = downPaymentType == null ? null : downPaymentType.trim();
	}

	public String getSaBonusType()
	{
		return saBonusType;
	}

	public void setSaBonusType(String saBonusType)
	{
		this.saBonusType = saBonusType == null ? null : saBonusType.trim();
	}

	public BigDecimal getMonthlyPremiumRate()
	{
		return monthlyPremiumRate;
	}

	public void setMonthlyPremiumRate(BigDecimal monthlyPremiumRate)
	{
		this.monthlyPremiumRate = monthlyPremiumRate;
	}

	public BigDecimal getContrAnnualInterestRate()
	{
		return contrAnnualInterestRate;
	}

	public void setContrAnnualInterestRate(BigDecimal contrAnnualInterestRate)
	{
		this.contrAnnualInterestRate = contrAnnualInterestRate;
	}

	public BigDecimal getReserveRate()
	{
		return reserveRate;
	}

	public void setReserveRate(BigDecimal reserveRate)
	{
		this.reserveRate = reserveRate;
	}

	public String getYbBindId()
	{
		return ybBindId;
	}

	public void setYbBindId(String ybBindId)
	{
		this.ybBindId = ybBindId == null ? null : ybBindId.trim();
	}

	public String getContractNo()
	{
		return contractNo;
	}

	public void setContractNo(String contractNo)
	{
		this.contractNo = contractNo == null ? null : contractNo.trim();
	}

	public Boolean getBuyInsurance()
	{
		return buyInsurance;
	}

	public void setBuyInsurance(Boolean buyInsurance)
	{
		this.buyInsurance = buyInsurance;
	}

	public Long getMonthConsultServiceRate()
	{
		return monthConsultServiceRate;
	}

	public void setMonthConsultServiceRate(Long monthConsultServiceRate)
	{
		this.monthConsultServiceRate = monthConsultServiceRate;
	}

	public String getRepaymentWay()
	{
		return repaymentWay;
	}

	public void setRepaymentWay(String repaymentWay)
	{
		this.repaymentWay = repaymentWay == null ? null : repaymentWay.trim();
	}

	public Date getClientSignedTime()
	{
		return clientSignedTime;
	}

	public void setClientSignedTime(Date clientSignedTime)
	{
		this.clientSignedTime = clientSignedTime;
	}

	public Date getStoreSignedTime()
	{
		return storeSignedTime;
	}

	public void setStoreSignedTime(Date storeSignedTime)
	{
		this.storeSignedTime = storeSignedTime;
	}

	public String getYbUserId()
	{
		return ybUserId;
	}

	public void setYbUserId(String ybUserId)
	{
		this.ybUserId = ybUserId == null ? null : ybUserId.trim();
	}

	public Boolean getCheckReturn()
	{
		return checkReturn;
	}

	public void setCheckReturn(Boolean checkReturn)
	{
		this.checkReturn = checkReturn;
	}

	public String getAttachTipInfo()
	{
		return attachTipInfo;
	}

	public void setAttachTipInfo(String attachTipInfo)
	{
		this.attachTipInfo = attachTipInfo == null ? null : attachTipInfo.trim();
	}

	public String getBankTel()
	{
		return bankTel;
	}

	public void setBankTel(String bankTel)
	{
		this.bankTel = bankTel == null ? null : bankTel.trim();
	}

	public String getYbUserType()
	{
		return ybUserType;
	}

	public void setYbUserType(String ybUserType)
	{
		this.ybUserType = ybUserType == null ? null : ybUserType.trim();
	}

	public String getGoodsType()
	{
		return goodsType;
	}

	public void setGoodsType(String goodsType)
	{
		this.goodsType = goodsType == null ? null : goodsType.trim();
	}

	public String getCustomerName()
	{
		return customerName;
	}

	public void setCustomerName(String customerName)
	{
		this.customerName = customerName == null ? null : customerName.trim();
	}

	public Long getClientCfcId()
	{
		return clientCfcId;
	}

	public void setClientCfcId(Long clientCfcId)
	{
		this.clientCfcId = clientCfcId;
	}

	public Long getFirmCfcId()
	{
		return firmCfcId;
	}

	public void setFirmCfcId(Long firmCfcId)
	{
		this.firmCfcId = firmCfcId;
	}

	public String getClientConStatus()
	{
		return clientConStatus;
	}

	public void setClientConStatus(String clientConStatus)
	{
		this.clientConStatus = clientConStatus == null ? null : clientConStatus.trim();
	}

	public String getFirmConStatus()
	{
		return firmConStatus;
	}

	public void setFirmConStatus(String firmConStatus)
	{
		this.firmConStatus = firmConStatus == null ? null : firmConStatus.trim();
	}

	public String getSaName()
	{
		return saName;
	}

	public void setSaName(String saName)
	{
		this.saName = saName == null ? null : saName.trim();
	}

	public String getAppStatusName()
	{
		return appStatusName;
	}

	public void setAppStatusName(String appStatusName)
	{
		this.appStatusName = appStatusName == null ? null : appStatusName.trim();
	}

	public String getIsUploadAttach()
	{
		return isUploadAttach;
	}

	public void setIsUploadAttach(String isUploadAttach)
	{
		this.isUploadAttach = isUploadAttach == null ? null : isUploadAttach.trim();
	}

	public Date getPaidSuccessTime()
	{
		return paidSuccessTime;
	}

	public void setPaidSuccessTime(Date paidSuccessTime)
	{
		this.paidSuccessTime = paidSuccessTime;
	}

	public String getIsRepaymentSuccess()
	{
		return isRepaymentSuccess;
	}

	public void setIsRepaymentSuccess(String isRepaymentSuccess)
	{
		this.isRepaymentSuccess = isRepaymentSuccess == null ? null : isRepaymentSuccess.trim();
	}

	public String getBusRetInfo()
	{
		return busRetInfo;
	}

	public void setBusRetInfo(String busRetInfo)
	{
		this.busRetInfo = busRetInfo == null ? null : busRetInfo.trim();
	}

	public Date getSendBusTime()
	{
		return sendBusTime;
	}

	public void setSendBusTime(Date sendBusTime)
	{
		this.sendBusTime = sendBusTime;
	}

	public Integer getRevocationType()
	{
		return revocationType;
	}

	public void setRevocationType(Integer revocationType)
	{
		this.revocationType = revocationType;
	}

	public String getRevocationDesc()
	{
		return revocationDesc;
	}

	public void setRevocationDesc(String revocationDesc)
	{
		this.revocationDesc = revocationDesc == null ? null : revocationDesc.trim();
	}

	public String getProResult()
	{
		return proResult;
	}

	public void setProResult(String proResult)
	{
		this.proResult = proResult;
	}


	public Integer getCheckReturnCount()
	{
		return checkReturnCount;
	}

	public void setCheckReturnCount(Integer checkReturnCount)
	{
		this.checkReturnCount = checkReturnCount;
	}

	public String getShowClass()
	{
		if (InputChecker.isEmpty(getAppState()))
		{
			return "";
		}
		return PropertyUtils.getResource("messages","app.state.style."+ getAppState());
	}

	public String getRoleSql()
	{
		return roleSql;
	}

	public void setRoleSql(String roleSql)
	{
		this.roleSql = roleSql;
	}

	public String getAppStatuNameByJjcode() throws Exception
	{
		if (InputChecker.isEmpty(getAppState()))
		{
			return "";
		}
		return	PropertyUtils.getResource("messages","app.state.jjcodename."+ getAppState());
	}

	public String getRealAppStatus()
	{
		return realAppStatus;
	}

	public void setRealAppStatus(String realAppStatus)
	{
		this.realAppStatus = realAppStatus;
	}

	public String getIdParam()
	{
		return idParam;
	}

	public void setIdParam(String idParam)
	{
		this.idParam = idParam == null ? null : idParam.trim();
	}

	public String getStartTime()
	{
		return startTime;
	}

	public void setStartTime(String startTime)
	{
		this.startTime = startTime;
	}

	public String getEndTime()
	{
		return endTime;
	}

	public void setEndTime(String endTime)
	{
		this.endTime = endTime;
	}

	public String getContractState()
	{
		return contractState;
	}

	public void setContractState(String contractState)
	{
		this.contractState = contractState;
	}

	
	public String getContractStateName()
	{
		if (InputChecker.isEmpty(getContractState()))
		{
			return "";
		}
		return PropertyUtils.getResource("messages","app.contract.state."+ getContractState());
	}

	public Integer getMarker() {
		return marker;
	}

	public void setMarker(Integer marker) {
		this.marker = marker;
	}
	
	public String getIsNoParam() {
		return isNoParam;
	}

	public void setIsNoParam(String isNoParam) {
		this.isNoParam = isNoParam;
	}

	public Integer getOverdueDayNum()
	{
		return overdueDayNum;
	}

	public void setOverdueDayNum(Integer overdueDayNum)
	{
		this.overdueDayNum = overdueDayNum;
	}

	public Long getNextCursor() {
		return nextCursor;
	}

	public void setNextCursor(Long nextCursor) {
		this.nextCursor = nextCursor;
	}

	public String getStoreCity() {
		return storeCity;
	}

	public void setStoreCity(String storeCity) {
		this.storeCity = storeCity;
	}

	public String getStoreCode() {
		return storeCode;
	}

	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

	public String getSingleCardTime() {
		return singleCardTime;
	}

	public void setSingleCardTime(String singleCardTime) {
		this.singleCardTime = singleCardTime;
	}

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public String getCapitalType() {
		return capitalType;
	}

	public void setCapitalType(String capitalType) {
		this.capitalType = capitalType;
	}

	public String getUserEvaluateCode() {
		return userEvaluateCode;
	}

	public void setUserEvaluateCode(String userEvaluateCode) {
		this.userEvaluateCode = userEvaluateCode;
	}

	public String getBusProductId() {
		return busProductId;
	}

	public void setBusProductId(String busProductId) {
		this.busProductId = busProductId;
	}

	public String getAppStateName() {
		if (InputChecker.isEmpty(getAppState()))
		{
			return "";
		}
		this.appStateName = PropertyUtils.getResource("messages","app.state.name."+ getAppState());
		return appStateName;
	}

	public void setAppStateName(String appStateName) {
		this.appStateName = appStateName;
	}

	public String getIsSendWk() {
		return isSendWk;
	}

	public void setIsSendWk(String isSendWk) {
		this.isSendWk = isSendWk;
	}

	public String getAppStatusInner() {
		return appStatusInner;
	}

	public void setAppStatusInner(String appStatusInner) {
		this.appStatusInner = appStatusInner;
	}

	public String getAppStatesShow() {
		return appStatesShow;
	}

	public void setAppStatesShow(String appStatesShow) {
		this.appStatesShow = appStatesShow;
	}

	public String getIsSubmit() {
		return isSubmit;
	}

	public void setIsSubmit(String isSubmit) {
		this.isSubmit = isSubmit;
	}

	public String getOldAppState() {
		return oldAppState;
	}

	public void setOldAppState(String oldAppState) {
		this.oldAppState = oldAppState;
	}

	public String getNewAppState() {
		return newAppState;
	}

	public Date getFirstRepayDate() {
		return firstRepayDate;
	}

	public void setFirstRepayDate(Date firstRepayDate) {
		this.firstRepayDate = firstRepayDate;
	}

	public void setNewAppState(String newAppState) {
		this.newAppState = newAppState;
	}

	public String getOldAppStateName() {
		return oldAppStateName;
	}

	public void setOldAppStateName(String oldAppStateName) {
		this.oldAppStateName = oldAppStateName;
	}
	
	
}