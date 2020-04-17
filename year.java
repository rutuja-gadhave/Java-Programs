import java.awt.*;
import java.util.Scanner;
class week
{
	int rs;
	int we;

	Scanner s=new Scanner(System.in);
	void accept()
	{
		System.out.println("Enter per day price for milk :  ");
		rs=s.nextInt();
		we=rs*7;
		System.out.println("Total weekly price of milk is  = "+we+"RS.");
	}
}
class month extends week
{
	int mo;
	void cal()
	{
		mo=we*4;
		System.out.println("Total monthly price of milk is  = "+mo+"RS.");
	}
}
 class year extends month
{
	int yr;
	void cal1()
	{
		yr=mo*12;
		System.out.println("Total yearly price of milk is  = "+yr+"RS.");	
	}
}
class multilevel extends year
{
	public static void main(String args[])
	{
		week w=new week();
		w.accept();
		month m=new month();
		m.cal();
		year y=new year();
		y.cal1();
	}
