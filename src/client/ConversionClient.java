/*
 * COMP 6302 - Web Services / Internet
 * Lab 5: Standalone SOAP Server
 * Marc Badrian - Due 4/20/16
 * 
 */

package client;

import java.util.Scanner;

public class ConversionClient {

	public static void main(String[] args) {

		ConversionServiceService service = new ConversionServiceService();

		ConversionServiceInterface server = service.getConversionServicePort();

		boolean again = true;

		while (again == true) {

			System.out.println("Welcome to the Unit Conversion SOAP Service!\n");

			System.out.println("Please enter your conversion command in the format \"[amount] [unit] to [unit]\"\n");
			System.out.println("Supported conversions are as follows: " + "\n" +
					"inches to feet         [amount] in to ft" + "\n" +
					"feet to inches         [amount] ft to in" + "\n" +
					"inches to centimeters  [amount] in to cm" + "\n" +
					"centimeters to inches  [amount] cm to in" + "\n" +
					"feet to meters         [amount] ft to m" + "\n" +
					"meters to feet         [amount] m to ft" + "\n" +
					"feet to miles          [amount] ft to mi" + "\n" +
					"miles to feet          [amount] mi to ft" + "\n" +
					"miles to kilometers    [amount] mi to km" + "\n" +
					"kilometers to miles    [amount] km to mi" + "\n" +
					"days to months         [amount] days to months" + "\n" +
					"months to days         [amount] months to days" + "\n" +
					"weeks to years         [amount] wks to yrs" + "\n" +
					"years to weeks         [amount] yrs to wks" + "\n"
					);
			Scanner s = new Scanner(System.in);
			String command = s.nextLine();
			String delims = "[ ]";
			String[] conversion = command.split(delims);
			Double amount = Double.parseDouble(conversion[0]);
			String from = conversion[1];
			String to = conversion[3];
			String input = from + to;
			Double solution = null;

			switch (input) {
			case "inft":
				solution = server.in2Ft(amount);
				break;
			case "ftin":
				solution = server.ft2In(amount);
				break;
			case "incm":
				solution = server.in2Cm(amount);
				break;
			case "cmin":
				solution = server.cm2In(amount);
				break;
			case "ftm":
				solution = server.ft2M(amount);
				break;
			case "mft":
				solution = server.m2Ft(amount);
				break;
			case "ftmi":
				solution = server.ft2Mi(amount);
				break;
			case "mift":
				solution = server.mi2Ft(amount);
				break;
			case "mikm":
				solution = server.mi2Km(amount);
				break;
			case "kmmi":
				solution = server.km2Mi(amount);
				break;
			case "daysmonths":
				solution = server.days2Months(amount);
				break;
			case "monthsdays":
				solution = server.months2Days(amount);
				break;
			case "wksyrs":
				solution = server.wks2Yrs(amount);
				break;
			case "yrswks":
				solution = server.yrs2Wks(amount);
				break;
			}		

			System.out.println("Your Conversion: " + amount + " " + from + " = " + solution + " " + to);
			System.out.println("\n" + "Would you like to do another conversion? Enter \"y\" or \"n\":");
			String choice = s.nextLine();
			boolean invalid = true;
			while (invalid == true) {
				if (choice.equals("y") || choice.equals("n")) {
					invalid = false;
					if (choice.equals("n")) {
						again = false;	
						s.close();
					};
				} else {
					System.out.println("Invalid input. Please type \"y\" or \"n\":");
					choice = s.nextLine();
				};
			};
		};

	};

}