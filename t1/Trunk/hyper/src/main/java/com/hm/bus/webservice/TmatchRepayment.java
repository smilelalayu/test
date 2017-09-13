
package com.hm.bus.webservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>tmatchRepayment complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="tmatchRepayment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="appId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="interest" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="planRepayAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="planRepayDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="principal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="punishAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="repayDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="repayInterest" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="repayPrincipal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="repayPunish" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="repayRelAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="repayRisk" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="repayStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="repayViolate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="repaymentId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="riskAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="stage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="updatetime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="violateAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tmatchRepayment", propOrder = {
    "appId",
    "interest",
    "planRepayAmt",
    "planRepayDate",
    "principal",
    "punishAmt",
    "repayDate",
    "repayInterest",
    "repayPrincipal",
    "repayPunish",
    "repayRelAmt",
    "repayRisk",
    "repayStatus",
    "repayViolate",
    "repaymentId",
    "riskAmt",
    "stage",
    "updatetime",
    "violateAmt"
})
public class TmatchRepayment {

    protected String appId;
    protected BigDecimal interest;
    protected BigDecimal planRepayAmt;
    protected String planRepayDate;
    protected BigDecimal principal;
    protected BigDecimal punishAmt;
    protected String repayDate;
    protected BigDecimal repayInterest;
    protected BigDecimal repayPrincipal;
    protected BigDecimal repayPunish;
    protected BigDecimal repayRelAmt;
    protected BigDecimal repayRisk;
    protected String repayStatus;
    protected BigDecimal repayViolate;
    protected int repaymentId;
    protected BigDecimal riskAmt;
    protected String stage;
    protected String updatetime;
    protected BigDecimal violateAmt;

    /**
     * 获取appId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppId() {
        return appId;
    }

    /**
     * 设置appId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppId(String value) {
        this.appId = value;
    }

    /**
     * 获取interest属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInterest() {
        return interest;
    }

    /**
     * 设置interest属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInterest(BigDecimal value) {
        this.interest = value;
    }

    /**
     * 获取planRepayAmt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPlanRepayAmt() {
        return planRepayAmt;
    }

    /**
     * 设置planRepayAmt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPlanRepayAmt(BigDecimal value) {
        this.planRepayAmt = value;
    }

    /**
     * 获取planRepayDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanRepayDate() {
        return planRepayDate;
    }

    /**
     * 设置planRepayDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanRepayDate(String value) {
        this.planRepayDate = value;
    }

    /**
     * 获取principal属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrincipal() {
        return principal;
    }

    /**
     * 设置principal属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrincipal(BigDecimal value) {
        this.principal = value;
    }

    /**
     * 获取punishAmt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPunishAmt() {
        return punishAmt;
    }

    /**
     * 设置punishAmt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPunishAmt(BigDecimal value) {
        this.punishAmt = value;
    }

    /**
     * 获取repayDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepayDate() {
        return repayDate;
    }

    /**
     * 设置repayDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepayDate(String value) {
        this.repayDate = value;
    }

    /**
     * 获取repayInterest属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRepayInterest() {
        return repayInterest;
    }

    /**
     * 设置repayInterest属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRepayInterest(BigDecimal value) {
        this.repayInterest = value;
    }

    /**
     * 获取repayPrincipal属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRepayPrincipal() {
        return repayPrincipal;
    }

    /**
     * 设置repayPrincipal属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRepayPrincipal(BigDecimal value) {
        this.repayPrincipal = value;
    }

    /**
     * 获取repayPunish属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRepayPunish() {
        return repayPunish;
    }

    /**
     * 设置repayPunish属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRepayPunish(BigDecimal value) {
        this.repayPunish = value;
    }

    /**
     * 获取repayRelAmt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRepayRelAmt() {
        return repayRelAmt;
    }

    /**
     * 设置repayRelAmt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRepayRelAmt(BigDecimal value) {
        this.repayRelAmt = value;
    }

    /**
     * 获取repayRisk属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRepayRisk() {
        return repayRisk;
    }

    /**
     * 设置repayRisk属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRepayRisk(BigDecimal value) {
        this.repayRisk = value;
    }

    /**
     * 获取repayStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepayStatus() {
        return repayStatus;
    }

    /**
     * 设置repayStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepayStatus(String value) {
        this.repayStatus = value;
    }

    /**
     * 获取repayViolate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRepayViolate() {
        return repayViolate;
    }

    /**
     * 设置repayViolate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRepayViolate(BigDecimal value) {
        this.repayViolate = value;
    }

    /**
     * 获取repaymentId属性的值。
     * 
     */
    public int getRepaymentId() {
        return repaymentId;
    }

    /**
     * 设置repaymentId属性的值。
     * 
     */
    public void setRepaymentId(int value) {
        this.repaymentId = value;
    }

    /**
     * 获取riskAmt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRiskAmt() {
        return riskAmt;
    }

    /**
     * 设置riskAmt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRiskAmt(BigDecimal value) {
        this.riskAmt = value;
    }

    /**
     * 获取stage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStage() {
        return stage;
    }

    /**
     * 设置stage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStage(String value) {
        this.stage = value;
    }

    /**
     * 获取updatetime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdatetime() {
        return updatetime;
    }

    /**
     * 设置updatetime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdatetime(String value) {
        this.updatetime = value;
    }

    /**
     * 获取violateAmt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getViolateAmt() {
        return violateAmt;
    }

    /**
     * 设置violateAmt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setViolateAmt(BigDecimal value) {
        this.violateAmt = value;
    }

}
