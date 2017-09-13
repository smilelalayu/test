package com.hm.bus.util;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.math.BigDecimal;
import java.util.Date;

public class LoanAppDTO {
	/** 超能工单号 */
    private Long id;

    /** 产品系列ID */
    private Long productSeriesId;

    /** 产品系列名称 */
    private String productSeriesName;

    /** 产品ID */
    private Long productId;

    /** 产品名称 */
    private String productName;

    /** 身份证号 */
    private String cardId;

    /** 手机号 */
    private String mobile;

    /** 工单状态(01：未提交、36：保理放款成功、05：退回、32：待放款、11：自动审核中：50：放款成功、12：待审核、70：工单撤销、80：拒绝、75:取消放款、14：待审核、20：待生成合同、90：数据异常、21：待签章、30：待上传资料、31：待交易确认、35：待保理放款) */
    private String appState;

    /** 申请金额 */
    private BigDecimal loanMoney;

    /** 工单生成时间 */
    private Date woBuildTime;

    /** 生成合同时间 */
    private Date createContTime;

    /** 合同签订时间 */
    private Date signTime;

    /** 期数 */
    private Integer periods;

    /** 平息利率 */
    private Double interestRate;

    /** 罚息利率（贷前停用） */
    private Double penaltyRate;

    /** 逾期管理费利率（贷前停用） */
    private Double lateExpeneseRate;

    /** 计费规则（贷前停用） */
    private String billingRule;

    /** 保费（贷前停用） */
    private BigDecimal premium;

    /** 产品折扣比例（贷前停用） */
    private BigDecimal discountRate;

    /** 商品总价 */
    private BigDecimal amount;

    /** 首付金额 */
    private BigDecimal downPaymentAmount;

    /** 合同金额（贷前停用） */
    private BigDecimal contractAmount;

    /** 服务费（贷前停用） */
    private BigDecimal serviceCharge;

    /** 风险备用金利率（贷前停用） */
    private Double riskRate;

    /** 风险备用金 */
    private BigDecimal riskAmount;

    /** 其他费用（贷前停用） */
    private BigDecimal otherAmount;

    /** 月还款额（贷前停用） */
    private BigDecimal monthAmount;

    /** 首个还款日（贷前停用） */
    private String firstDay;

    /** 还款日（贷前停用） */
    private Integer repaymentDay;

    /** 还款类型（1:代扣/2:自主还款） */
    private String repaymentType;

    /** 还款账号 */
    private String repaymentAcc;

    /** 还款户名 */
    private String repaymentAccName;

    /** 还款银行 */
    private String repaymentBank;

    /** 还款卡开户城市 */
    private String repaymentCity;

    /** 放款账号 */
    private String paymentAcc;

    /** 放款户名 */
    private String paymentAccName;

    /** 放款银行 */
    private String paymentBank;

    /** 放款支行（贷前停用） */
    private String paymentSubBank;

    /** 放款卡开户城市 */
    private String paymentCity;

    /** 还款支行（贷前停用） */
    private String repaymentSubBank;

    /** 最后修改日期 */
    private Date lastUpdateTime;

    /** 富友银行代号 */
    private String fyBankNo;

    /** 富友预留手机号 */
    private String fyMobile;

    /** 富友账户名（贷前停用） */
    private String fyAccountName;

    /** 富友账号（贷前停用） */
    private String fyAccountNo;

    /** Bus工单id */
    private String busAppid;

    /** 自主还款户名 */
    private String selfRepayName;

    /** 自主还款账号 */
    private String selfRepayAccount;

    /** 自主还款银行 */
    private String selfRepayBank;

    /** 创建时间 */
    private Date createdon;

    /** 修改人 */
    private String modifiedby;

    /** 修改时间 */
    private Date modifiedon;

    /** 乐观锁 */
    private Integer version;

    /** 首付比例 */
    private BigDecimal downPaymentRatio;

    /** 首付类型 */
    private String downPaymentType;

    /** 月保费比例 */
    private BigDecimal monthlyPremiumRate;

    /** 合同年利率 */
    private BigDecimal contrAnnualInterestRate;

    /** 备用金比例 */
    private BigDecimal reserveRate;

    /** 购买保险 */
    private Boolean buyInsurance;

    /** 月咨询服务费率（贷前停用） */
    private BigDecimal monthConsultServiceRate;

    /** 银行开户手机号 */
    private String bankTel;

    /** 客户名称 */
    private String customerName;

    /** 工单状态名称 */
    private String appStatusName;

    /** 放款成功时间 */
    private Date paidSuccessTime;

    /** 是否放款成功 */
    private String isRepaymentSuccess;

    /** 是否推送万卡，Y表示已经推送，空表示未推送 */
    private String isSendWk;

    /** 工单类型: POS,CASH,AGR */
    private String loanType;

    /** 保理/反保理(BL/DBL) */
    private String capitalType;

    /** 对内状态码 */
    private String appStatusInner;

    /** 资金渠道ID */
    private String fundChannelId;

    /** 资金渠道名称 */
    private String fundChannelName;

    /** 结清类型(settle_type:CN501:未结清,CN502:正常结清,CN503:提前还款结清,CN504:强制提前结清,CN505:减期结清) */
    private String finishType;

    /** 结清时间 */
    private Date finishDate;

    /** 月贷款利率 */
    private BigDecimal monthInterestRate;

    /** 月均手续费 */
    private BigDecimal monthPoundage;

    /** 月均信用管理费 */
    private BigDecimal monthCreditManagementFee;

    /** 逾期天数 */
    private Integer overdueDays;
    /** 还款方式 */
    private String repaymentMethod;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getFirstDay() {
        return firstDay;
    }

    public void setFirstDay(String firstDay) {
        this.firstDay = firstDay == null ? null : firstDay.trim();
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

    public String getFyBankNo() {
        return fyBankNo;
    }

    public void setFyBankNo(String fyBankNo) {
        this.fyBankNo = fyBankNo == null ? null : fyBankNo.trim();
    }

    public String getFyMobile() {
        return fyMobile;
    }

    public void setFyMobile(String fyMobile) {
        this.fyMobile = fyMobile == null ? null : fyMobile.trim();
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

    public Boolean getBuyInsurance() {
        return buyInsurance;
    }

    public void setBuyInsurance(Boolean buyInsurance) {
        this.buyInsurance = buyInsurance;
    }

  

    public BigDecimal getMonthConsultServiceRate() {
		return monthConsultServiceRate;
	}

	public void setMonthConsultServiceRate(BigDecimal monthConsultServiceRate) {
		this.monthConsultServiceRate = monthConsultServiceRate;
	}

	public String getBankTel() {
        return bankTel;
    }

    public void setBankTel(String bankTel) {
        this.bankTel = bankTel == null ? null : bankTel.trim();
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    public String getAppStatusName() {
        return appStatusName;
    }

    public void setAppStatusName(String appStatusName) {
        this.appStatusName = appStatusName == null ? null : appStatusName.trim();
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

    public String getIsSendWk() {
        return isSendWk;
    }

    public void setIsSendWk(String isSendWk) {
        this.isSendWk = isSendWk == null ? null : isSendWk.trim();
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType == null ? null : loanType.trim();
    }

    public String getCapitalType() {
        return capitalType;
    }

    public void setCapitalType(String capitalType) {
        this.capitalType = capitalType == null ? null : capitalType.trim();
    }

    public String getAppStatusInner() {
        return appStatusInner;
    }

    public void setAppStatusInner(String appStatusInner) {
        this.appStatusInner = appStatusInner == null ? null : appStatusInner.trim();
    }

    public String getFundChannelId() {
        return fundChannelId;
    }

    public void setFundChannelId(String fundChannelId) {
        this.fundChannelId = fundChannelId == null ? null : fundChannelId.trim();
    }

    public String getFundChannelName() {
        return fundChannelName;
    }

    public void setFundChannelName(String fundChannelName) {
        this.fundChannelName = fundChannelName == null ? null : fundChannelName.trim();
    }

    public String getFinishType() {
        return finishType;
    }

    public void setFinishType(String finishType) {
        this.finishType = finishType == null ? null : finishType.trim();
    }

    public Date getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(Date finishDate) {
        this.finishDate = finishDate;
    }

    public BigDecimal getMonthInterestRate() {
        return monthInterestRate;
    }

    public void setMonthInterestRate(BigDecimal monthInterestRate) {
        this.monthInterestRate = monthInterestRate;
    }

    public BigDecimal getMonthPoundage() {
        return monthPoundage;
    }

    public void setMonthPoundage(BigDecimal monthPoundage) {
        this.monthPoundage = monthPoundage;
    }

    public BigDecimal getMonthCreditManagementFee() {
        return monthCreditManagementFee;
    }

    public void setMonthCreditManagementFee(BigDecimal monthCreditManagementFee) {
        this.monthCreditManagementFee = monthCreditManagementFee;
    }

    public Integer getOverdueDays() {
        return overdueDays;
    }

    public void setOverdueDays(Integer overdueDays) {
        this.overdueDays = overdueDays;
    }

	public String getRepaymentMethod() {
		return repaymentMethod;
	}

	public void setRepaymentMethod(String repaymentMethod) {
		this.repaymentMethod = repaymentMethod;
	}


}