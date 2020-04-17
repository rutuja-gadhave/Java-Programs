import java.awt.*;
import java.util.Scanner;
class market
{
	int pname;
	String price;
	int qty;
	market()//default costructor
	{
		pname=0;
		price=0;
		qty=0;
	}
	market(int nm,string pr,int qy)//parametric constructor
	{
		pname=nm;
		price=pr;
		qty=qy;
	}
	market(market mk)//copy constructor
	{
		pname=mk.nm;
		price=mk.pr;
		qty=mk.qy;
	}
}
class constructor
{
	public static void main(String args[])
	{
		int price,qty;
		String name;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter product name : ");
		name=s.next();
		System.out.println("Enter product price : ");
		price=s.nextInt();
		System.out.println("Enter product quantity : ");
		qty=s.nextInt();
		market m1=new market();
		market m2=new market(name,price,qty);
		market m3=new market(&m2);
	}
}
		




			