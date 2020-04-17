import java.awt.*;
import java.applet.Applet;
public class app1 extends Applet
{
	TextField tf1,tf2,tf3;
public void init()
{
	 tf1=new TextField(20);
	 tf2=new TextField(20);
	 tf3=new TextField(20);
	add(tf1);
	add(tf2);
	add(tf3);
	tf1.setText("0");
	tf2.setText("0");
	tf3.setText("0");
}
public void paint(Graphics g)
{
	String x,y,z,d;
	int a,b,c,v;
	try
	{
		x=tf1.getText();
a=Integer.parseInt(x);
		y=tf2.getText();
b=Integer.parseInt(y);
		z=tf3.getText();
c=Integer.parseInt(z);
		v=a*b*c;
		d=String.valueOf(v);
		g.drawString("Multiplication is : "+d,100,200);	
	}
	catch(Exception e)
	{
		System.out.println(e);
	}	
}
}