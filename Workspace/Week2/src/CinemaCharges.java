	import java.util.Scanner;
	public class CinemaCharges {
	
		public static void main(String[] args){
			Scanner scanner=new Scanner(System.in);
			char parser = '0';
			
			double ChildTicket = 2.50;
			double TeenTicket = 5.50;
			double AdultTicket = 7.50;
			double StudentTicket = 6.50;
			
				System.out.println("Welcome to Movieplace! Please select your age below and present any relevant ID when collecting your ticket.");
				System.out.println("1. 5-11.");
				System.out.println("2. 12-17.");
				System.out.println("3. 18-64. Non-student");
				System.out.println("4. 18-64. Student");
				System.out.println("5. None of the above.");
				parser = scanner.next().charAt(0);
				
				switch(parser) {
				
				case '1' :
					System.out.println("€" + ChildTicket + "0");
					break;
				case '2' :
					System.out.println("€" + TeenTicket + "0");
					break;
				case '3' :
					System.out.println("€" + AdultTicket + "0");
					break;
				case '4' :
					System.out.println("€" + StudentTicket + "0");
					break;
				case '5' :
					System.out.println("Free");
					break;
				default:
					System.out.println("You have not selected an age, please reset the form and enter a number from 1 to 5 which applies to you.");
					
				}
		}
	}