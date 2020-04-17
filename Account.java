class Account
{
	int ano;
	string cname;
	double abal;
	public void accept()
	{
	Scanner s=new Scanner(System.in)
	System.out.println("\nEnter account no,name,balance : ");
	ano=s.nextInt ();
	cname=s.next ();
	abal=s.nextDouble();
	}
	
	public void display()
	{
	System.out.println("\nname : "+cname+"\taccount no. : "+ano+"\tsalary : "+abal);
	}
}
class TestAccount
{
	public static void main(String arg[])
	{
		Account a=new Account()
	

