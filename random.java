import java.io.*;
class random
{
	public static void main(String args[])
	{
		RandomAccessFile f=null;
		try
		{
		f=new RandomAccessFile("a.txt","rw");
		f.writeInt(1234);
		f.writeChar('n');
		f.writeBoolean(true);
		f.seek(0);
		System.out.println(f.readInt());
		System.out.println(f.readChar());
		System.out.println(f.readBoolean());
		f.seek(3);
		System.out.println(f.readBoolean());
		f.seek(f.length());
		f.writeDouble(1234.00);
		f.seek(0);
		System.out.println(f.readInt());
		System.out.println(f.readChar());
		System.out.println(f.readBoolean());
		System.out.println(f.readDouble());
		}
		catch(Exception e){}
		finally
		{
		try
			{
			f.close();
			}
			catch(Exception e){}
		}
	}
}