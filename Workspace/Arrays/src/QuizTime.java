import java.util.Scanner;
public class QuizTime {

	public static void main(String[] args) {
		Scanner A = new Scanner(System.in);

		String[] Q = {
				"#1 Who ISN'T from Ukraine? 1) Ed 2) Maksym 3) Artem 4) Hanna",
				"#2 What country is Aakarsh's family from? 1) Mongolia 2) Nepal 3) Phillipenes 4) Myanmar",
				"#3 How many in the class speak Spanish fluently? 1) One 2) Two 3) Three 4) Four",
				"#4 Who dressed up for halloween? 1) Hanna 2) Eoin 3) Albert 4) Joey",
				"#5 How many hours of classes do we have in a week? 1) 21 2) 23 3) 25 4) 26",
				"#6 Which letter appears at the start of most people's firstnames? 1) A 2) D 3) S 4) A&S Tied",
				"#7 Who has never worn a hat in class? 1) Eoin 2) Khalid 3) Joey 4) Daniel",
				"#8 Which assignment was due first? 1) OOP 2) PPD 3) PM 4) Communications",
				"#9 Who has the inspirational quote on the wall outside room 7? 1) Plato 2) William Shakespear 3) Cristiano Ronaldo 4) Tinkie-Winkie",
				"#10 Who was the fastest go karter of our class? 1) Ed 2) Maksym 3) MD 4) Saleem",
				"#11 According to Sonya, which pair is always smiling? 1) Sean & Sunny 2) Reuben & Sergii 3) MD & Abiola 4) Fred & Aaron",
				"#12 What is Sergii's Masters in?  1) Chemistry  2) Physics 3) Biology 4) Geography",
				"#13 What mythical animal features prominently on Maks' laptop? 1) Unicorn 2) Dragon 3) Pegasus 4) Cow",
				"#14 What country is Albert from? 1) Spain 2) Slovenia 3) Armenia 4) Romania",
				"#15 Who made this quiz? 1) Tinkie-Winkie 2) Eoin 3) Geograpghy 4) Cow",
				"#16 What kind of driver was Sunny? 1) Train Driver 2) Luas Driver 3) Taxi Driver 4) Bus Driver",
				"#17 What colour is Eoin's cat? 1) Ginger 2) Black 3) White 4) Tabby",
				"#18 Who are the class reps? 1) Abiola & Sean 2) Sergii & Maksm 3) Ed & Albert 4) Khalid & Aakarsh"
				
		};
		int[] ansArray;
		int[] keyArray = {1, 2, 3, 1, 2, 4, 4, 3, 3, 1, 3, 2, 1, 4, 2, 4, 2, 3};
		ansArray = new int[18];
		int score = 0;
		
		 for (int i = 0; i < Q.length; i++) {
			System.out.println(Q[i]);
			ansArray[i] = A.nextInt();
			
			if (ansArray[i] == keyArray[i]) {
				System.out.println("Correct!");
				score ++;
			}
			else {
				System.out.println("Incorrect!");
			}
		 }
		 System.out.println("Score: " + score);
	}
}
