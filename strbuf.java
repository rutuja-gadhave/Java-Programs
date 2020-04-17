import java.awt.*;
import java.util.Scanner;
import java.lang.StringBuffer;
class strbuf
{
	public static void main(String args[])
	{
		int l1,l2,l3,d,ch,ch1,n;
		String str=new String();
		String str1=new String();
		String s1=new String(" Abhinav");
		String s2=new String("Hujurpaga");
		String s3=new String("Gppune");
	    do
	    {
		System.out.println("1:setCharAt\t2:append\t3:insert");
		System.out.println("4:setLength\t3:replace\t4:reverse");	
		System.out.println("Enter your choice : ");
		Scanner s=new Scanner();
		ch=s.nextInt();
	        switch(ch)
	       {
		case 1:
		{
			str=s2.setCharAt(2,'A');
			System.out.println("Updated String s2 after setting character :"+str);
			break;
		}
		case 2:
		{
			str1=s3.append(s1);
			System.out.println("Append String s3 is :"+str1);
			break;
		}
		case 3:
		{
			System.out.println("Enter position to insert another string : ");
			n=s.nextInt();
			str=s2.insert(n,"iphone");
			System.out.println("Original String :"+s2);
			System.out.println("New String :"+str);
			break;
		}
		case 4:
		{
			str=s1.setLength(3);
			System.out.println("Set length of s1:"+str);
			break;
		}
		case 5:
		{
			str1=s2.replace("p","hi");
			System.out.println("Original String :"+s2);
			System.out.println("New String :"+str1);
			break;
		}
		case 6:
		{
			str=s3.reverse();
			System.out.println("Original String :"+s3);
			System.out.println("New String :"+str);
			break;
		}
		
	       }
	System.out.println("Do you want to continue.......press 1 else 0");
	}while(ch1==1);
         }
}	   	