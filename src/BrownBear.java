/**
 * This class extends Animal and implements Walkable and Swimmable to create a BrownBear Object
 * @author Jake Holovka
 *
 */
public class BrownBear extends Animal implements Walkable, Swimmable{

	private String subSpecies;
	/**
	 * This is the empty-argument constructor
	 */
	public BrownBear() {
		
		super();
		subSpecies = "Alaskan";
		
	}//end empty-argument constructor
	/**
	 * This is the preferred constructor
	 * @param int simID
	 * @param Location I
	 * @param String subSpecies
	 */
	public BrownBear(int simID, Location I, String subSpecies) {
		
		super(simID, I);
		setSubSpecies(subSpecies);
		
	}//end preferred argument constructor
	/**
	 * Returns the SubSpecie to caller
	 * @return String
	 */
	public String getSubSpecies() {
		return subSpecies;
	}//end getSubSpecies
	/**
	 * Allows the caller to set the subSpecies
	 * @param String subSpecies
	 */
	public void setSubSpecies(String subSpecies) {
		this.subSpecies = subSpecies;
	}//end setSubSpecies
	/**
	 * This method allows the Bear to swim in a given direction
	 * @param int direction
	 */
	@Override
	public void swim(int direction) {
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
			currentloc[1]=currentloc[1]+2;
			
			location.update(currentloc[0], currentloc[1]);
			
		}else if(direction == south) {
			//X coordinate
			currentloc[0]=currentloc[0]+0;
			//Y coordinate
			currentloc[1]=currentloc[1]-2;
			
			location.update(currentloc[0], currentloc[1]);
			
		}else if (direction == east) {
			//X coordinate
			currentloc[0]=currentloc[0]+2;
			//Y coordinate
			currentloc[0]=currentloc[0]+0;
			
			location.update(currentloc[0], currentloc[1]);
			
		}else if (direction == west) {
			//x coordinate
			currentloc[0]=currentloc[0]-2;
			//Y coordinate
			currentloc[0]=currentloc[0]+0;
			
			location.update(currentloc[0], currentloc[1]);
			
		}else {System.out.println("Wrong Direction");}
					
	}//end swim
	/**
	 * This method allows the bear to walk in a given direction
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
			currentloc[1]=currentloc[1]+3;
			
			location.update(currentloc[0], currentloc[1]);
			
		}else if(direction == south) {
			//X coordinate
			currentloc[0]=currentloc[0]+0;
			//Y coordinate
			currentloc[1]=currentloc[1]-3;
			
			location.update(currentloc[0], currentloc[1]);
			
		}else if (direction == east) {
			//X coordinate
			currentloc[0]=currentloc[0]+3;
			//Y coordinate
			currentloc[0]=currentloc[0]+0;
			
			location.update(currentloc[0], currentloc[1]);
			
		}else if (direction == west) {
			//x coordinate
			currentloc[0]=currentloc[0]-3;
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
		return "BrownBear [subSpecies=" + subSpecies + ", simID=" + simID + ", location=" + location + ", full=" + full
				+ ", rested=" + rested + "]";
	}//end toString

}//end class
