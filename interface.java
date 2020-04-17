import java.awt.*;
import java.util.*;
interface employee
{
	int eid;
	void accept();
}
interface office
{
	String ename;
	void accept1();
}
class organization impliments employee,office
{
	String dept;
	void accept1()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter employee name : ");
		ename=s.next();
		System.out.println("Enter employee depatment : ");
		dept=s.next();
	}
	void show()
	{
		System.out.println("Employee name :"+ename+"\tDepartment :"+dept);
	}
}
class designation extends organization
{
	String desg;
	void accept1()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter designation : ");
		desg=s.next();
		System.out.println("Enter employee ID : ");
		eid=s.nextInt();
	}
	void show1()
	{
		System.out.println("Employee ID :"+eid+"\tDesignation :"+desg);
	}
}
class interface
{
	public static void main(String args[])
	{
		designation d=new designation();
		d.accept1();
		d.accept();
		d.show();
		d.show1();
	}
}