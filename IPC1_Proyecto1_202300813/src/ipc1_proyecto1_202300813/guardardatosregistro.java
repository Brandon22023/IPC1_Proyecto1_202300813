
package ipc1_proyecto1_202300813;

public class guardardatosregistro {

    private String nombre;
    private String aprellido;
    private String contraseña;
    private String genero;
    private int edad;
    private int codigo;

    public guardardatosregistro(String nombre, String aprellido, String contraseña, String genero, int edad, int codigo) {
        this.nombre = nombre;
        this.aprellido = aprellido;
        this.contraseña = contraseña;
        this.genero = genero;
        this.edad = edad;
        this.codigo = codigo;
    }


    public guardardatosregistro() {
        nombre ="";
        aprellido = "";
        contraseña = "";
        genero = "";
        edad = 0;
        codigo = 0;

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAprellido() {
        return aprellido;
    }

    public void setAprellido(String aprellido) {
        this.aprellido = aprellido;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    
}
