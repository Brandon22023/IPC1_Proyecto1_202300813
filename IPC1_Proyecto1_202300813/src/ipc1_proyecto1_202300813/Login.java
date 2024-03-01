
package ipc1_proyecto1_202300813;
import java.awt.*;
import javax.swing.*;

public class Login extends JFrame{
    private JTextField usernameFiel;
    private JPasswordField passwordFiel;
    public Login() {
        
        
        //imagenes
        ImageIcon imagen1 = new  ImageIcon (getClass().getResource("../img/login.png"));
        Image imageDemension = imagen1.getImage().getScaledInstance(120, 100, Image.SCALE_SMOOTH); //ANCHO, ALTURA
        ImageIcon adjustedImageIcon = new ImageIcon(imageDemension);
        //Jlabel para mostrar la imagen 
        JLabel imagenLabel =new JLabel (adjustedImageIcon);
         imagenLabel.setBounds(190,30 , 100, 100);
         this.add(imagenLabel);
     
         JLabel passwordLabel2 = new JLabel ("Password:");
        passwordLabel2.setBounds(55,180 , 80, 25);
        this.add(passwordLabel2);
        
         passwordFiel =new JPasswordField();
         passwordFiel.setBounds(130,180 , 260, 25);
         this.add(passwordFiel);
        //etiqueta para nombre de usuario
        JLabel usernameLabel = new JLabel ("Código:");
        usernameLabel.setBounds(70,140 , 80, 20);
        this.add(usernameLabel);
        //campo de texto para el nombre de usuario
        usernameFiel = new JTextField();
        usernameFiel.setBounds(130,140 , 260, 25);
        this.add(usernameFiel);
        
        
        
        //ventana de inicio
        this.setTitle("Login");
        this.setSize(500,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        
        
    }
    
    
    
    
    
}
