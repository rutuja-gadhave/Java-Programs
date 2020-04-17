import java.awt.*;
abstract class shape//base class
{	
	shape()
	{
		System.out.println("Base class shape constructor called ");
	}		
	abstract void draw();
	
}
class shape1 extends shape//derived class
{
	shape1()
	{
		System.out.println("Derived class  shape1 constructor called ");
	}
	void draw()
	{
		System.out.println("Derived class draw() function called ");
	} 
	public static void main(String args[])
	{	
		shape1 s1=new shape1();
		s1.draw();
	}
}