import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class ObjectsHolder extends JComponent{
  private Background b;
  
  public ObjectsHolder() {
    this.setFocusable(true);
    b = new Background();
  }

//Draw the board
public void paintComponent(Graphics g) {
    Graphics2D g2 = (Graphics2D) g;

    b.draw(g2);
  }
  
}