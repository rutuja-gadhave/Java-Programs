//Rutuja Gadhave-1606032
import java.awt.*;
import java.util.*;
import java.lang.*;
class strrev
{
	public static void main(String args[])
	{
		int ch,ch1;
             do
	{		
		System.out.println("1-Without using string method\t2-Using string method");
		System.out.println("Enter your choice :");
		Scanner s=new Scanner(System.in);
		ch=s.nextInt();
		StringBuffer b=new StringBuffer();
		StringBuffer c=new StringBuffer("rutuja");
		switch(ch)
		{
			case 1:
			{
				int n=c.length();
				System.out.println("original string : ");
				for(int i=0;i<n;i++)
				{
					System.out.print(c.charAt(i));
				}
				System.out.println("");
				System.out.println("reverse string : ");
				for(int i=n-1;i>=0;--i)
				{
					System.out.print(c.charAt(i));
				}
				break;
			}
			case 2:
			{
				System.out.println("original string : "+c);
				b=c.reverse();
				System.out.println("reverse string : "+b);
				break;
			}
		}
		System.out.println("\npress 1 to continue.....else 0");
		ch1=s.nextInt();
	}while(ch1==1);
	}
}