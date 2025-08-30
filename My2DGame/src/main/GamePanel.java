package main;

import javax.swing.JPanel;
import java.awt.*;

//this class extends JPanel which means its a subclass of JPanel
public class GamePanel extends JPanel {
    //screen settings
//final	A non-access modifier used for classes, attributes and methods, which makes them non-changeable (impossible to inherit or override)
    final int originalTitleSize = 16; //16x16 title;
    final int scale = 3; // upscaling the size 16x3(scale) = 48

    final int titleSize = originalTitleSize * scale; // 48x48 tile
    final int maxScreenCol = 16; // 16 tiles horizontally
    final int maxScreenRow = 12; // 12 tiles vertically
    final int screenWidth = titleSize * maxScreenCol; //  48x16 =  768px
    final int screenHeight = titleSize * maxScreenRow; // 48x12 = 576pixels

    //constructor
    public GamePanel() {
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
    }


}
