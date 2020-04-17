import java.awt.*;
import java.util.Scanner;
public class oper
{
	int a;
	int b;
	int c;
	String s1;
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any two numbers : ");
		a=s.nextInt();
		b=s.nextInt();
		c=a+b;
		System.out.println("Addition is : "+c);
		System.out.println("Enter any city name  : ");
		s1=s.next();
		System.out.println("Government Polytechnic "+s1);
	}
}
	