
package com.hm.bus.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>back58Mortgagor complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="back58Mortgagor"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://biz.webservice.macrosky.com/}back58Common"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mortgagorList" type="{http://biz.webservice.macrosky.com/}productGoldAccount" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "back58Mortgagor", propOrder = {
    "mortgagorList"
})
public class Back58Mortgagor
    extends Back58Common
{

    @XmlElement(nillable = true)
    protected List<ProductGoldAccount> mortgagorList;

    /**
     * Gets the value of the mortgagorList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mortgagorList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMortgagorList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductGoldAccount }
     * 
     * 
     */
    public List<ProductGoldAccount> getMortgagorList() {
        if (mortgagorList == null) {
            mortgagorList = new ArrayList<ProductGoldAccount>();
        }
        return this.mortgagorList;
    }

}
