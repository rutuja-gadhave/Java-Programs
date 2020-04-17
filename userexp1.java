import java.util.*;
class userexp extends Exception
{
	public static void main()
	{
		Scanner s=new Scanner(System.in);
		try{
			System.out.println("Enter your birth month no. : ");
			int mo=s.nextInt();
			throw new Exception();
		}
		catch(MonthNumberException e1)
		{
			System.out.println("enter any number for month ");
		}
		catch(InvlidDataException e2)
		{
			System.out.println("there are 1-12 months only");
		}
		catch(IncorrectValue e3)
		{
			System.out.println("please enter positive no value");
		}
	}
}		



				
		