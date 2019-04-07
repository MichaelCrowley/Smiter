import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;

public class Background{

  public void draw(Graphics2D g2){
    Rectangle test = new Rectangle(250, 250, 500, 500);
    g2.setColor(Color.GREEN);
    g2.fill(test);
  }
}