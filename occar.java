//1606032	Rutuja Gadhave
import java.util.*;
import java.lang.*;
import java.awt.*;
public class occar
{
public static void main(String args[])
{
String s=new String("Rutuja");
System.out.println("String="+s);
char c;
Scanner t=new Scanner(System.in);
System.out.println("Enter character");
c=t.next().charAt(0);
int cnt=0;
for(int i=1;i<s.length();i++)
{
if(s.charAt(i)==(c))
cnt++;
}
System.out.println("occurances of charcter in string="+cnt);
}
}


