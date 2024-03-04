
package ipc1_proyecto1_202300813;


import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionListener;

public class Administrador extends JFrame implements ActionListener{
    JButton salirboton;
    JButton Crearboton;
    public Administrador() {
        //pestañas
        
        JTabbedPane pestañas  = new JTabbedPane(JTabbedPane.TOP);
        //crear las pestañas
        JPanel pest1 =new JPanel(null);
        JPanel pest2 =new JPanel(null);
        JPanel pest3 =new JPanel(null);
        
        //botones pestaña doctor
        
        pest1.add(new JLabel("Contenido de la pestaña 1"));
        pest2.add(new JLabel("Contenido de la pestaña 2"));
        pest3.add(new JLabel("Contenido de la pestaña 3"));
        

        
        pestañas.addTab("Doctores", pest1);
        pestañas.addTab("Pacientes", pest2);
        pestañas.addTab("Productos", pest3);
        
        
        //botones pestaña uno
        salirboton= new JButton ("Salir");
         salirboton.setBounds(1000, 25, 100, 50);
         salirboton.setBackground(new Color(156, 187, 230));
         salirboton.addActionListener(this);
         pest1.add(salirboton);
         
         Crearboton= new JButton ("crear doctor");
         Crearboton.setBounds(1200, 25, 150, 50);
         Crearboton.setBackground(new Color(156, 187, 230));
         Crearboton.addActionListener(this);
         pest1.add(Crearboton);
         
         
        
        //contenido de la pestaña doctores, pestaña 1
        //tabla
        String[] columadoc = {"codigo", "nombre", "genero", "edad", "especialidad", "telefono"};
        //llamar a la tabla
        JTable table_doc = new JTable(IPC1_Proyecto1_202300813.convertirDatosDoctores_tabla(),columadoc );
        
        //agregar un scroll por si se llena
        JScrollPane scrollPane =new JScrollPane(table_doc);
        scrollPane.setBounds(25, 80, 750, 570);
        
        pest1.add(scrollPane);
        
        
        //tabla
        String[] columanas_usuario = { "nombre","apellido","contraseña","genero", "edad"  };
        //llamar a la tabla
        JTable table_usr = new JTable(Registro.convertidordedatos_tabla(), columanas_usuario);
        JScrollPane scrollPane1 =new JScrollPane(table_usr);
        scrollPane1.setBounds(25, 80, 750, 570);
        pest2.add(scrollPane1);
        
        
        JLabel titulo= new JLabel ("Listado de Doctores");
        titulo.setFont(new Font ("Times New Roman", Font.BOLD, 40));
        titulo.setForeground(Color.white);
        titulo.setBounds(170, 10, 1000, 50);
        pest1.add(titulo);
        
        ImageIcon imagen5 = new  ImageIcon (getClass().getResource("../img/fondo4.jpg"));
        Image imageDemension5 = imagen5.getImage().getScaledInstance(1900, 1000, Image.SCALE_SMOOTH); //ANCHO, ALTURA
        ImageIcon adjustedImageIcon2 = new ImageIcon(imageDemension5);
        //Jlabel para mostrar la imagen 
        JLabel imagenLabel5 =new JLabel (adjustedImageIcon2);
         imagenLabel5.setBounds(0,0,1700, 830);
         pest1.add(imagenLabel5);
        
        
        


        


        //ventana
        getContentPane().add(pestañas);
        //------------Creando JFrame------------------
        this.setExtendedState(MAXIMIZED_BOTH);  // Hacer que la ventana se abra maximizada
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cerrar la aplicación al cerrar la ventana
        this.setResizable(false); // Deshabilitar la capacidad de cambiar el tamaño de la ventana
        this.setVisible(true); // Hacer la ventana visible
        
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
        //para salir y que salga otra vez el inicio de sesión
        if (e.getSource() == salirboton){
            this.dispose();
            Login Login1 =new Login();
            
        }else if (e.getSource() == Crearboton) {
            this.dispose();
            crear_Doc crear_Doc1 = new crear_Doc();
            
            
        }
        
        
    }
    
}
