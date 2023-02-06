import java.util.Scanner;
public class LuasElseIf {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("How old are you?");
		int Age = input.nextInt();
		double UA = 0;
		if(Age < 18) {
			UA = 1;
		}
		else if(Age >= 18);{
			UA = 1.50;
		}
			
		
		System.out.println("How many zones are you travelling between?");
		int Zones = input.nextInt();
		
		double Cost = Zones * UA;
		
		System.out.println("Your ticket is € " + Cost + ".");
	}
	
	
	
}
