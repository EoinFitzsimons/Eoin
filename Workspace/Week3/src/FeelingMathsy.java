import java.util.Scanner;
public class FeelingMathsy {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char input = '0';
		
		System.out.println("What opperation would you like? ");
		System.out.println("&");
		System.out.println("^");
		
	switch(input) {
		case '&':	
				System.out.println("What number do you want to find the square root of?");
				Double Maths1 = input.nextDouble();
				System.out.println(Math.sqrt(Maths1));
				
		case '^':	
			System.out.println("What number do you want to find the square of?");
			Int Maths2 = input.nextInt();
			System.out.println(Maths2*Maths2);
				
				
				
				
				
				}
	
											}
							}