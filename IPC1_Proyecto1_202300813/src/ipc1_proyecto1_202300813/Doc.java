
package ipc1_proyecto1_202300813;

public class Doc {
    private int codigo;
    private String nombre;
    private String genero;
    private int edad;
    private String especialidad;
    private String telefono;

    public Doc(int codigo, String nombre, String genero, int edad, String especialidad, String telefono) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.especialidad = especialidad;
        this.telefono = telefono;
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

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    
}
