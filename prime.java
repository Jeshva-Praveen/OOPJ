import java.util.Scanner;
public class prime {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a,i=1,count=0;
		System.out.print("Enter the value of a:");
		a=sc.nextInt();
		while (i<=a){
  			if(a%i==0)
    				count+=1;
  			i+=1;
  		}
		if(count==2)
			System.out.println("The given value "+a+" is a Prime number");			
		else
			System.out.println("The given value "+a+" is not a Prime number");	
	}
}
