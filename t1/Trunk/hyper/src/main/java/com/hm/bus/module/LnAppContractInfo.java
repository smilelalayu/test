package com.hm.bus.module;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 工单合同试算
 * @ClassName: LnAppContractInfo
 * @author dengwenjun
 * @date 2016年11月25日 下午12:05:23
 */public class LnAppContractInfo implements Serializable
{

	/** 
	 * @Fields serialVersionUID : TODO
	 */ 
	private static final long serialVersionUID = -1L;

	private Long id;

	/**
	 * 工单编号
	 */
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

	public BigDecimal getContractAmt() {
		return contractAmt;
	}

	public void setContractAmt(BigDecimal contractAmt) {
		this.contractAmt = contractAmt;
	}

	public BigDecimal getTotalFee()
	{
		return totalFee;
	}

	public void setTotalFee(BigDecimal totalFee)
	{
		this.totalFee = totalFee;
	}
}