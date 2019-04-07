
/*
 *  Author: Michael Crowley
 *  Date: 4/7/2019
 * 
 *  This class dictates how all characters sould be set up.
 */
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Rectangle;
import java.awt.Toolkit;
public class Character extends JPanel{
  public int health;
  public double speed;
  public Rectangle hitbox;
  public int power;
  public Dimension size;
  public Image currImage;
  public ImageIcon[] idle_anim;
  public ImageIcon[] death_anim;
  public ImageIcon[] attack_anim;
  public Point currPosition;

  public Character(){
    health = 1;
    speed = 5;
    power = 1;
    currPosition = new Point(0, 0);
    size = new Dimension(20, 80);
    hitbox = new Rectangle(currPosition, size);
  }

  private boolean healthIsGone(){
    return (health<=0);
  }

  private void takeDamage(){
    health--;
    //if(healthIsGone())
      //die(attack_anim);
  }

  private void die(ImageIcon[] death){
    
  }

  public void draw(Graphics2D g2){
    loadCurrentImage();
    g2.drawImage(currImage, (int) currPosition.getX(), 
                  (int) currPosition.getY(), this);
    Toolkit.getDefaultToolkit().sync();
  }

  private void loadCurrentImage(){    
    ImageIcon currframe = new ImageIcon("assets/player/adventurer-attack-00.png");
    currImage = currframe.getImage();
  }
}