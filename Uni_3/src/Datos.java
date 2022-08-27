/*
Utiliza JFrame frmFormulario
 */

/**
 *
 * @author alext
 */
public class Datos {

    private static frmFormulario formulario;
    private static Empleado empleado [];
    private static int contador;
    
    public static void main(String[] args) {
         // se instancia objeto el cual interactua con jframe formulario   
        formulario = new frmFormulario();
        // se crea el arreglo
        empleado = new Empleado[100];
        for(int i=0;i<100;i++){
            empleado[i] = new Empleado();
        }
        contador = 0;
        formulario.setVisible(true);
        
    }
    // se desarrollan los metodos
    public static void guardar(String n, String a, String c, int celular){
        empleado[contador].setNombre(n);
        empleado[contador].setApellido(a);
        empleado[contador].setCorreo(c);
        empleado[contador].setCelular(celular);
        contador++;

    }
    public static void buscar(String bus){
        for(int j=0;j<empleado.length;j++){
            if(empleado[j].getNombre().equals(bus)){
                formulario.cargarDatos(empleado[j]);
            }
        }
    }
}
