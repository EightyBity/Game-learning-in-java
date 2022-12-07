import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;


public class GamePanel extends JPanel{
    public GamePanel() {
        addKeyListener(new KeyboardInputs());
    }
    public void paintComponent(Graphics g){

        super.paintComponent(g);

        g.fillRect(0,0,200,200);
    }
}
