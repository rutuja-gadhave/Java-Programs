import java.util.*;
class threadf extends Thread
{
	public void run()
	{
		System.out.println("welcome!!!");
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{}
		System.out.println("Bye!!!");
	}
	public static void main(String args[])
	{
		threadf th1=new threadf();
		th1.setName("Rutuja");
		System.out.println("rutuja-"+th1.isAlive());
		System.out.println(th1.getName());
		threadf th2=new threadf();
		th2.setName("Neha");
		System.out.println("neha-"+th2.isAlive());
		System.out.println(th2.getName());
		th1.setPriority(Thread.MIN_PRIORITY);
		th2.setPriority(Thread.MAX_PRIORITY);
		System.out.println("after setting priority");
		th1.start();
		System.out.println("rutuja-"+th1.isAlive());
		try
		{
			th1.join();
		}
		catch(InterruptedException e)
		{}
		th2.start();
		System.out.println("neha-"+th2.isAlive());
	}
}
		
	


		
		
		