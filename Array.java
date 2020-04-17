//Rutuja Gadhave 1606032
import java.util.Scanner;
public class Array
{
	public static void main(String[] args)
	{
		int a[]=new int[5],p,i;
		System.out.println("Enter any 5 elements : ");
		Scanner s=new Scanner(System.in);
		for(i=0;i<5;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("\nEnter the search record");
		p=s.nextInt();
		for(i=0;i<5;i++)
		{
			if(a[i]==p)
			System.out.println("\nSearch record found!!!!");
		}	
 	}
}