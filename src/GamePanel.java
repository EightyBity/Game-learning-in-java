import javax.imageio.ImageIO;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

public class GamePanel extends JPanel{
    private mouseInputs mouseInputs;
    private float xDelta = 100, yDelta = 100;
    private BufferedImage img, subImg;
    public GamePanel() {
        mouseInputs = new mouseInputs(this);
        setPanelSize();
        importImg();
        addKeyListener(new KeyboardInputs(this));
        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs);
    }
    private void importImg() {
        InputStream is = getClass().getResourceAsStream("res/test.png");
        try {
            img = ImageIO.read(is);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    private void setPanelSize() {
        Dimension size = new Dimension(1280,800);
        setPreferredSize(size);
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
    }
    public void paintComponent(Graphics g){

        super.paintComponent(g);

        int y = 0;
        int x = 0;
        subImg = img.getSubimage(1*78, 0, 78, 56);
     g.drawImage(subImg, (int)xDelta, (int)yDelta,156,116, null);
  
      
    }
   
}
