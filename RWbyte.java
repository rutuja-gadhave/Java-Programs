import java.io.*;
class RWbyte
{
	public static void main(String args[])
	{
		FileInputStream fr=null;
		FileOutputStream fw=null;
		try{
		fr=new FileInputStream("a.txt");
		fw=new FileOutputStream("b.txt");
		int ch;
		while((ch=fr.read())!=-1)
		{
			fw.write(ch);
		}
		}
		catch(Exception e){}
		finally
		{
			try{
			fr.close();
			fw.close();
			}
			catch(Exception e){}
		}
	}
}