import java.util.Scanner;
class condition
{
	 public static void main(String args[])
	{
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("\nEnter any number : ");
		n=s.nextInt();
		if(n%3==0&&n%5==0)
		{
			System.out.println("\nno. is divisible by 3 and 5");
		}
		else if(n%3==0)
		{
			System.out.println("\nno. is divisible by 3 ");
		}
		else if(n%5==0)
		{
			System.out.println("\nno. is divisible by  5");
		}
		else
		{
			System.out.println("\nno. is not divisible by 3 and 5");
		}
	}
}