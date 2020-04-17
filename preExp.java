//Rutuja Gadhave - 1606032
import java.util.*;
class preExp
{
    public static void main (String [] args)
    {
        try
        {
            String s1=args[0];
            String s2=args[1];
            int n1=Integer.parseInt (s1);
            int n2=Integer.parseInt (s2);
            int n3=n1/n2;
            System.out.println ("DIVISION VALUE = "+n3);
        }
        catch (ArithmeticException Ae)
        {
            System.out.println ("DONT ENTER ZERO FOR DENOMINATOR...");
        }
        catch (NumberFormatException Nfe)
        {
            System.out.println ("PASS ONLY INTEGER VALUES...");
        }
        catch (ArrayIndexOutOfBoundsException Aioobe)
        {
            System.out.println ("PASS DATA FROM COMMAND PROMPT...");
        }
        finally
        {
            System.out.println ("I AM FROM FINALLY...");
        }
    }
};