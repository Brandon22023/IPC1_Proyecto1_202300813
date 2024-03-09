
package ipc1_proyecto1_202300813;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;




public class Paciente extends JFrame implements ActionListener {



            JTextArea motiCita;
    private JComboBox<String> Fecha;
    private JComboBox<String> Hora;
    private JComboBox<String> Especialidad;
    private JComboBox<String> cboDoctor;
    JButton exitButton;

    public Paciente() {
 JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
        //Crear los paneles / pestañas
        JPanel pesta1 = new JPanel(null);
        JPanel pesta2 = new JPanel(null);
        JPanel pesta3 = new JPanel(null);
        

 

        
        
        // Titulo
        JLabel lbl4 = new JLabel("Historial Cita");
        lbl4.setBounds(25, 25, 1850, 50);
        lbl4.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        lbl4.setOpaque(true);
        lbl4.setVerticalAlignment(SwingConstants.CENTER);
        lbl4.setHorizontalAlignment(SwingConstants.CENTER);
        lbl4.setFont(new Font("Times New Roman", Font.BOLD, 24));
        lbl4.setBackground(new Color(156, 187, 230));
        lbl4.setForeground(Color.white);
        lbl4.setVisible(true);
        pesta2.add(lbl4);
        //
        JLabel lbl5 = new JLabel("Crear Cita");
        lbl5.setBounds(1200, 200, 250, 40);
        lbl5.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        lbl5.setOpaque(true);
        lbl5.setVerticalAlignment(SwingConstants.CENTER);
        lbl5.setHorizontalAlignment(SwingConstants.CENTER);
        lbl5.setFont(new Font("Times New Roman", Font.BOLD, 24));
        lbl5.setBackground(new Color(156, 187, 230));
        lbl5.setForeground(Color.white);
        lbl5.setVisible(true);
        pesta1.add(lbl5);
        
        //
        JLabel lbl6 = new JLabel("Farmacia");
        lbl6.setBounds(25, 25, 1850, 50);
        lbl6.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        lbl6.setOpaque(true);
        lbl6.setVerticalAlignment(SwingConstants.CENTER);
        lbl6.setHorizontalAlignment(SwingConstants.CENTER);
        lbl6.setFont(new Font("Times New Roman", Font.BOLD, 24));
        lbl6.setBackground(new Color(156, 187, 230));
        lbl6.setForeground(Color.white);
        lbl6.setVisible(true);
        pesta3.add(lbl6);
        
   
        JLabel lblMotivo = new JLabel("Motivo de la cita: ");
        lblMotivo.setBounds(70,140,250,25);
        lblMotivo.setForeground(new Color(17, 45, 78));
        lblMotivo.setFont(new Font("Times New Roman",Font.BOLD,27));
        pesta1.add(lblMotivo); 
        motiCita = new JTextArea();
        motiCita.setFont(new Font("Times New Roman",Font.BOLD,18));
        motiCita.setBackground(new Color(156, 187, 230));
        motiCita.setBounds(50,195,400,400);
        pesta1.add(motiCita);
        
        
      
         
        //txtNombres
        JLabel lblHorario1 = new JLabel("Horario de citas disponibles ");
        lblHorario1.setBounds(600,660,750,25);
        lblHorario1.setForeground(new Color(17, 45, 78));
        lblHorario1.setFont(new Font("Times New Roman",Font.BOLD,27));
        pesta1.add(lblHorario1); 
        
        
        String[] cita33 = {"No de cita", "Especialidad", "Doctor", "Motivo", "Estado", "Fecha", "Posible Hora"};
        JTable table_doc = new JTable(IPC1_Proyecto1_202300813.convertirDatosDoctores_tabla(),cita33 );
     
        
        JScrollPane scroll1 = new JScrollPane(table_doc);
        scroll1.setBounds(25, 100, 750, 570);
        
        pesta2.add(scroll1); 
        

        
        //ComboFecha
        JLabel lblHorario = new JLabel("Fecha: ");
        lblHorario.setBounds(400,730,250,25);
        lblHorario.setForeground(new Color(17, 45, 78));
        lblHorario.setFont(new Font("Times New Roman",Font.BOLD,27));
        pesta1.add(lblHorario); 
        Fecha = new JComboBox();
        Fecha.addItem(" ");
        Fecha.addItem("16/03/2024");
        Fecha.addItem("18/03/2024");
        Fecha.addItem("20/04/2024");
        Fecha.addItem("21/05/2024");
        Fecha.addItem("12/05/2024");
        Fecha.addItem("23/05/2024");
        Fecha.addItem("14/06/2024");
        Fecha.addItem("05/07/2024");
        Fecha.addItem("18/09/2024");
        Fecha.setFont(new Font("Times New Roman",Font.BOLD,18));
        Fecha.setBackground(new Color(156, 187, 230));
        Fecha.setBounds(500,730,220,40);
        pesta1.add(Fecha);
 

        JLabel lblHora = new JLabel("Posible Hora: ");
        lblHora.setBounds(810,730,250,25);
        lblHora.setForeground(new Color(17, 45, 78));
        lblHora.setFont(new Font("Times New Roman",Font.BOLD,27));
        pesta1.add(lblHora); 
        Hora = new JComboBox();
        Hora.addItem(" ");
        Hora.addItem("12:00 P.M.");
        Hora.addItem("17:00 P.M.");
        Hora.addItem("20:00 P.M.");
        Hora.addItem("10:00 A.M.");
        Hora.addItem("9:00 P.M.");
        Hora.setFont(new Font("Times New Roman",Font.BOLD,18));
        Hora.setBackground(new Color(156, 187, 230));
        Hora.setBounds(975,730,220,40);
        pesta1.add(Hora);
        //cboEspecialidad
        JLabel mostrarDoc = new JLabel("Especialidad: ");
        mostrarDoc.setBounds(600, 400, 180, 40);
        mostrarDoc.setForeground(new Color(17, 45, 78));
        mostrarDoc.setFont(new Font("Times New Roman", Font.BOLD, 20));
        pesta1.add(mostrarDoc);
        Especialidad = new JComboBox<>();
        Especialidad.addItem("");
        Especialidad.setBackground(new Color(156, 187, 230));
        Especialidad.setBounds(750, 400, 220, 40);
        pesta1.add(Especialidad);
        

        JLabel lblDoc= new JLabel("Doctores: ");
        lblDoc.setBounds(600,450,180,40);
        lblDoc.setForeground(new Color(17, 45, 78));
        lblDoc.setFont(new Font("Times New Roman",Font.BOLD,20));
        pesta1.add(lblDoc); 
        cboDoctor = new JComboBox();
        cboDoctor.setFont(new Font("Times New Roman",Font.BOLD,20));
        cboDoctor.setBackground(new Color(156, 187, 230));
        cboDoctor.setBounds(750,450,220,40);
        pesta1.add(cboDoctor);
        

        

        JButton registrarButton = new JButton("Mostrar Doctores");
        registrarButton.setBounds(1200, 400, 250, 40);
        registrarButton.setForeground(Color.white);
        registrarButton.setFont(new Font("Times New Roman",Font.BOLD,20));
        registrarButton.setBackground(new Color(156, 187, 230));
        registrarButton.addActionListener(this);
        pesta1.add(registrarButton);

        JButton editarButton = new JButton("Editar Perfil");
        editarButton.setBounds(1600, 100, 250, 40);
        editarButton.setForeground(Color.white);
        editarButton.setFont(new Font("Times New Roman",Font.BOLD,20));
        editarButton.setBackground(new Color(156, 187, 230));
        editarButton.addActionListener(this);
        pesta1.add(editarButton);
         //Boton Horarios
        JButton horariosButton = new JButton("Mostrar Horarios");
        horariosButton.setBounds(1200, 450, 250, 40);
        horariosButton.setForeground(Color.white);
        horariosButton.setFont(new Font("Times New Roman",Font.BOLD,20));
        horariosButton.setBackground(new Color(156, 187, 230));
        horariosButton.addActionListener(this);
        pesta1.add(horariosButton);
         //Boton Generar
        JButton generarButton = new JButton("Generar Cita");
        generarButton.setBounds(1200, 550, 250, 40);
        generarButton.setForeground(Color.white);
        generarButton.setFont(new Font("Times New Roman",Font.BOLD,20));
        generarButton.setBackground(new Color(156, 187, 230));
        generarButton.addActionListener(this);
        pesta1.add(generarButton);
        
        //Boton Generar
        exitButton = new JButton("Salir");
        exitButton.setBounds(1200, 500, 250, 40);
        exitButton.setForeground(Color.white);
        exitButton.setFont(new Font("Times New Roman",Font.BOLD,20));
        exitButton.setBackground(new Color(156, 187, 230));
        exitButton.addActionListener(this);
        pesta1.add(exitButton);
        
        //Boton Registrar
        JButton comprarButton = new JButton("Comprar Productos");
        comprarButton.setBounds(1000, 250, 250, 40);
        comprarButton.setForeground(Color.white);
        comprarButton.setFont(new Font("Times New Roman",Font.BOLD,20));
        comprarButton.setBackground(new Color(156, 187, 230));
        comprarButton.addActionListener(this);
        pesta3.add(comprarButton);
        

        
        getContentPane().add(tabbedPane);
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        this.setResizable(false);
        this.setVisible(true); 
        
        tabbedPane.addTab("Solicitar Cita", pesta1);
        tabbedPane.addTab("Ver Estado Cita", pesta2);
        tabbedPane.addTab("Farmacia", pesta3);
        getContentPane().add(tabbedPane);
        
        
                      ImageIcon imagen15 = new  ImageIcon (getClass().getResource("../img/fondo6.jpg"));
        Image imageDemension15 = imagen15.getImage().getScaledInstance(1800, 850, Image.SCALE_SMOOTH); //ANCHO, ALTURA
        ImageIcon adjustedImageIcon12 = new ImageIcon(imageDemension15);
        //Jlabel para mostrar la imagen 
        JLabel imagenLabel15 =new JLabel (adjustedImageIcon12);
         imagenLabel15.setBounds(0,0,1600, 830);
         pesta1.add(imagenLabel15);

        
        //Configuraciones de la ventana
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Ventana Administrador");
        this.setResizable(false);
        this.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == exitButton){
            this.dispose();
            Login Login1 =new Login();
            
        }
        
    }
    
}
