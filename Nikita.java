import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<applet code="Awtcontrols.class" height=300 width=100>
</applet>*/
public class Awtcontrols extends Applet implements ActionListener
{
	TextField t1,t2;
	Label l1,l2,l3,l4,l5;
	Button b1;
	TextArea ta;
	Choice ch;
	Checkbox cb1,cb2,cb3,cb4,cb5;
	CheckboxGroup cg1;
	public void init()	
	{
		t1=new TextField(8);
		t2=new TextField(8);
		//t2.setEchoChar("*");
		l1=new Label("Name");
		l2=new Label("Password");
		l3=new Label("Hall Place");
		l4=new Label("Venue");
		l5=new Label("Menu");	
		b1=new Button("Submit");
		cg1=new CheckboxGroup();
		cb1=new Checkbox("Sweet");
		cb2=new Checkbox("snacks");
		cb3=new Checkbox("Veg");
		cb4=new Checkbox("NonVeg");
		cb5=new Checkbox("Indoor",cg1,true);
		cb6=new Checkbox("Outdoor",cg1,false);
		ch=new Choice();
		ch.add("Gujrat");
		ch.add("Udaypur");
		ch.add("Pune");
		ch.add("Mumbai");
		ta=new TextArea();
		t1.setText("0");
		t2.setText("0");
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(cb1);
		add(cb2);
		add(cb3);
		add(cb4);
		add(l4);
		add(cb5);
		add(cb6);
		add(ch);
		add(b1);
		add(ta);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b2)
		{
			String str="Welcome "+t1.getText();
			str=str+"\nYour Age is:"+t3.getText();
			str=str+"\nYour Hobbies are : ";
			if(cb1.getState())
			{
			str=str+"\nSweet";
			}
			if(cb2.getState())
			{
			str=str+"\nSnacks";
			}
			if(cb3.getState())
			{
			str=str+"\nVeg";
			}
			if(cb4.getState())
			{
			str=str+"\nNonVeg";
			}
			str=str+"\nHall Place is:";
			if(cb5.getState())
			{
			str=str+"\nIndoor";
			}
			else if(cb6.getState())
			{
			str=str+"\nOutdoor";
			}
			str=str+"Hall Venue is :"+ch.getSelectedItem();
			ta.setText(str);
		}
	}
}