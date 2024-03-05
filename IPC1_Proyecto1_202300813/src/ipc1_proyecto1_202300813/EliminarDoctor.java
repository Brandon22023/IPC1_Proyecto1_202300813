
package ipc1_proyecto1_202300813;

import javax.swing.JOptionPane;

public class EliminarDoctor {

    public static void eliminarDoctor(int codigo) {
        // Buscar y eliminar al doctor de la lista
        Doc doctorEliminar = null;
        for (Doc doctor : IPC1_Proyecto1_202300813.listadoctores) {
            if (doctor.getCodigo() == codigo) {
                doctorEliminar = doctor;
                break;
            }
        }

        if (doctorEliminar != null) {
            IPC1_Proyecto1_202300813.listadoctores.remove(doctorEliminar);
            JOptionPane.showMessageDialog(null, "Doctor eliminado exitosamente.");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró un doctor con el código especificado.");
        }
    }
}