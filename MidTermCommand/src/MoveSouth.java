
public class MoveSouth implements CommandInterface{

	private Player player;
	
	public MoveSouth(Player player) {
		
		this.player = player;
	}
	
	
	@Override
	public void execute() {
		
		player.moveSouth();
	}

	@Override
	public boolean undo() {
		
		
		return false;
	}
	

}
