import javax.swing.JFrame;

public class SmiterViewer{
  public static void main(String args[]){
    JFrame frame = new JFrame();

    final int FRAME_WIDTH = 1000;
    final int FRAME_HEIGHT = 1000;
    frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
    frame.setTitle("Smiter");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    ObjectsHolder component = new ObjectsHolder();
    frame.add(component);
    frame.setVisible(true);
  }
}