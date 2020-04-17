package pk2;
interface op2
{
	public void acc2();
}
public class  package1 implements op2
{
	float price;
	String cpy;
	public void acc2()
	{
		 price=5000;
		 cpy="Redmi";
	}
	public void show1()
	{
		System.out.println("Product price : "+price+"\tProduct brand : "+cpy);
	}
}