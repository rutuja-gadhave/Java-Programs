import java.io.*;
import java.awt.*;
class concatesq
{
	public static void main(String args[])
	{
		FileInputStream fi1=null;
		FileInputStream fi2=null;
		FileOutputStream fil=null;
		SequenceInputStream fi3=null;
		BufferedInputStream bfi=null;
		BufferedOutputStream bfo=null;
		try
		{
			fi1=new  FileInputStream("file1.txt");
			fi2=new  FileInputStream("file2.txt");
			fil=new FileOutputStream("file.txt");
			fi3=new SequenceInputStream(fi1,fi2);
			bfi=new BufferedInputStream(fi3);
			bfo=new BufferedOutputStream(fil);
			int ch;
			while((ch=bfi.read())!=-1)
			{
				bfo.write(ch);
			}
		}
		catch(IOException e)
		{
		}
		finally
		{
			try
			{
				bfi.close();
				bfo.close();
			}
			catch(IOException e){}
		}
	}
}