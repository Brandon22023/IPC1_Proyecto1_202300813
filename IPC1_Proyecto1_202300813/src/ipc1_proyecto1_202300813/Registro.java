
package ipc1_proyecto1_202300813;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Registro extends JFrame implements ActionListener{
   private JTextField Nombres;
   private JTextField apellidos;
   private JTextField contraseña;
   private JTextField edad;
   public int contador = 0;
   public static ArrayList<guardardatosregistro> listauwu = new ArrayList<>();
   guardardatosregistro registro = new guardardatosregistro();
       private JComboBox<String> genero2;
       
      
       
      
   
    JButton registerBoton;
    public Registro()  {
        
        
         JLabel titleLabel = new JLabel("Registro");
        titleLabel.setFont(new Font("Kristen ITC", Font.BOLD, 20));
        titleLabel.setBounds(200, 10, 100, 30);
        this.add(titleLabel);
        
        
        JLabel nombresLabel = new JLabel("Nombre:");
        nombresLabel.setBounds(70, 50, 80, 25);
        this.add(nombresLabel);
        
        Nombres = new JTextField();
        Nombres.setBounds(130, 50, 260, 25);
        this.add(Nombres);
        
         JLabel lastNameLabel = new JLabel("Apellido:");
        lastNameLabel.setBounds(70, 90, 80, 25);
        this.add(lastNameLabel);

        apellidos = new JTextField();
        apellidos.setBounds(130, 90, 260, 25);
        this.add(apellidos);
        
        JLabel contraseñaLabel = new JLabel("Contraseña:");
        contraseñaLabel.setBounds(50, 130, 80, 25);
        this.add(contraseñaLabel);

        contraseña = new JTextField();
        contraseña.setBounds(130, 130, 260, 25);
        this.add(contraseña);
        
        JLabel genderLabel = new JLabel("Género:");
        genderLabel.setBounds(70, 170, 80, 25);
        this.add(genderLabel);

        String[] tipogenero = {"Masculino", "Femenino"};
        genero2 = new JComboBox<>(tipogenero);
        genero2.setBounds(130, 170, 150, 25);
        this.add(genero2);
        
        JLabel edadLabel = new JLabel("edad:");
        edadLabel.setBounds(90, 210, 80, 25);
        this.add(edadLabel);

        edad = new JTextField();
        edad.setBounds(130, 210, 260, 25);
        this.add(edad);
        
         registerBoton= new JButton ("Registrarse");
         registerBoton.setBounds(180, 250, 150, 25);
         registerBoton.setBackground(new Color(156, 187, 230));
         registerBoton.addActionListener(this);
         this.add(registerBoton); 
         
         ImageIcon imagen3 = new  ImageIcon (getClass().getResource("../img/fondo5.png"));
        Image imageDemension3 = imagen3.getImage().getScaledInstance(600, 400, Image.SCALE_SMOOTH); //ANCHO, ALTURA
        ImageIcon adjustedImageIcon2 = new ImageIcon(imageDemension3);
        //Jlabel para mostrar la imagen 
        JLabel imagenLabel3 =new JLabel (adjustedImageIcon2);
         imagenLabel3.setBounds(0,0,500, 320);
         this.add(imagenLabel3);
         

        
        this.setTitle("Registro");
        this.setBounds(650, 400, 500, 350);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        
        

    }
     
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == registerBoton){
            JOptionPane.showMessageDialog(null, "Su codigo de Inicio de Sesion es: " + "\n" + Integer.toString(contador) , " Usuario Creado " ,JOptionPane.INFORMATION_MESSAGE);
            registro.setNombre(Nombres.getText());
            registro.setAprellido(apellidos.getText());
            registro.setContraseña(contraseña.getText());
            registro.setGenero(genero2.getSelectedItem().toString());
            registro.setEdad(Integer.parseInt(edad.getText()));
            listauwu.add(registro);
            contador++;
            
            this.dispose();
            Login Login1 =new Login();
            
    }
    }

            public static Object[][] convertidordedatos_tabla(){
        int filas= listauwu.size();
        Object[][] dato = new Object[filas][5];
        
        for (int i = 0; i < filas; i++) {
            guardardatosregistro backup = listauwu.get(i);
            
            dato[i][0]=backup.getNombre();
            dato[i][1]=backup.getAprellido();
            dato[i][2]=backup.getContraseña();
            dato[i][3]=backup.getGenero();
            dato[i][4]=backup.getEdad();

            
        }
        
        return dato;
    }
}



       
    
    
    

