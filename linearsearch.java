// java program for linearsearch
import java.util.Scanner;
class search{
	 void lsearch(int a[], int key){
		int count=-1,i;
		for(i=0;i<a.length;i++){
			if (key==a[i])
				count=i;
		}
		if(count==-1)
			System.out.println("unsuccessful search");
		else
			System.out.println("Key is found at index:"+count);
	}
}		
public class linearsearch{
	public static void main(String[] args){
		int a[]=new int[15];
		Scanner p=new Scanner(System.in);
		search s=new search(); 
		int i,key,n;
		System.out.print("List size:");
		n=p.nextInt();
		System.out.print("Elements of the list:");
		for(i=0;i<n;i++)
			a[i]=p.nextInt();
		System.out.print("key to be searched:");
		key=p.nextInt();
		s.lsearch(a,key);	
	}
}	
