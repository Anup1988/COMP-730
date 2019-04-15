
public class MoveWest implements CommandInterface {

	private Player player;
	
	public MoveWest(Player player) {
		
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
