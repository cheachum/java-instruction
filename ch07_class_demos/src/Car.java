
public class Car {
	private int id; 
	public static int NUM_WHEELS = 4;
	public static char[] objectCount;
	
	// empty constructor 
	public Car() {
		id = 0; 
	}

	// constructor accepting a parameter
	public Car(int i) {
		id = i; 
	}
	
	// getter method 
	public int getId() {
		return id; 
	}
	
	// setter method 
	public void setId(int i) {
		id = i; 
	}
	
	// toString method 
	public String toString() {
		return "Car: id = "+id;
	}
	
	
	
	
	
	
	
	
}
