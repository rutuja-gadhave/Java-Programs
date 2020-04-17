import java.lang.Thread;
class thread1 implements Runnable
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.printf("*");
			}
			System.out.println();
		}
	}
}
class thread2  implements Runnable
{
	public void run()
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.printf("@");
			}
			System.out.println();
		}
	}
}
class thread3 implements Runnable
{
	public void run()
	{
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("+");
			}
			System.out.println();
		}
	}
}
class threadTest
{
	public static void main(String args[])
	{
		thread1 t1=new thread1();
		t1.run();
		System.out.println("First thread executed");
		thread2 t2=new thread2();
		t2.run();
		System.out.println("Second thread executed");
		thread3 t3=new thread3();
		t3.run();
		System.out.println("Third thread executed");
	}
}
