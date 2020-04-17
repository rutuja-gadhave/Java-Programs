import java.util.*;
package pac1;
interface op1
{
	public void add();
}
public class arithmatic implements op1
{
	int a,b,c;
	public void add()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a+b;
		System.out.println("Addition is="+c);
	}
}
	
		

