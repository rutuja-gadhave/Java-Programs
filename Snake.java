import java.awt.*;

import java.applet.*;

import java.awt.event.*;

import java.util.ArrayList;

import javax.swing.*;

public class Snake extends JFrame implements Runnable, KeyListener
{     
public void init()
{

}
ArrayList<Element> arr;
    
Element food;
    
Thread t;
    
Graphics g;
    
int count;
    
public Snake()
    
{
        
super("Java Snake");
        
setSize(700, 700);
        
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
setResizable(false);
        
setVisible(true);
        
g = getGraphics();
        
arr = new ArrayList<Element>(10);
        
for(int i = 0; i < 10; i++)
            
arr.add(new Element(300 + 10 * i, 250, 1));
        
newFood();
        
addKeyListener(this);
        
t = new Thread(this);
        
t.start();
    
}
    
public void newFood()
    
{
        
do
        
{
            
food = new Element(30 + 10*(int)(66 * Math.random()), 30 + 10*(int)(46 * Math.random()), 0);
        
}
while(!isValidFood(food));
    
}
    
public boolean isValidFood(Element pos)
    
{
        
for(Element e : arr)
            
if(pos.x == e.x && pos.y == e.y)
                
return false;
        
return true;
    
}
    
public void run()
    
{
        
game:while(true)
        
{
            
for(int i = 1; i < arr.size(); i++)
            
{
                
if(arr.get(0).equals(arr.get(i)))
                
{
                    
showEnd();
                   
break game;
                
}
            
}
            
if(arr.get(0).x <= 0 || arr.get(0).y <= 10 || arr.get(0).x > 690 || arr.get(0).y >= 490)
            
{
               
 showEnd();
                
break game;
            
}
           
 if(arr.get(0).dir == 1 && arr.get(0).x - food.x == 10 && arr.get(0).y == food.y)
            
{
                
refresh();
                
continue;
            
}
            
else if(arr.get(0).dir == 2 && food.x - arr.get(0).x == 10 && arr.get(0).y == food.y)
            
{
                
refresh();
                
continue;
            
}
            
else if(arr.get(0).dir == 3 && arr.get(0).y - food.y == 10 && arr.get(0).x == food.x)
            
{
                
refresh();
                
continue;
            
}
           
else if(arr.get(0).dir == 4 && food.y - arr.get(0).y == 10 && arr.get(0).x == food.x)
            
{
                
refresh();
                
continue;
            
}
            
for(int i = arr.size() - 1; i > 0; i--)
            
{
                
arr.get(i).x = arr.get(i - 1).x;
                
arr.get(i).y = arr.get(i - 1).y;
                
arr.get(i).dir = arr.get(i - 1).dir;
            
}
            
switch(arr.get(0).dir)
            
{
                
case 1:
                    
arr.get(0).x -= 10;
                    
break;
                
case 2:
                    
arr.get(0).x += 10;
                    
break;
                
case 3:
                    
arr.get(0).y -= 10;
                    
break;
                
case 4:
                    
arr.get(0).y += 10;
                    
break;
            
}
            
render();
            
try
            
{
                
t.sleep(100);
            
}
            
catch(InterruptedException e)
            
{
                
e.printStackTrace();
            
}
        
}
    
}
    
public void refresh()
    
{
        
arr.add(0, new Element(food.x, food.y, arr.get(0).dir));
        
newFood();
        
render();
        
try
        
{
            
t.sleep(100);
        
}
        
catch(InterruptedException e)
        
{
             
e.printStackTrace();
        
}
    
}
    
public void render()
    
{
        
g.setColor(Color.green);
        
g.fillRect(0, 0, 700, 500);
        
g.setColor(Color.red);
        
g.fillOval(food.x, food.y, 10, 10);
        
g.setColor(Color.yellow);
        
for(int i = 0; i < arr.size(); i++)
{
g.fillOval(arr.get(i).x, arr.get(i).y, 10, 10);
    
if(i==0)
{
	g.setColor(Color.black);
	g.fillOval(arr.get(0).x,arr.get(0).y,10,10);
}
}
}
    
public void keyPressed(KeyEvent ke)
    
{
        
switch(ke.getKeyChar())
        
{
            
case 'W':
            
case 'w':
                
if(arr.get(0).dir != 4)
                    
arr.get(0).dir = 3;
                
break;
            
case 'A':
            
case 'a':
                
if(arr.get(0).dir != 2)
                    
arr.get(0).dir = 1;
                
break;
            
case 'S':
            
case 's':
                
if(arr.get(0).dir != 3)
                    
arr.get(0).dir = 4;
                
break;
            
case 'D':
            
case 'd':
                
if(arr.get(0).dir != 1)
                    
arr.get(0).dir = 2;
                
break;
        
}
    
}
    
public void keyReleased(KeyEvent ke)
    
{
        
switch(ke.getKeyChar())
        
{
            
case 'W':
            
case 'w':
                
if(arr.get(0).dir != 4)
                    
arr.get(0).dir = 3;
                
break;
            
case 'A':
            
case 'a':
                
if(arr.get(0).dir != 2)
                    
arr.get(0).dir = 1;
                
break;
            
case 'S':
            
case 's':
                
if(arr.get(0).dir != 3)
                    
arr.get(0).dir = 4;
                
break;
            
case 'D':
            
case 'd':
                
if(arr.get(0).dir != 1)
                    
arr.get(0).dir = 2;
                
break;
        
}
    
}
    
public void keyTyped(KeyEvent ke)
    
{
        
switch(ke.getKeyChar())
        
{
            
case 'W':
            
case 'w':
                
if(arr.get(0).dir != 4)
                    
arr.get(0).dir = 3;
                
break;
            
case 'A':
            
case 'a':
                
if(arr.get(0).dir != 2)
                    
arr.get(0).dir = 1;
                
break;
            
case 'S':
            
case 's':
                
if(arr.get(0).dir != 3)
                    
arr.get(0).dir = 4;
                
break;
            
case 'D':
            
case 'd':
                
if(arr.get(0).dir != 1)
                    
arr.get(0).dir = 2;
                
break;
        
}
    
}
    
public void showEnd()
    
{        
g.setColor(Color.green);
        
g.fillRect(0, 0, 700, 500);
        
g.setColor(Color.yellow);
        
g.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
        
g.drawString("Game Over!", 200, 200);
        
g.drawString("Your score: " + 10 * (arr.size() - 10), 200, 250);

}
public void paint(Graphics g){}
    
public void update(Graphics g){}
    
public static void main(String args[])
    
{
        

Snake s = new Snake();
        
s.requestFocus();
  

}

}