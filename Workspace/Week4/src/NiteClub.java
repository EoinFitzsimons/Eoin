import java.util.Scanner;
public class NiteClub {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Are you 18+? [Yes/No]");
		String AgeStr = scanner.next();
		int Age = 0;
		
		System.out.println("Are you vaccy waccied? [Yes/No]");
		String VacStr = scanner.next();
		int Vac = 0;
		
		switch(AgeStr) {
		case "Yes": Age=1;
		break;
		case "yes": Age=1;
		break;
		case "Y": Age=1;
		break;
		case "y": Age=1;
		break;
		default: Age=0;
		}
		
		switch(VacStr) {
		case "Yes": Vac=1;
		break;
		case "yes": Vac=1;
		break;
		case "y": Vac=1;
		break;
		case "Y": Vac=1;
		break;
		default: Vac=0;
		}
		
		if (Vac == 1 && Age == 1) {
			System.out.println("Welcome");
		}
		
		else {
			System.out.println("Away");
		}
		
	}
}
