
package ipc1_proyecto1_202300813;

import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class crear_Paciente extends JFrame implements ActionListener{
    
    private JTextField firstNamePaciente;
    private JTextField lastNamePaciente;
    private JTextField PasswordPaciente;
    private JTextField edadPaciente;
  
    private JComboBox<String> genderComboBox2;
     JButton registerButton2;
    public crear_Paciente()  {
        
        
        JLabel titleLabel = new JLabel("Registro Paciente");
        titleLabel.setFont(new Font("Kristen ITC", Font.BOLD, 20));
        titleLabel.setBounds(130, 10, 1000, 30);
        this.add(titleLabel);
        
        JLabel edadLabel = new JLabel("edad:");
        edadLabel.setBounds(80, 210, 80, 25);
        this.add(edadLabel);

        edadPaciente= new JTextField();
        edadPaciente.setBounds(130, 210, 260, 25);
        this.add(edadPaciente);

        JLabel firstNameLabel = new JLabel("Nombre:");
        firstNameLabel.setBounds(70, 50, 80, 25);
        this.add(firstNameLabel);

        firstNamePaciente = new JTextField();
        firstNamePaciente.setBounds(130, 50, 260, 25);
        this.add(firstNamePaciente);

        JLabel lastNameLabel = new JLabel("Apellido:");
        lastNameLabel.setBounds(70, 90, 80, 25);
        this.add(lastNameLabel);

        lastNamePaciente = new JTextField();
        lastNamePaciente.setBounds(130, 90, 260, 25);
        this.add(lastNamePaciente);
        //
        JLabel passwordLabel4 = new JLabel ("Password:");
        passwordLabel4.setBounds(55, 130, 80, 25);
        this.add(passwordLabel4);
        
         PasswordPaciente=new JPasswordField();
         PasswordPaciente.setBounds(130, 130, 260, 25);
         this.add(PasswordPaciente);
        //
        

        JLabel genderLabel = new JLabel("Género:");
        genderLabel.setBounds(80, 170, 80, 25);
        this.add(genderLabel);

        String[] genders = {"Masculino", "Femenino"};
        genderComboBox2 = new JComboBox<>(genders);
        genderComboBox2.setBounds(130, 170, 150, 25);
        this.add(genderComboBox2);

        registerButton2 = new JButton("Registrarse");
        registerButton2.setBounds(180, 250, 150, 25);
        registerButton2.setForeground(Color.WHITE);
        registerButton2.setBackground(new Color(214, 225, 50));
        registerButton2.addActionListener(this);
        this.add(registerButton2);
        
         ImageIcon imagen5 = new  ImageIcon (getClass().getResource("../img/fondo10.png"));
        Image imageDemension5 = imagen5.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH); //ANCHO, ALTURA
        ImageIcon adjustedImageIcon5 = new ImageIcon(imageDemension5);
        //Jlabel para mostrar la imagen 
        JLabel imagenLabel5 =new JLabel (adjustedImageIcon5);
         imagenLabel5.setBounds(0,0,1000, 320);
         this.add(imagenLabel5);
        
         ImageIcon imagen4 = new  ImageIcon (getClass().getResource("../img/fondo6.jpg"));
        Image imageDemension4 = imagen4.getImage().getScaledInstance(900, 700, Image.SCALE_SMOOTH); //ANCHO, ALTURA
        ImageIcon adjustedImageIcon2 = new ImageIcon(imageDemension4);
        //Jlabel para mostrar la imagen 
        JLabel imagenLabel4 =new JLabel (adjustedImageIcon2);
         imagenLabel4.setBounds(0,0,900, 320);
         this.add(imagenLabel4);

        this.setTitle("Registro");
        this.setBounds(650, 400, 600, 350);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
               if (e.getSource() == registerButton2){
            
            String nombrePaciente = firstNamePaciente.getText();
            String apellidoPaciente = lastNamePaciente.getText();
            String contraseñaPaciente = PasswordPaciente.getText();
            String EdadPaciente = edadPaciente.getText();
            String generoPaciente =(String)genderComboBox2.getSelectedItem();
           IPC1_Proyecto1_202300813.agregarpaciente(IPC1_Proyecto1_202300813.contador2, nombrePaciente, generoPaciente, Integer.parseInt(EdadPaciente), apellidoPaciente, contraseñaPaciente);
            IPC1_Proyecto1_202300813.contador2++;
            this.dispose();
            Administrador Admin = new Administrador();
            
        }
    }
    
    

}