public class Game {
 
  public static void main(String[] args) {
    System.out.println("Welcome!");
		
		Administrator admin = new Administrator();
		Player p1= new Player();
		String selection = admin.PromptUser();
		p1.Guessing(selection);
		
  }
  
}