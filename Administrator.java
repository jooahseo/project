import java.util.Scanner;

public class Administrator {
	
	Scanner scanning= new Scanner(System.in);
	private String[] items={"gumball","towel","chicken","pen","lotion"};
	public String selection ="";
	public String UserInput;
	

	public String PromptUser(){
		System.out.printf("We have :");
		for(int i=0; i<items.length; i++){
			if(i==items.length-1 )
				System.out.println(items[i]+".");
			else
			System.out.print(items[i]+",");
		}
		
			boolean contains= false;
			while(contains!=true){
				System.out.println("Please pick an item you want to guess:");
				UserInput= scanning.nextLine();
				for(int i=0; i<items.length;i++){
					if(UserInput.equalsIgnoreCase(items[i])){
						selection= items[i];
						contains = true;
					}
				}
				if(contains==false){
					System.out.println("Your choice is not valid.");
				}
			}
			System.out.printf("you choose : %s\n", selection);
			return selection;
	}
}
