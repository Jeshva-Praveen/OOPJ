// array basics learning
import java.util.Scanner;
public class array{
	public static void main(String args[]){
		int array[]=new int[15];
		Scanner p=new Scanner(System.in);
		System.out.println("Enter your elements to be entered:");
		for(int i=0;i<10;i++){
			array[i]=p.nextInt();
		}
		System.out.println("Elements you have entered is:");
		for(int i=0;i<10;i++){
					System.out.print(array[i]+" ");
		}
	}
}	
