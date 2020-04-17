import java.util.*;
import java.lang.*;
class info extends Thread
{
	String cname,sname,add;
	int id=0;
	synchronized void putInfo()
	{
		if(id==0)
		{
			System.out.println("wating for info......");
			try
			{
				wait();
			}
			catch(Exception e)
			{}
		}
		System.out.println("putting school info......");
		System.out.println(" School name ="+sname+"\t school address="+add);
		System.out.println("putting Student info.....");
		System.out.println("Student name="+cname+"\t roll no. ="+id);
	}
	synchronized void getInfo(String sname,String add,String cname,int id )
	{
		System.out.println("getting for info......");
		this.sname=sname;
		this.add=add;
		this.cname=cname;
		this.id=id;
		try
		{
			notify();
		}
		catch(Exception e)
		{}
	}
}
class itc1
{
	public static void main(String args[])
	{
		info t1=new info();
		new Thread()
		{
			public void run()
			{
				t1.putInfo();
			}
		}.start();
		new Thread()
		{
			public void run()
			{
				t1.getInfo("hujurpaga","katraj","Rutuja",32);
			}
		}.start();
	}
}
		
		

	