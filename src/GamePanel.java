import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;


public class GamePanel extends JPanel{
    public GamePanel() {
        addKeyListener(new KeyListener() {
                public void keyTyped(KeyEvent e){
                    
                }
                public void keyPressed(KeyEvent e){

                }
                public void keyReleased(KeyEvent e) {
                    // TODO Auto-generated method stub
                    
                }
            }
        );
    }
    public void paintComponent(Graphics g){

        super.paintComponent(g);

        g.fillRect(0,0,200,200);
    }
}
