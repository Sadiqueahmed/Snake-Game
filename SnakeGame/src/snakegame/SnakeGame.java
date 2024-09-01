
package snakegame;

import javax.swing.*;

/**
 *
 * @author sadiq
 */
public class SnakeGame extends JFrame {
    
    SnakeGame(){
        super("Snake Game");
        add(new Board()); 
        pack();
        
        
        setSize(300,300);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new SnakeGame();
    }
    
}
