import java.io.*;
class primitive
{
	public static void main(String args[])
	{
		FileOutputStream fout=null;
		DataOutputStream dout=null;
		try
		{
		fout=new FileOutputStream("a.txt");
		dout=new DataOutputStream(fout);
		dout.writeInt(1234);
		dout.writeChar('n');
		dout.writeDouble(1234.00);
		dout.writeBoolean(true);
		}
		catch(Exception e){}
		finally
		{
			try
			{
			dout.close();
			}
			catch(Exception e){}
		}

		FileInputStream fin=null;
		DataInputStream din=null;
		try
		{
		fin=new FileInputStream("a.txt");
		din=new DataInputStream(fin);
		System.out.println(din.readInt());
		System.out.println(din.readChar());
		System.out.println(din.readDouble());
		System.out.println(din.readBoolean());
		}
		catch(Exception e){}
		finally
		{
		try
			{
			din.close();
			}
			catch(Exception e){}
		}
	}
}