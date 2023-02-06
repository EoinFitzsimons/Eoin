import java.util.Scanner;
public class GameDifficulty {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String LevelString = "Expert";
		int Level = 0;
		switch(LevelString) {
		case "Beginner": Level = 1;
		break;
		case "Medium": Level = 2;
		break;
		case "Expert": Level = 3;
		break;
		default: Level = 0;
		break;
		}
		System.out.println("Select Level:");
		Level = input.nextInt();
		System.out.println("Your level is "+Level);	
	}
}
