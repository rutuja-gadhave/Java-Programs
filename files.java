import java.io.*;
class files
{
	public static void main(String args[])
	throws NullPointerException
	{
		String dnm="C://Java ";
		File f1=new File(dnm,"work.txt");
		File f2=new File("File name is"+f1.getName());
		System.out.println("Listening contents of directory");
		File f3=new File("C://java1");
		String s[]=f3.list();
		for(int i=0;i<s.length;i++)
		{
		File f= new File("\t"+dnm+"/"+s[i]);
		if(f.isDirectory())
		{
			f.delete();
			System.out.println("\t"+s[i]+"is directory");
		}
		else
		{
			System.out.println("\t"+s[i]+"is a file");
		}
		}
	}
}
