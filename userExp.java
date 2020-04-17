//Rutuja Gadhave - 1606032
import java.util.*;
class InvalidProductException extends Exception
{
    public InvalidProductException(String s)
    {
        super(s);
    }
}
 
public class userExp
{
   	void Check(int weight) throws InvalidProductException
	{
		if(weight<100)
		{
			throw new InvalidProductException("Product Invalid !!!!");
		}
   	}
   	public static void main(String args[])
    	{
    		userExp obj = new userExp();
       		 try
        		{
            			obj.Check(60);
        		}
        		catch (InvalidProductException e)
        		{
            			System.out.println("Exception is caught !!!!!");
            			System.out.println(e.getMessage());
        		}
   	 }
}