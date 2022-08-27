/*
Nombre
Carrera
Materia
El repositorio con nombre "POO"
ACTIVIDAD 2
*/

package datos;

/**
 *
 * @author invitado
 */
public class Datos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("--->DATOS GENERALES<---");
        DatosG info = new DatosG ("Riacrdo Alexis Molina Terrazas",19,"Ingenieria en Sistemas Computacionales","Programacion Orientada a Objetos","21550296");
        //String NumCon = info.getEdad()+" "+info.getCarrera()+" "+info.getMateria()+" "+info.getNumControl()+" ";
        System.out.println("El nombre es: "+info.getNombre());
        System.out.println("La edad es: "+info.getEdad());
        System.out.println("La carrera es: "+info.getCarrera());
        System.out.println("La materia es: "+info.getMateria());
        System.out.println("El numero de control es: "+info.getNumControl());
        
    }
    }
    

