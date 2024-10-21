//java program for bubblesort
import java.util.Scanner;
class sort{
	void bsort(int a[],int size){
		int t;
		for(int i=0;i<size-1;i++){
			for(int j=0;j<size-i-1;j++){
				if(a[j]>a[j+1]){
					t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}	
			}
		}
	}
}
public class bubblesort{
	public static void main(String[] args){
		int a[]=new int[15];
		Scanner p=new Scanner(System.in);
		sort s=new sort();
		int n;
		System.out.print("The list size:");
		n=p.nextInt();
		System.out.print("The elements of the list:");
		for(int i=0;i<n;i++)
			a[i]=p.nextInt();
		System.out.print("The list before sorting:");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");	
		System.out.println();	
		s.bsort(a,n);
		System.out.print("The list after sorting:");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		System.out.println();	
	}
}
