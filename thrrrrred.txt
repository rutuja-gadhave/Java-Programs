import java.lang.Thread;
class thread1 extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Hi !");
		}
	}
}
class thread2 extends Thread
{
	public void run()
	{
		for(int i=0;i<4;i++)
		{
			System.out.println("Hello !!");
		}
	}
}
class thread3 extends Thread
{
	public void run()
	{
		for(int i=0;i<3;i++)
		{
			System.out.println("WELCOME !!!");
		}
	}
}
class thread
{
	public static void main(String args[])
	{
		thread1 t1=new thread1();
		t1.start();
		thread2 t2=new thread2();
		t2.start();
		thread3 t3=new thread3();
		t3.start();
	}
}
