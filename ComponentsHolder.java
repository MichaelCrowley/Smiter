
/*
 *  Author: Michael Crowley
 *  Date: 4/6/2019
 * 
 *  This class holds the components like the background and character objects.
 */

import javax.swing.JComponent;
import javax.swing.JOptionPane;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class ComponentsHolder extends JComponent implements Runnable{
  private Background b = new Background();
  private Mirra player = new Mirra();
  private Thread animator;
  private final int DELAY = 100;
  
  public ComponentsHolder() {
    this.setFocusable(true);
  }

  //Draw the board
  public void paintComponent(Graphics g) {
      Graphics2D g2 = (Graphics2D) g;
  
      b.draw(g2);
      player.draw(g2);
    }

  public void cycle(){
      player.nextFrame();
  }

  @Override
  public void addNotify() {
      super.addNotify();

      animator = new Thread(this);
      animator.start();
  }

  @Override
  public void run() {
      long beforeTime;
      long timeDiff;
      long sleep;

      beforeTime = System.currentTimeMillis();

      //Smiter's run loop
      while(true){
        cycle();
        repaint();

        //Account for completion time of cycle and repaint to keep animations smooth
        timeDiff = System.currentTimeMillis() - beforeTime;
        sleep = DELAY - timeDiff;

        if(sleep < 0)
          sleep = 2;

        try{
          Thread.sleep(sleep);
        } catch (InterruptedException e) {
          String msg = String.format("Thread interrupted: %s", e.getMessage());
                
                JOptionPane.showMessageDialog(this, msg, "Error", 
                    JOptionPane.ERROR_MESSAGE);
        }

        beforeTime = System.currentTimeMillis();
      }
  }
  
}