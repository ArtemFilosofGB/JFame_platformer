package org.example;

import inputs.KeyboardInputs;
import inputs.MouseInputs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyListener;

public class GamePanel extends JPanel {
    private MouseInputs mouseInputs= new MouseInputs();
    private KeyboardInputs keyboardInputs = new KeyboardInputs(this);
    private int xDelta =0, yDelta =0;
    public GamePanel() {
        //mouseInputs = new MouseInputs();
        //KeyboardInputs keyboardInputs = new KeyboardInputs(this);

        addKeyListener(new KeyboardInputs(this));
        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs);

    }
    public void changeXDelta(int value){
        this.xDelta+=value;
        repaint();
    }
    public void changeYDelta(int value){
        this.yDelta+=value;
        repaint();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillRect(100+xDelta,100+yDelta,200,200);

    }
}
