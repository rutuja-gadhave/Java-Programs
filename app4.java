import java.awt.*;
import  java.awt.event.*;
import java.applet.*;
public class app4 extends Applet implements ActionListener
{
	TextField tf1,tf2,tf3,tf4;
	Label l1,l2,l3,l4,l5;
	Button b1;
	public void init()
	{
		tf1=new TextField();
		tf2=new TextField();
		tf3=new TextField();
		tf4=new TextField();
		l5=new Label("Enter marks out of 25....");
		l1=new Label("maths");
		l2=new Label("science");
		l3=new Label("history");
		l4=new Label("Average");
		b1=new Button("Find Avg");
		add(l5);
		add(l1);
		add(tf1);
		add(l2);
		add(tf2);
		add(l3);
		add(tf3);
		add(b1);
		add(l4);
		add(tf4);
		b1.addActionListener(this);
		tf1.setText("0");
		tf2.setText("0");
		tf3.setText("0");
		tf4.setText("0");
	}
	public void actionPerformed(ActionEvent e)
	{
	    if(e.getSource()==b1)
	   {
		String t1,t2,t3,a1;
		double a,s1,s2,s3;
		t1=tf1.getText();
		t2=tf2.getText();
		t3=tf3.getText();
		s1=Integer.parseInt(t1);
		s2=Integer.parseInt(t2);
		s3=Integer.parseInt(t3);
		a=(s1+s2+s3)/75*100;
		a1=String.valueOf(a);
		tf4.setText(a1);
	   }
	}
//<applet code="app4.class" height=300 width=300>
//</applet>
}
		