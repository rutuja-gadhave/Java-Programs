import java.util.*;
class customer
{
	public static void main(String args[])
	{	
		Vector cust=new Vector();
		int len=args.length;
		System.out.println("Enter  customer names : ");
		for(int i=0;i<len;i++)
		{
			cust.addElement(args[i]);
		}
		cust.insertElementAt("Neha",3);
		int size=cust.size();
		String custarr[]=new String[size];
		cust.copyInto(custarr);
		System.out.println("Name of customers : ");
		for(int i=0;i<size;i++)
		{
			System.out.println(custarr[i]);
		}
	}
}                                                                     