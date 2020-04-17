class th1
{
	int d;
	boolean flag=false;
	synchronized int getData()
	{	
		if(flag==false)
		{
			try
			{
				wait();
			}
			catch(InterruptedException e)
			{
				System.out.println("Exception caught");
			}
		}
		System.out.println("Got data : "+d);
		flag=false;
		notify();
		return d;
	}
	synchronized void putData(int d)
	{
		if(flag==true)
		{
			try
			{
				wait();
			}
			catch(InterruptedException e)
			{
				System.out.println("Exception caught");
			}
		}
		this.d=d;
		System.out.println("Put data with value : "+d);
		flag=true;
		notify();
	}
}
class producer implements Runnable
{
	th1 t;
	public producer(th1 t)
	{
		this.t=t;
		new Thread(this,"producer").start();
		System.out.println("Put called by producer");	
	}
	public void run()
	{
		int data=0;
		while (true)
		{
			data=data+1;
			t.putData(data);
		}
	}
}
class consumer implements Runnable
{
	th1 t;
	public consumer(th1 t)
	{
		this.t=t;
		new Thread(this,"consumer").start();
		System.out.println("Get called by consumer");	
	}
	public void run()
	{
		while (true)
		{
			t.getData();
		}
	}
}
public class ITC
{
	public static void main(String args[])
	{
		th1 o1=new th1();
		producer p=new producer(o1);
		consumer c=new consumer(o1);
		System.out.println("Press Ctrl + C to Stop ");
	}
}

		
