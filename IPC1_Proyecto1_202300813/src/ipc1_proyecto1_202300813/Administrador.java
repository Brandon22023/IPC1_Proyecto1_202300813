
package ipc1_proyecto1_202300813;


import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionListener;

public class Administrador extends JFrame implements ActionListener{

    public Administrador() {
        //pestañas
        
        JTabbedPane pestañas  = new JTabbedPane(JTabbedPane.TOP);
        //crear las pestañas
        JPanel pest1 =new JPanel(null);
        JPanel pest2 =new JPanel(null);
        JPanel pest3 =new JPanel(null);

        
        //para que aparezca la imagen de fondo, aun no sirve
        JFrame frame = new JFrame("../img/fondo5.png");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setExtendedState(JFrame.MAXIMIZED_BOTH); // Establece la ventana en pantalla completa
            frame.setUndecorated(true); // Quita la decoración de la ventana (bordes, botones, etc.)

            // Crea un componente para mostrar la imagen (reemplaza "ruta_de_la_imagen.png" con la ruta real)
            ImageIcon imageIcon = new ImageIcon("../img/fondo5.png");
            JLabel label = new JLabel(imageIcon);

            frame.add(label);
            frame.setVisible(true);
        //ventana
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        
    }

    
    
    
    
    
    
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
