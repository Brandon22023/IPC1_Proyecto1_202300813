
package ipc1_proyecto1_202300813;

import java.util.ArrayList;
public class IPC1_Proyecto1_202300813 {
    public static ArrayList <Doc> listadoctores = new ArrayList<>();


    public static void main(String[] args) {
        

        //Login Login1 =new Login();
        Administrador Admin = new Administrador();
         //Registro registro1 = new Registro();
       
        
    }
    
    public static Object[][] convertirDatosDoctores_tabla(){
        int filas= listadoctores.size();
        Object[][] arreglo = new Object[filas][6];
        
        for (int i = 0; i < filas; i++) {
            Doc temp_doctores = listadoctores.get(i);
            
            arreglo[i][0]=temp_doctores.getCodigo();
            arreglo[i][1]=temp_doctores.getNombre();
            arreglo[i][2]=temp_doctores.getGenero();
            arreglo[i][3]=temp_doctores.getEdad();
            arreglo[i][4]=temp_doctores.getEspecialidad();
            arreglo[i][5]=temp_doctores.getTelefono();

            
        }
        
        return arreglo;
    }
    
    public static void agregardoctor(int codigo, String nombre, String genero, int edad, String especialidad, String telefono){
        
        listadoctores.add(new Doc(codigo, nombre, genero, edad, especialidad, telefono));
    }
    public static int contador=001;
    
    
}

