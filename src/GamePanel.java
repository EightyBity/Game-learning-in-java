import javax.swing.JPanel;
import java.awt.Graphics;


public class GamePanel extends JPanel{
    public GamePanel() {

    }
    public void paintComponent(Graphics g){

        super.paintComponent(g);

        g.fillRect(0,0,200,200);
    }
}
