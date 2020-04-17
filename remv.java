//1606032-Rutuja Gadhave		
import java.awt.*;
import java.util.*;
import java.lang.*;
class remv
{
	public static void main(String args[])
	{
		String s1=new String("rutuja");
		Scanner s=new Scanner(System.in);
		System.out.println("enter the char which you want to remove from the string 'rutuja'");
		String a;
		int x;
		a=s.next();
		x=s1.indexOf(a);
		s1=s1.substring(0,x)+s1.substring(x+1);
		System.out.println("the string after removal is :"+s1);
	}
}