//Rutuja Gadhave - 1606032
import java.util.*;
public class mulcatch
{  
       public static void main(String args[])
      {  
 	try
	{  
    		int a[]=new int[5];  
    		a[5]=30/0;  
   	}  
   	catch(ArithmeticException e)
	{
		System.out.println("Exception is : "+e);
	}  
   	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Exception is : "+e);
	}  
  	catch(Exception e)
	{
		System.out.println("Exception is : "+e);
	}  
	finally
	{
		System.out.println("Program is successfully run !!!");
	}
 	System.out.println("Thank you...");  
       }  
}  