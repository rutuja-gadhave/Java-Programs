//1606032 Rutika Gadhave
import java.awt.*;
import java.util.Scanner;
public class matrix
{
	public static void main(String args[])
	{
		int a[ ][ ]=new int[3][3];
		int b[ ][ ]=new int[3][3];
		int c[ ][ ]=new int[3][3];
		int i,j,k,sum=0;
		Scanner s1=new Scanner(System.in);
		System.out.println("\nEnter 3 by 3 matrix 1 : ");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				a[i][j]=s1.nextInt();
			}
		}
		System.out.println("\nEnter 3 by 3 matrix 2 : ");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				b[i][j]=s1.nextInt();
			}
		}
		System.out.println("\nMultiplication is : \n");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				for(k=0;k<3;k++)
				{
					sum=sum+(a[i][k]*b[k][j]);
				}
				c[i][j]=sum;
				sum=0;
			}
		}
		System.out.println("\nProduct of entered elements : ");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.println(c[i][j]+"\t");
			}
			System.out.println("\n");
		}
	}
}

					