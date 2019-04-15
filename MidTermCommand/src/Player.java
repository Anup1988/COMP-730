// This is a receiver

public class Player {

	private int xCoord;
	private int yCoord;

	public Player() {

		this.xCoord = 0;
		this.yCoord = 0;

	}

	public void moveSouth() {

		System.out.println("Moved South");
		yCoord -= 1;
		System.out.println("X coordinate: "+ xCoord + ", Y coordinate: " + yCoord);
	}

	public void moveNorth() {

		System.out.println("Moved North");
		yCoord += 1;
		System.out.println("X coordinate: "+ xCoord + ", Y coordinate: " + yCoord);
	}

	public void moveEast() {

		System.out.println("Moved East");
		xCoord += 1;
		System.out.println("X coordinate: "+ xCoord + ", Y coordinate: " + yCoord);
	}

	public void moveWest() {

		System.out.println("Moved West");
		xCoord -= 1;
		System.out.println("X coordinate: "+ xCoord + ", Y coordinate: " + yCoord);
	}
	
	public int getX() {
		return xCoord;
	}
	
	public int getY() {
		
		return yCoord;
	}
}
