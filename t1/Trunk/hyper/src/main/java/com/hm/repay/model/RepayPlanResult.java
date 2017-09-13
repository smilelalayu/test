package com.hm.repay.model;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;

import com.gep.core.util.DateUtils;

public class RepayPlanResult implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8671968312829071414L;
	
	private Integer period;
	private Date repayDate;
	private BigDecimal monRepAmt;
	private BigDecimal monRepPri;
	private BigDecimal monRepIns;
	
	private BigDecimal InsFee;
	
	public RepayPlanResult() {

	}

	public Integer getPeriod() {
		return period;
	}

	public void setPeriod(Integer period) {
		this.period = period;
	}

	public String getRepayDate() {
		return DateUtils.formatDate(repayDate, "yyyy/MM/dd");
	}
	public Date getRepayDayDate() {
		return repayDate;
	}

	public void setRepayDate(Date repayDate) {
		this.repayDate = repayDate;
	}
	
	public BigDecimal getMonRepAmt()
	{
		return monRepAmt;
	}

	public void setMonRepAmt(BigDecimal monRepAmt)
	{
		this.monRepAmt = monRepAmt;
	}

	public BigDecimal getMonRepPri()
	{
		return monRepPri;
	}

	public void setMonRepPri(BigDecimal monRepPri)
	{
		this.monRepPri = monRepPri;
	}

	public BigDecimal getMonRepIns()
	{
		return monRepIns;
	}

	public void setMonRepIns(BigDecimal monRepIns)
	{
		this.monRepIns = monRepIns;
	}

	public int getRepayDay(){
		Calendar c = Calendar.getInstance();
		c.setTime(repayDate);
		return c.get(Calendar.DAY_OF_MONTH);
	}

	public BigDecimal getInsFee() {
		return InsFee;
	}

	public void setInsFee(BigDecimal insFee) {
		InsFee = insFee;
	}
	
}
