//1606032--Rutuja Nandkumar Gadhave
import java.awt.*;
import java.lang.*;
import java.util.*;
import java.awt.*;
class vector
{
    public static void main(String[] arg)
    {
     		 int n,i,s1;
		String cname;
        		Vector v = new Vector();
		System.out.println("\nHow many employee names that you want to enter : ");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(i=0;i<n;i++)
		{
			System.out.println("\nEnter "+(i+1)+" employee name");
			cname=s.next();
			v.addElement(cname);
		}
		System.out.println("\nEmployee Vector : "+v);
		s1=v.size();
		System.out.println("\nEmployee Vector size is : "+s1);
		System.out.println("\nEnter employee name and the position where to add in vector : ");
		cname=s.next();
		n=s.nextInt();
		v.insertElementAt(cname,n);
		System.out.println("\nEmployee vector after adding new name : ");
		System.out.println("\nEmployee Vector is : "+v);
		
    }
}













		










  //   System.out.println("Vector is " + v);
//System.out.println(no);
		/*
		String c1=new String();
		int i,n;
		System.out.println("enter size of vector");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(i=0;i<n;i++)
		{
			System.out.println("enter "+(i+1)+" element");
			cname=s.next();
			car.addElement(cname);
		}
		System.out.println("vector is:");
		for(i=1;i<=car.size();i++)
		{
			cname=car.elementAt(i);
			System.out.println(cname);
		}*/

		/*i=car.size;
		System.out.println("vector size is:"+i);
		System.out.println("enter element to add into vector and the position where to add");
		cname=s.next();
		n=s.nextInt();
		car.insertElement(cname,n);
		System.out.println("vector after adding is:");
		for(i=1;i<=car.size;i++)
		{
			cname=elementAt(i);
			System.out.println(cname);
		}
		car.copyInto(c1);
		System.out.println("array of vector is:");
		for(i=0;i<c1.length;i++)
		{
			System.out.println(c1[i]);
		}*/	