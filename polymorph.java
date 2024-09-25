abstract class vehicle{
	abstract void start();
	abstract void color();
}
class car extends vehicle{
	void start(){
		System.out.println("Cars go fast!");	
	}
	void color(){
		System.out.println("Color is Black");
	}
}
public class polymorph{
	public static void main(String[] args){
		vehicle v= new car();
		v.start();
		v.color();
	}
}

