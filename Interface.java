interface shape{
	double Area();
}
interface color{
	void color();
}
class circle implements shape,color{
	double pi =3.14;
	double r;
	String color;
	circle(double r,String color){
		this.r=r;
		this.color=color;
		System.out.println("Shape is Circle ");
	}
	public double Area(){
		return pi*r*r;
	}
	public void color(){
		System.out.println("Color is: "+color);
	}
}
public class Interface {
	public static void main(String[] args){
		circle c=new circle(3,"Blue");
		System.out.println("Area of the circle is = "+c.Area());
		c.color();
	}
}
