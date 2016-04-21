/*
 * COMP 6302 - Web Services / Internet
 * Lab 5: Standalone SOAP Server
 * Marc Badrian - Due 4/20/16
 * 
 */

package endpoints;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(endpointInterface = "endpoints.ConversionServiceInterface")
public class ConversionService implements ConversionServiceInterface{

	@WebMethod
	public double in2ft(double x) {
		return x / 12;
	}
	
	@WebMethod
	public double ft2in(double x) {
		return x * 12;
	}
	
	@WebMethod
	public double in2cm(double x) {
		return (x / 0.39370);
	}
	
	@WebMethod
	public double cm2in(double x) {
		return (x * 0.39370);
	}

	@WebMethod
	public double ft2m(double x) {
		return (x / 3.2808);
	}

	@WebMethod
	public double m2ft(double x){
		return (x * 3.2808);
	}
	
	@WebMethod
	public double ft2mi(double x) {
		return (x * 0.00018939);
	}

	@WebMethod
	public double mi2ft(double x){
		return (x * 5280);
	}
	
	@WebMethod
	public double mi2km(double x){
		return (x * 0.62137);
	}
	
	@WebMethod
	public double km2mi(double x){
		return (x / 0.62137);
	}

	@WebMethod
	public double days2months(double x){
		return (x * 0.0328548840839);
	}

	@WebMethod
	public double months2days(double x){
		return (x * 30.436875);
	}

	@WebMethod
	public double wks2yrs(double x){
		return (x * 0.019178082191781);
	}

	@WebMethod
	public double yrs2wks(double x){
		return (x * 52.142857142857);
	}
	
}
