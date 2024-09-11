// java program fror a constructor
class triangle{
	double b;
	double h;
	triangle(double b,double h){
		this.b=b;
		this.h=h;
	}
	double area(){
		return 0.5*b*h;
	}
}

public class AreaOfTriangle{
	public static void main(String[] args){
		triangle t1=new triangle(11,10);
		System.out.println(t1.area());
	} 
}
