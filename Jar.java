import java.util.Random;

public class Jar {

	private String item;
	private int totalNumber;
	private int howMany;
	
		public Jar(String item, int totalNum){
			this.item= item;
			totalNumber=totalNum;
		}
		public void fill(){
			Random random=new Random();
			howMany=random.nextInt(totalNumber);
			
			Player player=new Player(item, howMany);
			player.GuessingStart();
		}
}
