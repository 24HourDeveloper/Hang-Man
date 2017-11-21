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

		Words words = new Words();
		words.pullWordsFromFile();

		int random = (int) Math.round(Math.random() * (words.getList().size() - 1));

		String secretWord = words.getList().get(random);

		//provide the hint
		System.out.println("Hint: " + words.getDescription().get(random));

		StringBuilder emptyString = new StringBuilder("");
		for (int c = 0; c < secretWord.length(); c++){
			emptyString = emptyString.append("_");
		}

		int i = 0;
		while (i < 6) {
			System.out.println("Enter A Letter: ");
			String guess = input.nextLine().toLowerCase();

			if (guess.length() != 1){
				System.out.println("invalid input");
				return;
			}

			int z = 0;
			for (int a = 0; a < secretWord.length(); a++){
				//placing the characters in the right spot
				if (secretWord.toLowerCase().charAt(a) == guess.charAt(0)){
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

			if (secretWord.equalsIgnoreCase(emptyString.toString())){
				System.out.println("Congrats you won the game!!!!");
				return;
			}
			i++;
		}
		System.out.println("Sorry you lost the game. please try again!");
	}

}