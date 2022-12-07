import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;


public class GamePanel extends JPanel{
    private mouseInputs mouseInputs;
    private float xDelta = 100, yDelta = 100;
    private float xDir = 1f, yDir = 1f;

    private long LastCheck = 0;
    private Color color = new Color(150, 20, 90);
    private Random random;
    public GamePanel() {
        random = new Random();
        mouseInputs = new mouseInputs(this);
        addKeyListener(new KeyboardInputs(this));
        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs);
    }
    public void changeXDelta(int value){
        this.xDelta += value;
        repaint();
    }
    public void changeYDelta(int value){
        this.yDelta += value;
        repaint();
    }
    public void setRectPos(int x, int y){
        this.xDelta = x;
        this.yDelta = y;
        repaint();
    }
    public void paintComponent(Graphics g){

        super.paintComponent(g);

        updateRectangle();
        g.setColor(color);
        g.fillRect(0 + (int)xDelta,0 + (int)yDelta,200,100);
        
        
        
    }
    private void updateRectangle(){
            xDelta+= xDir;
            if(xDelta > 400 || xDelta < 0){
                xDir*=-1;
                color = getRndColor();
            }
            yDelta+= yDir;
            if(yDelta > 400 || yDelta < 0){
                yDir*=-1;
                color = getRndColor();
            }
    }
    private Color getRndColor() {
        int r = random.nextInt(255);
        int b = random.nextInt(255);
        int g = random.nextInt(255);

        return new Color(r,g,b);
    }
}
