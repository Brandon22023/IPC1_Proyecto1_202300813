
package ipc1_proyecto1_202300813;
import javax.swing.JOptionPane;
public class EliminarProducto {
    
        public static void DeleteProducto(int codiprodu) {
        CreadorProducto productEliminar = null;
        for (CreadorProducto produtient : IPC1_Proyecto1_202300813.listadoProducto) {
            if (produtient.getCodigoProducto() == codiprodu) {
                productEliminar = produtient;
                break;
            }
        }

        if (productEliminar != null) {
            IPC1_Proyecto1_202300813.listadoProducto.remove(productEliminar);
            JOptionPane.showMessageDialog(null, "Producto eliminado exitosamente.");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró un Producto con el código especificado.");
        }
        
    }
    
    
}
