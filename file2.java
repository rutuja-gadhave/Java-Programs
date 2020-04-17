//Rutuja Gadhave - 1606032
import java.io.*;
import java.awt.*;
class file2
{
	public static void main(String args[])
	{
		FileInputStream fi=null;
		FileInputStream fi1=null;
		FileOutputStream f4=null;
		SequenceInputStream fo=null;
		BufferedInputStream fr=null;
		BufferedOutputStream fw=null;
		
		try
		{
			int ch;
			fi=new FileInputStream("src.txt");
			fi1=new FileInputStream("src1.txt");
			f4=new FileOutputStream("des1.txt");
			fo = new SequenceInputStream(fi,fi1);	
			fr = new BufferedInputStream(fo);
			fw = new BufferedOutputStream(f4);
			while((ch=fr.read())!=-1)
			{
				
				fw.write((char)ch);
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
				System.out.println(e);
			}
		}
	}
}