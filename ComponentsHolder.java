/*
 *  Author: Michael Crowley
 *  Date: 4/6/2019
 * 
 *  This class holds the components like the background and character objects.
 */

import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class ComponentsHolder extends JComponent implements Runnable{
  private Background b;
  private Character player;
  private Thread animator;
  
  public ComponentsHolder() {
    this.setFocusable(true);
    b = new Background();
    player = new Mirra();
  }

  //Draw the board
  public void paintComponent(Graphics g) {
      Graphics2D g2 = (Graphics2D) g;
  
      b.draw(g2);
      player.draw(g2);
    }

  public void cycle(){

  }


  @Override
  public void run() {

  }
  
}