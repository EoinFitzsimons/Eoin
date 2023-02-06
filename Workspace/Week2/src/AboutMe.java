

import java.util.Scanner;
public class AboutMe

{
	public static void main(String []args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("What's your name?");
		String Name = input.nextLine();
		System.out.println("What's your age?");
		String Age = input.nextLine();
		System.out.println("What's your height in cm?");
		String Height = input.nextLine();
		System.out.println("What's your college?");
		String College = input.nextLine();
		System.out.println("What's your course?");
		String Course = input.nextLine();
		
		System.out.println("Your name is " + Name + ", you are " + Age + " years old, you are " + Height +  " tall, you are studying in " + College + " and the course you are doing is " + Course + ".");
		

	}
}
