/*
 *  Author: Michael Crowley
 *  Date: 4/7/2019
 * 
 *  This class dictates how all characters sould be set up.
 */
import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.Rectangle;
public class Character{
  int health;
  double speed;
  Rectangle hitbox;
  int power;
  int dimension_x;
  int dimension_y;
  private Image currImage;
  private ImageIcon[] idle_anim;
  private ImageIcon[] death_anim;
  private ImageIcon[] attack_anim;

  public Character(){
    health = 1;
    speed = 5;
    dimension_x = 20;
    dimension_y = 80;
    hitbox = new Rectangle(0, 0, dimension_x, dimension_y)
    power = 1;

  }

  private boolean healtIsGone(){
    return (health<=0);
  }

  private void takeDamage(){
    health--;
    if(healtIsGone())
      die();
  }

  private die(){
    
  }
}