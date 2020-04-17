import java.io.*;
class RWbyte1
{
	public static void main(String args[])
	{
		byte b[]={'n','e','h','a'};
		FileOutputStream fw=null;
		try{
		fw=new FileOutputStream("b1.txt");
		fw.write(b);
		}
		catch(Exception e){}
		finally
		{
			try{
			fw.close();
			}
			catch(Exception e){}
		}
	}
}