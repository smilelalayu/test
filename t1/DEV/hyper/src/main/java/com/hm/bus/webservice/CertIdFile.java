
package com.hm.bus.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>certIdFile complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="certIdFile"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="certIdFileByte" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="certIdFileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "certIdFile", propOrder = {
    "certIdFileByte",
    "certIdFileName"
})
public class CertIdFile {

    protected byte[] certIdFileByte;
    protected String certIdFileName;

    /**
     * 获取certIdFileByte属性的值。
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getCertIdFileByte() {
        return certIdFileByte;
    }

    /**
     * 设置certIdFileByte属性的值。
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setCertIdFileByte(byte[] value) {
        this.certIdFileByte = value;
    }

    /**
     * 获取certIdFileName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertIdFileName() {
        return certIdFileName;
    }

    /**
     * 设置certIdFileName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertIdFileName(String value) {
        this.certIdFileName = value;
    }

}
