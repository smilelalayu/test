package com.hm.appinfo.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.hm.repay.model.RepayPlanResult;
import com.hm.repay.model.RepayPlanVo;

public class LnAppReq implements Serializable
{
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

	/**销售代表*/
	private Long sa;

	/**工单状态*/
	private String appState;

	/**申请金额*/
	private BigDecimal loanMoney;

	/**用户评价*/
	private String userEvaluate;

	/**生成合同时间*/
	private Date createContTime;
	
	/**机构组织编码*/
	private String orgCode;

	/**客户id*/
	private Long clientId;

	/**商品总价*/
	private BigDecimal amount;

	/**首付金额*/
	private BigDecimal downPaymentAmount;	

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

	/**SA备注*/
	private String saRemark;

	/**富友账户名*/
	private String fyAccountName;

	/**富友账号*/
	private String fyAccountNo;

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

	/**购买保险*/
	private Boolean buyInsurance;

	/**还款方式*/
	private String repaymentWay;

	/**证明材料提示信息*/
	private String attachTipInfo;

	/**银行开户手机号*/
	private String bankTel;

	/**商品类型*/
	private String goodsType;

	/**客户名称 申请人*/
	private String customerName;

	/**录入工单信息用户名*/
	private String saName;

	/**工单状态名称*/
	private String appStatusName;
	
	/**
	 * 贷款产品
	 */
	private List<LnAppGoodsReq> goodsReqs;
	
	private String jsonGoodsReqs;
	
	/**
	 * 合同信息
	 */
	private RepayPlanVo repayPlanVo;
	
	private String jsonRepayPlan;
	
	
	/**
	 * 还款记录
	 */
	private List<RepayPlanResult> repayPlanResults;
	
	/**
	 * 职业
	 */
	private String careerType;
	
	/**
	 * 省
	 */
	private String provinceId;
	 
	/**
	 * 市 
	 */
	private String cityId;
	
	/**
	 * 地区
	 */
	private String districtId;
	
	//期数
	private Integer periods;
	
	private BigDecimal discountRate;
	
	private BigDecimal reserveRate;
	
	private BigDecimal monthlyPremiumRate;
	
	private Double interestRate;
	
	/**合同年利率*/
	private BigDecimal contrAnnualInterestRate;
	
	/**预计毕业年份*/
    private String expectGraduateYear;
    
    /**修改人*/
	private String modifiedby;

	/**修改时间*/
	private Date modifiedon;

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
		this.firmName = firmName;
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
		this.shopName = shopName;
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
		this.productSeriesName = productSeriesName;
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
		this.productName = productName;
	}

	public String getCardId() {
		return cardId;
	}

	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
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
		this.appState = appState;
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
		this.userEvaluate = userEvaluate;
	}

	public Date getCreateContTime() {
		return createContTime;
	}

	public void setCreateContTime(Date createContTime) {
		this.createContTime = createContTime;
	}

	public String getOrgCode() {
		return orgCode;
	}

	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	public Long getClientId() {
		return clientId;
	}

	public void setClientId(Long clientId) {
		this.clientId = clientId;
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

	public String getRepaymentType() {
		return repaymentType;
	}

	public void setRepaymentType(String repaymentType) {
		this.repaymentType = repaymentType;
	}

	public String getRepaymentAcc() {
		return repaymentAcc;
	}

	public void setRepaymentAcc(String repaymentAcc) {
		this.repaymentAcc = repaymentAcc;
	}

	public String getRepaymentAccName() {
		return repaymentAccName;
	}

	public void setRepaymentAccName(String repaymentAccName) {
		this.repaymentAccName = repaymentAccName;
	}

	public String getRepaymentBank() {
		return repaymentBank;
	}

	public void setRepaymentBank(String repaymentBank) {
		this.repaymentBank = repaymentBank;
	}

	public String getRepaymentCity() {
		return repaymentCity;
	}

	public void setRepaymentCity(String repaymentCity) {
		this.repaymentCity = repaymentCity;
	}

	public String getPaymentAcc() {
		return paymentAcc;
	}

	public void setPaymentAcc(String paymentAcc) {
		this.paymentAcc = paymentAcc;
	}

	public String getPaymentAccName() {
		return paymentAccName;
	}

	public void setPaymentAccName(String paymentAccName) {
		this.paymentAccName = paymentAccName;
	}

	public String getPaymentBank() {
		return paymentBank;
	}

	public void setPaymentBank(String paymentBank) {
		this.paymentBank = paymentBank;
	}

	public String getPaymentSubBank() {
		return paymentSubBank;
	}

	public void setPaymentSubBank(String paymentSubBank) {
		this.paymentSubBank = paymentSubBank;
	}

	public String getPaymentCity() {
		return paymentCity;
	}

	public void setPaymentCity(String paymentCity) {
		this.paymentCity = paymentCity;
	}

	public String getRepaymentSubBank() {
		return repaymentSubBank;
	}

	public void setRepaymentSubBank(String repaymentSubBank) {
		this.repaymentSubBank = repaymentSubBank;
	}

	public String getSaRemark() {
		return saRemark;
	}

	public void setSaRemark(String saRemark) {
		this.saRemark = saRemark;
	}

	public String getFyAccountName() {
		return fyAccountName;
	}

	public void setFyAccountName(String fyAccountName) {
		this.fyAccountName = fyAccountName;
	}

	public String getFyAccountNo() {
		return fyAccountNo;
	}

	public void setFyAccountNo(String fyAccountNo) {
		this.fyAccountNo = fyAccountNo;
	}

	public String getCustType() {
		return custType;
	}

	public void setCustType(String custType) {
		this.custType = custType;
	}

	public String getSelfRepayName() {
		return selfRepayName;
	}

	public void setSelfRepayName(String selfRepayName) {
		this.selfRepayName = selfRepayName;
	}

	public String getSelfRepayAccount() {
		return selfRepayAccount;
	}

	public void setSelfRepayAccount(String selfRepayAccount) {
		this.selfRepayAccount = selfRepayAccount;
	}

	public String getSelfRepayBank() {
		return selfRepayBank;
	}

	public void setSelfRepayBank(String selfRepayBank) {
		this.selfRepayBank = selfRepayBank;
	}

	public String getCreatedby() {
		return createdby;
	}

	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}

	public Date getCreatedon() {
		return createdon;
	}

	public void setCreatedon(Date createdon) {
		this.createdon = createdon;
	}

	public Boolean getBuyInsurance() {
		return buyInsurance;
	}

	public void setBuyInsurance(Boolean buyInsurance) {
		this.buyInsurance = buyInsurance;
	}

	public String getRepaymentWay() {
		return repaymentWay;
	}

	public void setRepaymentWay(String repaymentWay) {
		this.repaymentWay = repaymentWay;
	}

	public String getAttachTipInfo() {
		return attachTipInfo;
	}

	public void setAttachTipInfo(String attachTipInfo) {
		this.attachTipInfo = attachTipInfo;
	}

	public String getBankTel() {
		return bankTel;
	}

	public void setBankTel(String bankTel) {
		this.bankTel = bankTel;
	}

	public String getGoodsType() {
		return goodsType;
	}

	public void setGoodsType(String goodsType) {
		this.goodsType = goodsType;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getSaName() {
		return saName;
	}

	public void setSaName(String saName) {
		this.saName = saName;
	}

	public String getAppStatusName() {
		return appStatusName;
	}

	public void setAppStatusName(String appStatusName) {
		this.appStatusName = appStatusName;
	}

	public List<LnAppGoodsReq> getGoodsReqs() {
		return goodsReqs;
	}

	public void setGoodsReqs(List<LnAppGoodsReq> goodsReqs) {
		this.goodsReqs = goodsReqs;
	}


	public RepayPlanVo getRepayPlanVo() {
		return repayPlanVo;
	}

	public void setRepayPlanVo(RepayPlanVo repayPlanVo) {
		this.repayPlanVo = repayPlanVo;
	}

	public List<RepayPlanResult> getRepayPlanResults() {
		return repayPlanResults;
	}

	public void setRepayPlanResults(List<RepayPlanResult> repayPlanResults) {
		this.repayPlanResults = repayPlanResults;
	}	

	public String getCareerType()
	{
		return careerType;
	}

	public void setCareerType(String careerType)
	{
		this.careerType = careerType;
	}

	public String getProvinceId()
	{
		return provinceId;
	}

	public void setProvinceId(String provinceId)
	{
		this.provinceId = provinceId;
	}

	public String getCityId()
	{
		return cityId;
	}

	public void setCityId(String cityId)
	{
		this.cityId = cityId;
	}

	public String getDistrictId()
	{
		return districtId;
	}

	public void setDistrictId(String districtId)
	{
		this.districtId = districtId;
	}

	public Integer getPeriods()
	{
		return periods;
	}

	public void setPeriods(Integer periods)
	{
		this.periods = periods;
	}

	public String getJsonGoodsReqs()
	{
		return jsonGoodsReqs;
	}

	public void setJsonGoodsReqs(String jsonGoodsReqs)
	{
		this.jsonGoodsReqs = jsonGoodsReqs;
	}

	public String getJsonRepayPlan()
	{
		return jsonRepayPlan;
	}

	public void setJsonRepayPlan(String jsonRepayPlan)
	{
		this.jsonRepayPlan = jsonRepayPlan;
	}

	public BigDecimal getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(BigDecimal discountRate) {
		this.discountRate = discountRate;
	}
	
	public BigDecimal getReserveRate() {
		return reserveRate;
	}

	public void setReserveRate(BigDecimal reserveRate) {
		this.reserveRate = reserveRate;
	}

	public BigDecimal getMonthlyPremiumRate() {
		return monthlyPremiumRate;
	}

	public void setMonthlyPremiumRate(BigDecimal monthlyPremiumRate) {
		this.monthlyPremiumRate = monthlyPremiumRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}

	public BigDecimal getContrAnnualInterestRate() {
		return contrAnnualInterestRate;
	}

	public void setContrAnnualInterestRate(BigDecimal contrAnnualInterestRate) {
		this.contrAnnualInterestRate = contrAnnualInterestRate;
	}

	public String getExpectGraduateYear() {
		return expectGraduateYear;
	}

	public void setExpectGraduateYear(String expectGraduateYear) {
		this.expectGraduateYear = expectGraduateYear;
	}

	public String getModifiedby() {
		return modifiedby;
	}

	public void setModifiedby(String modifiedby) {
		this.modifiedby = modifiedby;
	}

	public Date getModifiedon() {
		return modifiedon;
	}

	public void setModifiedon(Date modifiedon) {
		this.modifiedon = modifiedon;
	}
}
