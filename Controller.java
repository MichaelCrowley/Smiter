import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;

public class Controller extends KeyAdapter{
  Mirra player = new Mirra();
  
  public Controller(Mirra p){
    this.player = p;
  }
  
  public void keyPressed(KeyEvent e) {
    switch (e.getKeyCode()) {
      case KeyEvent.VK_DOWN:
        player.moveDown();
        break;
      case KeyEvent.VK_LEFT:
        player.moveLeft();
        break;
      case KeyEvent.VK_RIGHT:
        player.moveRight();
        break;
      case KeyEvent.VK_UP:
        player.moveUp();
        break;
    }
  }

  public void keyReleased(KeyEvent e){
    switch (e.getKeyCode()) {
      case KeyEvent.VK_DOWN:
        player.setIdle();
        break;
      case KeyEvent.VK_LEFT:
        player.setIdle();
        break;
      case KeyEvent.VK_RIGHT:
        player.setIdle();
        break;
      case KeyEvent.VK_UP:
        player.setIdle();
        break;
    }
  }
    
}