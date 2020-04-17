import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.image.BufferStrategy;
import java.awt.event.*;
import javax.swing.*;
 
public class Events implements Runnable {
 
    JFrame frame;
    int myX = 400;
    int myY = 400;
    Canvas canvas;
    BufferStrategy bufferStrategy;
    boolean running = true;
 
    public Events() 
	{
        frame = new JFrame("Basic Game");
        JPanel panel = (JPanel) frame.getContentPane();
        panel.setPreferredSize(new Dimension(500, 500));
        panel.setLayout(null);
        canvas = new Canvas();
        canvas.setBounds(0, 0, 500, 500);
        canvas.setIgnoreRepaint(true);
        panel.add(canvas);
        canvas.addKeyListener(new KeyAdapter()
	 {
           
            public void keyPressed(KeyEvent evt) 
	{
                moveIt(evt);
            }
        });
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);
        canvas.createBufferStrategy(2);
        bufferStrategy = canvas.getBufferStrategy();
        canvas.requestFocus();
    }
    public void run() {
        while (running = true) {
            Paint();
            try {
                Thread.sleep(25);
            } catch (InterruptedException e) {
            }
        }
    }
    public static void main(String[] args)
    {
        Events ex = new Events();
        new Thread(ex).start();
    }
    public void Paint() {
        Graphics2D g = (Graphics2D) bufferStrategy.getDrawGraphics();
        g.clearRect(0, 0, 500, 500);
        Paint(g);
        bufferStrategy.show(); 
    }
 
    protected void Paint(Graphics2D j) {
     j.fillOval(myX, myY, 30, 30);
     j.fillOval(myX,myY,50,50);
    j.drawArc(myX,myY,45,100,150,120);


    }
    public void moveIt(KeyEvent evt) {
     switch (evt.getKeyCode()) 
	{
            case KeyEvent.VK_DOWN:
                myY += 5;
                break;
            case KeyEvent.VK_UP:
                myY -= 5;
                break;
            case KeyEvent.VK_LEFT:
                myX -= 5;
                break;
            case KeyEvent.VK_RIGHT:
                myX += 5;
                break;
        }
         
       
         
    }
}