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
		SecretWord sw = new SecretWord("Hangman");
		String word = sw.getHangWord();
		
		System.out.println("Enter first guess: ");
		String guess = input.nextLine();
		
		if(guess.equals(word)){
			System.out.println("Correct!!!");
		}else{
			System.out.println("Incorrect!!");
		}
		
		//System.out.println(sw.getHangWord());
	}

}
