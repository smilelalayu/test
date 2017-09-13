package com.hm.validate.model;

public class FormRulesJson implements java.io.Serializable{
    
    /** 
     * serialVersionUID:TODO
     * 
     * @since Ver 1.0 
     */ 
        
    private static final long serialVersionUID = -2246414401478577057L;
    private String required ; //必输字段
    private String  requiredmsg;
    private String  expressionmsg;
    private String  functionmsg;
    private String  formulamsg;
    private String number;
    private String  numbermsg;
    private String digits; //必须输入整数
    private String  digitsmsg;
    private String minlength; //输入长度最小
    private String  minlengthmsg;
    private String maxlength; // 输入长度最多
    private String  maxlengthmsg;
    private String min ;  // 输入值不能小于
    private String  minmsg;
    private String max ;   //输入值不能大于
    private String  maxmsg;
    private String remote; //使用ajax方法调用XXXX.jsp验证输入值
    private String  remotemsg;
    private String equalTo; //输入值必须和#field相同
    private String  equalTomsg;
   
    public String getRequired() {
        return required;
    }
    public void setRequired(String required) {
        this.required = required;
    }
    public String getRequiredmsg() {
        return requiredmsg;
    }
    public void setRequiredmsg(String requiredmsg) {
        this.requiredmsg = requiredmsg;
    }
    public String getExpressionmsg() {
        return expressionmsg;
    }
    public void setExpressionmsg(String expressionmsg) {
        this.expressionmsg = expressionmsg;
    }
    public String getFunctionmsg() {
        return functionmsg;
    }
    public void setFunctionmsg(String functionmsg) {
        this.functionmsg = functionmsg;
    }
    public String getFormulamsg() {
        return formulamsg;
    }
    public void setFormulamsg(String formulamsg) {
        this.formulamsg = formulamsg;
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public String getNumbermsg() {
        return numbermsg;
    }
    public void setNumbermsg(String numbermsg) {
        this.numbermsg = numbermsg;
    }
    public String getDigits() {
        return digits;
    }
    public void setDigits(String digits) {
        this.digits = digits;
    }
    public String getDigitsmsg() {
        return digitsmsg;
    }
    public void setDigitsmsg(String digitsmsg) {
        this.digitsmsg = digitsmsg;
    }
    public String getMinlength() {
        return minlength;
    }
    public void setMinlength(String minlength) {
        this.minlength = minlength;
    }
    public String getMinlengthmsg() {
        return minlengthmsg;
    }
    public void setMinlengthmsg(String minlengthmsg) {
        this.minlengthmsg = minlengthmsg;
    }
    public String getMaxlength() {
        return maxlength;
    }
    public void setMaxlength(String maxlength) {
        this.maxlength = maxlength;
    }
    public String getMaxlengthmsg() {
        return maxlengthmsg;
    }
    public void setMaxlengthmsg(String maxlengthmsg) {
        this.maxlengthmsg = maxlengthmsg;
    }
    public String getMin() {
        return min;
    }
    public void setMin(String min) {
        this.min = min;
    }
    public String getMinmsg() {
        return minmsg;
    }
    public void setMinmsg(String minmsg) {
        this.minmsg = minmsg;
    }
    public String getMax() {
        return max;
    }
    public void setMax(String max) {
        this.max = max;
    }
    public String getMaxmsg() {
        return maxmsg;
    }
    public void setMaxmsg(String maxmsg) {
        this.maxmsg = maxmsg;
    }
    public String getRemote() {
        return remote;
    }
    public void setRemote(String remote) {
        this.remote = remote;
    }
    public String getRemotemsg() {
        return remotemsg;
    }
    public void setRemotemsg(String remotemsg) {
        this.remotemsg = remotemsg;
    }
    public String getEqualTo() {
        return equalTo;
    }
    public void setEqualTo(String equalTo) {
        this.equalTo = equalTo;
    }
    public String getEqualTomsg() {
        return equalTomsg;
    }
    public void setEqualTomsg(String equalTomsg) {
        this.equalTomsg = equalTomsg;
    }
    
   
}
