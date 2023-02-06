import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		char choice;
		Scanner console = new Scanner(System.in);
		System.out.println("Y or N: ");
		choice = console.next().charAt(0);
		switch (choice) {
		case 'Y':
		case'y':
			System.out.println("You entered Y.");
		break;
		case 'N':
		case'n':
			System.out.println("You entered N.");
		break;
		default:
			System.out.println("Invalid Input");
		}
		
	}

}
