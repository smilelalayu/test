package com.hm.appinfo.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 工单合同试算
 * @ClassName: LnAppContractInfo
 * @author Administrator
 * @date 2016年4月28日 下午12:05:23
 */
public class LnAppCalcInfo  implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1759973564017206724L;

	private Long id;

	private Long appId;

	/**
	 * 月均信用管理费
	 */
	private BigDecimal monCreditRate;

	/**
	 * 月均资询服务费
	 */
	private BigDecimal monConsultRate;

	/**
	 * 月均手续费
	 */
	private BigDecimal monServiceFee;

	/**
	 * 月还款额
	 */
	private BigDecimal monRepayAmt;

	/**
	 * 月贷款利率
	 */
	private BigDecimal monLoanRate;

	/**
	 * 期数
	 */
	private Integer periods;

	/**
	 * 商品余额
	 */
	private BigDecimal loanMoney;

	/**
	 * 自付金额
	 */
	private BigDecimal downPaymentAmount;

	/**
	 * 是否购买保险
	 */
	private Integer buyInsurance;

	/**
	 * 商品总价
	 */
	private BigDecimal amount;

	/**
	 * 首次还款日
	 */
	private Date firstDayDate;

	/**
	 * 还款日
	 */
	private String repyDay;

	/**
	 * 合同金额
	 */
	private BigDecimal contractAmt;

	/**
	 * 总费用
	 */
	private BigDecimal totalFee;
	
	/**
	 * 咨询服务费＝咨询服务费合计+手续费合计*98.5%
	 */
	private BigDecimal  consultServiceFee;
	
	/**
	 * 保障计划专款人民币＝合同金额＊担保保证金比例
	 */
	private BigDecimal securityFee;
	
	/**
	 * 保险费＝合同金额＊保险计提比例
	 */
	private BigDecimal insuranceFee;
	
	/**
	 * 手续费合计 
	 */
	private BigDecimal totalServiceFee;
	
	/**
	 * 提前结清服务费＝合同金额＊提前结清服务费比例
	 */
	private BigDecimal advanceSettleFee;
	
	/**
	 * 管理服务费＝（咨询服务费合计＋手续费总计＊98.5%）＊超能收入比例
	 */
	private BigDecimal manageFee;
	
	/**
	 * 保理服务费和预支价金比例＝（咨询服务费合计＋手续费总计＊98.5％）＊保理分成比例／商品余额
	 */
	private BigDecimal blServiceAdvanceRate;
	
	/**
	 * 超能保障计划专款人民币
	 */
  	private BigDecimal ensureFeeCn;
  	
  	/**
  	 * 超能保险费
  	 */
  	private BigDecimal insuranceFeeCn;
  	
  	/**
	 * 贷后管理费
	 */
	private BigDecimal loanAfterManageFee;
	
	/**
	 * 月均咨询服务费
	 */
	private BigDecimal monConsultFee;
	/**
	 * 月均信用管理费（月均保障费）
	 */
	private BigDecimal monCreditFee;
	/**
	 *	手续费人民币 
	 */
	private BigDecimal poundageFee;
	/**
	 * 仲裁对接技术服务费人民币
	 */
	private BigDecimal zzToTechnologyServiceFee;
	/**
	 * 玖富合同金额
	 * @return
	 */
	private BigDecimal contractAmtJF;

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public Long getAppId()
	{
		return appId;
	}

	public void setAppId(Long appId)
	{
		this.appId = appId;
	}

	public Integer getPeriods()
	{
		return periods;
	}

	public void setPeriods(Integer periods)
	{
		this.periods = periods;
	}

	public BigDecimal getLoanMoney()
	{
		return loanMoney;
	}

	public void setLoanMoney(BigDecimal loanMoney)
	{
		this.loanMoney = loanMoney;
	}

	public BigDecimal getDownPaymentAmount()
	{
		return downPaymentAmount;
	}

	public void setDownPaymentAmount(BigDecimal downPaymentAmount)
	{
		this.downPaymentAmount = downPaymentAmount;
	}

	public Integer getBuyInsurance()
	{
		return buyInsurance;
	}

	public void setBuyInsurance(Integer buyInsurance)
	{
		this.buyInsurance = buyInsurance;
	}

	public BigDecimal getAmount()
	{
		return amount;
	}

	public void setAmount(BigDecimal amount)
	{
		this.amount = amount;
	}

	public Date getFirstDayDate()
	{
		return firstDayDate;
	}

	public void setFirstDayDate(Date firstDayDate)
	{
		this.firstDayDate = firstDayDate;
	}

	public String getRepyDay()
	{
		return repyDay;
	}

	public void setRepyDay(String repyDay)
	{
		this.repyDay = repyDay == null ? null : repyDay.trim();
	}

	public BigDecimal getTotalFee()
	{
		return totalFee;
	}

	public void setTotalFee(BigDecimal totalFee)
	{
		this.totalFee = totalFee;
	}

	public BigDecimal getConsultServiceFee() {
		return consultServiceFee;
	}

	public void setConsultServiceFee(BigDecimal consultServiceFee) {
		this.consultServiceFee = consultServiceFee;
	}

	public BigDecimal getInsuranceFee() {
		return insuranceFee;
	}

	public void setInsuranceFee(BigDecimal insuranceFee) {
		this.insuranceFee = insuranceFee;
	}

	public BigDecimal getAdvanceSettleFee() {
		return advanceSettleFee;
	}

	public void setAdvanceSettleFee(BigDecimal advanceSettleFee) {
		this.advanceSettleFee = advanceSettleFee;
	}

	public BigDecimal getManageFee() {
		return manageFee;
	}

	public void setManageFee(BigDecimal manageFee) {
		this.manageFee = manageFee;
	}

	public BigDecimal getMonCreditRate() {
		return monCreditRate;
	}

	public void setMonCreditRate(BigDecimal monCreditRate) {
		this.monCreditRate = monCreditRate;
	}

	public BigDecimal getMonConsultRate() {
		return monConsultRate;
	}

	public void setMonConsultRate(BigDecimal monConsultRate) {
		this.monConsultRate = monConsultRate;
	}

	public BigDecimal getMonServiceFee() {
		return monServiceFee;
	}

	public void setMonServiceFee(BigDecimal monServiceFee) {
		this.monServiceFee = monServiceFee;
	}

	public BigDecimal getMonRepayAmt() {
		return monRepayAmt;
	}

	public void setMonRepayAmt(BigDecimal monRepayAmt) {
		this.monRepayAmt = monRepayAmt;
	}

	public BigDecimal getMonLoanRate() {
		return monLoanRate;
	}

	public void setMonLoanRate(BigDecimal monLoanRate) {
		this.monLoanRate = monLoanRate;
	}

	public BigDecimal getContractAmt() {
		return contractAmt;
	}

	public void setContractAmt(BigDecimal contractAmt) {
		this.contractAmt = contractAmt;
	}

	public BigDecimal getSecurityFee() {
		return securityFee;
	}

	public void setSecurityFee(BigDecimal securityFee) {
		this.securityFee = securityFee;
	}

	public BigDecimal getTotalServiceFee() {
		return totalServiceFee;
	}

	public void setTotalServiceFee(BigDecimal totalServiceFee) {
		this.totalServiceFee = totalServiceFee;
	}

	public BigDecimal getBlServiceAdvanceRate() {
		return blServiceAdvanceRate;
	}

	public void setBlServiceAdvanceRate(BigDecimal blServiceAdvanceRate) {
		this.blServiceAdvanceRate = blServiceAdvanceRate;
	}

	public BigDecimal getEnsureFeeCn() {
		return ensureFeeCn;
	}

	public void setEnsureFeeCn(BigDecimal ensureFeeCn) {
		this.ensureFeeCn = ensureFeeCn;
	}

	public BigDecimal getInsuranceFeeCn() {
		return insuranceFeeCn;
	}

	public void setInsuranceFeeCn(BigDecimal insuranceFeeCn) {
		this.insuranceFeeCn = insuranceFeeCn;
	}

	public BigDecimal getLoanAfterManageFee() {
		return loanAfterManageFee;
	}

	public void setLoanAfterManageFee(BigDecimal loanAfterManageFee) {
		this.loanAfterManageFee = loanAfterManageFee;
	}

	public BigDecimal getMonConsultFee() {
		return monConsultFee;
	}

	public void setMonConsultFee(BigDecimal monConsultFee) {
		this.monConsultFee = monConsultFee;
	}

	public BigDecimal getMonCreditFee() {
		return monCreditFee;
	}

	public void setMonCreditFee(BigDecimal monCreditFee) {
		this.monCreditFee = monCreditFee;
	}

	public BigDecimal getPoundageFee() {
		return poundageFee;
	}

	public void setPoundageFee(BigDecimal poundageFee) {
		this.poundageFee = poundageFee;
	}

	public BigDecimal getZzToTechnologyServiceFee() {
		return zzToTechnologyServiceFee;
	}

	public void setZzToTechnologyServiceFee(BigDecimal zzToTechnologyServiceFee) {
		this.zzToTechnologyServiceFee = zzToTechnologyServiceFee;
	}

	public BigDecimal getContractAmtJF() {
		return contractAmtJF;
	}

	public void setContractAmtJF(BigDecimal contractAmtJF) {
		this.contractAmtJF = contractAmtJF;
	}
	
}