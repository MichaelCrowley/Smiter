/*
 *  Author: Michael Crowley
 *  Date: 4/6/2019
 * 
 *  This class displays the background image.
 */

import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Background extends JPanel{

  private Image background;

  public Background(){
    loadBackground();
  }

  //Display image
  public void draw(Graphics2D g2){
    g2.drawImage(background, 0, 0, this);
    Toolkit.getDefaultToolkit().sync();
  }

  private void loadBackground(){    
    ImageIcon source = new ImageIcon("assets/background.png");
    background = source.getImage();
  }
}