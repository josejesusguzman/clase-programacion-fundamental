import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Mostrar una ventana con Hola Mundo en JAVA
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FrameDemo
{
    private static void creacionGUI() {
        JFrame frame = new JFrame("FrameDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel label = new JLabel("Hola mundo");
        label.setPreferredSize(new Dimension(175,100));
        frame.getContentPane().add(label, BorderLayout.CENTER);
        
        frame.pack();
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                creacionGUI();
            }
        });
    }
    
}
