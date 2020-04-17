//Pooja kumbharkar - 1606069
import java.util.*;
class shop{  
	int price=25000;  
  	synchronized void withdraw(int price)
	{  
		System.out.println("going to purchase a product ...!!!!");  
  		if(this.price<price)
		{  
			System.out.println("The product is expensive!!!");  
			try
			{
				wait();
			}	
			catch(Exception e){}  
		}  
		this.price-=price;  
		System.out.println("pay the bill and take it !!!!");  
		}  
  		synchronized void deposit(int price)
		{  
			System.out.println("Purchased Product !!!!");  
			this.price+=price;  
			System.out.println("Successfully delivered product at home !!!! ");  
			notify();  
		}  
}  
 class TestITC
{  
	public static void main(String args[])
	{  
		final shop s=new shop();
		new Thread()
		{  
			public void run()
			{
				s.withdraw(15000);
			}  
		}.start();  
		new Thread()
		{  
			public void run()
			{
				s.deposit(10000);
			}  
		}.start();  
  	}
}  
