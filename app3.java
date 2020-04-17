import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class app3 extends Applet implements ActionListener
{
	TextField tf1,tf2;
	Button b1,b2,b3;
	Label l1,l2;
	public void init()
	{
		b1=new Button("Squqre");
		b2=new Button("Cube");
		b3=new Button("Factorial");
		tf1=new TextField();
		tf2=new TextField();
		l1=new Label("Enter any number : ");
		l2=new Label("Answer  : ");
		add(l1);
		add(tf1);
		add(b1);
		add(b2);
		add(b3);
		add(l2);
		add(tf2);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		tf1.setText("0");
		tf2.setText("0");
	}
	public void actionPerformed(ActionEvent e)
	{
		
		int a,b;
		String x,y;
		x=tf1.getText();
		a=Integer.parseInt(x);
		if(e.getSource()==b1)
		{
			b=a*a;
			y=String.valueOf(b);
			tf2.setText(y);
		}
		if(e.getSource()==b2)
		{
			
			b=a*a*a;
			y=String.valueOf(b);
			tf2.setText(y);
		}
		if(e.getSource()==b3)
		{	
			b=1;
			for(int i=1;i<=a;i++)
			{
				b=b*i;
			}
			y=String.valueOf(b);
			tf2.setText(y);
		}
	}
//<applet code="app3.class" height=300 width=300>
//</applet>
}