
public class MoveNorth implements CommandInterface{

	
	private Player player;
	
	public MoveNorth(Player player) {
		
		this.player = player;
	}
	
	
	
	@Override
	public void execute() {
		
		player.moveNorth();
	}

	@Override
	public boolean undo() {
		
		return false;
	}

	
}
