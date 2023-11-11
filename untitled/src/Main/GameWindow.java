package Main;

import javax.swing.*;

public class GameWindow{
    private JFrame jFrame;
    public GameWindow(GamePanel gamePanel){

        jFrame = new JFrame();
        jFrame.setSize(600, 480);

        jFrame.setVisible(true);
        jFrame.add(gamePanel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
