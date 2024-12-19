package assignment8;


public class Car{
	private String make;
	private String model;
	private int year;
	private double MPG;
	private int milesdriven;
	private int fuelcapacity;
	private int fuelremaining;
	
	public Car(String string, String string2, int i, double d, int j, int k, int l) {
		
		  make = string;
		 model = string2;
		  year = i;
		  MPG = d;
		  milesdriven = j;
		  fuelcapacity = k;
		  fuelremaining = l;
	}

	public void fillTank(double g) {
		double spaceleft = fuelcapacity - fuelremaining;
		
		if(g <= spaceleft) {
			fuelremaining+= g;
		}else {
			fuelremaining = fuelcapacity;
		}
		
		
		
	}

	public void drive(double m) {
		milesdriven += m;
		fuelremaining -= m/MPG;
		
		
		
	}
	
	public String toString() {
		
	         return "Car{" +
	                "totalMilesDriven=" + milesdriven +
	                ", gasInTank=" + fuelremaining +
	                ", averageMPG=" + MPG + ", fuel capacity=" + fuelcapacity + ", year=" + year + ", make=" + make+ "model" + model+  
	                '}';
	    }
	
	public int getFuelRemaining() {
		return fuelremaining;
	}
	

}



