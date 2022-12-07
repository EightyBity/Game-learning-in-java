import javax.swing.JPanel;
import java.awt.Graphics;


public class GamePanel extends JPanel{
    private mouseInputs mouseInputs;
    private int xDelta = 100, yDelta = 100;
    public GamePanel() {
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

        g.fillRect(0 + xDelta,0 + yDelta,200,200);
    }
}
