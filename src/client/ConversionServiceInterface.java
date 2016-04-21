/*
 * COMP 6302 - Web Services / Internet
 * Lab 5: Standalone SOAP Server
 * Marc Badrian - Due 4/20/16
 * 
 */

package client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Action;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ConversionServiceInterface", targetNamespace = "http://endpoints/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface ConversionServiceInterface {


    /**
     * 
     * @param arg0
     * @return
     *     returns double
     */
    @WebMethod(operationName = "ft2mi")
    @WebResult(partName = "return")
    @Action(input = "http://endpoints/ConversionServiceInterface/ft2miRequest", output = "http://endpoints/ConversionServiceInterface/ft2miResponse")
    public double ft2Mi(
        @WebParam(name = "arg0", partName = "arg0")
        double arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns double
     */
    @WebMethod(operationName = "m2ft")
    @WebResult(partName = "return")
    @Action(input = "http://endpoints/ConversionServiceInterface/m2ftRequest", output = "http://endpoints/ConversionServiceInterface/m2ftResponse")
    public double m2Ft(
        @WebParam(name = "arg0", partName = "arg0")
        double arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns double
     */
    @WebMethod(operationName = "cm2in")
    @WebResult(partName = "return")
    @Action(input = "http://endpoints/ConversionServiceInterface/cm2inRequest", output = "http://endpoints/ConversionServiceInterface/cm2inResponse")
    public double cm2In(
        @WebParam(name = "arg0", partName = "arg0")
        double arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns double
     */
    @WebMethod(operationName = "ft2in")
    @WebResult(partName = "return")
    @Action(input = "http://endpoints/ConversionServiceInterface/ft2inRequest", output = "http://endpoints/ConversionServiceInterface/ft2inResponse")
    public double ft2In(
        @WebParam(name = "arg0", partName = "arg0")
        double arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns double
     */
    @WebMethod(operationName = "km2mi")
    @WebResult(partName = "return")
    @Action(input = "http://endpoints/ConversionServiceInterface/km2miRequest", output = "http://endpoints/ConversionServiceInterface/km2miResponse")
    public double km2Mi(
        @WebParam(name = "arg0", partName = "arg0")
        double arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns double
     */
    @WebMethod(operationName = "yrs2wks")
    @WebResult(partName = "return")
    @Action(input = "http://endpoints/ConversionServiceInterface/yrs2wksRequest", output = "http://endpoints/ConversionServiceInterface/yrs2wksResponse")
    public double yrs2Wks(
        @WebParam(name = "arg0", partName = "arg0")
        double arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns double
     */
    @WebMethod(operationName = "wks2yrs")
    @WebResult(partName = "return")
    @Action(input = "http://endpoints/ConversionServiceInterface/wks2yrsRequest", output = "http://endpoints/ConversionServiceInterface/wks2yrsResponse")
    public double wks2Yrs(
        @WebParam(name = "arg0", partName = "arg0")
        double arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns double
     */
    @WebMethod(operationName = "mi2km")
    @WebResult(partName = "return")
    @Action(input = "http://endpoints/ConversionServiceInterface/mi2kmRequest", output = "http://endpoints/ConversionServiceInterface/mi2kmResponse")
    public double mi2Km(
        @WebParam(name = "arg0", partName = "arg0")
        double arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns double
     */
    @WebMethod(operationName = "ft2m")
    @WebResult(partName = "return")
    @Action(input = "http://endpoints/ConversionServiceInterface/ft2mRequest", output = "http://endpoints/ConversionServiceInterface/ft2mResponse")
    public double ft2M(
        @WebParam(name = "arg0", partName = "arg0")
        double arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns double
     */
    @WebMethod(operationName = "mi2ft")
    @WebResult(partName = "return")
    @Action(input = "http://endpoints/ConversionServiceInterface/mi2ftRequest", output = "http://endpoints/ConversionServiceInterface/mi2ftResponse")
    public double mi2Ft(
        @WebParam(name = "arg0", partName = "arg0")
        double arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns double
     */
    @WebMethod(operationName = "in2ft")
    @WebResult(partName = "return")
    @Action(input = "http://endpoints/ConversionServiceInterface/in2ftRequest", output = "http://endpoints/ConversionServiceInterface/in2ftResponse")
    public double in2Ft(
        @WebParam(name = "arg0", partName = "arg0")
        double arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns double
     */
    @WebMethod(operationName = "in2cm")
    @WebResult(partName = "return")
    @Action(input = "http://endpoints/ConversionServiceInterface/in2cmRequest", output = "http://endpoints/ConversionServiceInterface/in2cmResponse")
    public double in2Cm(
        @WebParam(name = "arg0", partName = "arg0")
        double arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns double
     */
    @WebMethod(operationName = "days2months")
    @WebResult(partName = "return")
    @Action(input = "http://endpoints/ConversionServiceInterface/days2monthsRequest", output = "http://endpoints/ConversionServiceInterface/days2monthsResponse")
    public double days2Months(
        @WebParam(name = "arg0", partName = "arg0")
        double arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns double
     */
    @WebMethod(operationName = "months2days")
    @WebResult(partName = "return")
    @Action(input = "http://endpoints/ConversionServiceInterface/months2daysRequest", output = "http://endpoints/ConversionServiceInterface/months2daysResponse")
    public double months2Days(
        @WebParam(name = "arg0", partName = "arg0")
        double arg0);

}
