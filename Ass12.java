//1606032-Rutuja Gadhave		
import java.awt.*;
import java.util.*;
import java.lang.*;
class Ass12
{
	public static void main(String args[])
	{
		String s1=new String("shivani");
		Scanner s=new Scanner(System.in);
		System.out.println("enter the char which you want to remove from the string 'shivaniss'");
		String a;
		int x;
		a=s.next();
		x=s1.indexOf(a);
		s1=s1.substring(0,x)+s1.substring(x+1);
		System.out.println("the string after removal is :"+s1);
	}
}