

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


/**
 * Created by hungtran on 2/26/16.
 */
public class GameWindow extends Frame implements Runnable {



    public GameWindow() {


        GameManager.getInstance().stackMenuGame.push(new MenuScene());





        this.setTitle("TechKids - code the change");
        this.setSize(800, 600);
        this.setVisible(true);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });
        this.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                GameManager.getInstance().stackMenuGame.peek().keyPressed(e);
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
    }


    @Override
    public void paint(Graphics g) {
        super.paint(g);
        GameManager.getInstance().stackMenuGame.peek().draw(g);
    }

    @Override
    public void run() {

        while(true) {

            repaint();


            try {
                Thread.sleep(17);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}