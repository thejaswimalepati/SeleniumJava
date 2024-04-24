package javapractice;

class Vehicle
{
	
	void run() {
		System.out.println("Vehicle is running");	
	}
	
}

class Bike extends Vehicle{
	
	void run() {
		System.out.println("Bike is running");	
	}
	
	
}


public class MethodOverriding {

	public static void main(String[] args) {
		
		Bike obj=new Bike();
		
		obj.run();
		
		Vehicle obj1=new Vehicle();
		
		obj1.run();
		
	}

}
