import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.awt.*;
class copy
{
	public static void main(String args[])
	{
		File in =new File("src.txt");
		File of =new File("des.txt");
		FileInputStream in1=null;
		FileOutputStream of1=null;
		try
		{
			in1=new FileInputStream(in);
			of1=new FileOutputStream(of);
			int ch;
			
			
			while((ch=in1.read())!=-1)
			{
				
				of1.write(ch);
			}
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		finally
		{
			try
			{
				in1.close();
				of1.close();
			}
			catch(IOException e)
			{
				System.out.println(e);}
		}
	}
}

	



