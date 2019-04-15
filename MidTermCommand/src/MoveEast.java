
public class MoveEast implements CommandInterface {

	private Player player;
	
	public MoveEast(Player player) {
		
		this.player = player;
	}
	
	
	@Override
	public void execute() {

		player.moveEast();
		
	}

	@Override
	public boolean undo() {
		
		
		
		return false;
	}

}
