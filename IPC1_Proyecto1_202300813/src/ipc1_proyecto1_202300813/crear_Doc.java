
package ipc1_proyecto1_202300813;


import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class crear_Doc extends JFrame implements ActionListener{
     private JTextField firstNameField;
    private JTextField lastNameField;
    private JTextField Password;
    private JTextField Especialidad;
    private JTextField Telefono;
    private JTextField edad;

    private JComboBox<String> genderComboBox;

    JButton registerButton;

    public crear_Doc() throws HeadlessException {
               JLabel titleLabel = new JLabel("Registro Doctor");
        titleLabel.setFont(new Font("Kristen ITC", Font.BOLD, 20));
        titleLabel.setBounds(350, 10, 1000, 30);
        this.add(titleLabel);
        
        //
        JLabel TelefonoLabel = new JLabel("Telefono:");
        TelefonoLabel.setBounds(520, 90, 80, 25);
        this.add(TelefonoLabel);

        Telefono = new JTextField();
        Telefono.setBounds(600, 90, 260, 25);
        this.add(Telefono);

        //
        JLabel edadLabel = new JLabel("edad:");
        edadLabel.setBounds(540, 130, 80, 25);
        this.add(edadLabel);

        edad = new JTextField();
        edad.setBounds(600, 130, 260, 25);
        this.add(edad);
        //
        
        JLabel EspecialidadLabel = new JLabel("Especialidad:");
        EspecialidadLabel.setBounds(500, 50, 80, 25);
        this.add(EspecialidadLabel);

        Especialidad = new JTextField();
        Especialidad.setBounds(600, 50, 260, 25);
        this.add(Especialidad);
        //
        
        JLabel firstNameLabel = new JLabel("Nombre:");
        firstNameLabel.setBounds(70, 50, 80, 25);
        this.add(firstNameLabel);

        firstNameField = new JTextField();
        firstNameField.setBounds(130, 50, 260, 25);
        this.add(firstNameField);

        JLabel lastNameLabel = new JLabel("Apellido:");
        lastNameLabel.setBounds(70, 90, 80, 25);
        this.add(lastNameLabel);

        lastNameField = new JTextField();
        lastNameField.setBounds(130, 90, 260, 25);
        this.add(lastNameField);
        //
        JLabel passwordLabel4 = new JLabel ("Password:");
        passwordLabel4.setBounds(55, 130, 80, 25);
        this.add(passwordLabel4);
        
         Password =new JPasswordField();
         Password.setBounds(130, 130, 260, 25);
         this.add(Password);
        //
        

        JLabel genderLabel = new JLabel("Género:");
        genderLabel.setBounds(80, 170, 80, 25);
        this.add(genderLabel);

        String[] genders = {"Masculino", "Femenino"};
        genderComboBox = new JComboBox<>(genders);
        genderComboBox.setBounds(130, 170, 150, 25);
        this.add(genderComboBox);

        registerButton = new JButton("Registrarse");
        registerButton.setBounds(360, 220, 150, 25);
        registerButton.setForeground(Color.WHITE);
        registerButton.setBackground(new Color(214, 225, 50));
        registerButton.addActionListener(this);
        this.add(registerButton);
        
         ImageIcon imagen4 = new  ImageIcon (getClass().getResource("../img/fondo6.jpg"));
        Image imageDemension4 = imagen4.getImage().getScaledInstance(900, 700, Image.SCALE_SMOOTH); //ANCHO, ALTURA
        ImageIcon adjustedImageIcon2 = new ImageIcon(imageDemension4);
        //Jlabel para mostrar la imagen 
        JLabel imagenLabel4 =new JLabel (adjustedImageIcon2);
         imagenLabel4.setBounds(0,0,900, 320);
         this.add(imagenLabel4);

        this.setTitle("Registro");
        this.setBounds(650, 400, 900, 350);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == registerButton){
            
            String nombre = firstNameField.getText();
            String apellido = lastNameField.getText();
            String contraseña = Password.getText();
            String especialidad = Especialidad.getText();
            String Edad = edad.getText();
            String tel = Telefono.getText();
            String Selectgener =(String)genderComboBox.getSelectedItem();
            IPC1_Proyecto1_202300813.agregardoctor(IPC1_Proyecto1_202300813.contador, nombre,Selectgener , Integer.parseInt(Edad), especialidad, tel);
            
            IPC1_Proyecto1_202300813.contador++;
            
            
            
            
            
            
            this.dispose();
            Administrador Admin = new Administrador();
            
        }
        
    }
    
}
