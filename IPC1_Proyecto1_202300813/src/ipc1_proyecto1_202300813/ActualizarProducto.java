package ipc1_proyecto1_202300813;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActualizarProducto extends JFrame implements ActionListener {

    private JTextField NombreProducto;
    private JTextField PrecioProducto;
    private JTextField DescripcionProducto;
    private JTextField CantidadProducto;
    private JButton updateButton4;
    private CreadorProducto productoActual;

    public ActualizarProducto(CreadorProducto producto) {
        this.productoActual = producto;

        JLabel titleLabel = new JLabel("Actualizar Producto");
        titleLabel.setFont(new Font("Kristen ITC", Font.BOLD, 20));
        titleLabel.setBounds(350, 10, 1000, 30);
        this.add(titleLabel);

        JLabel nombreLabel = new JLabel("Nombre:");
        nombreLabel.setBounds(70, 50, 80, 25);
        this.add(nombreLabel);

        NombreProducto = new JTextField(producto.getNombreProducto());
        NombreProducto.setBounds(130, 50, 260, 25);
        this.add(NombreProducto);

        JLabel precioLabel = new JLabel("Precio:");
        precioLabel.setBounds(70, 90, 80, 25);
        this.add(precioLabel);

        PrecioProducto = new JTextField(String.valueOf(producto.getPrecioProducto()));
        PrecioProducto.setBounds(130, 90, 260, 25);
        this.add(PrecioProducto);
        
        JLabel descriLabel = new JLabel("Descripción:");
        descriLabel.setBounds(55, 130, 80, 25);
        this.add(descriLabel);

        DescripcionProducto = new JTextField(String.valueOf(producto.getDescripciónProdcuto()));
        DescripcionProducto.setBounds(130, 130, 260, 25);
        this.add(DescripcionProducto);

        
        
        JLabel CantidadLabel = new JLabel("Cantidad:");
        CantidadLabel.setBounds(540, 130, 80, 25);
        this.add(CantidadLabel);

        CantidadProducto = new JTextField(String.valueOf(producto.getCantidadProducto()));
        CantidadProducto.setBounds(600, 130, 260, 25);
        this.add(CantidadProducto);

        
        // Botón de actualización
        updateButton4 = new JButton("Actualizar");
        updateButton4.setBounds(360, 220, 150, 25);
        updateButton4.setForeground(Color.WHITE);
        updateButton4.setBackground(new Color(214, 225, 50));
        updateButton4.addActionListener(this);
        this.add(updateButton4);

        // Imagen
        ImageIcon imagen5 = new ImageIcon(getClass().getResource("../img/fondo8.jpg"));
        Image imageDimension5 = imagen5.getImage().getScaledInstance(950, 400, Image.SCALE_SMOOTH);
        ImageIcon adjustedImageIcon2 = new ImageIcon(imageDimension5);
        JLabel imagenLabel5 = new JLabel(adjustedImageIcon2);
        imagenLabel5.setBounds(0, 0, 900, 400);
        this.add(imagenLabel5);

        this.setTitle("Actualizar Producto");
        this.setBounds(650, 400, 900, 350);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == getupdateButton4()) {
            // Lógica para actualizar el doctor con los nuevos valores ingresados
            getProductoActual().setNombreProducto( getNombreProducto().getText());
            getProductoActual().setPrecioProducto(Double.parseDouble(getPrecioProducto().getText()));
            getProductoActual().setCantidadProducto(Integer.parseInt(getCantidadProducto().getText()));
            getProductoActual().setDescripciónProdcuto(getDescripcionProducto().getText());
            // Mensaje de éxito
            JOptionPane.showMessageDialog(null, "Producto actualizado exitosamente.");

            // Cierra la ventana de actualización
            this.dispose();
        }
        
     
    }

    /**
     * @return the NombreProducto
     */
    public JTextField getNombreProducto() {
        return NombreProducto;
    }

    /**
     * @param NombreProducto the NombreProducto to set
     */
    public void setNombreProducto(JTextField NombreProducto) {
        this.NombreProducto = NombreProducto;
    }

    /**
     * @return the PrecioProducto
     */
    public JTextField getPrecioProducto() {
        return PrecioProducto;
    }

    /**
     * @param PrecioProducto the PrecioProducto to set
     */
    public void setPrecioProducto(JTextField PrecioProducto) {
        this.PrecioProducto = PrecioProducto;
    }

    /**
     * @return the DescripcionProducto
     */
    public JTextField getDescripcionProducto() {
        return DescripcionProducto;
    }

    /**
     * @param DescripcionProducto the DescripcionProducto to set
     */
    public void setDescripcionProducto(JTextField DescripcionProducto) {
        this.DescripcionProducto = DescripcionProducto;
    }

    /**
     * @return the CantidadProducto
     */
    public JTextField getCantidadProducto() {
        return CantidadProducto;
    }

    /**
     * @param CantidadProducto the CantidadProducto to set
     */
    public void setCantidadProducto(JTextField CantidadProducto) {
        this.CantidadProducto = CantidadProducto;
    }

    /**
     * @return the updateButton
     */
    public JButton getupdateButton4() {
        return updateButton4;
    }

    /**
     * @param updateButton the updateButton to set
     */
    public void setupdateButton4(JButton updateButton4) {
        this.updateButton4= updateButton4;
    }

    /**
     * @return the productoActual
     */
    public CreadorProducto getProductoActual() {
        return productoActual;
    }

    /**
     * @param productoActual the productoActual to set
     */
    public void setProductoActual(CreadorProducto productoActual) {
        this.productoActual = productoActual;
    }
}

