
package com.hm.bus.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>webYsxAttach complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="webYsxAttach"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="attachCondition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ysxId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="tLonAttach" type="{http://biz.webservice.macrosky.com/}ysxWebAttach" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "webYsxAttach", propOrder = {
    "attachCondition",
    "ysxId",
    "tLonAttach"
})
public class WebYsxAttach {

    protected String attachCondition;
    protected int ysxId;
    @XmlElement(nillable = true)
    protected List<YsxWebAttach> tLonAttach;

    /**
     * 获取attachCondition属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttachCondition() {
        return attachCondition;
    }

    /**
     * 设置attachCondition属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttachCondition(String value) {
        this.attachCondition = value;
    }

    /**
     * 获取ysxId属性的值。
     * 
     */
    public int getYsxId() {
        return ysxId;
    }

    /**
     * 设置ysxId属性的值。
     * 
     */
    public void setYsxId(int value) {
        this.ysxId = value;
    }

    /**
     * Gets the value of the tLonAttach property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tLonAttach property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTLonAttach().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link YsxWebAttach }
     * 
     * 
     */
    public List<YsxWebAttach> getTLonAttach() {
        if (tLonAttach == null) {
            tLonAttach = new ArrayList<YsxWebAttach>();
        }
        return this.tLonAttach;
    }

}
