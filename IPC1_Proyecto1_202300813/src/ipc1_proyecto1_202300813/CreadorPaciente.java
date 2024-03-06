
package ipc1_proyecto1_202300813;

public class CreadorPaciente {
       private int codigoPaciente;
    private String nombrePaciente;
    private String generoPaciente;
    private int edadPaciente;
    private String apellidoPaciente;  // Nuevo campo
   private String contraseñaPaciente;

        public CreadorPaciente(int codigoPaciente, String nombrePaciente, String generoPaciente, int edadPaciente, String apellidoPaciente, String contraseñaPaciente) {
            this.codigoPaciente = codigoPaciente;
            this.nombrePaciente = nombrePaciente;
            this.generoPaciente = generoPaciente;
            this.edadPaciente = edadPaciente;
            this.apellidoPaciente = apellidoPaciente;
            this.contraseñaPaciente = contraseñaPaciente;
        }

        /**
         * @return the codigoPaciente
         */
        public int getCodigoPaciente() {
            return codigoPaciente;
        }

        /**
         * @param codigoPaciente the codigoPaciente to set
         */
        public void setCodigoPaciente(int codigoPaciente) {
            this.codigoPaciente = codigoPaciente;
        }

        /**
         * @return the nombrePaciente
         */
        public String getNombrePaciente() {
            return nombrePaciente;
        }

        /**
         * @param nombrePaciente the nombrePaciente to set
         */
        public void setNombrePaciente(String nombrePaciente) {
            this.nombrePaciente = nombrePaciente;
        }

        /**
         * @return the generoPaciente
         */
        public String getGeneroPaciente() {
            return generoPaciente;
        }

        /**
         * @param generoPaciente the generoPaciente to set
         */
        public void setGeneroPaciente(String generoPaciente) {
            this.generoPaciente = generoPaciente;
        }

        /**
         * @return the edadPaciente
         */
        public int getEdadPaciente() {
            return edadPaciente;
        }

        /**
         * @param edadPaciente the edadPaciente to set
         */
        public void setEdadPaciente(int edadPaciente) {
            this.edadPaciente = edadPaciente;
        }

        /**
         * @return the apellidoPaciente
         */
        public String getApellidoPaciente() {
            return apellidoPaciente;
        }

        /**
         * @param apellidoPaciente the apellidoPaciente to set
         */
        public void setApellidoPaciente(String apellidoPaciente) {
            this.apellidoPaciente = apellidoPaciente;
        }

        /**
         * @return the contraseñaPaciente
         */
        public String getContraseñaPaciente() {
            return contraseñaPaciente;
        }

        /**
         * @param contraseñaPaciente the contraseñaPaciente to set
         */
        public void setContraseñaPaciente(String contraseñaPaciente) {
            this.contraseñaPaciente = contraseñaPaciente;
        }



   
    


     
}
