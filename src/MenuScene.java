import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * Created by hungtran on 3/17/16.
 */
public class MenuScene extends Scene {
    @Override
    public void draw(Graphics g) {
        g.drawString("THIS IS MENU SCENE. Press N to Play Game.", 300, 300);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_N){
            GameManager.getInstance().stackMenuGame.push(new GamePlayScene());
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
