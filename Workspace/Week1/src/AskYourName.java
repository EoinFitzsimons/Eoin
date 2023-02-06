import java.util.Scanner;
public class AskYourName

{
	public static void main(String []args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("What's your name?");
		
		String Name = input.nextLine();
	    System.out.println("Hello " + Name + " how are you?");
	    
	    String How = input.nextLine();
	    System.out.println("Oh " + Name + " why are you " + How + "?");
	    
	    String Reason = input.nextLine();
	    System.out.println( Reason + "? That's an interesting reason for feeling " + How + "...");
	    System.out.println("By the way, how old are you " + Name + "?");
	    
	    String Age = input.nextLine();
	    System.out.println("Well "+ Name + " the " + Age + " year old, who feels " + How + " because " + Reason + " it's very nice to meet you.");
	}
}
