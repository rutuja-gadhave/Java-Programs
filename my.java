import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
class my extends Frame  implements ActionListener,ItemListener
{
	TextField t1,t2,t3,t4,t5,t6,t7,t8,t9;
	Panel p;
	Font f;
	Choice l1,l2,l3,l4,l5,l6,l7,l8,l9;
	String m1[]={"1","2","3","4","5","6","7","8","9"};
	my()
	{
		super("MagicSquare");
		setVisible(true);
		setSize(400,400);
		//t1=new TextField[10];
		p=new Panel();
		add(p);
		p.setLayout(null);
		t1=new TextField(20);
		t2=new TextField(20);
		t3=new TextField(20);
		f=new Font("Times new Romen",Font.BOLD,28);
		p.setFont(f);
		t4=new TextField(20);
		t5=new TextField(20);
		t6=new TextField(20);
		
		t7=new TextField(20);
		t8=new TextField(20);
		t9=new TextField(20);
		for(int i=0;i<10;i++)
		{
			p.add (new TextField(i));
			
		}
		l1=new Choice();
		l2=new Choice();
		l3=new Choice();

		l4=new Choice();
		l5=new Choice();
		l6=new Choice();

		l7=new Choice();
		l8=new Choice();
		l9=new Choice();
		l1.add("1");
		l1.add("2");
		l1.add("3");
		l1.add("4");
		l1.add("5");
		l1.add("6");	
		l1.add("7");
		l1.add("8");
		l1.add("9");


		l2.add("1");
		l2.add("2");
		l2.add("3");
		l2.add("4");
		l2.add("5");
		l2.add("6");	
		l2.add("7");
		l2.add("8");
		l2.add("9");

		l3.add("1");
		l3.add("2");
		l3.add("3");
		l3.add("4");
		l3.add("5");
		l3.add("6");	
		l3.add("7");
		l3.add("8");
		l3.add("9");

		
		l4.add("1");
		l4.add("2");
		l4.add("3");
		l4.add("4");
		l4.add("5");
		l4.add("6");	
		l4.add("7");
		l4.add("8");
		l4.add("9");

		
		l5.add("1");
		l5.add("2");
		l5.add("3");
		l5.add("4");
		l5.add("5");
		l5.add("6");	
		l5.add("7");
		l5.add("8");
		l5.add("9");

		
		l6.add("1");
		l6.add("2");
		l6.add("3");
		l6.add("4");
		l6.add("5");
		l6.add("6");	
		l6.add("7");
		l6.add("8");
		l6.add("9");

		
		p.add(t1);
		p.add(t2);
		p.add(t3);
		p.add(t4);
		p.add(t5);
		p.add(t6);
		p.add(t7);
		p.add(t8);
		p.add(t9);
		p.add(l1);
		p.add(l2);
		p.add(l3);

		p.add(l4);
		p.add(l5);
		p.add(l6);

		t1.setBounds(180,110,50,50);
		t2.setBounds(230,110,50,50);
		t3.setBounds(280,110,50,50);
	
		t4.setBounds(180,190,50,50);
		t5.setBounds(230,190,50,50);
		t6.setBounds(280,190,50,50);

		
		l1.setBounds(180,70,50,50);
		l2.setBounds(230,70,50,50);
		l3.setBounds(280,70,50,50);

		l4.setBounds(180,160,50,50);
		l5.setBounds(230,160,50,50);
		l6.setBounds(280,160,50,50);

		
		l1.addItemListener(this);
		l2.addItemListener(this);
		l3.addItemListener(this);
		l4.addItemListener(this);
		l5.addItemListener(this);
		l6.addItemListener(this);
		l7.addItemListener(this);	
		l8.addItemListener(this);
		l9.addItemListener(this);
}
public void itemStateChanged(ItemEvent e)
		{
			
			int s[];
			t1.setText(l1.getSelectedItem());
			t2.setText(l1.getSelectedItem());
			t3.setText(l1.getSelectedItem());
			t4.setText(l1.getSelectedItem());
			t5.setText(l1.getSelectedItem());
			t6.setText(l1.getSelectedItem());
			

				
		}

public void actionPerformed(ActionEvent e)
{	
		
			int [] s={};
			t1.setText(l1.getSelectedItem());
				for(int i=0;i<s.length;i++)
				{
					
					t1.setText("  "+s[i]);
				}							
}		
	public static void main(String args[])
	{
		my m=new my();
	}
}
