package ipc1_proyecto1_202300813;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActualizarDoc extends JFrame implements ActionListener {
    private JTextField firstNameField;
    private JTextField lastNameField;
    private JPasswordField passwordField;
    private JTextField especialidadField;
    private JTextField telefonoField;
    private JTextField edadField;

    private JComboBox<String> genderComboBox;

    private JButton updateButton;

    private Doc doctorActual;

    public ActualizarDoc(Doc doctor) {
        this.doctorActual = doctor;

        JLabel titleLabel = new JLabel("Actualizar Doctor");
        titleLabel.setFont(new Font("Kristen ITC", Font.BOLD, 20));
        titleLabel.setBounds(350, 10, 1000, 30);
        this.add(titleLabel);

        // Campos para mostrar los datos actuales del doctor
        JLabel firstNameLabel = new JLabel("Nombre:");
        firstNameLabel.setBounds(70, 50, 80, 25);
        this.add(firstNameLabel);

        firstNameField = new JTextField(doctor.getNombre());
        firstNameField.setBounds(130, 50, 260, 25);
        this.add(firstNameField);

        JLabel lastNameLabel = new JLabel("Apellido:");
        lastNameLabel.setBounds(70, 90, 80, 25);
        this.add(lastNameLabel);

        lastNameField = new JTextField(doctor.getApellido());
        lastNameField.setBounds(130, 90, 260, 25);
        this.add(lastNameField);

        JLabel passwordLabel = new JLabel("Contraseña:");
        passwordLabel.setBounds(55, 130, 80, 25);
        this.add(passwordLabel);

        passwordField = new JPasswordField(doctor.getContraseña());
        passwordField.setBounds(130, 130, 260, 25);
        this.add(passwordField);

        JLabel especialidadLabel = new JLabel("Especialidad:");
        especialidadLabel.setBounds(500, 50, 80, 25);
        this.add(especialidadLabel);

        especialidadField = new JTextField(doctor.getEspecialidad());
        especialidadField.setBounds(600, 50, 260, 25);
        this.add(especialidadField);

        JLabel telefonoLabel = new JLabel("Teléfono:");
        telefonoLabel.setBounds(520, 90, 80, 25);
        this.add(telefonoLabel);

        telefonoField = new JTextField(doctor.getTelefono());
        telefonoField.setBounds(600, 90, 260, 25);
        this.add(telefonoField);

        JLabel edadLabel = new JLabel("Edad:");
        edadLabel.setBounds(540, 130, 80, 25);
        this.add(edadLabel);

        edadField = new JTextField(String.valueOf(doctor.getEdad()));
        edadField.setBounds(600, 130, 260, 25);
        this.add(edadField);

        JLabel genderLabel = new JLabel("Género:");
        genderLabel.setBounds(80, 170, 80, 25);
        this.add(genderLabel);

        String[] genders = {"Masculino", "Femenino"};
        genderComboBox = new JComboBox<>(genders);
        genderComboBox.setBounds(130, 170, 150, 25);
        genderComboBox.setSelectedItem(doctor.getGenero());
        this.add(genderComboBox);

        // Botón de actualización
        updateButton = new JButton("Actualizar");
        updateButton.setBounds(360, 220, 150, 25);
        updateButton.setForeground(Color.WHITE);
        updateButton.setBackground(new Color(214, 225, 50));
        updateButton.addActionListener(this);
        this.add(updateButton);

        
         ImageIcon imagen5 = new  ImageIcon (getClass().getResource("../img/fondo8.jpg"));
        Image imageDemension5 = imagen5.getImage().getScaledInstance(950, 400, Image.SCALE_SMOOTH); //ANCHO, ALTURA
        ImageIcon adjustedImageIcon2 = new ImageIcon(imageDemension5);
        //Jlabel para mostrar la imagen 
        JLabel imagenLabel5 =new JLabel (adjustedImageIcon2);
         imagenLabel5.setBounds(0,0,900, 400);
        this.add(imagenLabel5);

        this.setTitle("Actualizar Doctor");
        this.setBounds(650, 400, 900, 350);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == getUpdateButton()) {
            // Lógica para actualizar el doctor con los nuevos valores ingresados
            getDoctorActual().setNombre(getFirstNameField().getText());
            getDoctorActual().setApellido(getLastNameField().getText());
            getDoctorActual().setContraseña(new String(getPasswordField().getPassword()));
            getDoctorActual().setEspecialidad(getEspecialidadField().getText());
            getDoctorActual().setTelefono(getTelefonoField().getText());
            getDoctorActual().setEdad(Integer.parseInt(getEdadField().getText()));
            getDoctorActual().setGenero((String) getGenderComboBox().getSelectedItem());

            // Mensaje de éxito
            JOptionPane.showMessageDialog(null, "Doctor actualizado exitosamente.");

            // Cierra la ventana de actualización
            this.dispose();
        }
    }

    // Getters y Setters
    public JTextField getFirstNameField() {
        return firstNameField;
    }

    public JTextField getLastNameField() {
        return lastNameField;
    }

    public JPasswordField getPasswordField() {
        return passwordField;
    }

    public JTextField getEspecialidadField() {
        return especialidadField;
    }

    public JTextField getTelefonoField() {
        return telefonoField;
    }

    public JTextField getEdadField() {
        return edadField;
    }

    public JComboBox<String> getGenderComboBox() {
        return genderComboBox;
    }

    public JButton getUpdateButton() {
        return updateButton;
    }

    public Doc getDoctorActual() {
        return doctorActual;
    }

    public void setFirstNameField(JTextField firstNameField) {
        this.firstNameField = firstNameField;
    }

    public void setLastNameField(JTextField lastNameField) {
        this.lastNameField = lastNameField;
    }

    public void setPasswordField(JPasswordField passwordField) {
        this.passwordField = passwordField;
    }

    public void setEspecialidadField(JTextField especialidadField) {
        this.especialidadField = especialidadField;
    }

    public void setTelefonoField(JTextField telefonoField) {
        this.telefonoField = telefonoField;
    }

    public void setEdadField(JTextField edadField) {
        this.edadField = edadField;
    }

    public void setGenderComboBox(JComboBox<String> genderComboBox) {
        this.genderComboBox = genderComboBox;
    }

    public void setUpdateButton(JButton updateButton) {
        this.updateButton = updateButton;
    }

    public void setDoctorActual(Doc doctorActual) {
        this.doctorActual = doctorActual;
    }
}