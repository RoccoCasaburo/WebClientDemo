
package webservicedemo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webservicedemo package. 
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

    private final static QName _SubResponse_QNAME = new QName("http://webservicedemo/", "subResponse");
    private final static QName _AddResponse_QNAME = new QName("http://webservicedemo/", "addResponse");
    private final static QName _Sub_QNAME = new QName("http://webservicedemo/", "sub");
    private final static QName _Add_QNAME = new QName("http://webservicedemo/", "add");
    private final static QName _Metodo1_QNAME = new QName("http://webservicedemo/", "metodo1");
    private final static QName _Metodo1Response_QNAME = new QName("http://webservicedemo/", "metodo1Response");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservicedemo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Sub }
     * 
     */
    public Sub createSub() {
        return new Sub();
    }

    /**
     * Create an instance of {@link AddResponse }
     * 
     */
    public AddResponse createAddResponse() {
        return new AddResponse();
    }

    /**
     * Create an instance of {@link SubResponse }
     * 
     */
    public SubResponse createSubResponse() {
        return new SubResponse();
    }

    /**
     * Create an instance of {@link Metodo1Response }
     * 
     */
    public Metodo1Response createMetodo1Response() {
        return new Metodo1Response();
    }

    /**
     * Create an instance of {@link Metodo1 }
     * 
     */
    public Metodo1 createMetodo1() {
        return new Metodo1();
    }

    /**
     * Create an instance of {@link Add }
     * 
     */
    public Add createAdd() {
        return new Add();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservicedemo/", name = "subResponse")
    public JAXBElement<SubResponse> createSubResponse(SubResponse value) {
        return new JAXBElement<SubResponse>(_SubResponse_QNAME, SubResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservicedemo/", name = "addResponse")
    public JAXBElement<AddResponse> createAddResponse(AddResponse value) {
        return new JAXBElement<AddResponse>(_AddResponse_QNAME, AddResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Sub }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservicedemo/", name = "sub")
    public JAXBElement<Sub> createSub(Sub value) {
        return new JAXBElement<Sub>(_Sub_QNAME, Sub.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Add }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservicedemo/", name = "add")
    public JAXBElement<Add> createAdd(Add value) {
        return new JAXBElement<Add>(_Add_QNAME, Add.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Metodo1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservicedemo/", name = "metodo1")
    public JAXBElement<Metodo1> createMetodo1(Metodo1 value) {
        return new JAXBElement<Metodo1>(_Metodo1_QNAME, Metodo1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Metodo1Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservicedemo/", name = "metodo1Response")
    public JAXBElement<Metodo1Response> createMetodo1Response(Metodo1Response value) {
        return new JAXBElement<Metodo1Response>(_Metodo1Response_QNAME, Metodo1Response.class, null, value);
    }

}
