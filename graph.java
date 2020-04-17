import java.awt.*;
import java.applet.*;
/*<applet code="graph.class" height=300 width=300>
</applet>*/
public class graph extends Applet
{
	public void paint(Graphics g)
	{
		Font f=new Font("Times New Roman",Font.BOLD,20);
		g.setFont(f);
		Color c=new Color(210,100,100);
		g.setColor(c);
		g.drawString("Kite",250,30);
		g.drawLine(200,200,300,100);
		g.drawLine(300,100,400,200);
		g.drawLine(400,200,300,300);
		g.drawLine(300,100,300,300);
		g.drawLine(300,300,250,350);
		g.drawLine(250,350,350,350);
		g.drawLine(300,300,350,350);
		g.drawLine(200,200,300,300);
		g.drawArc(300,300,45,50,135,120);
	}
}