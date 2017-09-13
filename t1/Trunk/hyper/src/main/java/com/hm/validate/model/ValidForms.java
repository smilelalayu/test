package com.hm.validate.model;

/**
 * ValidateForms entity. @author MyEclipse Persistence Tools
 */

public class ValidForms implements java.io.Serializable {

	// Fields

	/** 
     * serialVersionUID:TODO
     * 
     * @since Ver 1.0 
     */ 
        
    private static final long serialVersionUID = 4188259690354961258L;
    private Long id;
	private String actionCode;
	private Integer version;
	private String type;
	private Long ruleId;
	private String rules;
    private FormRulesJson formRulesJson ;
    private String context;
    private String postUrl;
    
    
	
	// Property accessors

	
    public String getPostUrl() {
        return postUrl;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public void setPostUrl(String postUrl) {
        this.postUrl = postUrl;
    }

    public FormRulesJson getFormRulesJson() {
        return formRulesJson;
    }

    public void setFormRulesJson(FormRulesJson formRulesJson) {
        this.formRulesJson = formRulesJson;
    }

    public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getActionCode() {
		return this.actionCode;
	}

	public void setActionCode(String actionCode) {
		this.actionCode = actionCode;
	}

	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Long getRuleId() {
		return this.ruleId;
	}

	public void setRuleId(Long ruleId) {
		this.ruleId = ruleId;
	}

	public String getRules() {
		return this.rules;
	}

	public void setRules(String rules) {
		this.rules = rules;
	}

}