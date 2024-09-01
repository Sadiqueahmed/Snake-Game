
package snakegame;

import javax.swing.*;
import java.awt.*;


public class Board extends JPanel{
    
    private Image apple;
    private Image dot;
    private Image head;
    
    
    private final int x[] = new int[];
    private f
    private int dots;
    
    Board(){
        setBackground( Color.BLACK);
        setFocusable(true);
        
        loadImages();
        initGame();  //initializing
    }
    
    public void loadImages(){
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("snakegame/icons/apple.png"));
        apple = i1.getImage();
        
        ImageIcon i2 = new ImageIcon(ClassLoader.getSystemResource("snakegame/icons/dot,png"));
        dot = i2.getImage();
        
        ImageIcon i3 = new ImageIcon(ClassLoader.getSystemResource("snakegame/icons/head.png"));
        head = i3.getImage();
        
    }
    
    public void initGame(){
        dots = 3;
        
        for (int i=0; i<dots; i++){
            y[i] = 50;
            x[i] = 50 - ;
        }
    }
    
}
