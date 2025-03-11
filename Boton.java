/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Boton {

   
    public static void main(String[] args) {
   
        JFrame frame = new JFrame("Ejemplo de JButton");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JButton button = new JButton("Haz clic aquí");
        button.setBounds(100, 70, 120, 30); 

       
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
                JOptionPane.showMessageDialog(frame, "¡Botón presionado!");
            }
        });

      
        frame.add(button);

     
        frame.setVisible(true);
    }
}
    
    
