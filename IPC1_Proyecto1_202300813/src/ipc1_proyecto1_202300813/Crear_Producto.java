
package ipc1_proyecto1_202300813;
import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Crear_Producto extends JFrame implements ActionListener{
    
    private JTextField nombreProducto;
    private JTextField DescripciónProdcuto;
    private JTextField PrecioProducto;
    private JTextField cantidadProducto;
     JButton registerButton3;

    public Crear_Producto() {
        JLabel titleLabel = new JLabel("Crear Producto");
        titleLabel.setFont(new Font("Kristen ITC", Font.BOLD, 20));
        titleLabel.setBounds(130, 10, 1000, 30);
        this.add(titleLabel);

        JLabel firstNameLabel = new JLabel("Nombre:");
        firstNameLabel.setBounds(70, 50, 80, 25);
        this.add(firstNameLabel);

        nombreProducto = new JTextField();
        nombreProducto.setBounds(130, 50, 260, 25);
        this.add(nombreProducto);

        JLabel lastNameLabel = new JLabel("Descripción:");
        lastNameLabel.setBounds(50, 90, 80, 25);
        this.add(lastNameLabel);

        DescripciónProdcuto = new JTextField();
        DescripciónProdcuto.setBounds(130, 90, 260, 25);
        this.add(DescripciónProdcuto);
        //
        JLabel passwordLabel4 = new JLabel ("Precio:");
        passwordLabel4.setBounds(55, 130, 80, 25);
        this.add(passwordLabel4);
        
         PrecioProducto=new JTextField();
         PrecioProducto.setBounds(130, 130, 260, 25);
         this.add(PrecioProducto);
        //
        

        JLabel edadLabel = new JLabel("Cantidad:");
        edadLabel.setBounds(70, 210, 80, 25);
        this.add(edadLabel);

        cantidadProducto= new JTextField();
        cantidadProducto.setBounds(130, 210, 260, 25);
        this.add(cantidadProducto);

        registerButton3 = new JButton("Registrar Producto");
        registerButton3.setBounds(180, 250, 170, 25);
        registerButton3.setForeground(Color.WHITE);
        registerButton3.setBackground(new Color(214, 225, 50));
        registerButton3.addActionListener(this);
        this.add(registerButton3);
        
        
         ImageIcon imagen4 = new  ImageIcon (getClass().getResource("../img/fondo6.jpg"));
        Image imageDemension4 = imagen4.getImage().getScaledInstance(900, 700, Image.SCALE_SMOOTH); //ANCHO, ALTURA
        ImageIcon adjustedImageIcon2 = new ImageIcon(imageDemension4);
        //Jlabel para mostrar la imagen 
        JLabel imagenLabel4 =new JLabel (adjustedImageIcon2);
         imagenLabel4.setBounds(0,0,900, 320);
         this.add(imagenLabel4);

        this.setTitle("Productos");
        this.setBounds(650, 400, 600, 350);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         if (e.getSource() == registerButton3){
            
            String nombreProduct = nombreProducto.getText();
            String Descripcionproduct = DescripciónProdcuto.getText();
            String precioproduct = PrecioProducto.getText();
            String cantidadProduct = cantidadProducto.getText();


            IPC1_Proyecto1_202300813.agregarproducto(IPC1_Proyecto1_202300813.contador3, nombreProduct, Double.parseDouble(precioproduct), Descripcionproduct, Integer.parseInt(cantidadProduct));
            IPC1_Proyecto1_202300813.contador3++;
            this.dispose();
            Administrador Admin = new Administrador();
            
        }
        
        
    }
    
    
}
