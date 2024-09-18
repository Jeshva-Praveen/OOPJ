// single inheritance program in java on vehicles
class Vehicle{
	void start(){
		System.out.println("Vehicle started!");
	}
}
class car extends Vehicle{
	void start(){
		System.out.println("Car started!!");	
	}
} 

public class vehicle {
	public static void main(String[] args){
		Vehicle v =new Vehicle();
		v.start();
		car c1 = new car();
		c1.start();
	}
} 
