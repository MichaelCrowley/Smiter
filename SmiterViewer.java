/*
 *  Author: Michael Crowley
 *  Date: 4/6/2019
 * 
 *  This class starts the game.
 */
import javax.swing.JFrame;
import java.awt.EventQueue;

public class SmiterViewer extends JFrame{
  final int FRAME_WIDTH = 1000;
  final int FRAME_HEIGHT = 1000;

  public SmiterViewer() {
    initUI();
  }

  private void initUI(){
    setSize(FRAME_WIDTH, FRAME_HEIGHT);
    setTitle("Smiter");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    ComponentsHolder component = new ComponentsHolder();
    add(component);
  } 
  public static void main(String args[]){
    EventQueue.invokeLater(() -> {
      JFrame SV = new SmiterViewer();
      SV.setVisible(true);
  });
  }
}