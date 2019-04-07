import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Background extends JPanel{

  private Image p;

  public Background(){
    loadImage();
  }
  public void draw(Graphics2D g2){
    Rectangle test = new Rectangle(150, 150, 500, 500);
    g2.setColor(Color.GREEN);
    g2.fill(test);
    drawP(g2);
  }

  private void drawP(Graphics2D g2){
      g2.drawImage(p, 200, 200, this);
      Toolkit.getDefaultToolkit().sync();
  }

  private void loadImage(){    
    ImageIcon ii = new ImageIcon("assets/player/adventurer-idle-00.png");
    p = ii.getImage();
  }
}