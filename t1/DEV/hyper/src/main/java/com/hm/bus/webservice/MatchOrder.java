
package com.hm.bus.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>matchOrder complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="matchOrder"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://biz.webservice.macrosky.com/}tLonApplication"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="matchDetail" type="{http://biz.webservice.macrosky.com/}loanMatchDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "matchOrder", propOrder = {
    "matchDetail"
})
public class MatchOrder
    extends TLonApplication
{

    @XmlElement(nillable = true)
    protected List<LoanMatchDetail> matchDetail;

    /**
     * Gets the value of the matchDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the matchDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMatchDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoanMatchDetail }
     * 
     * 
     */
    public List<LoanMatchDetail> getMatchDetail() {
        if (matchDetail == null) {
            matchDetail = new ArrayList<LoanMatchDetail>();
        }
        return this.matchDetail;
    }

}
