package com.hm.repay.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * 试算结信息
 * @author Administrator
 *
 */
public class RepayPlanVo implements java.io.Serializable
{

	private static final long serialVersionUID = 1L;

	private BigDecimal principal;// 借款本金 传入参数
	private Integer terms;// 借款期数 传入参数
	private Date payDate;// 放款日期 传入参数
	private BigDecimal yearRate;// 年贷款利率（等额本息）传入参数
	private BigDecimal totRate;// 月平息费率 传入参数
	private BigDecimal trDiscount; // 月平息费率 折扣 传入参数
	private Boolean pchIns;// 是否购买保险 传入参数
	private BigDecimal insRate;// 保险费率 传入参数
	private BigDecimal infoFeeRate;// 信用管理费率 传入参数
	private String capitalType;//资金类型
	// 还款计划计算结果
	private BigDecimal npvAmt;// 合同金额 没有计算 传出参数
	private BigDecimal monRate;// 合同月利率（等额本息） 传出参数
	private BigDecimal consultFee; // 咨询服务费合计 传出参数
	private BigDecimal infoFee; // 信用管理费 传出参数
	private BigDecimal totalFee; // 总费用 传出参数
	private BigDecimal monRepAmt; // 月还款额
	private String firstRepayDate;// 首次还款日期
	private String monRepayDay;// 月还款日

	private BigDecimal monthlyFee;// 月均手续费 传出参数
	private BigDecimal monInfoFeeRate;// 月均信用管理费率 传出参数
	private BigDecimal monConsultFeeRate;// 月均资询服务费率 传出参数
	
	private BigDecimal  consultServiceFee;//咨询服务费＝咨询服务费合计+手续费合计*98.5%
	private BigDecimal ensureFee;//保障计划专款人民币＝合同金额＊担保保证金比例
	private BigDecimal insuranceFee;//保险费＝合同金额＊保险计提比例
	private BigDecimal poundageTotal;//手续费合计 
	private BigDecimal advanceSettleFee;//提前结清服务费＝合同金额＊提前结清服务费比例
	private BigDecimal manageFee;//管理服务费＝（咨询服务费合计＋手续费总计＊98.5%）＊超能收入比例
	private BigDecimal blserviceFee;//保理服务费和预支价金比例＝（咨询服务费合计＋手续费总计＊98.5％）＊保理分成比例／商品余额

	List<RepayPlanResult> results = new ArrayList<RepayPlanResult>();

	public BigDecimal getPrincipal()
	{
		return principal;
	}

	public void setPrincipal(BigDecimal principal)
	{
		this.principal = principal;
	}

	public Integer getTerms()
	{
		return terms;
	}

	public void setTerms(Integer terms)
	{
		this.terms = terms;
	}

	public Date getPayDate()
	{
		return payDate;
	}

	public void setPayDate(Date payDate)
	{
		this.payDate = payDate;
	}

	public BigDecimal getYearRate()
	{
		return yearRate;
	}

	public void setYearRate(BigDecimal yearRate)
	{
		this.yearRate = yearRate;
	}

	public BigDecimal getTotRate()
	{
		return totRate;
	}

	public void setTotRate(BigDecimal totRate)
	{
		this.totRate = totRate;
	}

	public BigDecimal getTrDiscount()
	{
		return trDiscount;
	}

	public void setTrDiscount(BigDecimal trDiscount)
	{
		this.trDiscount = trDiscount;
	}

	public void setPchIns(Boolean pchIns)
	{
		this.pchIns = pchIns;
	}

	public BigDecimal getInsRate()
	{
		return insRate;
	}

	public void setInsRate(BigDecimal insRate)
	{
		this.insRate = insRate;
	}

	public BigDecimal getInfoFeeRate()
	{
		return infoFeeRate;
	}

	public void setInfoFeeRate(BigDecimal infoFeeRate)
	{
		this.infoFeeRate = infoFeeRate;
	}

	public String getCapitalType() {
		return capitalType;
	}

	public void setCapitalType(String capitalType) {
		this.capitalType = capitalType;
	}

	public BigDecimal getNpvAmt()
	{
		return npvAmt;
	}

	public void setNpvAmt(BigDecimal npvAmt)
	{
		this.npvAmt = npvAmt;
	}

	public BigDecimal getMonRate()
	{
		return monRate;
	}

	public void setMonRate(BigDecimal monRate)
	{
		this.monRate = monRate;
	}

	public BigDecimal getInfoFee()
	{
		return infoFee;
	}

	public void setInfoFee(BigDecimal infoFee)
	{
		this.infoFee = infoFee;
	}

	public BigDecimal getTotalFee()
	{
		return totalFee;
	}

	public void setTotalFee(BigDecimal totalFee)
	{
		this.totalFee = totalFee;
	}

	public BigDecimal getConsultFee()
	{
		return consultFee;
	}

	public void setConsultFee(BigDecimal consultFee)
	{
		this.consultFee = consultFee;
	}

	public Boolean getPchIns()
	{
		return pchIns;
	}

	public String getFirstRepayDate()
	{
		return firstRepayDate;
	}

	public void setFirstRepayDate(String firstRepayDate)
	{
		this.firstRepayDate = firstRepayDate;
	}

	public BigDecimal getMonRepAmt()
	{
		return monRepAmt;
	}

	public void setMonRepAmt(BigDecimal monRepAmt)
	{
		this.monRepAmt = monRepAmt;
	}

	public String getMonRepayDay()
	{
		return monRepayDay;
	}

	public void setMonRepayDay(String monRepayDay)
	{
		this.monRepayDay = monRepayDay;
	}

	public List<RepayPlanResult> getResults()
	{
		return results;
	}

	public void setResults(List<RepayPlanResult> results)
	{
		this.results = results;
	}

	public BigDecimal getMonthlyFee()
	{
		return monthlyFee;
	}

	public void setMonthlyFee(BigDecimal monthlyFee)
	{
		this.monthlyFee = monthlyFee;
	}

	public BigDecimal getMonInfoFeeRate()
	{
		return monInfoFeeRate;
	}

	public void setMonInfoFeeRate(BigDecimal monInfoFeeRate)
	{
		this.monInfoFeeRate = monInfoFeeRate;
	}

	public BigDecimal getConsultServiceFee() {
		return consultServiceFee;
	}

	public void setConsultServiceFee(BigDecimal consultServiceFee) {
		this.consultServiceFee = consultServiceFee;
	}

	public BigDecimal getEnsureFee() {
		return ensureFee;
	}

	public void setEnsureFee(BigDecimal ensureFee) {
		this.ensureFee = ensureFee;
	}

	public BigDecimal getInsuranceFee() {
		return insuranceFee;
	}

	public void setInsuranceFee(BigDecimal insuranceFee) {
		this.insuranceFee = insuranceFee;
	}

	public BigDecimal getPoundageTotal() {
		return poundageTotal;
	}

	public void setPoundageTotal(BigDecimal poundageTotal) {
		this.poundageTotal = poundageTotal;
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

	public BigDecimal getBlserviceFee() {
		return blserviceFee;
	}

	public void setBlserviceFee(BigDecimal blserviceFee) {
		this.blserviceFee = blserviceFee;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public BigDecimal getMonConsultFeeRate()
	{
		return monConsultFeeRate;
	}

	public void setMonConsultFeeRate(BigDecimal monConsultFeeRate)
	{
		this.monConsultFeeRate = monConsultFeeRate;
	}

	
}
