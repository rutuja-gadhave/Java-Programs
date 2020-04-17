import java.awt.*;
import java.util.*;
class remove
{
	public static void main(String args[]);
	{
		Scanner s=new Scanner(System.in);
		String n;
		String str[]=new String("rutuja");
		System.out.println("Enter any character to remove from given String : ");
		n=s.next(); 
		for(int i=0;i<str.length;i++)
		{
			if(str[i]==n)
			{
				String s2=str.replace(n,'');
				String s3=s2.trim();
			}
		}
		System.out.println("Updated String is : "+s3);
	}
}