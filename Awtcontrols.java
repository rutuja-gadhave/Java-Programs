import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<applet code="Awtcontrols.class" height=300 width=100>
</applet>*/
public class Awtcontrols extends Applet implements ActionListener
{
	TextField t1,t2,t3;
	Label l1,l2,l3,l4,l5,l6,l7,l8;
	Button b1,b2;
	TextArea ta;
	Choice ch;
	Checkbox cb1,cb2,cb3,cb4,cb5,cb6;
	CheckboxGroup cg1;
	public void init()	
	{
		t1=new TextField(8);
		t2=new TextField(8);
		//t2.setEchoChar("*");
		t3=new TextField(20);
		l1=new Label("General Form");
		l2=new Label("UserName");
		l3=new Label("UserPassword");
		l4=new Label("Age");
		l5=new Label("Hobbies");
		l6=new Label("Gender");	
		l7=new Label("City");
		l8=new Label("Result");
		b1=new Button("Check Age");
		b2=new Button("Submit");
		cg1=new CheckboxGroup();
		cb1=new Checkbox("Singing");
		cb2=new Checkbox("Dancing");
		cb3=new Checkbox("Drawing");
		cb4=new Checkbox("Travel");
		cb5=new Checkbox("Male",cg1,true);
		cb6=new Checkbox("Female",cg1,false);
		ch=new Choice();
		ch.add("Pune");
		ch.add("Mumbai");
		ch.add("Nashik");
		ch.add("Nagpur");
		ta=new TextArea();
		t1.setText("0");
		t2.setText("0");
		t3.setText("0");
		add(l1);
		add(l2);
		add(t1);
		add(l3);
		add(t2);
		add(l4);
		add(t3);
		add(b1);
		add(l5);
		add(cb1);
		add(cb2);
		add(cb3);
		add(cb4);
		add(l6);
		add(cb5);
		add(cb6);
		add(ch);
		add(b2);
		add(ta);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		int x=Integer.parseInt(t3.getText());
		if(e.getSource()==b1)
		{
			if(x<0)
			{
				t3.setText("Age Cannot be less than 0");
			}
		}
		if(e.getSource()==b2)
		{
			String str="Welcome "+t1.getText();
			str=str+"\nYour Age is:"+t3.getText();
			str=str+"\nYour Hobbies are : ";
			if(cb1.getState())
			{
			str=str+"\nSinging";
			}
			if(cb2.getState())
			{
			str=str+"\nDancing";
			}
			if(cb3.getState())
			{
			str=str+"\nDrawing";
			}
			if(cb4.getState())
			{
			str=str+"\nTraveling";
			}
			str=str+"\nGender is:";
			if(cb5.getState())
			{
			str=str+"\nMale";
			}
			else if(cb6.getState())
			{
			str=str+"\nFemale";
			}
			str=str+"Your City is :"+ch.getSelectedItem();
			ta.setText(str);
		}
	}
}