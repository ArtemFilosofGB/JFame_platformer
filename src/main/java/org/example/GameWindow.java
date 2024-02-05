package org.example;

import javax.swing.*;

public class GameWindow {
    private JFrame jFrame;
    public GameWindow(GamePanel gamePanel){
        jFrame = new JFrame();
        jFrame.setSize(800,600);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.add(gamePanel);
        jFrame.setLocationRelativeTo(null);//window in the center

        //Bottom of the code
        jFrame.setVisible(true);

    }

}
