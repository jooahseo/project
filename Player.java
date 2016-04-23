
import java.util.Scanner;

public class Player {
	private String item;
	private int theAnswer, userGuess;
	public int attempts;
	
	Player(String item, int answer){
		this.item=item;
		theAnswer=answer;
		attempts=0;
	}

	public void GuessingStart(){
		System.out.println("Hi player!, the Jar has been randomly filled with "+ item);
		Scanner input = new Scanner(System.in);
		
		boolean incorrect=true;
	
		while(incorrect){
			System.out.printf("Please guess how many %s in the jar: ", item);
			userGuess=input.nextInt();
			
			if(userGuess==theAnswer){
				if(attempts<2){
				attempts++;
				System.out.printf("Congratulations! you win the game after %d attempt \n",attempts);
				}
				else{
					attempts++;
					System.out.printf("Congratulations! you win the game after %d attempts\n",attempts);
				}
				incorrect=false;
			}
			else if(userGuess < theAnswer){
				System.out.println("We have more than that in the jar");
				attempts++;
			}
			else if(userGuess> theAnswer){
				System.out.println("We have less than that in the jar");
				attempts++;
			}
			
		}
	}
}
