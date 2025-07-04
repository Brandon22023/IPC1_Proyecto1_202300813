
package ipc1_proyecto1_202300813;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener{
    private JTextField usernameFiel;
    private JPasswordField passwordFiel;
    public Login() {
        //etiqueta de bienvenida cambiando el tipo de letra
        JLabel titulo= new JLabel ("Welcome");
        titulo.setFont(new Font ("Times New Roman", Font.BOLD, 20));
        titulo.setBounds(200, 10, 100, 30);
        this.add(titulo);
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
        
        //para que aparezca la imagen de fondo
        ImageIcon imagen2 = new  ImageIcon (getClass().getResource("../img/fondo3.jpg"));
        Image imageDemension2 = imagen2.getImage().getScaledInstance(500, 300, Image.SCALE_SMOOTH); //ANCHO, ALTURA
        ImageIcon adjustedImageIcon2 = new ImageIcon(imageDemension2);
        //Jlabel para mostrar la imagen 
        JLabel imagenLabel2 =new JLabel (adjustedImageIcon2);
         imagenLabel2.setBounds(0,0,500, 300);
         this.add(imagenLabel2);
         //boton de inicio de sesión
         JButton loginBoton= new JButton ("Iniciar sesión");
         loginBoton.setBounds(90, 220, 150, 25);
         loginBoton.setBackground(new Color(156, 187, 230));
         loginBoton.addActionListener(this);
         this.add(loginBoton);
         //boton de registro
         JButton loginRegister= new JButton ("Registrarse");
         loginRegister.setBounds(250, 220, 150, 25);
         loginRegister.setBackground(new Color(156, 187, 230));
         loginRegister.addActionListener(this);
         this.add(loginRegister);        
        //ventana de inicio
        this.setTitle("Login");
        this.setSize(500,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setVisible(true);  
    }
    //acciones de un boton

    @Override
    public void actionPerformed(ActionEvent IniciarS) {
        boolean ingresar = false;
        
        
        //cuando revisa un click
        if (IniciarS.getActionCommand().equals("Iniciar sesión")) {
            //accion a realizar al presionar encima
           String Username = usernameFiel.getText();
           String contra = new String (passwordFiel.getPassword());
            if (Username.equals("202300813") && contra.equals("proyecto1IPC1") ) {
                Administrador Admin = new Administrador();
                this.dispose();
                
                
                
            }else if(ingresar == false){
                
                Registro regi = new Registro();
               regi.setVisible(false);
             boolean ingrse = false;
             for (int i = 0; i < regi.listauwu.size() ; i++) {
             if (Username.equals(Integer.toString(regi.listauwu.get(i).getCodigo())) && contra.equals(regi.listauwu.get(i).getContraseña())){
                JOptionPane.showMessageDialog(null,"Bienvenido Usuario");
                Administrador Admin = new Administrador();
                  this.dispose();
                  
                  ingresar = true;
            
            break;
            
            } 
        }if (!ingresar) {
        // Lógica para el tercer tipo de usuario (código y contraseña de listadoPaciente)
        for (CreadorPaciente paciente : IPC1_Proyecto1_202300813.listadoPaciente) {
            if (Username.equals(Integer.toString(paciente.getCodigoPaciente())) && contra.equals(paciente.getContraseñaPaciente())) {
          
      JOptionPane.showMessageDialog(null, "Bienvenido Paciente tipo de usuario");

                // Agrega aquí la lógica para abrir la ventana específica del tercer tipo de usuario
                // Por ejemplo: VentanaTipoTres ventanaTipoTres = new VentanaTipoTres();
                // ventanaTipoTres.setVisible(true);
                
                
               
                 Paciente pacie = new Paciente();
                this.dispose();
 
             // Termina la función ya que se encontró una coincidencia
            }
        }

        // Si no se encontró coincidencia, muestra un mensaje de error
        //JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos", "No se pudo iniciar sesión", JOptionPane.WARNING_MESSAGE);
    }
        
              
            }
            //click en el boton registro
        }
        else{
            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos", "No se pudo iniciar sesión", JOptionPane.WARNING_MESSAGE);
        }
        if (IniciarS.getActionCommand().equals("Registrarse")) {
            //accion a realizar al presionar encima
            Registro registro1 = new Registro();
            this.dispose();
            
        }
       
    }
    
}
    
    
    

