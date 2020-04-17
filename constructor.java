import java.awt.*;
import java.util.Scanner;
class market
{
	String pname;
	int price;
	int qty;
	market()//default costructor
	{ 
		pname="maggi";
		price=10;
		qty=5;
	}
	market(String nm,int pr,int qy)//parametric constructor
	{
		pname=nm;
		price=pr;
		qty=qy;
	}
	void display()
	{
		System.out.println("Product Name = "+pname+"\tProduct Price = "+price+
				"\tProduct Quantity = "+qty);
	}
}
class constructor
{
	public static void main(String args[])
	{
		int price,qty;
		String pname;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter product name : ");
		pname=s.next();
		System.out.println("Enter product price : ");
		price=s.nextInt();
		System.out.println("Enter product quantity : ");
		qty=s.nextInt();
		market m1=new market();
		m1.display();
		market m2=new market(pname,price,qty);
		m2.display();

	}
}
		




			