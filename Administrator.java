import java.util.Scanner;

public class Administrator {
	
	Scanner scanning= new Scanner(System.in);
	
	public String itemInput;
	public int numInput;
	

	public void GameStart(){
		
		
		System.out.println("Hello Admisitrator, Please Enter the type of item will be stored in the jar");
		itemInput= scanning.nextLine();
		
		System.out.printf("What's the total number of %s can fit in the jar?", itemInput);
		numInput= scanning.nextInt();
		
		Jar jar=new Jar(itemInput,numInput);
		
		jar.fill();
		
	}
			
}
