// heirarchial inheritance in shapes in java
class Shape{
	double getArea(){
		return 0;	
	}
}
class Rectangle extends Shape{
	double length=21;
	double width=9;
	double getArea(){
		return length*width;
	}
}
class Circle extends Shape{
	double radius=7;
	double getArea(){
		return 3.14*radius*radius;
	}
}

public class shapes{
	public static void main(String[] args){
		Shape s= new Shape();
		Rectangle r=new Rectangle();
		Circle c= new Circle();
		System.out.println(" "+s.getArea());
		System.out.println("Area of Rectangle is :"+r.getArea());
		System.out.println("Area of Circle is :"+c.getArea());
		
	}
}
