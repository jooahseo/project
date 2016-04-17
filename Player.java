import java.util.Random;
import java.util.Scanner;

public class Player {
	private int GuessingRange;
	private int theAnswer, userGuess;
	public int attempts;
	
	Player(){
		attempts=0;
	}

	public void Guessing(String selected){
		Random random = new Random();
		Scanner input = new Scanner(System.in);
		if(selected== "gumball")
			GuessingRange=1000;
		else if (selected== "towel") 
			GuessingRange=100;
		else if (selected== "pen" )
			GuessingRange=200;
		else if(selected== "chicken")
			GuessingRange=20;
		else if (selected=="lotion")
			GuessingRange=50;
		
		theAnswer = random.nextInt(GuessingRange);
		boolean incorrect=true;
		System.out.printf("Okay! your choice is a %s. \n I put some %ss in the jar. \n The maximum number I can put %s in the jar is %d \n",selected, selected, selected, GuessingRange);
		
		while(incorrect){
			System.out.printf("Please guess how many %s in the jar: ", selected);
			userGuess=input.nextInt();
			
			if(userGuess==theAnswer){
				if(attempts<2)
				System.out.printf("Congratulations! you win the game after %d attempt \n",attempts);
				else
					System.out.printf("Congratulations! you win the game after %d attempts \n",attempts);
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
