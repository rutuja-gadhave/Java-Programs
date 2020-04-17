import java.util.Scanner;
class Loop1
{
	public static  void main(String args[])
	{
		int i,n,ans;
		Scanner s=new Scanner(System.in);
		System.out.println("\nEnter any number to print table : ");
		n=s.nextInt();
		for(i=1;i<=10;i++)
		{
			ans=n*i;
			System.out.println("\n"+n+"*"+i+"= "+ans);
		}
	}
}		