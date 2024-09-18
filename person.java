// single inheritance  program for person and employees
class Person{
	String name="praveen";
	int age=18;
	void display(){
		System.out.println("Name: "+name+"\nAge :"+ age);
	}
}
class Employee extends Person{
	int salary=80000;
	void display(){
		System.out.println("Salary :"+salary);	
	}
} 

public class person{
	public static void main(String[] args){
		Person p =new Person();
		p.display();
		Employee e = new Employee();
		e.display();
	}
} 
