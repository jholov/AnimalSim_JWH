/**
 * This is an abstract class that lets you pull attributes for an animal
 * @author Jake Holovka
 *
 */

public abstract class Animal {

	protected int simID;
	protected Location location = new Location();
	protected boolean full;
	protected boolean rested;
	/**
	 * This is the empty-argument constructor
	 */
	public Animal() {
		
		simID = 0;
		full = false;
		location.update(0, 0);
		rested = true;
		
	}//end empty argument constructor
	/**
	 * This is the preferred constructor
	 * @param int simID
	 * @param Location I
	 */
	public Animal(int simID, Location I) {
		
		setSimID(simID);
		setLocation(I);
		setFull(false);
		setRested(true);
		
	}//end preferred constructor
	/**
	 * This method generates a random number for which it will decide if the object is full or not
	 * @return boolean
	 */
	public boolean eat() {
		
		double numE = Math.random();
		
		if (numE<=.5) {
			setFull(false);
			return false;
			
		}else setFull(true);
			return true;
		
	}//end eat
	/**
	 * This method generates a random number for which it will decide if the object is rested or not
	 * @return boolean
	 */
	public boolean sleep() {
		
		double numS = Math.random();
		
		if (numS<=.5) {
			setRested(false);
			return false;
			
		}else setRested(true);
			return true;
			
	}//end sleep 
	/**
	 * Returns the SimID to the caller
	 * @return int
	 */
	public int getSimID() {
		return simID;
	}//end getSimID
	/**
	 * Allows the caller to set the simID
	 * @param int simID
	 */
	public void setSimID(int simID) {
		this.simID = simID;
	}//end setSimID
	/**
	 * Returns the location to the caller
	 * @return Location
	 */
	public Location getLocation() {
		return location;
	}//end getLocation
	/**
	 * Allows the caller to set the location
	 * @param location
	 */
	public void setLocation(Location location) {
		this.location = location;
	}//end setLocation
	/**
	 * Returns if the object is full or not
	 * @return boolean
	 */
	public boolean isFull() {
		return full;
	}//end isFull
	/**
	 * Allows the caller to set if their full or not
	 * @param boolean full
	 */
	public void setFull(boolean full) {
		this.full = full;
	}//end setFull
	/**
	 * Returns if the object is rested or not
	 * @return boolean
	 */
	public boolean isRested() {
		return rested;
	}//end isRested
	/**
	 * Allows the caller to set if their rested or not
	 * @param boolean rested
	 */
	public void setRested(boolean rested) {
		this.rested = rested;
	}//end setRested
	
}//end class
