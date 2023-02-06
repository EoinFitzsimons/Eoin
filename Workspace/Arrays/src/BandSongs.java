public class BandSongs {

	public static void main(String[] args) {
		System.out.println ("I like the band called Numbers.");
		//All	
		String[] ASongs = {"One", "Two", "Three", "Four"};
		for (int i = 0; i < ASongs.length; i++) {
		System.out.println ("One of their songs is " + (ASongs[i]) + ".");
		}
		//Best
		String[] BSongs = {"Two", "Four"};
		for (int i = 0; i < BSongs.length; i++) {
		System.out.println ("I like " + (BSongs[i]) + " in particular.");
		}
	}
}