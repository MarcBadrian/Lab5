/*
 * COMP 6302 - Web Services / Internet
 * Lab 5: Standalone SOAP Server
 * Marc Badrian - Due 4/20/16
 * 
 */

package endpoints;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface ConversionServiceInterface {

	@WebMethod
	public double in2ft(double x);
	
	@WebMethod
	public double ft2in(double x);
	
	@WebMethod
	public double in2cm(double x);
	
	@WebMethod
	public double cm2in(double x);

	@WebMethod
	public double ft2m(double x);

	@WebMethod
	public double m2ft(double x);
	
	@WebMethod
	public double ft2mi(double x);

	@WebMethod
	public double mi2ft(double x);
	
	@WebMethod
	public double mi2km(double x);
	
	@WebMethod
	public double km2mi(double x);

	@WebMethod
	public double days2months(double x);

	@WebMethod
	public double months2days(double x);

	@WebMethod
	public double wks2yrs(double x);

	@WebMethod
	public double yrs2wks(double x);
	
}
