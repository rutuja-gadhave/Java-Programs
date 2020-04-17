import java.awt.*;
import java.util.Scanner;
class complex
{
	int i,r;
	complex(){}
	complex(int a,int b)
	{
		i=a;
		r=b;
	}
	complex operator+(complex c);
	void display()
	{
		System.out.println(" Real value  is : "+r);
		System.out.println("Imaginary value  is : "+i);
	}
}
complex complex::operator+(complex c)
{
	complex c1;
	c1.r=r+c.r;
	c1.i=i+c.i;
	return c1;
}
class overload
{
	int i,r;
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first real  and imaginary value = ");
		r1=s.nextInt();
		i1=s.nextInt();
		System.out.println("Enter  second real and imaginary value = ");
		r2=s.nextInt();
		i2=s.nextInt();
		complex obj1=new complex();
		complex ca1=new complex(r1,i1);
		complex ca2=new complex(r2,i2);
		obj1=ca1+ca2;
		obj1.display();
	}
}