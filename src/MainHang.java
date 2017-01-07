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
		String emptyString = "";
		
		int i = 0;
		while(i < word.length()){
		System.out.println("Enter A Letter: ");
		String guess = input.nextLine();
		
		for(int x= 0; x < word.length(); x++){
			if(Character.toString(word.charAt(x)).equals(guess)){
				System.out.println(guess);
				emptyString += guess;
				System.out.println("Empty String "+emptyString);
				break;
			}else{
				System.out.println("Letter not found. Try again!");
				continue;
			}
			
		}
		}
		
		//System.out.println(word.charAt(0));
		
		/*if(guess.equals(word)){
			System.out.println("Correct!!!");
		}else{
			System.out.println("Incorrect!!");
		}*/
		
		//System.out.println(sw.getHangWord());
	}

}
