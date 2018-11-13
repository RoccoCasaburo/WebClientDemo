
package webservicedemo;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "DemoWS", targetNamespace = "http://webservicedemo/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface DemoWS {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "add", targetNamespace = "http://webservicedemo/", className = "webservicedemo.Add")
    @ResponseWrapper(localName = "addResponse", targetNamespace = "http://webservicedemo/", className = "webservicedemo.AddResponse")
    @Action(input = "http://webservicedemo/DemoWS/addRequest", output = "http://webservicedemo/DemoWS/addResponse")
    public int add(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sub", targetNamespace = "http://webservicedemo/", className = "webservicedemo.Sub")
    @ResponseWrapper(localName = "subResponse", targetNamespace = "http://webservicedemo/", className = "webservicedemo.SubResponse")
    @Action(input = "http://webservicedemo/DemoWS/subRequest", output = "http://webservicedemo/DemoWS/subResponse")
    public int sub(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

    /**
     * 
     */
    @WebMethod
    @RequestWrapper(localName = "metodo1", targetNamespace = "http://webservicedemo/", className = "webservicedemo.Metodo1")
    @ResponseWrapper(localName = "metodo1Response", targetNamespace = "http://webservicedemo/", className = "webservicedemo.Metodo1Response")
    @Action(input = "http://webservicedemo/DemoWS/metodo1Request", output = "http://webservicedemo/DemoWS/metodo1Response")
    public void metodo1();

}