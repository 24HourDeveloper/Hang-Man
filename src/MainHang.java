import java.util.Scanner;
public class MainHang {

	/*This is a Hang man game
	 * You only get 6 trys
	 * You get one letter at a time
	 * game logic checks to see if the letter selected was correct
	 */


	public static void main(String[] args) {
		//scanner so user can enter guess
		Scanner input = new Scanner(System.in);

		// object that holds the hang man word
		SecretWord secretWord = new SecretWord("Hangman");
		String word = secretWord.getHangWord();
		StringBuilder emptyString = new StringBuilder("_______");

		int i = 0;
		while (i < 6) {
			System.out.println("Enter A Letter: ");
			String guess = input.nextLine();

			int z = 0;
			for (int a = 0; a < word.length(); a++){
				//placing the characters in the right spot
				if (word.toLowerCase().charAt(a) == guess.charAt(0)){
					emptyString.setCharAt(a, guess.charAt(0));
					z++;
				}
			}
			//making sure that if the guess occurs more than one time it is only decremented one time
			if (z == 1)
				i--;
			if (z > 1)
				i--;

			System.out.println(emptyString);

			if (word.equalsIgnoreCase(emptyString.toString())){
				System.out.println("Congrats you one the game!!!!");
				return;
			}
			i++;
		}
		System.out.println("Sorry you lost the game. please try again!");
	}

}