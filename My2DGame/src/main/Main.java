package main;

import javax.swing.*;

public class Main {
    //without static void main a java program cannot be run
    public static void main(String[] args) {
        //to create a window
        JFrame window = new JFrame();
        //frame gets closed when exited
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //cannot be resized windows
        window.setResizable(false);
        window.setTitle("2D Adventure");

        GamePanel gamePanel = new GamePanel();
        window.add(gamePanel);

        //windows will be displayed at the center of the screen
        window.setLocationRelativeTo(null);
        //windows will be visible
        window.setVisible(true);
    }
}
