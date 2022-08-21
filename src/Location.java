/**
 * This class creates a Location with an X and Y coordinate
 * @author Jake Holovka
 *
 */
public class Location {

	private int xCoord;
	private int yCoord;
	/**
	 * This is the empty-argument constructor
	 */
	public Location() {
		
		xCoord = 0;
		yCoord = 0;
	
	}//end empty-argument constructor
	/**
	 * This is the preferred constructor
	 * @param int x
	 * @param int y
	 */
	public Location(int x, int y) {
		
		this.xCoord = x;
		this.yCoord = y;
		
	}//end preferred constructor
	/**
	 * This method lets you change the X and Y coordinates
	 * @param int x
	 * @param int y
	 */
	public void update(int x, int y) {
		this.xCoord = x;
		this.yCoord = y;
		
	}//end update
	/**
	 * Returns the coordinates in an array
	 * @return int[]
	 */
	public int[] getCoordinates() {
		
	int[] Loc = new int[2];
	Loc[0] = xCoord;
	Loc[1] = yCoord;
	
	 
	return Loc;
	}//end getCoordinates
/**
 * @return String
 */
	@Override
	public String toString() {
		return "Location [xCoord=" + xCoord + ", yCoord=" + yCoord + "]";
	}//end toString
	
}//end class
