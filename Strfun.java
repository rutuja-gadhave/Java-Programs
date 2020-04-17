//Rutuja Gadhave -1606032
import java.awt.*;
import java.lang.*;
import java.util.Scanner;
class Strfun
{
	public static void main(String args[])
	{
		int l1,l2,l3,d,ch,ch1;
		String str,str1,a,b,c,e;
		String s1=new String(" Mobile");
		String s2=new String("Laptop");
		String s3=new String("Tab");
		String s4=new String("tab");
	   do
	  {
		System.out.println("1:length     \t2:Concatenate\t3:Equal");
		System.out.println("4:uppercase\t5:lowercase   \t6:Substring");
		System.out.println("7:indexOf    \t8:Replace      \t9:Equal-ignore-case");
		System.out.println("Enter your choice : ");
		Scanner s=new Scanner(System.in);
		ch=s.nextInt();
		
		l1=s1.length();
		l2=s2.length();
		l3=s3.length(); 
		switch(ch)
	{
	case 1:
	{
		System.out.println("Length of s1 : "+l1);
		System.out.println("Length of s2 : "+l2);
		System.out.println("Length of s3 : "+l3);
		break;
	}
	case 2:
	{
		str=s1.concat(s2);
		System.out.println("After concating s1 & s2 : "+str);
		str1=s2.concat(s3);
		System.out.println("After concating s2 & s3 : "+str1);
		break;
	}
	case 3:
	{
		boolean m=s1.equals(s3);
		if(m==true)
		{
			System.out.println("The both strings are equal !!!!!!!");
		}
		if(m==false)
		{ 
			System.out.println("The both strings are not equal !!!!!!!");
		}
		break;
	}
	case 4:
	{
		a=s1.toUpperCase();
		System.out.println("Upper case of s1: "+a);
		b=s2.toUpperCase();
		System.out.println("Lower case of s2: "+b);
		break;
	}
	case 5:
	{
		a=s1.toLowerCase();
		System.out.println("Lower case of s1: "+a);
		b=s2.toLowerCase();
		System.out.println("Lower case of s2: "+b);
		break;
	}
	case 6:
	{
		c=s1.substring(2);
		System.out.println("Substring of s1: "+c);
		break;
	}
	case 7:
	{
		d=s2.indexOf('t');
		System.out.println("The index of 't' in string laptop "+d);
		break;
	}
	case 8:
	{
		e=s2.replace('p','j');
		System.out.println("First String s2 is : "+s2);
		System.out.println("replaced String s2 is : "+e);
		break;
	}
	case 9:
	{
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
		break;
	}
	}
	    System.out.println("Do you want to continue...............Press 1 else 0");
	     ch1=s.nextInt();	
                  }while(ch1==1);
	
	}
}
