//Rutuja Gadhave 
//1606032
class Test1
{
	public static void main(String[] args)
	{
		double d=100.4;
		//explicit type casting
		long l = (long)d;
		//explicit type casting
		int i = (int)l;
		System.out.println("\nDouble value "+d);
		//fractional part lost
		System.out.println("\nLong value "+l);
		//fractional part lost
		System.out.println("\nInt value "+i);
	}
}