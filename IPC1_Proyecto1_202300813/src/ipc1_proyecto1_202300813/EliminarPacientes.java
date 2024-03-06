
package ipc1_proyecto1_202300813;

import javax.swing.JOptionPane;

public class EliminarPacientes {

    public static void EliminarPacientes(int cod) {
        
 
        CreadorPaciente patientEliminar = null;
        for (CreadorPaciente patient : IPC1_Proyecto1_202300813.listadoPaciente) {
            if (patient.getCodigoPaciente() == cod) {
                patientEliminar = patient;
                break;
            }
        }

        if (patientEliminar != null) {
            IPC1_Proyecto1_202300813.listadoPaciente.remove(patientEliminar);
            JOptionPane.showMessageDialog(null, "Paciente eliminado exitosamente.");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró un Paciente con el código especificado.");
        }
        
    }
    
    
}
