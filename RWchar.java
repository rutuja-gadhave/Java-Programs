import java.io.*;
class RWchar
{
	public static void main(String args[])
	{
		FileReader fr=null;
		FileWriter fw=null;
		try{
		fr=new FileReader("a.txt");
		fw=new FileWriter("b.txt");
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