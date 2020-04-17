import java.awt.*;
import java.lang.*;
import java.util.Scanner;
class shop
{
	public static void main(String args[])
	{
		int l1,l2,l3,d;
		String str,str1,a,b,c,e;
		String s1=new String(" Mobile");
		String s2=new String("Laptop");
		String s3=new String("Tab");
		String s4=new String("tab");
		l1=s1.length();
		l2=s2.length();
		l3=s3.length();
		System.out.println("Length of s1 : "+l1);
		System.out.println("Length of s2 : "+l2);
		System.out.println("Length of s3 : "+l3);
		str=s1.concat(s2);
		System.out.println("After concating s1 & s2 : "+str);
		str1=s2.concat(s3);
		System.out.println("After concating s2 & s3 : "+str1);
		boolean m=s1.equals(s3);
		if(m==true)
		{
			System.out.println("The both strings are equal !!!!!!!");
		}
		if(m==false)
		{ 
			System.out.println("The both strings are not equal !!!!!!!");
		}
		a=s1.toUpperCase();
		System.out.println("Upper case of s1: "+a);
		b=s2.toLowerCase();
		System.out.println("Lower case of s2: "+b);
		c=s1.substring(2);
		System.out.println("Substring of s1: "+c);
		d=s2.indexOf('t');
		System.out.println("The index of 't' in string laptop "+d);
		e=s2.replace('p','j');
		System.out.println("First String s2 is : "+s2);
		System.out.println("replaced String s2 is : "+e);
		boolean n=s3.equalsIgnoreCase(s4);
		if(n==true)
		{
			System.out.println("The both strings are equal !!!!!!!");
		}
		if(n==false)
		{ 
			System.out.println("The both strings are not equal !!!!!!!");
		}
		s2=s1.trim();
		System.out.println("After Trimming"+s2); 
	}
}
