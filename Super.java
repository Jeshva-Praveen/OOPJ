class Animal{
	Animal(){
	 System.out.println("Animals eats!");
	}
}
class Dog extends Animal{
	Dog(){
	super();
	System.out.println("Dog barks!!");
	}
}
public class Super{
	public static void main(String[]args){
	Dog d = new Dog();
	}
}
