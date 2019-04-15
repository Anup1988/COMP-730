import java.util.Random;

public class PlayerTester {

	public static void main(String[] args) {

		Player player = new Player();
		CommandInvoker comObj = new CommandInvoker();
		
		MoveNorth northObj = new MoveNorth(player);
		MoveSouth southObj = new MoveSouth(player);
		MoveEast eastObj = new MoveEast(player);
		MoveWest westObj = new MoveWest(player);
		
		Random random = new Random();
		int number;
		
		for(int i=0; i<50; i++) {
			
			number = random.nextInt(4) + 1;
			
			if(number == 4) {
				comObj.setCommand(westObj);
				comObj.movePlayer();
				
			}
			else if(number == 3) {
				comObj.setCommand(southObj);
				comObj.movePlayer();
			}
			
			else if(number ==2) {
				
				comObj.setCommand(eastObj);
				comObj.movePlayer();
			}
			else {
				
				comObj.setCommand(northObj);
				comObj.movePlayer();
			}
			System.out.println("               ");
			
		}
		
		
		System.out.println("Final coordinate: " + player.getX()+"," + player.getY());
		
		
		
		
	}

}
