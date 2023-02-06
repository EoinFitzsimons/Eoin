

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Luas {

	private static Scanner INPUT = new Scanner(System.in);
	private static DecimalFormat CURRENCY = new DecimalFormat("0.00");

	/* Global Variables to store data or statistics */

	private static int CARTITEMS = 0;
	private static double CARTTOTAL = 0;
	private static boolean LOGIN;
	private static int STATS_INK_PAPER = 100;
	private static int STATS_TOTAL_INCOME = 0;
	private static int STATS_NUM_ADULT = 0;
	private static int STATS_NUM_CHILD = 0;
	private static int STATS_NUM_STUDENT = 0;
	private static int STATS_TICKET_SALES = 0;
	private static int STATS_NUM_STANDARD = 0;
	private static int STATS_NUM_FLEXI = 0;
	private static int STATS_NUM_SINGLE = 0;
	private static int STATS_NUM_RETURN = 0;
	private static int STATS_NUM_FLEXI_1 = 0;
	private static int STATS_NUM_FLEXI_7 = 0;
	private static int STATS_NUM_FLEXI_30 = 0;
	private static int STATS_NUM_STANDARD_ADULT = 0;
	private static int STATS_NUM_STANDARD_CHILD = 0;
	private static int STATS_NUM_FLEXI_ADULT = 0;
	private static int STATS_NUM_FLEXI_CHILD = 0;
	private static int STATS_NUM_FLEXI_STUDENT = 0;
	private static double AVERAGE_PRICE = 0;
	private static double INSERTED_MONEY = 0;
	private static boolean MACHINE_STATUS = true;
	private static String STR_DETAILS = "";
	private static String[] ARRAY_MACHINE_STATUS = { "Offline", "Online" };
	private static String NAMEUSER;

	public static void main(String[] args) {

		terminalMenu();// Welcome Message and Start Service

	}

	public static void terminalMenu() {
		System.out.println();
		System.out.println("__      __          _                                               _                                                     \r\n"
				+ "\\ \\    / / ___     | |     __      ___    _ __     ___      o O O  | |_     ___                                           \r\n"
				+ " \\ \\/\\/ / / -_)    | |    / _|    / _ \\  | '  \\   / -_)    o       |  _|   / _ \\                                          \r\n"
				+ "  \\_/\\_/  \\___|   _|_|_   \\__|_   \\___/  |_|_|_|  \\___|   TS__[O]  _\\__|   \\___/                                          \r\n"
				+ "_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"| {======|_|\"\"\"\"\"|_|\"\"\"\"\"|                                         \r\n"
				+ "\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'./o--000'\"`-0-0-'\"`-0-0-'                                         \r\n"
				+ "   _      _                         _                                                                                     \r\n"
				+ "  | |_   | |_      ___      o O O  | |     _  _    __ _     ___                                                           \r\n"
				+ "  |  _|  | ' \\    / -_)    o       | |__  | +| |  / _` |   (_-<                                                           \r\n"
				+ "  _\\__|  |_||_|   \\___|   TS__[O]  |____|  \\_,_|  \\__,_|   /__/_                                                          \r\n"
				+ "_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"| {======|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|                                                         \r\n"
				+ "\"`-0-0-'\"`-0-0-'\"`-0-0-'./o--000'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'                                                         \r\n"
				+ "  _                        _        _              __ _                                              _                    \r\n"
				+ " | |__     ___     ___    | |__    (_)    _ _     / _` |    o O O   ___     ___      _ _   __ __    (_)     __      ___   \r\n"
				+ " | '_ \\   / _ \\   / _ \\   | / /    | |   | ' \\    \\__, |   o       (_-<    / -_)    | '_|  \\ V /    | |    / _|    / -_)  \r\n"
				+ " |_.__/   \\___/   \\___/   |_\\_\\   _|_|_  |_||_|   |___/   TS__[O]  /__/_   \\___|   _|_|_   _\\_/_   _|_|_   \\__|_   \\___|  \r\n"
				+ "_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"| {======|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"| \r\n"
				+ "\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'./o--000'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-' \r\n"
				+ "___________________________________________________________________________________________________________________________");


		
		
		
		
		
		loginService(); // Check to login just Name "Character"
		checkInkPaper(); // Check terminal ink and paper
		selectTicketType(); // First menu encounter
	}

	public static void checkInkPaper() {
		if (STATS_INK_PAPER <= 0) {
			outOfService(); // If there are no ink and paper enter outOfService mode
		}
	}

	public static void loginService() {

		System.out.println("   ___             _                                _  _                           \r\n"
				+ "  | __|   _ _     | |_     ___      _ _     o O O  | || |   ___    _  _      _ _   \r\n"
				+ "  | _|   | ' \\    |  _|   / -_)    | '_|   o        \\_, |  / _ \\  | +| |    | '_|  \r\n"
				+ "  |___|  |_||_|   _\\__|   \\___|   _|_|_   TS__[O]  _|__/   \\___/   \\_,_|   _|_|_   \r\n"
				+ "_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"| {======|_| \"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|  \r\n"
				+ "\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'./o=-000'\"`-0-0-'\"`-0=0-'\"`-0-0-'\"`-0-0-'  \r\n"
				+ "  _ _     __ _    _ __     ___      o O O | |__     ___     | |     ___   __ __ __ \r\n"
				+ " | ' \\   / _` |  | '  \\   / -_)    o      | '_ \\   / -_)    | |    / _ \\  \\ V  V / \r\n"
				+ " |_||_|  \\__,_|  |_|_|_|  \\___|   TS__[O] |_.__/   \\___|   _|_|_   \\___/   \\_/\\_/  \r\n"
				+ "_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"| {======|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|  \r\n"
				+ "\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'./o--000'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'  \r\n"
				+ "____________________________________________________________________________________");

		NAMEUSER = INPUT.next();
		int charCount = 0;
		for (int userName = 0; userName < NAMEUSER.length(); userName++) {

			// to check the user name is in Lower-case letter 'Character'
			if ('a' <= NAMEUSER.charAt(userName) && NAMEUSER.charAt(userName) <= 'z') {
				charCount++;
			}
			// to check the user name is in Upper-case letter 'Character'
			else if ('A' <= NAMEUSER.charAt(userName) && NAMEUSER.charAt(userName) <= 'Z') {
				charCount++;
			} else {
				System.out.println("\nInvalid input! Enter Only Characters values \n");
				loginService();
			}
		}
		if (charCount <= 2) { // to check if 2 or less than 2 return to LogiService
			System.out.println("That is not enough! Please enter more than 2 characters! ");
			loginService();
		}

	}

	private static void outOfService() { // Call method to say out of service
		System.out.println("Terminal is out of service");// We should have a \n Please Enter 'a' to go to the menu!
		String choice = INPUT.next();
		switch (choice) {
		case "a": { // Switch to choice a, which is login
			login();
		}
		default: {
			System.out.println("Invalid option, try again");
			outOfService(); // Call out of service method
		}
		}
	}

	public static void selectTicketType() { // Method for student type
		System.out.println("------------------------------------");
		System.out.println("Please choose your ticket type      |");
		System.out.println("1) Standard                         |");
		System.out.println("2) Flexi                            |");
		System.out.println("------------------------------------");
		String choice = INPUT.next();
		switch (choice) {
		case "1": {
			String ticketType = "Standard";
			selectZone(ticketType);
			break;
		}
		case "2": {
			String ticketType = "Flexi   ";
			selectZone(ticketType);
			break;
		}
		case "a": {
			login();
			break;
		}
		case "x": {
			if (LOGIN == false) {
				login();
			} else {
				System.out.println("Shutting down...");
				System.exit(0);
			}
			break;
		}
		default: {
			System.out.println("Invalid option, try again");
			selectTicketType();
			break;
		}
		}
	}

	public static void selectZone(String ticketType) {
		System.out.println("");
		System.out.println("-----------------------------------------");
		System.out.println("Your selected Ticket Type:   " + ticketType + "    |");
		System.out.println("Please select your zone" + "                  |");
		System.out.println("1) Zone 1" + "                                |");
		System.out.println("2) Zone 2" + "                                |");
		System.out.println("3) Zone 3" + "                                |");
		System.out.println("4) Zone 4" + "                                |");
		System.out.println("5) Zone 5" + "                                |");
		System.out.println("-----------------------------------------");
		String choice = INPUT.next();
		switch (choice) {
		case "1": {
			String zone = "1";
			if (ticketType.equals("Standard")) {
				standardTicket(ticketType, zone);
			} else { // FlexiTicket
				flexiTicket(ticketType, zone);
			}
			break;
		}
		case "2": {
			String zone = "2";
			if (ticketType.equals("Standard")) {
				standardTicket(ticketType, zone);
			} else {
				flexiTicket(ticketType, zone);
			}
			break;
		}
		case "3": {
			String zone = "3";
			if (ticketType.equals("Standard")) {
				standardTicket(ticketType, zone);
			} else {
				flexiTicket(ticketType, zone);
			}
			break;
		}
		case "4": {
			String zone = "4";
			if (ticketType.equals("Standard")) {
				standardTicket(ticketType, zone);
			} else {
				flexiTicket(ticketType, zone);
			}
			break;
		}
		case "5": {
			String zone = "5";// there is no more then 5 (5-8)
			if (ticketType.equals("Standard")) {
				standardTicket(ticketType, zone);
			} else {
				flexiTicket(ticketType, zone);
			}
			break;
		}
		default: {
			System.out.println("Invalid option, try again");
			selectZone(ticketType);
			break;
		}
		}
	}

	public static void standardTicket(String ticketType, String zone) {
		System.out.println("----------------------------------------");
		System.out.println("Your selected Ticket Type:  " + ticketType + "    |");
		System.out.println("Your selected Ticket Zone:  " + zone + "           |");
		System.out.println("Please choose your ticket fares" + "         |");
		System.out.println("1) Single Ticket" + "                        |");
		System.out.println("2) Return Ticket" + "                        |");
		System.out.println("----------------------------------------");
		String choice = INPUT.next();
		switch (choice) {
		case "1": {
			String ticketTypeFares = "Single";
			selectedStandard(ticketType, zone, ticketTypeFares);
			break;
		}
		case "2": {
			String ticketTypeFares = "Return";
			selectedStandard(ticketType, zone, ticketTypeFares);
			break;
		}
		default: {
			System.out.println("Invalid option, try again");
			standardTicket(ticketType, zone);
			break;
		}
		}
	}

	private static void flexiTicket(String ticketType, String selectedZone) {
		System.out.println("--------------------------------------------");
		System.out.println("Your selected Ticket Type:   " + ticketType + "       |");
		System.out.println("Your selected Ticket Zone: \t" + selectedZone + "           |");
		System.out.println("Please choose your ticket fares" + "             |");
		System.out.println("1) 1 Day Ticket" + "                             |");
		System.out.println("2) 7 Day Ticket" + "                             |");
		System.out.println("3) 30 Day Ticket" + "                            |");
		System.out.println("--------------------------------------------");
		String choice = INPUT.next();
		switch (choice) {
		case "1": {
			String ticketTypeFares = "1 Day";
			selectedFlexi(ticketType, selectedZone, ticketTypeFares);
			break;
		}
		case "2": {
			String ticketTypeFares = "7 Day";
			selectedFlexi(ticketType, selectedZone, ticketTypeFares);
			break;
		}
		case "3": {
			String ticketTypeFares = "30 Day";
			selectedFlexi(ticketType, selectedZone, ticketTypeFares);
			break;
		}
		default: {
			System.out.println("Invalid option, try again");
			flexiTicket(ticketType, selectedZone);
			break;
		}
		}
	}

	public static void selectedStandard(String ticketType, String selectedZone, String ticketTypeFares) {
		System.out.println("--------------------------------------------");
		System.out.println("Your selected Standard Ticket: \t" + ticketTypeFares + "      |");
		System.out.println("Please choose your ticket age" + "               |");
		System.out.println("1) Adult" + "                                    |");
		System.out.println("2) Child" + "                                    |");
		System.out.println("--------------------------------------------");
		String choice = INPUT.next();
		switch (choice) {
		case "1": {
			String selectedAge = "Adult";
			int numTickets = 1;
			addToCart(ticketType, selectedZone, ticketTypeFares, selectedAge, numTickets);
			break;
		}
		case "2": {
			int numTickets = 1;
			String selectedAge = "Child";
			addToCart(ticketType, selectedZone, ticketTypeFares, selectedAge, numTickets);
			break;
		}
		default: {
			System.out.println("Invalid option, try again");
			selectedFlexi(ticketType, selectedZone, ticketTypeFares);
			break;
		}
		}
	}

	public static void selectedFlexi(String ticketType, String selectedZone, String ticketTypeFares) {
		System.out.println("-----------------------------------------");
		System.out.println("Your selected Flexi Ticket: \t" + ticketTypeFares + "    |");
		System.out.println("Please choose your ticket age" + "            |");
		System.out.println("1) Adult" + "                                 |");
		System.out.println("2) Child" + "                                 |");

		if (!selectedZone.equals("1")) {
			System.out.println("3) Student" + "                               |");
			System.out.println("-----------------------------------------");
		}
		String choice = INPUT.next();
		switch (choice) {
		case "1": {
			String selectedAge = "Adult";
			int numTickets = 1;
			addToCart(ticketType, selectedZone, ticketTypeFares, selectedAge, numTickets);
			break;
		}
		case "2": {
			String selectedAge = "Child";
			int numTickets = 1;
			addToCart(ticketType, selectedZone, ticketTypeFares, selectedAge, numTickets);
			break;
		}
		case "3": {
			if (!selectedZone.equals("1")) {
				String selectedAge = "Student";
				int numTickets = 1;
				addToCart(ticketType, selectedZone, ticketTypeFares, selectedAge, numTickets);
			} else {
				System.out.println("Zone 1 not available for student type");
				selectedFlexi(ticketType, selectedZone, ticketTypeFares);
			}
			break;
		}
		default: {
			System.out.println("Invalid option, try again");
			selectedFlexi(ticketType, selectedZone, ticketTypeFares);
			break;
		}
		}
	}

	public static void addToCart(String ticketType, String selectedZone, String ticketTypeFares, String selectedAge,
			int numTickets) {

		System.out.println("------------------------------------");
		System.out.println("|                                  |");
		System.out.println("|        TICKET DETAILS:" + "           |");
		System.out.println("| Ticket Holder's Name :  " +NAMEUSER+ "  |");
		System.out.println("| Selected Ticket: \t" + ticketType + "   |");
		System.out.println("| Selected Zone: \t\t" + selectedZone + "  |");
		System.out.println("| Selected Ticket Fares:    " + ticketTypeFares + " |");
		System.out.println("| Selected Ticket Age: \t" + selectedAge + "      |");
		System.out.println("| Ticket Quantities: \t" + numTickets + "          |");
		System.out.println("|                                  |");
		System.out.println("------------------------------------");
		System.out.println("-----------------------------------");
		System.out.println("1) Choose Quantity" + "                 |");
		System.out.println("2) Confirm Order" + "                   |");
		System.out.println("3) Cancel" + "                          |");
		System.out.println("-----------------------------------");
		String choice = INPUT.next();
		switch (choice) {
		case "1": {
			System.out.println("Enter amount of ticket");
			int qty = 1;
			try {
				qty = INPUT.nextInt();
			} catch (Exception e) {
				qty = 1;
				addToCart(ticketType, selectedZone, ticketTypeFares, selectedAge, numTickets);
			}
			if (qty > 100) { // fall back statements
				System.out.println("You may not purchase more than 5 tickets at a time");
				numTickets = 5;
				// numTickets += qty;

			} else {
				if (qty > 5) {
					System.out.println("You may not purchase more than 5 tickets at a time");
					if (qty > STATS_INK_PAPER) {
						System.out.println("Sorry only " + STATS_INK_PAPER
								+ " tickets are available\nChanging your quantities to " + STATS_INK_PAPER);
						numTickets = STATS_INK_PAPER;
					} else {
						numTickets = 5;
					}
				} else if (qty <= 5) {
					if (qty > STATS_INK_PAPER) { // If there are less than 5 tickets remaining
						System.out.println("Sorry only " + STATS_INK_PAPER
								+ " tickets are available\nChanging your quantities to " + STATS_INK_PAPER);
						numTickets = STATS_INK_PAPER;
					} else {
						numTickets = STATS_INK_PAPER;
					}
					numTickets = qty;
				} else if (qty <= 0) {
					System.out.println("Invalid Values, try again");
					numTickets = 1;
				}
				addToCart(ticketType, selectedZone, ticketTypeFares, selectedAge, numTickets);
				break;
			}
		}
		case "2": {
			CARTITEMS++;
			cart(ticketType, selectedZone, ticketTypeFares, selectedAge, numTickets);
			break;
		}
		case "3": {
			if (CARTITEMS == 0) {
				System.out.println("Returning to main menu...");
				terminalMenu();
			} else {
				System.out.println("Cancelling ticket order...");
				selectTicketType();
			}
			break;
		}
		default: {
			System.out.println("Invalid option, try again");
			addToCart(ticketType, selectedZone, ticketTypeFares, selectedAge, numTickets);
			break;
		}
		}
	}

	public static void cart(String ticketType, String selectedZone, String ticketTypeFares, String selectedAge,
			int numTickets) {

		double price = 0;
		if (ticketType.equals("Standard")) {
			if (ticketTypeFares.equals("Single")) {
				if (selectedAge.equals("Adult")) {
					switch (selectedZone) {
					case "1": {
						price = 2.10;
						price *= numTickets;
						CARTTOTAL += price;
						//STATS_INK_PAPER += numTickets;
						break;
					}
					case "2": {
						price = 2.50;
						price *= numTickets;
						CARTTOTAL += price;
						break;
					}
					case "3": {
						price = 3.00;
						price *= numTickets;
						CARTTOTAL += price;
						break;
					}
					case "4": {
						price = 3.00;
						price *= numTickets;
						CARTTOTAL += price;
						break;
					}
					case "5": {
						price = 3.30;
						price *= numTickets;
						CARTTOTAL += price;
						break;
					}
					}
				} else if (selectedAge.equals("Child")) { // Child
					switch (selectedZone) {
					case "1": {
						price = 1.00;
						price *= numTickets;
						CARTTOTAL += price;
						break;
					}
					case "2": {
						price = 1.00;
						price *= numTickets;
						CARTTOTAL += price;
						break;
					}
					case "3": {
						price = 1.00;
						price *= numTickets;
						CARTTOTAL += price;
						break;
					}
					case "4": {
						price = 1.20;
						price *= numTickets;
						CARTTOTAL += price;
						break;
					}
					case "5": {
						price = 1.20;
						price *= numTickets;
						CARTTOTAL += price;
						break;
					}
					}
				} else {
					System.out.println("Error, Report administrator");
					terminalMenu();
				}
			} else {
				if (ticketTypeFares.equals("Return")) {
					if (selectedAge.equals("Adult")) { // return adult
						switch (selectedZone) {
						case "1": {
							price = 3.70;
							price *= numTickets;
							CARTTOTAL += price;
							break;
						}
						case "2": {
							price = 4.40;
							price *= numTickets;
							CARTTOTAL += price;
							break;
						}
						case "3": {
							price = 5.40;
							price *= numTickets;
							CARTTOTAL += price;
							break;
						}
						case "4": {
							price = 5.40;
							price *= numTickets;
							CARTTOTAL += price;
							break;
						}
						case "5": {
							price = 5.90;
							price *= numTickets;
							CARTTOTAL += price;
							break;
						}
						}
					} else { // return Child
						switch (selectedZone) {
						case "1": {
							price = 1.80;
							price *= numTickets;
							CARTTOTAL += price;
							break;
						}
						case "2": {
							price = 1.80;
							price *= numTickets;
							CARTTOTAL += price;
							break;
						}
						case "3": {
							price = 1.80;
							price *= numTickets;
							CARTTOTAL += price;
							break;
						}
						case "4": {
							price = 2.30;
							price *= numTickets;
							CARTTOTAL += price;
							break;
						}
						case "5": {
							price = 2.30;
							price *= numTickets;
							CARTTOTAL += price;
							break;
						}
						}
					}
				}
			}
		} else { // Statement for Flexi Pricings
			if (selectedAge.equals("Adult")) { // adult price table
				switch (ticketTypeFares) {
				case "1 Day": {
					price = 7.20;
					price *= numTickets;
					CARTTOTAL += price;
					break;
				}
				case "7 Day": {
					switch (selectedZone) {
					case "1": {
						price = 16.30;
						price *= numTickets;
						CARTTOTAL += price;
						break;
					}
					case "2": {
						price = 19.70;
						price *= numTickets;
						CARTTOTAL += price;
						break;
					}
					case "3": {
						price = 24.50;
						price *= numTickets;
						CARTTOTAL += price;
						break;
					}
					case "4": {
						price = 24.50;
						price *= numTickets;
						CARTTOTAL += price;
						break;
					}
					case "5": {
						price = 27.00;
						price *= numTickets;
						CARTTOTAL += price;
						break;
					}
					}
					break;

				}
				case "30 Day": {
					switch (selectedZone) {
					case "1": {
						price = 65;
						price *= numTickets;
						CARTTOTAL += price;
						break;
					}
					case "2": {
						price = 79;
						price *= numTickets;
						CARTTOTAL += price;
						break;
					}
					case "3": {
						price = 95;
						price *= numTickets;
						CARTTOTAL += price;
						break;
					}
					case "4": {
						price = 95;
						price *= numTickets;
						CARTTOTAL += price;
						break;
					}
					case "5": {
						price = 102;
						price *= numTickets;
						CARTTOTAL += price;
						break;
					}
					}
					break;
				}
				}
			} else if (selectedAge.equals("Child")) { // child price table
				switch (ticketTypeFares) {
				case "1 Day": {
					price = 3;
					price *= numTickets;
					CARTTOTAL += price;
					break;
				}
				case "7 Day": {
					switch (selectedZone) {
					case "1": {
						price = 7.80;
						price *= numTickets;
						CARTTOTAL += price;
						break;
					}
					case "2": {
						price = 7.80;
						price *= numTickets;
						CARTTOTAL += price;
						break;
					}
					case "3": {
						price = 7.80;
						price *= numTickets;
						CARTTOTAL += price;
						break;
					}
					case "4": {
						price = 9.40;
						price *= numTickets;
						CARTTOTAL += price;
						break;
					}
					case "5": {
						price = 9.40;
						price *= numTickets;
						CARTTOTAL += price;
						break;
					}
					}
					break;
				}
				case "30 Day": {
					switch (selectedZone) {
					case "1": {
						price = 31;
						price *= numTickets;
						CARTTOTAL += price;
						break;
					}
					case "2": {
						price = 31;
						price *= numTickets;
						CARTTOTAL += price;
						break;
					}
					case "3": {
						price = 31;
						price *= numTickets;
						CARTTOTAL += price;
						break;
					}
					case "4": {
						price = 37.50;
						price *= numTickets;
						CARTTOTAL += price;
						break;
					}
					case "5": {
						price = 37.50;
						price *= numTickets;
						CARTTOTAL += price;
						break;
					}
					}
					break;
				}
				}
			} else { // student price table
				switch (ticketTypeFares) {
				case "1 Day": {
					price = 0;
					price *= numTickets;
					CARTTOTAL += price;
					break;
				}
				case "7 Day": {
					switch (selectedZone) {
					case "1": {
						price = 12;
						price *= numTickets;
						CARTTOTAL += price;
						break;
					}
					case "2": {
						price = 13.70;
						price *= numTickets;
						CARTTOTAL += price;
						break;
					}
					case "3": {
						price = 17.00;
						price *= numTickets;
						CARTTOTAL += price;
						break;
					}
					case "4": {
						price = 17.00;
						price *= numTickets;
						CARTTOTAL += price;
						break;
					}
					case "5": {
						price = 19;
						price *= numTickets;
						CARTTOTAL += price;
						break;
					}
					}
					break;
				}
				case "30 Day": {
					switch (selectedZone) {
					case "1": {
						price = 45.5;
						price *= numTickets;
						CARTTOTAL += price;
						break;
					}
					case "2": {
						price = 54.5;
						price *= numTickets;
						CARTTOTAL += price;
						break;
					}
					case "3": {
						price = 65;
						price *= numTickets;
						CARTTOTAL += price;
						break;
					}
					case "4": {
						price = 65;
						price *= numTickets;
						CARTTOTAL += price;
						break;
					}
					case "5": {
						price = 75;
						price *= numTickets;
						CARTTOTAL += price;
						numTickets++;
						break;
					}
					}
					break;
				}
				}
			}
		}
		/*
		 * Displaying different orders in one global string values
		 */
		STR_DETAILS += "\n-----------------------------------\n|      TICKET DETAILS: \n| Ticket Holder's Name: "+ NAMEUSER
				+ "\n| Selected Ticket: \t" + ticketType + " \n| Selected Zone: \t\t" + selectedZone
				+ " \n| Selected Ticket Fares:    " + ticketTypeFares + " \n| Selected Ticket Age: \t" + selectedAge
				+ " \n| Ticket Quantities: \t" +  numTickets + "\n| There is: "+(STATS_INK_PAPER-=numTickets)+" Ticket Lift";
		System.out.println(STR_DETAILS);

		System.out.println("| Price: �" + CURRENCY.format(CARTTOTAL));
		System.out.println("-----------------------------------");
		System.out.println("-----------------------------------");
		System.out.println("1) Pay" + "                            |");
		System.out.println("2) Add more items" + "                 |");
		System.out.println("3) Cancel" + "                         |");
		System.out.println("-----------------------------------");
		String choice = INPUT.next();
		switch (choice) {
		case "1": {
			try {
				payment(ticketType, selectedZone, ticketTypeFares, selectedAge, numTickets);
			} catch (InputMismatchException e) {
				System.out.println("Error");
				payment(ticketType, selectedZone, ticketTypeFares, selectedAge, numTickets);
			}
			break;
		}
		case "2": {
			if(STATS_INK_PAPER <= 0) {
				System.out.println("| Price: �" + CURRENCY.format(CARTTOTAL));
				payment(ticketType, selectedZone, ticketTypeFares, selectedAge, numTickets);
				
			}else {
				selectTicketType();
			}
			
			break;
			
		}
		case "3": {
			System.out.println("Returning to main menu...");
			CARTTOTAL = 0;
			STR_DETAILS = "";
			terminalMenu();
			break;
			
		}
		default: {
			System.out.println("Invalid option, try again");
			addToCart(ticketType, selectedZone, ticketTypeFares, selectedAge, numTickets);
		}
		}
	}

	private static void payment(String ticketType, String selectedZone, String ticketTypeFares, String selectedAge,
			int numTickets) {
		/*
		 * 2 Local duplicated variables of global variable , cartTotal and
		 * insertedMoney, are used for remaining balance calculation. for stable
		 * calculation payment method
		 */
		double LcartTotal = 0;
		double moneyIn = 0;
		LcartTotal = LcartTotal + CARTTOTAL;
		System.out.println("---------------------------------");
		System.out.println("Price �: " + LcartTotal + "                     |");
		System.out.println("Please Insert Your Payment" + "       |");
		System.out.println("---------------------------------");
		moneyIn = INPUT.nextDouble();
		terminalMenu();
		/*
		 * First input, calc before while loop.
		 */
		double LmoneyIn = 0;
		LmoneyIn = LmoneyIn + moneyIn;
		INSERTED_MONEY += LmoneyIn;
		while (INSERTED_MONEY < CARTTOTAL) {
			LcartTotal -= LmoneyIn;
			if (LcartTotal == 0.00 | LcartTotal <= 0.00) { // Fixing logic errors for balance @ 0.00
				paymentSuccessful(ticketType, selectedZone, ticketTypeFares, selectedAge, numTickets);
			}
			System.out.println("Remaining Balance: " + CURRENCY.format(LcartTotal));
			System.out.println("Please insert remaining balance");
			LmoneyIn = INPUT.nextDouble();
			INSERTED_MONEY += LmoneyIn;
		}
		paymentSuccessful(ticketType, selectedZone, ticketTypeFares, selectedAge, numTickets);
	}

	public static void paymentSuccessful(String ticketType, String selectedZone, String ticketTypeFares,
			String selectedAge, int numTickets) {
		/*
		 * Method for resetting data on global variables or adding to Statistics values
		 */
		STR_DETAILS = "";
		STATS_INK_PAPER -= numTickets;
		STATS_TOTAL_INCOME += CARTTOTAL;
		/*
		 * Change Calc
		 */
		if (CARTTOTAL < INSERTED_MONEY) {
			INSERTED_MONEY -= CARTTOTAL;
			/*
			 * Data Conversion
			 */
			String insertedMoneyConversion = "";
			insertedMoneyConversion += INSERTED_MONEY;
			double Converted = Double.parseDouble(insertedMoneyConversion);
			if (CARTTOTAL != 0) {
				System.out.println("Your change is �" + CURRENCY.format(Converted));
			} else {
				System.out.println("Debug 0.00");
			}
		}
		INSERTED_MONEY = 0;
		STATS_TICKET_SALES += numTickets;
		switch (selectedAge) {
		case "Adult": {
			STATS_NUM_ADULT += numTickets;
			if (ticketType.equals("Standard")) {
				STATS_NUM_STANDARD_ADULT += numTickets;
			} else {
				STATS_NUM_FLEXI_ADULT += numTickets;
			}
			break;
		}
		case "Child": {
			STATS_NUM_CHILD += numTickets;
			if (ticketType.equals("Standard")) {
				STATS_NUM_STANDARD_CHILD += numTickets;
			} else {
				STATS_NUM_FLEXI_CHILD += numTickets;
			}
			break;
		}
		case "Student": {
			STATS_NUM_STUDENT += numTickets;
			STATS_NUM_FLEXI_STUDENT += numTickets;
			break;
		}
		}
		switch (ticketType) {
		case "Standard": {
			STATS_NUM_STANDARD += numTickets;
			break;
		}
		case "Flexi": {
			STATS_NUM_FLEXI += numTickets;
			break;
		}
		}
		switch (ticketTypeFares) {
		case "Single": {
			STATS_NUM_SINGLE += numTickets;
			break;
		}
		case "Return": {
			STATS_NUM_RETURN += numTickets;
			break;
		}
		case "1 Day": {
			STATS_NUM_FLEXI_1 += numTickets;
			break;
		}
		case "7 Day": {
			STATS_NUM_FLEXI_7 += numTickets;
			break;
		}
		case "30 Day": {
			STATS_NUM_FLEXI_30 += numTickets;
			break;
		}
		}
		AVERAGE_PRICE = STATS_TOTAL_INCOME / STATS_TICKET_SALES;
		CARTITEMS = 0;
		CARTTOTAL = 0;
		System.out.print("Thank you for your purchase\n");
		checkInkPaper();
		terminalMenu();
	}

	public static void login() {
		String password = "111";
		System.out.println("Enter password ");// We Should have a \n The Password is '111';
		String enteredPassword = INPUT.next();
		if (enteredPassword.equals(password)) {
			LOGIN = true;
			admin();
		} else if (enteredPassword.equals("x")) {
			terminalMenu();
		} else {
			System.out.println("Incorrect Password, try again");
			System.out.println("( Press X to go back )");
			login();
		}
	}

	public static void admin() {
		if (LOGIN == false) {
			login();
		} else {
			if (STATS_INK_PAPER <= 20) {
				System.out.println("============================");
				System.out.println(" (!) Alert (!)");
				System.out.println("Machine low on Ink / Paper");
				System.out.println("============================");
			}
			System.out.println("------------------------------------------------------");
			System.out.println("   -- ADMIN PANEL --" + "                              |");
			System.out.println("1) Manage Terminal" + "                                |");
			System.out.println("2) Display Statistics" + "                             |");
			System.out.println("3) Logout" + "                                         |");
			System.out.println("4) Return to Terminal Menu ( Without Logging Out )" +"|");
			System.out.println("x) Shut Down System" + "                               |");
			System.out.println("------------------------------------------------------");
			String choice = INPUT.next();
			switch (choice) {
			case "1": {
				adminManage();
				break;
			}
			case "2": {
				stats();
				break;
			}
			case "3": {
				LOGIN = false;
				System.out.println("Logging out...");
				terminalMenu();
				break;
			}
			case "4": {
				terminalMenu();
				break;
			}
			case "x": {
				System.out.println("Shutting Down...");
				System.exit(0);
				break;
			}
			default: {
				System.out.println("Invalid option, try again");
				admin();
				break;
			}
			}
		}
	}

	public static void adminManage() {
		System.out.println("------------------------------------");
		System.out.println("   -- MANAGE TERMINAL --" + "        |");
		System.out.println("1) Refill Ink and Papers" + "        |");
		System.out.println("2) Return to admin panel" + "        |");
		System.out.println("------------------------------------");
		String choice = INPUT.next();
		switch (choice) {
		case "1": {
			STATS_INK_PAPER = 100;
			System.out.println("Your machine has been refilled.");
			break;
		}
		case "2": {
			System.out.println("Returning to admin panel...");
			admin();
			break;
		}
		default: {
			break;
		}
		}
		adminManage();
	}

	public static void stats() {
		System.out.println("------------------------------------------");
		System.out.println("        -- STATS --" + "                   |");
		System.out.println("1) Statistics for Standard Tickets" + "    |");
		System.out.println("2) Statistics for Flexi Tickets" + "       |");
		System.out.println("3) Total Statistics" + "                   |");
		System.out.println("x) Return to admin panel" + "              |");
		System.out.println("------------------------------------------");
		String choice = INPUT.next();
		switch (choice) {
		case "1": {
			statsStandard();
			break;
		}
		case "2": {
			statsFlexi();
			break;
		}
		case "3": {
			statsTotal();
			break;
		}
		case "x": {
			admin();
			break;
		}
		default: {
			System.out.println("Returning to admin panel...");
			break;
		}
		}
	}

	private static void statsStandard() {
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("Numbers of Standard ticket sold: \t" + STATS_NUM_STANDARD);
		System.out.println("Numbers of Adult|Child: \t" + STATS_NUM_STANDARD_ADULT + "|" + STATS_NUM_STANDARD_CHILD);
		System.out.println("Numbers of Single|Return: \t" + STATS_NUM_SINGLE + "|" + STATS_NUM_RETURN);
		System.out.println("\nPress any button to return to stats panel");
		String choice = INPUT.next();
		System.out.println("------------------------------------------------------------------------");
		switch (choice) {
		default: {
			stats();
		}
		}
	}

	private static void statsFlexi() {
		String localStatsNumFlexi = Integer.toString(STATS_NUM_FLEXI);
		System.out.println("Numbers of Flexi ticket sold: \t" + localStatsNumFlexi);
		System.out.println("Numbers of Adult|Child|Student: \t" + STATS_NUM_FLEXI_ADULT + "|" + STATS_NUM_FLEXI_CHILD
				+ "|" + STATS_NUM_FLEXI_STUDENT);
		System.out.println("Numbers of 1 Day|7 Day|30 Day: \t" + STATS_NUM_FLEXI_1 + "|" + STATS_NUM_FLEXI_7 + "|"
				+ STATS_NUM_FLEXI_30);
		System.out.println("\nPress any button to return to stats panel");
		String choice = INPUT.next();
		switch (choice) {
		default: {
			stats();
		}
		}
	}

	private static void statsTotal() {
		String terminal = "";
		if (MACHINE_STATUS == true) {
			terminal = ARRAY_MACHINE_STATUS[1];
		} else {
			terminal = ARRAY_MACHINE_STATUS[0];
		}
		System.out.println("-- Stats --");
		System.out.println("Machine Status: " + terminal + " | " + STATS_INK_PAPER + " Available Tickets");
		System.out.println("Total Income: �" + CURRENCY.format(STATS_TOTAL_INCOME));
		System.out.println("Average: �" + CURRENCY.format(AVERAGE_PRICE));
		System.out.println("Number Of Tickets Sold: " + STATS_TICKET_SALES);
		System.out.println("Numbers of Adult|Child|Student ticket(s) bought: " + STATS_NUM_ADULT + "|" + STATS_NUM_CHILD
				+ "|" + STATS_NUM_STUDENT);
		System.out.println("\nPress any button to return to stats panel");
		String choice = INPUT.next();
		switch (choice) {
		default: {
			stats();
		}
		}
	}
}