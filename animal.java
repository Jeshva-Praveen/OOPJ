//multiple inheritance of animals in java
class Animal{
	void makeSound(){
		System.out.println("Animals makes sound!!");
	}
}
class Dog extends Animal{
	void makeSound(){
		System.out.println("Woof!");
	}
}
class Puppy extends Dog{
	void makeSound(){
		System.out.println("Yap!");
	}
}

public class animal{
	public static void main(String[] args){
		Animal a=new Animal();
		Dog d=new Dog();
		Puppy p =new Puppy();	
		a.makeSound();
		d.makeSound();
		p.makeSound();
	}
}
