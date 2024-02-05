package inputs;

import org.example.GamePanel;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardInputs extends JFrame implements KeyListener {
    private GamePanel gamePanel;
    private boolean isLeft = false;
    private boolean isRight = false;
    private boolean isUp = false;
    private boolean isDown = false;

    public KeyboardInputs(GamePanel gamePanel) {
        this.gamePanel = gamePanel;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT) isLeft = true;
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) isRight = true;
        if (e.getKeyCode() == KeyEvent.VK_UP) isUp = true;
        if (e.getKeyCode() == KeyEvent.VK_DOWN) isDown = true;
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT) isLeft = false;
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) isRight = false;
        if (e.getKeyCode() == KeyEvent.VK_UP) isUp = false;
        if (e.getKeyCode() == KeyEvent.VK_DOWN) isDown = false;
    }
}
