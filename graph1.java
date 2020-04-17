import java.awt.*;
import java.applet.*;
//<applet code="graph1.class" height=400 width=400>
//</applet>
public class graph1 extends Applet
{
	public void paint(Graphics g)
	{ 
		Font f=new Font("Times New Roman",Font.BOLD,25);
		g.setFont(f);
		/*g.drawString("Rutuja",250,50);
		g.drawLine(10,200,250,500);
		g.drawLine(110,200,250,500);
		g.drawRoundRect(10,200,500,110,10,10);
		g.fillRoundRect(20,210,450,100,5,5);*/
		g.drawOval(20,20,200,120);
		g.setColor(Color.green);
		g.fillOval(70,30,100,100);//circle
		int x[]={20,120,220,20};
		int y[]={20,120,20,20};
		int x1[]={120,220,220,120};
		int y1[]={120,20,220,120};
		int n1=4;
		int n2=4;
		g.drawPolygon(x,y,n1);
		g.setColor(Color.red);
		g.fillPolygon(x1,y1,n2);
	}
}