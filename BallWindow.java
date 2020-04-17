public class BallPanel extends JPanel implements Runnable {

int RED, GREEN, BLUE;
int Xdirection = 1, Ydirection = 1;
boolean pleaseWait = false;

BallPanel(int X, int Y){
    locateBall(X, Y, 30, 30);               
/*  Random r = new Random();
    RED = r.nextInt(255);
    GREEN = r.nextInt(255);
    BLUE = r.nextInt(255);
    */
}   
public void paint(Graphics g){
    int panelWidth = this.getWidth();
    int panelHeight = this.getHeight();     

//  g.setColor( new Color(RED, GREEN, BLUE ));
    g.setColor(Color.ORANGE);

    g.fillOval(panelWidth/2, panelHeight/2,panelWidth/2, panelHeight/2);
}

public void locateBall(int x, int y, int width, int height){

    setBounds(x, y, width, height);
    repaint();
}

public void run() {

    int width = this.getWidth();
    int height = this.getHeight();
    Random r = new Random();

    while(true){
        if(!pleaseWait){
            int lastX = this.getX();
            int lastY = this.getY();

            if (lastX > 675) Xdirection = -1;
            if (lastY > 485) Ydirection = -1;
            if (lastX < -5) Xdirection = 1;
            if (lastY < -5) Ydirection = 1;

    /*      if(lastX > 280 && lastY > 170){
                Xdirection = -1;
                Ydirection = -1;
            }
    */      
            locateBall(lastX + Xdirection*r.nextInt(3), 
                       lastY + Ydirection*r.nextInt(3), 
                       width, height );
        }
        try{
            Thread.sleep(5);
        }catch(Exception e){};
    }

}

}


public class BallWindow extends JFrame implements ActionListener{
    JButton btnStop = new JButton("STOP");
    JButton btnSave = new JButton("SAVE");
    Vector<BallPanel> ballVector = new Vector<BallPanel>();

    JPanel p1 = createPanel(280, 200, 200, 20, Color.gray);
    JPanel p2 = createPanel(280, 300, 200, 20, Color.gray);
    JPanel bottomp = createPanel(345, 540, 70, 15, Color.black);

    JPanel lborder = createPanel(10, 10, 2, 560, Color.black);
    JPanel rborder = createPanel(720, 10, 2, 560, Color.black);
    JPanel tborder = createPanel(10, 10, 710, 2, Color.black);



public BallWindow() {
    setLayout(null);
    btnStop.setBounds(12, 15, 100, 30);
    btnStop.addActionListener(this);
    add(btnStop);
    btnSave.setBounds(12, 50, 100, 30);
    //btnSave.addActionListener(this);
    add(btnSave);
    Random r = new Random();
    for(int i=0; i<7; i++){
        BallPanel bp = new BallPanel(r.nextInt(740), r.nextInt(590));
        Thread t = new Thread(bp);
        ballVector.add(bp);
        t.start();
        add(bp);
    }
add(p1);
    add(p2);
    add(bottomp);
    add(lborder);
    add(rborder);
    add(tborder);

    setSize(740, 590);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setResizable(false);
    repaint();
}


JPanel createPanel(int x, int y, int width, int height, Color pColor){
    JPanel temp = new JPanel();
    temp.setBackground(pColor);
    temp.setBounds(x, y, width, height);
    return temp;    
}



public static void main(String[] args) {
    new BallWindow();

}
public void actionPerformed(ActionEvent arg0) {
    for (BallPanel ball : ballVector) {
        ball.pleaseWait = !ball.pleaseWait;
    }

    if( btnStop.getText().equalsIgnoreCase("STOP"))
        btnStop.setText("START");
    else
        btnStop.setText("STOP");

//  if(arg0.getSource())

}

}