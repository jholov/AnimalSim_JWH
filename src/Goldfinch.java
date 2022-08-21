/**
 * This class extends animal and implements Walkable and Flyable to create a Goldfinch bird object
 * @author Jake Holovka
 *
 */
public class Goldfinch extends Animal implements Walkable, Flyable{

	private double wingSpan;
	/**
	 * This is the empty-argument constructor
	 */
	public Goldfinch() {
		
		super();
		wingSpan = 9;
		
	}//end empty-argument constructor
	/**
	 * This is the preferred constructor
	 * @param int simID
	 * @param Location location
	 * @param double wingSpan
	 */
	public Goldfinch(int simID, Location location, double wingSpan) {
		
	super(simID, location);
	setWingSpan(wingSpan);
	
	}//end preferred constructor
	/**
	 * Returns WingSpan to the caller
	 * @return double
	 */
	public double getWingSpan() {
		return wingSpan;
	}//end getWingSpan
	/**
	 * Allows the caller to set the wingSpan
	 * @param double wingSpan
	 */
	public void setWingSpan(double wingSpan) {
		
		if(wingSpan>= 5 && wingSpan <= 11.0) {
			this.wingSpan = wingSpan;}
		else {System.out.println("Invalid WingSpan");}
		
	}//end setWingSpan
	/**
	 * This method sets the new Location of an object
	 * @param Location I
	 */
	@Override
	public void fly(Location I) {
		// TODO Auto-generated method stub
		
		setLocation(I);
		
	}//end fly
	/**
	 * This method allows the caller to set the direction the object will walk towards
	 * @param int direction
	 */
	@Override
	public void walk(int direction) {
		// TODO Auto-generated method stub
		
		int north = 1;
		int south = -1;
		int east = 2;
		int west = -2;
	
		int[] currentloc=location.getCoordinates();
		
		if(direction == north) {
			//X coordinate
			currentloc[0]=currentloc[0]+0;
			//Y coordinate
			currentloc[1]=currentloc[1]+1;
			
			location.update(currentloc[0], currentloc[1]);
			
		}else if(direction == south) {
			//X coordinate
			currentloc[0]=currentloc[0]+0;
			//Y coordinate
			currentloc[1]=currentloc[1]-1;
			
			location.update(currentloc[0], currentloc[1]);
			
		}else if (direction == east) {
			//X coordinate
			currentloc[0]=currentloc[0]+1;
			//Y coordinate
			currentloc[0]=currentloc[0]+0;
			
			location.update(currentloc[0], currentloc[1]);
			
		}else if (direction == west) {
			//x coordinate
			currentloc[0]=currentloc[0]-1;
			//Y coordinate
			currentloc[0]=currentloc[0]+0;
			
			location.update(currentloc[0], currentloc[1]);
			
		}else {System.out.println("Wrong Direction");}
		
	}//end walk
	/**
	 * @return String
	 */
	@Override
	public String toString() {
		return "Goldfinch [wingSpan=" + wingSpan + ", simID=" + simID + ", location=" + location + ", full=" + full
				+ ", rested=" + rested + "]";
	}//end toString
	
}//end class
