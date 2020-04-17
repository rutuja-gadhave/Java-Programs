import java.util.Scanner;
class Loop
{
	public static  void main(String args[])
	{
		int i,n,n1,f,ans,n2;
		Scanner s=new Scanner(System.in);
		System.out.println("\nEnter any number to print table : ");
		n=s.nextInt();
		for(i=1;i<=10;i++)
		{
			ans=n*i;
			System.out.println("\n"+n+"*"+i+"= "+ans);
		}
		System.out.println("\nEnter any number to find factorial : ");
		n1=s.nextInt();
		f=1;
		for(i=n1;i>=1;i--)
		{
			{
				f=n1*n1-1;	
			}
	
		}
		System.out.println("\nFactorial is : "+f);
		System.out.println("\nEnter any number to find positive nos,within that range : ");
		n2=s.nextInt();
		System.out.println("\n positive nos. are = ");
		do
		{
			 i=1;	
			if( i%2==0)
			{
				System.out.println("\n"+i);
			}
			else
			{
				i++;
			}
		}while(i<=n2);
	}
}	