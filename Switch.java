//Rutuja  Gadhave 1606032
import java.util.Scanner;
class Switch
{
       public static void main(String args[])
       {
	int ch,ch1,a,b,c,d;
                 Scanner s=new Scanner(System.in);
	System.out.println("\n1 = ARITHMATIC OPERATION\n2 = LOGICAL OPERATION \n3 = RELATIONAL OPERATION");
                 System.out.println("\nEnter your choice : ");
                 ch=s.nextInt();
	switch(ch)
	{
	               case 1:
	              {
		System.out.println("\nARITHMATIC OPERATION");
                                   System.out.println("\nEnter any two values  : ");
       		a=s.nextInt();
		b=s.nextInt();
		System.out.println("\n1 = ADDITION\n2 = SUBTRACTION\n3 = MULTIPLICATION\n4 = DIVISION \n5 = MODULUS");
		System.out.println("\nEnter your choice for arithmatic operation : ");
		ch1=s.nextInt();
		switch(ch1)
		{
			case 1:
			c=a+b;
			System.out.println("\nAddition is : "+c);
			break;
			
			case 2:
			c=a-b;
			System.out.println("\nSubtraction is : "+c);
			break;
			
			case 3:
			c=a*b;
			System.out.println("\nMultiplication is : "+c);
			break;

			case 4:
			c=a/b;
			System.out.println("\nDivision is : "+c);
			break;

			case 5:
			c=a%b;
			System.out.println("\nModulus is : "+c);
			break;
			
			default:
			System.out.println("\nInvalid Choice");
		}
		break;
	     }	
	     case 2:
                      {
		System.out.println("\nLOGICAL OPERATIONS") ;
		System.out.println("\nEnter any  number : ");
       		d=s.nextInt();
		if((d%2==0)&&(d%5==0))
		{
			System.out.println("\nGiven no. is divisible by 2 and 5 ");
		}
		else if((d%2==0)||(d%5==0))
		{
			System.out.println("\nGiven no. is divisible by 2 or 5 ");
		}
		else 
		{
			System.out.println("\nThe given no. is not divisible by both 2 and 5");
		}
	                 break;
                 }
	case 3 :
	{
		System.out.println("\nRELATIONAL OPERATIONS");
		System.out.println("\nEnter any two values  : ");
       		a=s.nextInt();
		b=s.nextInt();
		if(a>b)
		System.out.println("\n"+a+" is the greatest value"); 
	 	else if(b>a)
		System.out.println("\n"+b+" is the greatest value"); 
		else if(a==b)
		System.out.println("\nBoth values are equal");
		else if(a!=b)
		System.out.println("\nBoth values are not equal");
		else if(a>=b)
		System.out.println("\n"+a+" is  greater than equal to "+b);
		else if(a<=b)
		System.out.println("\n"+a+" is less than equal to "+b); 
		break;
	}
	default:
	System.out.println("\nInvalid choice");
           }
      }
}		
   
			
			

			
			

		
            	
	 