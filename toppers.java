import java.awt.*;
class student
{
	float getpercentage()
	{  return 0;}
}
class rutuja extends student
{
	float getpercentage()
	{  return 95;}
}
class neha extends student
{
	float getpercentage()
	{  return 93;}
}	
class riddhi extends student
{
	float getpercentage()
	{  return 90;}
}			
class toppers
{
	public static void main(String args[])
	{
	rutuja r=new rutuja();
	neha n=new neha();
	riddhi ri=new riddhi();
	System.out.println("Rutuja Scored : "+r.getpercentage());
	System.out.println("Neha Scored : "+n.getpercentage());
	System.out.println("Riddhi Scored : "+ri.getpercentage());
	}
}
	