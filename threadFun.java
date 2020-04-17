//Rutuja Gadhave - 1606032
import java.util.*;
public class threadFun extends Thread
{
	public void run()
   	{
       		System.out.println("Welcome... ");
       		try
		 {
        			Thread.sleep(500);
    		}
		catch(InterruptedException ie){ }
       		System.out.println("Thank You !!! ");
  	}
	public static void main(String[] args)
	{
		 threadFun t1=new threadFun();
		 t1.setName("Thread1");
		System.out.println("Thread create first: "+t1.isAlive());
		System.out.println("The name of first thread is : "+t1.getName());
		 threadFun t2=new  threadFun();
		System.out.println("Thread create second : "+t2.isAlive());
		t2.setName("Thread2");
		System.out.println("The name of second thread is : "+t2.getName());
		t1.setPriority(Thread.MIN_PRIORITY);  
  		t2.setPriority(Thread.MAX_PRIORITY);  
		t1.start();
		System.out.println("I am thread1");
		System.out.println("Thread create first: "+t1.isAlive());
		try
		{
  			t1.join();	
		}
		catch(InterruptedException ie){}
		t2.start();
		System.out.println("I am thread2");
		System.out.println("Thread create second: "+t2.isAlive());
	}
}

