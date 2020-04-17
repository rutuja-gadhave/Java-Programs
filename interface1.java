//Rutuja Gadhave-1606032
import java.awt.*;
import java.util.*;
interface employee
{
	static int eid=101;
	public void accept();
}
interface office
{
	static String ename="Rutuja";
	public void accept1();
}
class organization implements office,employee
{
	String desg;
	public void accept1()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter designation : ");
		desg=s.next();
	}
	String dept;
	public void accept()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter employee department : ");
		dept=s.next();
	}
	 void show()
	{
		System.out.println("Employee ID :"+eid+"\tEmployee name :"+ename);
	}
}
class designation extends organization
{
	
	
	void show1()
	{
		System.out.println("Employee designation :"+desg+"\tDepartment :"+dept);
	}
}
class interface1
{
	public static void main(String args[])
	{
		designation d=new designation();
		d.accept();
		d.accept1();
		d.show();
		d.show1();
	}
}