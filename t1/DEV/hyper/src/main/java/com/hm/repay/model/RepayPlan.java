package com.hm.repay.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class RepayPlan {

	private BigDecimal principal;// 借款本金 传入参数
	private Integer terms;// 借款期数 传入参数
	private Date payDate;// 放款日期 传入参数
	private BigDecimal yearRate;// 年贷款利率（等额本息）传入参数
	private BigDecimal totRate;// 月平息费率 传入参数
	private BigDecimal trDiscount; // 月平息费率 折扣 传入参数
	private Boolean pchIns;// 是否购买保险 传入参数
	private BigDecimal insRate;// 保险费率 传入参数
	private BigDecimal infoFeeRate;// 信用管理费率 传入参数
	//add by hewei 2016/12/19
	private BigDecimal  assureBondRate;//担保保证金比例
	private BigDecimal  settleBondRate;//提前结清保证金比例
	private BigDecimal  safeAccruedRate;//保险计提比例
	private BigDecimal  cnIncomeRate;//超能收入比例
	private BigDecimal  blIncomeRate;//保理收入比例
	private BigDecimal  bjIncomeRate;//北京收入比例
	private String capitalType;//资金类型
	private String busProductId;//北京产品号
	
	// 还款计划计算结果
	private BigDecimal npvAmt;// 合同金额 没有计算 传出参数
	private BigDecimal monRate;// 合同月利率（等额本息） 传出参数
	private BigDecimal consultFee; // 月均资询服务费率=咨询服务费合计/商品余额/分期期数  传出参数
	private BigDecimal infoFee; // 月均信用管理费率=信用管理费合计/商品余额/分期期数  传出参数
	private BigDecimal totalFee; // 总费用 传出参数
	private String firstDay; // 首个还款日
	private BigDecimal monRepAmt;// 每月还款额
	private String repyDay;//还款日
	private Date firstDayDate; //首个还款日
	private Date lastDayDate;//最后还款日
	private BigDecimal monthlyFee;//月均手续费	
	//Add By devxyy 20151105 Strat
	private BigDecimal consultFeeByMon; // 月均资询服务费
	private BigDecimal creditManageFeeByMon; // 月均信用管理费
	//Add By devxyy 20151105 end	
	private String firstRepayDate;// 首次还款日期
	private String monRepayDay;// 月还款日
	//add by hewei 2016/12/19
	private BigDecimal  consultServiceFee;//咨询服务费＝咨询服务费合计+手续费合计*98.5%
	private BigDecimal ensureFee;//保障计划专款人民币＝合同金额＊担保保证金比例
	private BigDecimal insuranceFee;//保险费＝合同金额＊保险计提比例
	private BigDecimal poundageTotal;//手续费合计 
	private BigDecimal advanceSettleFee;//提前结清服务费＝合同金额＊提前结清服务费比例
	private BigDecimal manageFee;//管理服务费＝（咨询服务费合计＋手续费总计＊98.5%）＊超能收入比例
	private BigDecimal blserviceFee;//保理服务费和预支价金比例＝（咨询服务费合计＋手续费总计＊98.5％）＊保理分成比例／商品余额
	
	private boolean infoChangesign;//现金贷和pos贷银行卡账户是否一致的判断标识，默认为false
	private List<RepayPlanResult> results;

	public String getBusProductId() {
		return busProductId;
	}

	public void setBusProductId(String busProductId) {
		this.busProductId = busProductId;
	}

	public boolean isInfoChangesign() {
		return infoChangesign;
	}

	public void setInfoChangesign(boolean infoChangesign) {
		this.infoChangesign = infoChangesign;
	}

	public BigDecimal getBjIncomeRate() {
		return bjIncomeRate;
	}

	public void setBjIncomeRate(BigDecimal bjIncomeRate) {
		this.bjIncomeRate = bjIncomeRate;
	}

	public BigDecimal getBlserviceFee() {
		return blserviceFee;
	}

	public void setBlserviceFee(BigDecimal blserviceFee) {
		this.blserviceFee = blserviceFee;
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

	public BigDecimal getAssureBondRate() {
		return assureBondRate;
	}

	public void setAssureBondRate(BigDecimal assureBondRate) {
		this.assureBondRate = assureBondRate;
	}

	public BigDecimal getSettleBondRate() {
		return settleBondRate;
	}

	public void setSettleBondRate(BigDecimal settleBondRate) {
		this.settleBondRate = settleBondRate;
	}

	public BigDecimal getSafeAccruedRate() {
		return safeAccruedRate;
	}

	public void setSafeAccruedRate(BigDecimal safeAccruedRate) {
		this.safeAccruedRate = safeAccruedRate;
	}

	public BigDecimal getCnIncomeRate() {
		return cnIncomeRate;
	}

	public void setCnIncomeRate(BigDecimal cnIncomeRate) {
		this.cnIncomeRate = cnIncomeRate;
	}

	public BigDecimal getBlIncomeRate() {
		return blIncomeRate;
	}

	public void setBlIncomeRate(BigDecimal blIncomeRate) {
		this.blIncomeRate = blIncomeRate;
	}
	
	public String getCapitalType() {
		return capitalType;
	}

	public void setCapitalType(String capitalType) {
		this.capitalType = capitalType;
	}

	public BigDecimal getMonthlyFee() {
		return monthlyFee;
	}

	public void setMonthlyFee(BigDecimal monthlyFee) {
		this.monthlyFee = monthlyFee;
	}

	

	public BigDecimal getPrincipal() {
		return principal;
	}

	public void setPrincipal(BigDecimal principal) {
		this.principal = principal;
	}

	public Integer getTerms() {
		return terms;
	}

	public void setTerms(Integer terms) {
		this.terms = terms;
	}

	public Date getPayDate() {
		return payDate;
	}

	public void setPayDate(Date payDate) {
		this.payDate = payDate;
	}

	public BigDecimal getYearRate() {
		return yearRate;
	}

	public void setYearRate(BigDecimal yearRate) {
		this.yearRate = yearRate;
	}

	public BigDecimal getTotRate() {
		return totRate;
	}

	public void setTotRate(BigDecimal totRate) {
		this.totRate = totRate;
	}

	public BigDecimal getTrDiscount() {
		return trDiscount;
	}

	public void setTrDiscount(BigDecimal trDiscount) {
		this.trDiscount = trDiscount;
	}

	public Boolean isPchIns() {
		return pchIns;
	}

	public void setPchIns(Boolean pchIns) {
		this.pchIns = pchIns;
	}

	public BigDecimal getInsRate() {
		return insRate;
	}

	public void setInsRate(BigDecimal insRate) {
		this.insRate = insRate;
	}

	public BigDecimal getInfoFeeRate() {
		return infoFeeRate;
	}

	public void setInfoFeeRate(BigDecimal infoFeeRate) {
		this.infoFeeRate = infoFeeRate;
	}

	public List<RepayPlanResult> getResults() {
		return results;
	}

	public void setResults(List<RepayPlanResult> results) {
		this.results = results;
	}

	public BigDecimal getNpvAmt() {
		return npvAmt;
	}

	public void setNpvAmt(BigDecimal npvAmt) {
		this.npvAmt = npvAmt;
	}

	public BigDecimal getMonRate() {
		return monRate;
	}

	public void setMonRate(BigDecimal monRate) {
		this.monRate = monRate;
	}

	public BigDecimal getInfoFee() {
		return infoFee;
	}

	public void setInfoFee(BigDecimal infoFee) {
		this.infoFee = infoFee;
	}

	public BigDecimal getTotalFee() {
		return totalFee;
	}

	public void setTotalFee(BigDecimal totalFee) {
		this.totalFee = totalFee;
	}

	public BigDecimal getConsultFee() {
		return consultFee;
	}

	public void setConsultFee(BigDecimal consultFee) {
		this.consultFee = consultFee;
	}

	public Boolean getPchIns() {
		return pchIns;
	}

	public String getFirstDay() {
		if(firstDay == null){
			firstDay = results == null || results.isEmpty() ? null :
				results.get(0).getRepayDate();
		}
		return firstDay;
	}

	public void setFirstDay(String firstDay) {
		this.firstDay = firstDay;
	}

	public BigDecimal getMonRepAmt() {
		if(monRepAmt == null){
			monRepAmt = results == null || results.isEmpty() ? null :
				results.get(0).getMonRepAmt();
		}
		return monRepAmt;
	}

	public void setMonRepAmt(BigDecimal monRepAmt) {
		this.monRepAmt = monRepAmt;
	}

	public String getRepyDay() {
		if(repyDay == null){
			repyDay = results == null || results.isEmpty() ? null :
				results.get(0).getRepayDay()+"";
		}
		return repyDay;
	}

	public void setRepyDay(String repyDay) {
		this.repyDay = repyDay;
	}

	public Date getFirstDayDate() {
		if(firstDayDate == null){
			firstDayDate = results == null || results.isEmpty() ? null :
				results.get(0).getRepayDayDate();
		}
		return firstDayDate;
	}

	public void setFirstDayDate(Date firstDayDate) {
		this.firstDayDate = firstDayDate;
	}

	public Date getLastDayDate() {
		if(lastDayDate == null){
			lastDayDate = results == null || results.isEmpty() ? null :
				results.get(results.size()-1).getRepayDayDate();
		}
		return lastDayDate;
	}

	public void setLastDayDate(Date lastDayDate) {
		this.lastDayDate = lastDayDate;
	}

	public BigDecimal getConsultFeeByMon() {
		return consultFeeByMon;
	}

	public void setConsultFeeByMon(BigDecimal consultFeeByMon) {
		this.consultFeeByMon = consultFeeByMon;
	}

	public BigDecimal getCreditManageFeeByMon() {
		return creditManageFeeByMon;
	}

	public void setCreditManageFeeByMon(BigDecimal creditManageFeeByMon) {
		this.creditManageFeeByMon = creditManageFeeByMon;
	}

	public String getFirstRepayDate() {
		return firstRepayDate;
	}

	public void setFirstRepayDate(String firstRepayDate) {
		this.firstRepayDate = firstRepayDate;
	}

	public String getMonRepayDay() {
		return monRepayDay;
	}

	public void setMonRepayDay(String monRepayDay) {
		this.monRepayDay = monRepayDay;
	}
	
	@Override
	public String toString() {
		return "RepayPlan [principal=" + principal + ", terms=" + terms + ", payDate=" + payDate + ", yearRate="
				+ yearRate + ", totRate=" + totRate + ", trDiscount=" + trDiscount + ", pchIns=" + pchIns + ", insRate="
				+ insRate + ", infoFeeRate=" + infoFeeRate + ", assureBondRate=" + assureBondRate + ", settleBondRate="
				+ settleBondRate + ", safeAccruedRate=" + safeAccruedRate + ", cnIncomeRate=" + cnIncomeRate
				+ ", blIncomeRate=" + blIncomeRate + ", npvAmt=" + npvAmt + ", monRate=" + monRate + ", consultFee="
				+ consultFee + ", infoFee=" + infoFee + ", totalFee=" + totalFee + ", firstDay=" + firstDay
				+ ", monRepAmt=" + monRepAmt + ", repyDay=" + repyDay + ", firstDayDate=" + firstDayDate
				+ ", lastDayDate=" + lastDayDate + ", monthlyFee=" + monthlyFee + ", consultFeeByMon=" + consultFeeByMon
				+ ", creditManageFeeByMon=" + creditManageFeeByMon + ", firstRepayDate=" + firstRepayDate
				+ ", monRepayDay=" + monRepayDay + ", consultServiceFee=" + consultServiceFee + ", ensureFee="
				+ ensureFee + ", insuranceFee=" + insuranceFee + ", poundageTotal=" + poundageTotal
				+ ", advanceSettleFee=" + advanceSettleFee + ", manageFee=" + manageFee + ", results=" + results + "]";
	}

	
}
