
/*
 *  Author: Michael Crowley
 *  Date: 4/7/2019
 * 
 *  This class dictates how Mirra is setup and acts.
 */
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import javax.swing.ImageIcon;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.util.Scanner;

public class Mirra extends Character{
  private String path = "assets/player/adventurer-";
  private ImageIcon[] idleFrames = new ImageIcon[4];
  private String currAnimSet = "idle"; 
  private int frameNum = 0;
  
  public Mirra(){
    this.health = 1;
    this.speed = 5;
    this.power = 1;
    this.currPosition = new Point(500, 500);
    this.size = new Dimension(20, 80);
    this.hitbox = new Rectangle(currPosition, size);
  }
  
  public void nextFrame(){
    if(frameNum < 3)
      frameNum++;
    else
      frameNum = 0;
  }

  public void draw(Graphics2D g2){
    loadCurrentImage();
    g2.drawImage(currImage, (int) currPosition.getX(), 
                  (int) currPosition.getY(), this);
    Toolkit.getDefaultToolkit().sync();
  }

  private void loadCurrentImage(){    
    ImageIcon frame = new ImageIcon(path + currAnimSet + "-0" + this.frameNum + ".png");
    this.currImage = frame.getImage();
  }
}