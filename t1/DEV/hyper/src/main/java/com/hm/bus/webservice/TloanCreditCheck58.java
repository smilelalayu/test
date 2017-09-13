
package com.hm.bus.webservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>tloanCreditCheck58 complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="tloanCreditCheck58"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cardMaxLimitAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="creditCardNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="totalLoan" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="year2Last2Num" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tloanCreditCheck58", propOrder = {
    "cardMaxLimitAmt",
    "creditCardNum",
    "totalLoan",
    "year2Last2Num"
})
public class TloanCreditCheck58 {

    protected BigDecimal cardMaxLimitAmt;
    protected String creditCardNum;
    protected BigDecimal totalLoan;
    protected Integer year2Last2Num;

    /**
     * ��ȡcardMaxLimitAmt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCardMaxLimitAmt() {
        return cardMaxLimitAmt;
    }

    /**
     * ����cardMaxLimitAmt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCardMaxLimitAmt(BigDecimal value) {
        this.cardMaxLimitAmt = value;
    }

    /**
     * ��ȡcreditCardNum���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardNum() {
        return creditCardNum;
    }

    /**
     * ����creditCardNum���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardNum(String value) {
        this.creditCardNum = value;
    }

    /**
     * ��ȡtotalLoan���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalLoan() {
        return totalLoan;
    }

    /**
     * ����totalLoan���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalLoan(BigDecimal value) {
        this.totalLoan = value;
    }

    /**
     * ��ȡyear2Last2Num���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getYear2Last2Num() {
        return year2Last2Num;
    }

    /**
     * ����year2Last2Num���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setYear2Last2Num(Integer value) {
        this.year2Last2Num = value;
    }

}
