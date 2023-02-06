import java.util.Arrays;

public class SortArrayEx2 {
	public static void main(String[] args) {
		float [] resultArray = {90.03, 23.05 ,5.06, 109.11, 1.2, 2.2, 6.7, 3.4};
		System.out.println("Default Order: " + Arrays.toString(resultArray));
		Arrays.sort(resultArray);
		System.out.println("Sorted Order: " + Arrays.toString(resultArray));
		}
	}
