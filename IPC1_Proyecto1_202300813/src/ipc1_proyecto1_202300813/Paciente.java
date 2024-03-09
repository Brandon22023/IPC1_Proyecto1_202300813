
package ipc1_proyecto1_202300813;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;



public class Paciente extends JFrame implements ActionListener {
        private JComboBox<String> especialidad;
    private JComboBox<String> doctor;
    private JTextField motivoCita;
    private JButton mostrarDoctores;
    private JButton mostrarHorarios;
    private JButton generarCita;

    public Paciente() {
        
this.setTitle("Paciente");
        this.setBounds(650, 400, 700, 500); // Ajusté el tamaño de la ventana
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        // Crear los componentes
        JLabel labelMotivoCita = new JLabel("Motivo de la cita:");
        labelMotivoCita.setBounds(50, 50, 150, 30);
        this.add(labelMotivoCita);

        motivoCita = new JTextField();
        motivoCita.setBounds(200, 50, 200, 30);
        this.add(motivoCita);

        JLabel labelEspecialidad = new JLabel("Especialidad:");
        labelEspecialidad.setBounds(50, 100, 150, 30);
        this.add(labelEspecialidad);

        especialidad = new JComboBox<>();
        especialidad.setBounds(200, 100, 200, 30);
        this.add(especialidad);

        mostrarDoctores = new JButton("Mostrar Doctores");
        mostrarDoctores.setBounds(450, 100, 150, 30);
        this.add(mostrarDoctores);

        JLabel labelDoctor = new JLabel("Doctor:");
        labelDoctor.setBounds(50, 150, 150, 30);
        this.add(labelDoctor);

        doctor = new JComboBox<>();
        doctor.setBounds(200, 150, 200, 30);
        this.add(doctor);

        mostrarHorarios = new JButton("Mostrar Horarios");
        mostrarHorarios.setBounds(450, 150, 150, 30);
        this.add(mostrarHorarios);

        JLabel labelFecha = new JLabel("Fecha:");
        labelFecha.setBounds(50, 200, 150, 30);
        this.add(labelFecha);

        JTextField fecha = new JTextField("06/05/2024");
        fecha.setBounds(200, 200, 200, 30);
        this.add(fecha);

        JLabel labelHora = new JLabel("Hora:");
        labelHora.setBounds(50, 250, 150, 30);
        this.add(labelHora);

        JTextField hora = new JTextField("11:00");
        hora.setBounds(200, 250, 200, 30);
        this.add(hora);

        generarCita = new JButton("Generar Cita");
        generarCita.setBounds(250, 300, 150, 30);
        this.add(generarCita);

        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}
