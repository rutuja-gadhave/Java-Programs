//Rutuja Gadhave - 1606032
import java.io.*;
import java.awt.*;
class file1
{
	public static void main(String args[])
	{
		File in =new File("src.txt");
		File of =new File("des.txt");
		FileReader fr=null;
		FileWriter fw=null;
		try
		{
			fr = new FileReader(in);
			fw = new FileWriter(of);
			int ch;
			
			
			while((ch=fr.read())!=-1)
			{
				
				fw.write(ch);
			}
		}
		catch(IOException e)
		{
			System.out.println(e);
			System.out.println(-1);
		}
		finally
		{
			try
			{
				fr.close();
				fw.close();
			}
			catch(IOException e)
			{
				System.out.println(e);}
		}
	}
}

	



