/*
 * COMP 6302 - Web Services / Internet
 * Lab 5: Standalone SOAP Server
 * Marc Badrian - Due 4/20/16
 * 
 */

package publishers;

import java.util.Scanner;
import javax.xml.ws.Endpoint;

import endpoints.ConversionService;

public class ConversionPublisher {

	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		final String url = "http://localhost:8888/Lab5";
		System.out.println("Publishing ConversionService at endpoint "+ url);
		Endpoint ep = Endpoint.publish(url, new ConversionService());
		System.out.println("Done publishing");
		System.out.println("Enter in \"exit\" to stop publishing:");
		String input = s.nextLine();
		boolean exit = false;
		while (exit == false) {
			if (input.equals("exit")) {
				ep.stop();
				exit = true;
			} else {
				System.out.println("You did not type \"exit\". Please try again:");
				input = s.nextLine();
			};
		};
		s.close();
	}
}
