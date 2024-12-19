package assignment8;

public class CarsMain{
	//Colden Jeanmonod
		//04/2/2024
		//Assignment 8a Cars
		//
		//This Program makes different car functions and runs a short demo on them.
		//
	public static void main(String[] args) {
		
		Car carray[] = new Car[3];
		carray[0] =  new Car("Ford", "Pinto", 1972, 17.5, 132480, 12, 8); // creates a new Car object;
		carray[1] =  new Car("Jeep", "Wrangler", 2016, 18.3, 124356, 17, 10); // creates a new Car object
		carray[2] =  new Car("Chervolet", "Avalanche", 2013, 15, 13092, 15, 7);
		
		
	    carray[0].drive(5); // drives the Car 5 miles
	    carray[0].fillTank(1); // put in a gallon of gas
	    System.out.println(carray[0].getFuelRemaining()); // prints the amount of fuel left
	    System.out.println(carray[0]);
	    
	    
	    
	    carray[1].drive(7); 
	   carray[1].fillTank(2); 
	    System.out.println(carray[1].getFuelRemaining()); 
	    System.out.println(carray[1]);
	    
	     // creates a new Car object
	    carray[2].drive(6);
	    carray[2].fillTank(3); 
	    System.out.println(carray[2].getFuelRemaining()); 
	    System.out.println(carray[2]);
 }
}
