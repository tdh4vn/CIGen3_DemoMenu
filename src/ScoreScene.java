import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * Created by hungtran on 3/17/16.
 */
public class ScoreScene extends Scene {
    @Override
    public void draw(Graphics g) {
        g.drawString("YOUR SCORE 100.Press B to back.", 300, 300);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_B) {
            GameManager.getInstance().stackMenuGame.pop();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
