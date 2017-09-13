package com.hm.validate.model;

import java.util.Date;

/**
 * ValidateRules entity. @author MyEclipse Persistence Tools
 */

public class ValidRules implements java.io.Serializable {

	// Fields

	/** 
     * serialVersionUID:TODO
     * 
     * @since Ver 1.0 
     */ 
        
    private static final long serialVersionUID = -5099674772530514275L;
    private Long id;
	private String ruleCode;
	private String ruleName;
	private String expression;
	private String function;
	private String formula;
	private String lastOper;
	 private Date lastUpdate;

	

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRuleCode() {
		return this.ruleCode;
	}

	public void setRuleCode(String ruleCode) {
		this.ruleCode = ruleCode;
	}

	public String getRuleName() {
		return this.ruleName;
	}

	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}

	public String getExpression() {
		return this.expression;
	}

	public void setExpression(String expression) {
		this.expression = expression;
	}

	public String getFunction() {
		return this.function;
	}

	public void setFunction(String function) {
		this.function = function;
	}

	public String getFormula() {
		return this.formula;
	}

	public void setFormula(String formula) {
		this.formula = formula;
	}

	public String getLastOper() {
		return this.lastOper;
	}

	public void setLastOper(String lastOper) {
		this.lastOper = lastOper;
	}

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }


}