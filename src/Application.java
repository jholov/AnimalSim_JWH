import java.util.ArrayList;
/**
 * This class Tests all the Classes and Interfaces
 * @author Jake Holovka
 *
 */
public class Application {

	public static <T> void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("*********************************************\n\n                 "
				+ "Location Tests\n\n*********************************************");
		
		//testing empty argument constructor
		Location lake = new Location();
		System.out.println(lake.toString());
		
		//testing preferred argument constructor
		Location pond = new Location(2,5);
		System.out.println(pond.toString());
		
		//testing update method 
		lake.update(4, 6);
		System.out.println(lake.toString());
		
		//testing getCoordinates
		int[] River=lake.getCoordinates();
		 for(int i=0; i<= River.length-1;i++)
			 
			 System.out.println(River[i]);
				
		
		System.out.println("*********************************************\n\n                 "
				+ "Animal Tests\n\n*********************************************");
		
		//showing you can't instantiated an animal class
		Animal liger = new Animal();
		
		//testing eat + rested method
		BrownBear smokey = new BrownBear();
		System.out.println(smokey.eat());
		System.out.println(smokey.sleep());
		
		//testing getter and setter for simID
		smokey.setSimID(15);
		System.out.println(smokey.getSimID());
		
		//testing getter and setter for location
		smokey.setLocation(pond);
		System.out.println(smokey.getLocation());
		
		//testing getter and setter for full
		smokey.setFull(false);
		System.out.println(smokey.isFull());
		
		//testing getter and setter for isRested
		smokey.setRested(true);
		System.out.println(smokey.isRested());

		System.out.println("*********************************************\n\n                 "
				+ "Goldfinch Tests\n\n*********************************************");
		
		//testing empty-argument constructor
		Goldfinch Dee = new Goldfinch();
		System.out.println(Dee.toString());
		
		//testing preferred constructor
		Goldfinch BigBird = new Goldfinch(22,lake,10);
		System.out.println(BigBird.toString());
		
		//testing Eat and Sleep method
		BigBird.eat();
		BigBird.sleep();
		System.out.println(BigBird.isFull());
		System.out.println(BigBird.isRested());
		
		//Testing setWingSpan when out of range
		Dee.setWingSpan(4);
		
		//Testing setters and getter for WingSpan
		Dee.setWingSpan(10);
		System.out.println(Dee.getWingSpan());
		
		//Testing walk method
		System.out.println("Dee initial position");
		System.out.println(Dee.getLocation());
		System.out.println("Walking East");
		Dee.walk(2);
		System.out.println(Dee.getLocation());
		System.out.println("Walking South");
		Dee.walk(-1);
		System.out.println(Dee.getLocation());
		
		//Testing fly method
		System.out.println("Flying to pond");
		Dee.fly(pond);
		System.out.println(Dee.getLocation());
		System.out.println("Flying to lake");
		Dee.fly(lake);
		System.out.println(Dee.getLocation());
		
		System.out.println("*********************************************\n\n                 "
				+ "BrownBear Tests\n\n*********************************************");
		
		//Testing empty-argument constructor
		BrownBear Blue = new BrownBear();
		System.out.println(Blue.toString());
		
		//Testing preferred argument constructor
		BrownBear Pooh = new BrownBear(137, lake, "Grizzly");
		System.out.println(Pooh.toString());
		
		//Testing getters and setters for subSpecies
		Pooh.setSubSpecies("Kodiak");
		System.out.println(Pooh.getSubSpecies());
		
		//Testing Eat and Sleep method
		Pooh.eat();
		Pooh.sleep();
		System.out.println(Pooh.isFull());
		System.out.println(Pooh.isRested());
		
		
		//Testing swim method
		System.out.println("Initial Location");
		System.out.println(Pooh.getLocation());
		System.out.println("Pooh Swimming West");
		Pooh.swim(-2);
		System.out.println(Pooh.getLocation());
		System.out.println("Pooh Swimming North");
		Pooh.swim(1);
		System.out.println(Pooh.getLocation());
		
		
		//Testing walk method
		System.out.println("Pooh initial Location");
		System.out.println(Pooh.getLocation());
		System.out.println("Pooh walking South");
		Pooh.walk(-1);
		System.out.println(Pooh.getLocation());
		System.out.println("Pooh Walking East");
		Pooh.walk(2);
		System.out.println(Pooh.getLocation());
		
		System.out.println("*********************************************\n\n                 "
				+ "Generics Tests\n\n*********************************************");
			
		ArrayList<T> Animals = new ArrayList<T>();
		
		//adding BrownBear objects to ArrayList Animals
		Animals.add((T) Pooh);
		Animals.add((T) Blue);
			
		//adding Goldfinch objects to ArrayList Animals
		Animals.add((T) Dee);
		Animals.add((T) BigBird);
			
		System.out.println(Animals.toString());
			
	}//end main

}//end class
