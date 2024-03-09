
package ipc1_proyecto1_202300813;

import java.util.ArrayList;
public class IPC1_Proyecto1_202300813 {
    public static ArrayList <Doc> listadoctores = new ArrayList<>();
    public static ArrayList<CreadorPaciente> listadoPaciente = new ArrayList<>();
    public static ArrayList<CreadorProducto> listadoProducto = new ArrayList<>();
   


    public static void main(String[] args) {
        

        //Login Login1 =new Login();
        //Administrador Admin = new Administrador();
         //Registro registro1 = new Registro();
         //crear_Paciente paciente3 = new crear_Paciente();
         //Crear_Producto product = new Crear_Producto();
         Paciente pacie = new Paciente();

       
        
    }
    public static Object[][] convertirDatosProductos_tabla(){
        int filas= listadoProducto.size();
        Object[][] arreglo = new Object[filas][5];
        
        for (int i = 0; i < filas; i++) {
            CreadorProducto temp_producto = listadoProducto.get(i);
            
            arreglo[i][0]=temp_producto.getCodigoProducto();
            arreglo[i][1]=temp_producto.getNombreProducto();
            arreglo[i][2]=temp_producto.getCantidadProducto();
            arreglo[i][3]=temp_producto.getDescripciónProdcuto();
            arreglo[i][4]=temp_producto.getPrecioProducto();

            


            
        }
        
        return arreglo;
    }
        public static Object[][] convertirDatosPacientes_tabla(){
        int filas= listadoPaciente.size();
        Object[][] arreglo = new Object[filas][6];
        
        for (int i = 0; i < filas; i++) {
            CreadorPaciente temp_paciente = listadoPaciente.get(i);
            
            arreglo[i][0]=temp_paciente.getCodigoPaciente();
            arreglo[i][1]=temp_paciente.getNombrePaciente();
            arreglo[i][2]=temp_paciente.getApellidoPaciente();
            arreglo[i][3]=temp_paciente.getContraseñaPaciente();
            arreglo[i][4]=temp_paciente.getGeneroPaciente();
            arreglo[i][5]=temp_paciente.getEdadPaciente();
            


            
        }
        
        return arreglo;
    }
    
    public static Object[][] convertirDatosDoctores_tabla(){
        int filas= listadoctores.size();
        Object[][] arreglo = new Object[filas][8];
        
        for (int i = 0; i < filas; i++) {
            Doc temp_doctores = listadoctores.get(i);
            arreglo[i][0]=temp_doctores.getCodigo();
            arreglo[i][1]=temp_doctores.getNombre();
            arreglo[i][2]=temp_doctores.getApellido();
            arreglo[i][3]=temp_doctores.getGenero();
            arreglo[i][4]=temp_doctores.getEdad();
            arreglo[i][5]=temp_doctores.getEspecialidad();
            arreglo[i][6]=temp_doctores.getContraseña();
            arreglo[i][7]=temp_doctores.getTelefono();

            
        }
        
        return arreglo;
    }
    
    public static void agregarproducto(int codigoProducto, String nombreProducto, Double PrecioProducto, String DescripciónProdcuto, int cantidadProducto) {
    listadoProducto.add(new CreadorProducto(codigoProducto,nombreProducto, PrecioProducto, DescripciónProdcuto, cantidadProducto ));
}
    public static int contador3=1;
    
    
    public static void agregarpaciente(int codigoPaciente, String nombrePaciente, String generoPaciente, int edadPaciente, String apellidoPaciente, String contraseñaPaciente) {
    listadoPaciente.add(new CreadorPaciente(codigoPaciente, nombrePaciente, generoPaciente, edadPaciente, apellidoPaciente, contraseñaPaciente));
}
    public static int contador2=1;
    
    public static void agregardoctor(int codigo, String nombre,String apellido, String genero, int edad, String especialidad,String contraseña, String telefono){
        
        listadoctores.add(new Doc(codigo, nombre,apellido, genero, edad, especialidad,contraseña, telefono));

    }
    public static int contador=1;


    
}

