import java.util.Scanner;
public class VaccineCert {
	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		char input = '0';
		
		System.out.println("Do you have a vaccine cert: ");
		System.out.println("1. yes");
		System.out.println("2. no");
		
		input = user.next().charAt(0);
		
		switch(input) {
		case '1':
			System.out.println("You may reserve a table inside.");
			break;
			
		case '2':
			System.out.println("Sit outside.");
			break;
			
			default:
				System.out.println("Not a valid reply");
			
		}
	}
}
