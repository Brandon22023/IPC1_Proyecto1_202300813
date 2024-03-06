
package ipc1_proyecto1_202300813;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ActualizarPaciente extends JFrame implements ActionListener {
  
    private JTextField nombrePaciente;
    private JTextField apellidoPaciente;
    private JPasswordField contraseñaPaciente;
    private JTextField edadPaciente;
    private JButton updateButton;
    private CreadorPaciente pacienteActual;

    public ActualizarPaciente(CreadorPaciente paciente) {
        this.pacienteActual = paciente;
        
        JLabel titleLabel = new JLabel("Actualizar Doctor");
        titleLabel.setFont(new Font("Kristen ITC", Font.BOLD, 20));
        titleLabel.setBounds(350, 10, 1000, 30);
        this.add(titleLabel);

        // Campos para mostrar los datos actuales del doctor
        JLabel firstNameLabel = new JLabel("Nombre:");
        firstNameLabel.setBounds(70, 50, 80, 25);
        this.add(firstNameLabel);

        nombrePaciente = new JTextField(paciente.getNombrePaciente());
        nombrePaciente.setBounds(130, 50, 260, 25);
        this.add(nombrePaciente);

        JLabel lastNameLabel = new JLabel("Apellido:");
        lastNameLabel.setBounds(70, 90, 80, 25);
        this.add(lastNameLabel);

        apellidoPaciente = new JTextField(paciente.getApellidoPaciente());
        apellidoPaciente.setBounds(130, 90, 260, 25);
        this.add(apellidoPaciente);

        JLabel passwordLabel = new JLabel("Contraseña:");
        passwordLabel.setBounds(55, 130, 80, 25);
        this.add(passwordLabel);

        contraseñaPaciente = new JPasswordField(paciente.getContraseñaPaciente());
        contraseñaPaciente.setBounds(130, 130, 260, 25);
        this.add(contraseñaPaciente);

        JLabel edadLabel = new JLabel("Edad:");
        edadLabel.setBounds(540, 130, 80, 25);
        this.add(edadLabel);

        edadPaciente = new JTextField(String.valueOf(paciente.getEdadPaciente()));
        edadPaciente.setBounds(600, 130, 260, 25);
        this.add(edadPaciente);


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
            getPacienteActual().setNombrePaciente(getNombrePaciente().getText());
            getPacienteActual().setApellidoPaciente(getApellidoPaciente().getText());
            getPacienteActual().setContraseñaPaciente(new String(getContraseñaPaciente().getPassword()));
            getPacienteActual().setEdadPaciente(Integer.parseInt(getEdadPaciente().getText()));



            // Mensaje de éxito
            JOptionPane.showMessageDialog(null, "Doctor actualizado exitosamente.");

            // Cierra la ventana de actualización
            this.dispose();
        }
        
    }

    /**
     * @return the nombrePaciente
     */
    public JTextField getNombrePaciente() {
        return nombrePaciente;
    }

    /**
     * @param nombrePaciente the nombrePaciente to set
     */
    public void setNombrePaciente(JTextField nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    /**
     * @return the apellidoPaciente
     */
    public JTextField getApellidoPaciente() {
        return apellidoPaciente;
    }

    /**
     * @param apellidoPaciente the apellidoPaciente to set
     */
    public void setApellidoPaciente(JTextField apellidoPaciente) {
        this.apellidoPaciente = apellidoPaciente;
    }

    /**
     * @return the contraseñaPaciente
     */
    public JPasswordField getContraseñaPaciente() {
        return contraseñaPaciente;
    }

    /**
     * @param contraseñaPaciente the contraseñaPaciente to set
     */
    public void setContraseñaPaciente(JPasswordField contraseñaPaciente) {
        this.contraseñaPaciente = contraseñaPaciente;
    }

    /**
     * @return the edadPaciente
     */
    public JTextField getEdadPaciente() {
        return edadPaciente;
    }

    /**
     * @param edadPaciente the edadPaciente to set
     */
    public void setEdadPaciente(JTextField edadPaciente) {
        this.edadPaciente = edadPaciente;
    }

    /**
     * @return the updateButton
     */
    public JButton getUpdateButton() {
        return updateButton;
    }

    /**
     * @param updateButton the updateButton to set
     */
    public void setUpdateButton(JButton updateButton) {
        this.updateButton = updateButton;
    }

    /**
     * @return the pacienteActual
     */
    public CreadorPaciente getPacienteActual() {
        return pacienteActual;
    }

    /**
     * @param pacienteActual the pacienteActual to set
     */
    public void setPacienteActual(CreadorPaciente pacienteActual) {
        this.pacienteActual = pacienteActual;
    }
    
    
}
