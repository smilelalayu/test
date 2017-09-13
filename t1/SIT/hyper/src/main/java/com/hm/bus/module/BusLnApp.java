package com.hm.bus.module;

import com.gep.core.util.DateUtils;

import java.math.BigDecimal;
import java.util.Date;

public class BusLnApp {
	private Long id;

	private String firmName;

	private Long storeId;

	private String shopName;

	private Long productSeriesId;

	private String productSeriesName;

	private Long productId;

	private String productName;

	private String cardId;

	private String mobile;

	private Long l1Manager;

	private Long l2Manager;

	private Long l3Manager;

	private Long l4Manager;

	private Long saleManager;

	private Long sa;

	private String appState;

	private BigDecimal loanMoney;

	private String userEvaluate;

	private Date woBuildTime;

	private Date createContTime;

	private Date signTime;

	private String orgCode;

	private Long clientId;

	private Integer periods;

	private Double interestRate;

	private Double penaltyRate;

	private Double lateExpeneseRate;

	private String billingRule;

	private BigDecimal premium;

	private BigDecimal discountRate;

	private BigDecimal saBonus;

	private BigDecimal dsmBonus;

	private BigDecimal commissionRate;

	private BigDecimal amount;

	private BigDecimal downPaymentAmount;

	private BigDecimal contractAmount;

	private BigDecimal serviceCharge;

	private Double riskRate;

	private BigDecimal riskAmount;

	private BigDecimal otherAmount;

	private BigDecimal monthAmount;

	private Date firstRepayDate;

	private Integer repaymentDay;

	private String repaymentType;

	private String repaymentAcc;

	private String repaymentAccName;

	private String repaymentBank;

	private String repaymentCity;

	private String paymentAcc;

	private String paymentAccName;

	private String paymentBank;

	private String paymentSubBank;

	private String paymentCity;

	private String repaymentSubBank;

	private Date lastUpdateTime;

	private Integer cfcId;

	private Date cofTraceTime;

	private String saRemark;

	private String fyAccountName;

	private String fyAccountNo;

	private String busAppid;

	private String custType;

	private String selfRepayName;

	private String selfRepayAccount;

	private String selfRepayBank;

	private String createdby;

	private Date createdon;

	private String modifiedby;

	private Date modifiedon;

	private Integer version;

	private Date checkAccTime;

	private BigDecimal minLoanAmount;

	private BigDecimal maxLoanAmount;

	private BigDecimal downPaymentRatio;

	private String downPaymentType;

	private String saBonusType;

	private BigDecimal monthlyPremiumRate;

	private BigDecimal contrAnnualInterestRate;

	private BigDecimal reserveRate;

	private String ybBindId;

	private String contractNo;

	private Boolean buyInsurance;

	private Long monthConsultServiceRate;

	private String repaymentWay;

	private Date clientSignedTime;

	private Date storeSignedTime;

	private String ybUserId;

	private Boolean checkReturn;

	private String attachTipInfo;

	private String bankTel;

	private String ybUserType;

	private String goodsType;

	private String customerName;

	private Long clientCfcId;

	private Long firmCfcId;

	private String clientConStatus;

	private String firmConStatus;

	private String saName;

	private String appStatusName;

	private String isUploadAttach;

	private Date paidSuccessTime;

	private String isRepaymentSuccess;

	private String busRetInfo;
	private Date sendBusTime;
	private String sendBusTimeFormat;

	private Integer revocationType;

	private String revocationDesc;

	private String loanType;
	
	private String loanTypeName;

	private Integer marker;

	private String capitalType;

	private String userEvaluateCode;
	// 状态
	private String proResult;
	// 批次号
	private String batchNO;
	/**
	 * 查询时间
	 */
	private String startTime;
	private String endTime;
	private String roleSql;// 根绝角色查询条件
	private String realAppState;
	
	private String amountSystemSerial;//额度系统的模型编号

	private String realAppStateName;
	
	private String busProductId; 
	
	private String appStatusInner;
	private String quotaOperationStatus;//圈存额度状态

	
	public String getQuotaOperationStatus() {
		return quotaOperationStatus;
	}

	public void setQuotaOperationStatus(String quotaOperationStatus) {
		this.quotaOperationStatus = quotaOperationStatus;
	}

	public String getRealAppState() {
		return realAppState;
	}

	public void setRealAppState(String realAppState) {
		this.realAppState = realAppState;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getRoleSql() {
		return roleSql;
	}

	public void setRoleSql(String roleSql) {
		this.roleSql = roleSql;
	}

	public String getProResult() {
		return proResult;
	}

	public void setProResult(String proResult) {
		this.proResult = proResult;
	}

	public String getBatchNO() {
		return batchNO;
	}

	public void setBatchNO(String batchNO) {
		this.batchNO = batchNO;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirmName() {
		return firmName;
	}

	public void setFirmName(String firmName) {
		this.firmName = firmName == null ? null : firmName.trim();
	}

	public Long getStoreId() {
		return storeId;
	}

	public void setStoreId(Long storeId) {
		this.storeId = storeId;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName == null ? null : shopName.trim();
	}

	public Long getProductSeriesId() {
		return productSeriesId;
	}

	public void setProductSeriesId(Long productSeriesId) {
		this.productSeriesId = productSeriesId;
	}

	public String getProductSeriesName() {
		return productSeriesName;
	}

	public void setProductSeriesName(String productSeriesName) {
		this.productSeriesName = productSeriesName == null ? null : productSeriesName.trim();
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName == null ? null : productName.trim();
	}

	public String getCardId() {
		return cardId;
	}

	public void setCardId(String cardId) {
		this.cardId = cardId == null ? null : cardId.trim();
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile == null ? null : mobile.trim();
	}

	public Long getL1Manager() {
		return l1Manager;
	}

	public void setL1Manager(Long l1Manager) {
		this.l1Manager = l1Manager;
	}

	public Long getL2Manager() {
		return l2Manager;
	}

	public void setL2Manager(Long l2Manager) {
		this.l2Manager = l2Manager;
	}

	public Long getL3Manager() {
		return l3Manager;
	}

	public void setL3Manager(Long l3Manager) {
		this.l3Manager = l3Manager;
	}

	public Long getL4Manager() {
		return l4Manager;
	}

	public void setL4Manager(Long l4Manager) {
		this.l4Manager = l4Manager;
	}

	public Long getSaleManager() {
		return saleManager;
	}

	public void setSaleManager(Long saleManager) {
		this.saleManager = saleManager;
	}

	public Long getSa() {
		return sa;
	}

	public void setSa(Long sa) {
		this.sa = sa;
	}

	public String getAppState() {
		return appState;
	}

	public void setAppState(String appState) {
		this.appState = appState == null ? null : appState.trim();
	}

	public BigDecimal getLoanMoney() {
		return loanMoney;
	}

	public void setLoanMoney(BigDecimal loanMoney) {
		this.loanMoney = loanMoney;
	}

	public String getUserEvaluate() {
		return userEvaluate;
	}

	public void setUserEvaluate(String userEvaluate) {
		this.userEvaluate = userEvaluate == null ? null : userEvaluate.trim();
	}

	public Date getWoBuildTime() {
		return woBuildTime;
	}

	public void setWoBuildTime(Date woBuildTime) {
		this.woBuildTime = woBuildTime;
	}

	public Date getCreateContTime() {
		return createContTime;
	}

	public void setCreateContTime(Date createContTime) {
		this.createContTime = createContTime;
	}

	public Date getSignTime() {
		return signTime;
	}

	public void setSignTime(Date signTime) {
		this.signTime = signTime;
	}

	public String getOrgCode() {
		return orgCode;
	}

	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode == null ? null : orgCode.trim();
	}

	public Long getClientId() {
		return clientId;
	}

	public void setClientId(Long clientId) {
		this.clientId = clientId;
	}

	public Integer getPeriods() {
		return periods;
	}

	public void setPeriods(Integer periods) {
		this.periods = periods;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}

	public Double getPenaltyRate() {
		return penaltyRate;
	}

	public void setPenaltyRate(Double penaltyRate) {
		this.penaltyRate = penaltyRate;
	}

	public Double getLateExpeneseRate() {
		return lateExpeneseRate;
	}

	public void setLateExpeneseRate(Double lateExpeneseRate) {
		this.lateExpeneseRate = lateExpeneseRate;
	}

	public String getBillingRule() {
		return billingRule;
	}

	public void setBillingRule(String billingRule) {
		this.billingRule = billingRule == null ? null : billingRule.trim();
	}

	public BigDecimal getPremium() {
		return premium;
	}

	public void setPremium(BigDecimal premium) {
		this.premium = premium;
	}

	public BigDecimal getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(BigDecimal discountRate) {
		this.discountRate = discountRate;
	}

	public BigDecimal getSaBonus() {
		return saBonus;
	}

	public void setSaBonus(BigDecimal saBonus) {
		this.saBonus = saBonus;
	}

	public BigDecimal getDsmBonus() {
		return dsmBonus;
	}

	public void setDsmBonus(BigDecimal dsmBonus) {
		this.dsmBonus = dsmBonus;
	}

	public BigDecimal getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(BigDecimal commissionRate) {
		this.commissionRate = commissionRate;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getDownPaymentAmount() {
		return downPaymentAmount;
	}

	public void setDownPaymentAmount(BigDecimal downPaymentAmount) {
		this.downPaymentAmount = downPaymentAmount;
	}

	public BigDecimal getContractAmount() {
		return contractAmount;
	}

	public void setContractAmount(BigDecimal contractAmount) {
		this.contractAmount = contractAmount;
	}

	public BigDecimal getServiceCharge() {
		return serviceCharge;
	}

	public void setServiceCharge(BigDecimal serviceCharge) {
		this.serviceCharge = serviceCharge;
	}

	public Double getRiskRate() {
		return riskRate;
	}

	public void setRiskRate(Double riskRate) {
		this.riskRate = riskRate;
	}

	public BigDecimal getRiskAmount() {
		return riskAmount;
	}

	public void setRiskAmount(BigDecimal riskAmount) {
		this.riskAmount = riskAmount;
	}

	public BigDecimal getOtherAmount() {
		return otherAmount;
	}

	public void setOtherAmount(BigDecimal otherAmount) {
		this.otherAmount = otherAmount;
	}

	public BigDecimal getMonthAmount() {
		return monthAmount;
	}

	public void setMonthAmount(BigDecimal monthAmount) {
		this.monthAmount = monthAmount;
	}

	public Date getFirstRepayDate() {
		return firstRepayDate;
	}

	public void setFirstRepayDate(Date firstRepayDate) {
		this.firstRepayDate = firstRepayDate;
	}

	public Integer getRepaymentDay() {
		return repaymentDay;
	}

	public void setRepaymentDay(Integer repaymentDay) {
		this.repaymentDay = repaymentDay;
	}

	public String getRepaymentType() {
		return repaymentType;
	}

	public void setRepaymentType(String repaymentType) {
		this.repaymentType = repaymentType == null ? null : repaymentType.trim();
	}

	public String getRepaymentAcc() {
		return repaymentAcc;
	}

	public void setRepaymentAcc(String repaymentAcc) {
		this.repaymentAcc = repaymentAcc == null ? null : repaymentAcc.trim();
	}

	public String getRepaymentAccName() {
		return repaymentAccName;
	}

	public void setRepaymentAccName(String repaymentAccName) {
		this.repaymentAccName = repaymentAccName == null ? null : repaymentAccName.trim();
	}

	public String getRepaymentBank() {
		return repaymentBank;
	}

	public void setRepaymentBank(String repaymentBank) {
		this.repaymentBank = repaymentBank == null ? null : repaymentBank.trim();
	}

	public String getRepaymentCity() {
		return repaymentCity;
	}

	public void setRepaymentCity(String repaymentCity) {
		this.repaymentCity = repaymentCity == null ? null : repaymentCity.trim();
	}

	public String getPaymentAcc() {
		return paymentAcc;
	}

	public void setPaymentAcc(String paymentAcc) {
		this.paymentAcc = paymentAcc == null ? null : paymentAcc.trim();
	}

	public String getPaymentAccName() {
		return paymentAccName;
	}

	public void setPaymentAccName(String paymentAccName) {
		this.paymentAccName = paymentAccName == null ? null : paymentAccName.trim();
	}

	public String getPaymentBank() {
		return paymentBank;
	}

	public void setPaymentBank(String paymentBank) {
		this.paymentBank = paymentBank == null ? null : paymentBank.trim();
	}

	public String getPaymentSubBank() {
		return paymentSubBank;
	}

	public void setPaymentSubBank(String paymentSubBank) {
		this.paymentSubBank = paymentSubBank == null ? null : paymentSubBank.trim();
	}

	public String getPaymentCity() {
		return paymentCity;
	}

	public void setPaymentCity(String paymentCity) {
		this.paymentCity = paymentCity == null ? null : paymentCity.trim();
	}

	public String getRepaymentSubBank() {
		return repaymentSubBank;
	}

	public void setRepaymentSubBank(String repaymentSubBank) {
		this.repaymentSubBank = repaymentSubBank == null ? null : repaymentSubBank.trim();
	}

	public Date getLastUpdateTime() {
		return lastUpdateTime;
	}

	public void setLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}

	public Integer getCfcId() {
		return cfcId;
	}

	public void setCfcId(Integer cfcId) {
		this.cfcId = cfcId;
	}

	public Date getCofTraceTime() {
		return cofTraceTime;
	}

	public void setCofTraceTime(Date cofTraceTime) {
		this.cofTraceTime = cofTraceTime;
	}

	public String getSaRemark() {
		return saRemark;
	}

	public void setSaRemark(String saRemark) {
		this.saRemark = saRemark == null ? null : saRemark.trim();
	}

	public String getFyAccountName() {
		return fyAccountName;
	}

	public void setFyAccountName(String fyAccountName) {
		this.fyAccountName = fyAccountName == null ? null : fyAccountName.trim();
	}

	public String getFyAccountNo() {
		return fyAccountNo;
	}

	public void setFyAccountNo(String fyAccountNo) {
		this.fyAccountNo = fyAccountNo == null ? null : fyAccountNo.trim();
	}

	public String getBusAppid() {
		return busAppid;
	}

	public void setBusAppid(String busAppid) {
		this.busAppid = busAppid == null ? null : busAppid.trim();
	}

	public String getCustType() {
		return custType;
	}

	public void setCustType(String custType) {
		this.custType = custType == null ? null : custType.trim();
	}

	public String getSelfRepayName() {
		return selfRepayName;
	}

	public void setSelfRepayName(String selfRepayName) {
		this.selfRepayName = selfRepayName == null ? null : selfRepayName.trim();
	}

	public String getSelfRepayAccount() {
		return selfRepayAccount;
	}

	public void setSelfRepayAccount(String selfRepayAccount) {
		this.selfRepayAccount = selfRepayAccount == null ? null : selfRepayAccount.trim();
	}

	public String getSelfRepayBank() {
		return selfRepayBank;
	}

	public void setSelfRepayBank(String selfRepayBank) {
		this.selfRepayBank = selfRepayBank == null ? null : selfRepayBank.trim();
	}

	public String getCreatedby() {
		return createdby;
	}

	public void setCreatedby(String createdby) {
		this.createdby = createdby == null ? null : createdby.trim();
	}

	public Date getCreatedon() {
		return createdon;
	}

	public void setCreatedon(Date createdon) {
		this.createdon = createdon;
	}

	public String getModifiedby() {
		return modifiedby;
	}

	public void setModifiedby(String modifiedby) {
		this.modifiedby = modifiedby == null ? null : modifiedby.trim();
	}

	public Date getModifiedon() {
		return modifiedon;
	}

	public void setModifiedon(Date modifiedon) {
		this.modifiedon = modifiedon;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public Date getCheckAccTime() {
		return checkAccTime;
	}

	public void setCheckAccTime(Date checkAccTime) {
		this.checkAccTime = checkAccTime;
	}

	public BigDecimal getMinLoanAmount() {
		return minLoanAmount;
	}

	public void setMinLoanAmount(BigDecimal minLoanAmount) {
		this.minLoanAmount = minLoanAmount;
	}

	public BigDecimal getMaxLoanAmount() {
		return maxLoanAmount;
	}

	public void setMaxLoanAmount(BigDecimal maxLoanAmount) {
		this.maxLoanAmount = maxLoanAmount;
	}

	public BigDecimal getDownPaymentRatio() {
		return downPaymentRatio;
	}

	public void setDownPaymentRatio(BigDecimal downPaymentRatio) {
		this.downPaymentRatio = downPaymentRatio;
	}

	public String getDownPaymentType() {
		return downPaymentType;
	}

	public void setDownPaymentType(String downPaymentType) {
		this.downPaymentType = downPaymentType == null ? null : downPaymentType.trim();
	}

	public String getSaBonusType() {
		return saBonusType;
	}

	public void setSaBonusType(String saBonusType) {
		this.saBonusType = saBonusType == null ? null : saBonusType.trim();
	}

	public BigDecimal getMonthlyPremiumRate() {
		return monthlyPremiumRate;
	}

	public void setMonthlyPremiumRate(BigDecimal monthlyPremiumRate) {
		this.monthlyPremiumRate = monthlyPremiumRate;
	}

	public BigDecimal getContrAnnualInterestRate() {
		return contrAnnualInterestRate;
	}

	public void setContrAnnualInterestRate(BigDecimal contrAnnualInterestRate) {
		this.contrAnnualInterestRate = contrAnnualInterestRate;
	}

	public BigDecimal getReserveRate() {
		return reserveRate;
	}

	public void setReserveRate(BigDecimal reserveRate) {
		this.reserveRate = reserveRate;
	}

	public String getYbBindId() {
		return ybBindId;
	}

	public void setYbBindId(String ybBindId) {
		this.ybBindId = ybBindId == null ? null : ybBindId.trim();
	}

	public String getContractNo() {
		return contractNo;
	}

	public void setContractNo(String contractNo) {
		this.contractNo = contractNo == null ? null : contractNo.trim();
	}

	public Boolean getBuyInsurance() {
		return buyInsurance;
	}

	public void setBuyInsurance(Boolean buyInsurance) {
		this.buyInsurance = buyInsurance;
	}

	public Long getMonthConsultServiceRate() {
		return monthConsultServiceRate;
	}

	public void setMonthConsultServiceRate(Long monthConsultServiceRate) {
		this.monthConsultServiceRate = monthConsultServiceRate;
	}

	public String getRepaymentWay() {
		return repaymentWay;
	}

	public void setRepaymentWay(String repaymentWay) {
		this.repaymentWay = repaymentWay == null ? null : repaymentWay.trim();
	}

	public Date getClientSignedTime() {
		return clientSignedTime;
	}

	public void setClientSignedTime(Date clientSignedTime) {
		this.clientSignedTime = clientSignedTime;
	}

	public Date getStoreSignedTime() {
		return storeSignedTime;
	}

	public void setStoreSignedTime(Date storeSignedTime) {
		this.storeSignedTime = storeSignedTime;
	}

	public String getYbUserId() {
		return ybUserId;
	}

	public void setYbUserId(String ybUserId) {
		this.ybUserId = ybUserId == null ? null : ybUserId.trim();
	}

	public Boolean getCheckReturn() {
		return checkReturn;
	}

	public void setCheckReturn(Boolean checkReturn) {
		this.checkReturn = checkReturn;
	}

	public String getAttachTipInfo() {
		return attachTipInfo;
	}

	public void setAttachTipInfo(String attachTipInfo) {
		this.attachTipInfo = attachTipInfo == null ? null : attachTipInfo.trim();
	}

	public String getBankTel() {
		return bankTel;
	}

	public void setBankTel(String bankTel) {
		this.bankTel = bankTel == null ? null : bankTel.trim();
	}

	public String getYbUserType() {
		return ybUserType;
	}

	public void setYbUserType(String ybUserType) {
		this.ybUserType = ybUserType == null ? null : ybUserType.trim();
	}

	public String getGoodsType() {
		return goodsType;
	}

	public void setGoodsType(String goodsType) {
		this.goodsType = goodsType == null ? null : goodsType.trim();
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName == null ? null : customerName.trim();
	}

	public Long getClientCfcId() {
		return clientCfcId;
	}

	public void setClientCfcId(Long clientCfcId) {
		this.clientCfcId = clientCfcId;
	}

	public Long getFirmCfcId() {
		return firmCfcId;
	}

	public void setFirmCfcId(Long firmCfcId) {
		this.firmCfcId = firmCfcId;
	}

	public String getClientConStatus() {
		return clientConStatus;
	}

	public void setClientConStatus(String clientConStatus) {
		this.clientConStatus = clientConStatus == null ? null : clientConStatus.trim();
	}

	public String getFirmConStatus() {
		return firmConStatus;
	}

	public void setFirmConStatus(String firmConStatus) {
		this.firmConStatus = firmConStatus == null ? null : firmConStatus.trim();
	}

	public String getSaName() {
		return saName;
	}

	public void setSaName(String saName) {
		this.saName = saName == null ? null : saName.trim();
	}

	public String getAppStatusName() {
		return appStatusName;
	}

	public void setAppStatusName(String appStatusName) {
		this.appStatusName = appStatusName == null ? null : appStatusName.trim();
	}

	public String getIsUploadAttach() {
		return isUploadAttach;
	}

	public void setIsUploadAttach(String isUploadAttach) {
		this.isUploadAttach = isUploadAttach == null ? null : isUploadAttach.trim();
	}

	public Date getPaidSuccessTime() {
		return paidSuccessTime;
	}

	public void setPaidSuccessTime(Date paidSuccessTime) {
		this.paidSuccessTime = paidSuccessTime;
	}

	public String getIsRepaymentSuccess() {
		return isRepaymentSuccess;
	}

	public void setIsRepaymentSuccess(String isRepaymentSuccess) {
		this.isRepaymentSuccess = isRepaymentSuccess == null ? null : isRepaymentSuccess.trim();
	}

	public String getBusRetInfo() {
		return busRetInfo;
	}

	public void setBusRetInfo(String busRetInfo) {
		this.busRetInfo = busRetInfo == null ? null : busRetInfo.trim();
	}

	public Date getSendBusTime() {
		return sendBusTime;
	}

	public void setSendBusTime(Date sendBusTime) {
		this.sendBusTime = sendBusTime;
	}

	public Integer getRevocationType() {
		return revocationType;
	}

	public void setRevocationType(Integer revocationType) {
		this.revocationType = revocationType;
	}

	public String getRevocationDesc() {
		return revocationDesc;
	}

	public void setRevocationDesc(String revocationDesc) {
		this.revocationDesc = revocationDesc == null ? null : revocationDesc.trim();
	}

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType == null ? null : loanType.trim();
	}

	public Integer getMarker() {
		return marker;
	}

	public void setMarker(Integer marker) {
		this.marker = marker;
	}

	public String getCapitalType() {
		return capitalType;
	}

	public void setCapitalType(String capitalType) {
		this.capitalType = capitalType == null ? null : capitalType.trim();
	}

	public String getUserEvaluateCode() {
		return userEvaluateCode;
	}

	public void setUserEvaluateCode(String userEvaluateCode) {
		this.userEvaluateCode = userEvaluateCode == null ? null : userEvaluateCode.trim();
	}

	public String getRealAppStateName() {
		if (realAppState != null) {
			switch (this.realAppState) {
			case "35":
				this.realAppStateName = "待保理放款";
				break;
			case "36":
				realAppStateName = "待BUS放款";
				break;
			case "32":
				realAppStateName = "待放款";
				break;
			case "32X":
				realAppStateName = "待生成还款计划";
				break;
			case "50":
				realAppStateName = "放款成功";
				break;
			}
			return realAppStateName;
		}else{
			return realAppStateName;
		}
	}

	public String getLoanTypeName() {
		if (loanType != null) {
			if("POS".equals(loanType)){
				return "POS贷";
			}else if("AGR".equals(loanType)){
				return "农机贷";
			}else if("CASH".equals(loanType)){
				return "现金贷";
			}else{
				return loanType;
			}
		}else{
			return loanType;
		}
	}

	public String getSendBusTimeFormat() {
		if (sendBusTime != null) {
			return DateUtils.formatDateTime(sendBusTime);
		}else{
			return null;
		}
	}

	public String getBusProductId() {
		return busProductId;
	}

	public void setBusProductId(String busProductId) {
		this.busProductId = busProductId;
	}

	/**
	 * @return the amountSystemSerial
	 */
	public String getAmountSystemSerial() {
		return amountSystemSerial;
	}

	/**
	 * @param amountSystemSerial the amountSystemSerial to set
	 */
	public void setAmountSystemSerial(String amountSystemSerial) {
		this.amountSystemSerial = amountSystemSerial;
	}

	public String getAppStatusInner() {
		return appStatusInner;
	}

	public void setAppStatusInner(String appStatusInner) {
		this.appStatusInner = appStatusInner;
	}

	
	

}