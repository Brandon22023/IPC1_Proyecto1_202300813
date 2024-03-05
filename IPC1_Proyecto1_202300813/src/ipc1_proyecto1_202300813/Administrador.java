
package ipc1_proyecto1_202300813;


import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionListener;

public class Administrador extends JFrame implements ActionListener{
    JButton salirboton;
    JButton salirboton2;
    JButton salirboton3;
    JButton Crearboton;
    JButton EliminarBoton;
    JButton ActualizarBoton;
    JButton Actualizarventana;
    JButton Actualizarventana2;
    JButton Actualizarventana3;
    JButton crearpaciente;
    JButton Actualizarpaciente;
    JButton Eliminarpaciente;
    JButton CrearProducto;
    JButton ActualizarProducto;
    JButton EliminarProducto;
    
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
        
        
        CrearProducto= new JButton ("Crear Producto");
         CrearProducto.setBounds(1200, 25, 150, 50);
         CrearProducto.setBackground(new Color(156, 187, 230));
         CrearProducto.addActionListener(this);
         pest3.add(CrearProducto);
         
         EliminarProducto= new JButton ("Eliminar Producto");
         EliminarProducto.setBounds(1200, 100, 150, 50);
         EliminarProducto.setBackground(new Color(156, 187, 230));
         EliminarProducto.addActionListener(this);
         pest3.add(EliminarProducto);
         
         ActualizarProducto= new JButton ("Actualizar Producto");
         ActualizarProducto.setBounds(1000, 100, 150, 50);
         ActualizarProducto.setBackground(new Color(156, 187, 230));
         ActualizarProducto.addActionListener(this);
         pest3.add(ActualizarProducto);
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
         
         EliminarBoton= new JButton ("Eliminar doctor");
         EliminarBoton.setBounds(1200, 100, 150, 50);
         EliminarBoton.setBackground(new Color(156, 187, 230));
         EliminarBoton.addActionListener(this);
         pest1.add(EliminarBoton);
         
         ActualizarBoton= new JButton ("Actualizar doctor");
         ActualizarBoton.setBounds(1000, 100, 150, 50);
         ActualizarBoton.setBackground(new Color(156, 187, 230));
         ActualizarBoton.addActionListener(this);
         pest1.add(ActualizarBoton);
         
         Actualizarventana= new JButton ("Actualizar Ventana");
         Actualizarventana.setBounds(1000, 180, 150, 50);
         Actualizarventana.setBackground(new Color(156, 187, 230));
         Actualizarventana.addActionListener(this);
         pest1.add(Actualizarventana);
         //
         salirboton2= new JButton ("Salir");
         salirboton2.setBounds(1000, 25, 100, 50);
         salirboton2.setBackground(new Color(156, 187, 230));
         salirboton2.addActionListener(this);
         pest2.add(salirboton2);
         salirboton3= new JButton ("Salir");
         salirboton3.setBounds(1000, 25, 100, 50);
         salirboton3.setBackground(new Color(156, 187, 230));
         salirboton3.addActionListener(this);
         pest3.add(salirboton3);
         
         crearpaciente= new JButton ("crear Paciente");
         crearpaciente.setBounds(1200, 25, 150, 50);
         crearpaciente.setBackground(new Color(156, 187, 230));
         crearpaciente.addActionListener(this);
         pest2.add(crearpaciente);
         
         Eliminarpaciente= new JButton ("Eliminar Paciente");
         Eliminarpaciente.setBounds(1200, 100, 150, 50);
         Eliminarpaciente.setBackground(new Color(156, 187, 230));
         Eliminarpaciente.addActionListener(this);
         pest2.add(Eliminarpaciente);
         
         Actualizarpaciente= new JButton ("Actualizar Paciente");
         Actualizarpaciente.setBounds(1000, 100, 150, 50);
         Actualizarpaciente.setBackground(new Color(156, 187, 230));
         Actualizarpaciente.addActionListener(this);
         pest2.add(Actualizarpaciente);
         
         Actualizarventana2= new JButton ("Actualizar Ventana");
         Actualizarventana2.setBounds(1000, 180, 150, 50);
         Actualizarventana2.setBackground(new Color(156, 187, 230));
         Actualizarventana2.addActionListener(this);
         pest2.add(Actualizarventana2);
         
         Actualizarventana3= new JButton ("Actualizar Ventana");
         Actualizarventana3.setBounds(1000, 180, 150, 50);
         Actualizarventana3.setBackground(new Color(156, 187, 230));
         Actualizarventana3.addActionListener(this);
         pest3.add(Actualizarventana3);
         
         
         
         
         
        
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
        
        JLabel lbl6 = new JLabel("Listado de Productos");
        lbl6.setBounds(25, 25, 750, 50);
        lbl6.setBorder(BorderFactory.createLineBorder(Color.black, 2));
       lbl6.setBackground(Color.LIGHT_GRAY);
        lbl6.setOpaque(true);
        lbl6.setVerticalAlignment(SwingConstants.CENTER);
        lbl6.setHorizontalAlignment(SwingConstants.CENTER);
        lbl6.setFont(new Font(lbl6.getFont().getFontName(), Font.BOLD, 24));
        lbl6.setVisible(true);
        pest3.add(lbl6);
        
        JLabel lbl5 = new JLabel("Listado de Pacientes");
        lbl5.setBounds(25, 25, 750, 50);
        lbl5.setBorder(BorderFactory.createLineBorder(Color.black, 2));
       lbl5.setBackground(Color.LIGHT_GRAY);
        lbl5.setOpaque(true);
        lbl5.setVerticalAlignment(SwingConstants.CENTER);
        lbl5.setHorizontalAlignment(SwingConstants.CENTER);
        lbl5.setFont(new Font(lbl5.getFont().getFontName(), Font.BOLD, 24));
        lbl5.setVisible(true);
        pest2.add(lbl5);
        
     
        JLabel lbl4 = new JLabel("Listado de Doctores");
        lbl4.setBounds(25, 25, 750, 50);
        lbl4.setBorder(BorderFactory.createLineBorder(Color.black, 2));
       lbl4.setBackground(Color.LIGHT_GRAY);
        lbl4.setOpaque(true);
        lbl4.setVerticalAlignment(SwingConstants.CENTER);
        lbl4.setHorizontalAlignment(SwingConstants.CENTER);
        lbl4.setFont(new Font(lbl4.getFont().getFontName(), Font.BOLD, 24));
        lbl4.setVisible(true);
        pest1.add(lbl4);
        
        ImageIcon imagen8 = new  ImageIcon (getClass().getResource("../img/fondo9.jpg"));
        Image imageDemension8 = imagen8.getImage().getScaledInstance(1800, 850, Image.SCALE_SMOOTH); //ANCHO, ALTURA
        ImageIcon adjustedImageIcon8 = new ImageIcon(imageDemension8);
        //Jlabel para mostrar la imagen 
        JLabel imagenLabel8 =new JLabel (adjustedImageIcon8);
         imagenLabel8.setBounds(0,0,1600, 830);
         pest3.add(imagenLabel8);
        
      ImageIcon imagen7 = new  ImageIcon (getClass().getResource("../img/fondo7.jpg"));
        Image imageDemension7 = imagen7.getImage().getScaledInstance(1800, 850, Image.SCALE_SMOOTH); //ANCHO, ALTURA
        ImageIcon adjustedImageIcon7 = new ImageIcon(imageDemension7);
        //Jlabel para mostrar la imagen 
        JLabel imagenLabel7 =new JLabel (adjustedImageIcon7);
         imagenLabel7.setBounds(0,0,1600, 830);
         pest2.add(imagenLabel7);
         
        ImageIcon imagen5 = new  ImageIcon (getClass().getResource("../img/fondo4.jpg"));
        Image imageDemension5 = imagen5.getImage().getScaledInstance(1800, 850, Image.SCALE_SMOOTH); //ANCHO, ALTURA
        ImageIcon adjustedImageIcon2 = new ImageIcon(imageDemension5);
        //Jlabel para mostrar la imagen 
        JLabel imagenLabel5 =new JLabel (adjustedImageIcon2);
         imagenLabel5.setBounds(0,0,1600, 830);
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
        }else if (e.getSource() == EliminarBoton) {
        // Pide al usuario que ingrese el código del doctor a eliminar
        String codigoEliminar = JOptionPane.showInputDialog("Ingrese el código del doctor a eliminar:");

        // Verifica si el usuario ingresó un valor
        if (codigoEliminar != null && !codigoEliminar.isEmpty()) {
            // Intenta convertir el valor ingresado a un entero
            try {
                int codigo = Integer.parseInt(codigoEliminar);
                // Llama al método eliminarDoctor con el código proporcionado
                EliminarDoctor.eliminarDoctor(codigo);
            } catch (NumberFormatException ex) {
                // Maneja el caso en que el valor ingresado no sea un número
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un código válido.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Operación cancelada por el usuario.");
        }
        this.dispose();
         Administrador Admin = new Administrador();
        }else if (e.getSource() == ActualizarBoton) {
    // Pide al usuario que ingrese el código del doctor a actualizar
    String codigoActualizar = JOptionPane.showInputDialog("Ingrese el código del doctor a actualizar:");

    // Verifica si el usuario ingresó un valor
    if (codigoActualizar != null && !codigoActualizar.isEmpty()) {
        // Intenta convertir el valor ingresado a un entero
        try {
            int codigo = Integer.parseInt(codigoActualizar);
            // Busca el doctor con el código especificado
            Doc doctorActualizar = null;
            for (Doc doctor : IPC1_Proyecto1_202300813.listadoctores) {
                if (doctor.getCodigo() == codigo) {
                    doctorActualizar = doctor;
                    break;
                }
            }

            if (doctorActualizar != null) {
                // Llama a la clase ActualizarDoc y pasa el doctor a actualizar
                ActualizarDoc actualizarVentana = new ActualizarDoc(doctorActualizar);
                this.dispose();
                Administrador Admin = new Administrador();

            } else {
                JOptionPane.showMessageDialog(null, "No se encontró un doctor con el código especificado.");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un código válido.");
        }
    } else {
        JOptionPane.showMessageDialog(null, "Operación cancelada por el usuario.");
        
    }
    
    
    
   
}else if (e.getSource() == Actualizarventana) {
            this.dispose();
            Administrador Admin = new Administrador();
 
        }else if (e.getSource() == Actualizarventana2) {
            this.dispose();
            Administrador Admin = new Administrador();
 
        }else if (e.getSource() == Actualizarventana3) {
            this.dispose();
            Administrador Admin = new Administrador();
 
        }else if (e.getSource() == salirboton2){
            this.dispose();
            Login Login1 =new Login();
            
        }else if (e.getSource() == salirboton3){
            this.dispose();
            Login Login1 =new Login();
            
        }
        
        
        
    }
    
}
