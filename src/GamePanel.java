import javax.swing.JPanel;
import java.awt.Graphics;


public class GamePanel extends JPanel{
    private mouseInputs mouseInputs;
    public GamePanel() {
        mouseInputs = new mouseInputs();
        addKeyListener(new KeyboardInputs());
        addMouseListener(new mouseInputs());
        addMouseMotionListener(mouseInputs);
    }
    public void paintComponent(Graphics g){

        super.paintComponent(g);

        g.fillRect(0,0,200,200);
    }
}
