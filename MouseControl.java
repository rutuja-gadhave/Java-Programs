import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Game implements Runnable{
   
   final int WIDTH = 1000;
   final int HEIGHT = 700;
   
   JFrame frame;
   Canvas canvas;
   BufferStrategy bufferStrategy;
   
   public Game(){
      frame = new JFrame("Basic Game");
      
      JPanel panel = (JPanel) frame.getContentPane();
      panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
      panel.setLayout(null);
      
      canvas = new Canvas();
      canvas.setBounds(0, 0, WIDTH, HEIGHT);
      canvas.setIgnoreRepaint(true);
      
      panel.add(canvas);
      
      canvas.addMouseListener(new MouseControl());
      
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.pack();
      frame.setResizable(false);
      frame.setVisible(true);
      
      canvas.createBufferStrategy(2);
      bufferStrategy = canvas.getBufferStrategy();
      
      canvas.requestFocus();
   }
   
        
  
    public boolean mouseLeftPressed, mouseRightPressed;
      
      public void MouseClicked(MouseEvent e){}
      public void MouseDragged(MouseEvent e){}
      public void MouseEntered(MouseEvent e){}
      public void MouseExited(MouseEvent e){}
      public void MouseMoved(MouseEvent e){}
      public void MousePressed(MouseEvent e){
         switch(e.getButton()) {
            case MouseEvent.BUTTON1:
               mouseLeftPressed = true;
               System.out.println("mouseLeftPressed");
               break;
            case MouseEvent.BUTTON2:
               mouseRightPressed = true;
               System.out.println("mouseRightPressed");
               break;
         }
      }
      public void MouseReleased(MouseEvent e){
         switch(e.getButton()) {
            case MouseEvent.BUTTON1:
               mouseLeftPressed = false;
               System.out.println("mouseLeftReleased");
               break;
            case MouseEvent.BUTTON2:
               mouseRightPressed = false;
               System.out.println("mouseRightReleased");
               break;
         }
      }
      public void MouseWheelMoved(MouseEvent e){}
      
   }
   
   public static void main(String [] args){
      Game ex = new Game();
      new Thread(ex).start();
   }

}