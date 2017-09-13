
package com.hm.bus.webservice.cnloan;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.hm.bus.webservice.util package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CnEditAppInfo_QNAME = new QName("http://webservice.cicada.jfbank.com/", "cnEditAppInfo");
    private final static QName _CnEditAppInfoResponse_QNAME = new QName("http://webservice.cicada.jfbank.com/", "cnEditAppInfoResponse");
    private final static QName _GenerateRepaymentNotices_QNAME = new QName("http://webservice.cicada.jfbank.com/", "generateRepaymentNotices");
    private final static QName _GenerateRepaymentNoticesResponse_QNAME = new QName("http://webservice.cicada.jfbank.com/", "generateRepaymentNoticesResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.hm.bus.webservice.util
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CnEditAppInfo }
     * 
     */
    public CnEditAppInfo createCnEditAppInfo() {
        return new CnEditAppInfo();
    }

    /**
     * Create an instance of {@link CnEditAppInfoResponse }
     * 
     */
    public CnEditAppInfoResponse createCnEditAppInfoResponse() {
        return new CnEditAppInfoResponse();
    }

    /**
     * Create an instance of {@link GenerateRepaymentNotices }
     * 
     */
    public GenerateRepaymentNotices createGenerateRepaymentNotices() {
        return new GenerateRepaymentNotices();
    }

    /**
     * Create an instance of {@link GenerateRepaymentNoticesResponse }
     * 
     */
    public GenerateRepaymentNoticesResponse createGenerateRepaymentNoticesResponse() {
        return new GenerateRepaymentNoticesResponse();
    }

    /**
     * Create an instance of {@link TransHead }
     * 
     */
    public TransHead createTransHead() {
        return new TransHead();
    }

    /**
     * Create an instance of {@link TIndApplication }
     * 
     */
    public TIndApplication createTIndApplication() {
        return new TIndApplication();
    }

    /**
     * Create an instance of {@link TransModel }
     * 
     */
    public TransModel createTransModel() {
        return new TransModel();
    }

    /**
     * Create an instance of {@link TransBody }
     * 
     */
    public TransBody createTransBody() {
        return new TransBody();
    }

    /**
     * Create an instance of {@link RepaymentNoticeResult }
     * 
     */
    public RepaymentNoticeResult createRepaymentNoticeResult() {
        return new RepaymentNoticeResult();
    }

    /**
     * Create an instance of {@link RepaymentNoticeModel }
     * 
     */
    public RepaymentNoticeModel createRepaymentNoticeModel() {
        return new RepaymentNoticeModel();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CnEditAppInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.cicada.jfbank.com/", name = "cnEditAppInfo")
    public JAXBElement<CnEditAppInfo> createCnEditAppInfo(CnEditAppInfo value) {
        return new JAXBElement<CnEditAppInfo>(_CnEditAppInfo_QNAME, CnEditAppInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CnEditAppInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.cicada.jfbank.com/", name = "cnEditAppInfoResponse")
    public JAXBElement<CnEditAppInfoResponse> createCnEditAppInfoResponse(CnEditAppInfoResponse value) {
        return new JAXBElement<CnEditAppInfoResponse>(_CnEditAppInfoResponse_QNAME, CnEditAppInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerateRepaymentNotices }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.cicada.jfbank.com/", name = "generateRepaymentNotices")
    public JAXBElement<GenerateRepaymentNotices> createGenerateRepaymentNotices(GenerateRepaymentNotices value) {
        return new JAXBElement<GenerateRepaymentNotices>(_GenerateRepaymentNotices_QNAME, GenerateRepaymentNotices.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerateRepaymentNoticesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.cicada.jfbank.com/", name = "generateRepaymentNoticesResponse")
    public JAXBElement<GenerateRepaymentNoticesResponse> createGenerateRepaymentNoticesResponse(GenerateRepaymentNoticesResponse value) {
        return new JAXBElement<GenerateRepaymentNoticesResponse>(_GenerateRepaymentNoticesResponse_QNAME, GenerateRepaymentNoticesResponse.class, null, value);
    }

}
