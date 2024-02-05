package org.example;

public class Game {
    private GameWindow gameWindow;
    private GamePanel gamePanel;
    public Game(){
        //craetive class
        System.out.println("New Game!");
        gamePanel = new GamePanel();
        gameWindow =new GameWindow(gamePanel);

        gamePanel.requestFocus();


    }
}
