import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Mostrar un mensaje cuando el botón se presione
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DialogDemo extends JFrame implements ActionListener
{
    
    JButton b1;
    
    DialogDemo() {
        
        this.setLayout(null);
        
        b1 = new JButton("Boton 1");
        
        b1.setBounds(130, 5, 100, 60);
        
        this.add(b1);
        
        b1.addActionListener(this);
        
    }
    
    
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == b1) {
            System.out.println("Botón presionado");
            JOptionPane.showMessageDialog(
                this, 
                "Este es un error", 
                "ERROR", 
                JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void main(String args[]) {
        DialogDemo demo = new DialogDemo();
        demo.setBounds(200, 200, 400, 300);
        demo.setVisible(true);
    }
    
}
