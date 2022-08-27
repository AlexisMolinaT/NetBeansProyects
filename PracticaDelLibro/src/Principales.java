/*
se accede
 */

/**
 *
 * @author alext
 */



public class Principales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Alumno a1 = new Alumno();
       a1.agregarApellido("Molina ","Terrazas");
       //Metodo sin hacer uso de los get/set
       a1.setNombre("Ricardo Alexis");
       a1.setFechaNac("4 de enero de 2003");
       //Metodo sin hacer uso de los get/set
       a1.setNC(21550296);
       a1.ponGrupo("A",Horario.MAÑANA);
       //se crea objeto para acceder al valor de las varibales (nombre,fecha de nac,NC)
        String generales = a1.getNombre()+" "+a1.getFechaNac()+" "+a1.getNC();
       //imprimir los valores por medio del objeto creado
       System.out.println("\nDatos generales del alumno(a) : "+generales);
       a1.imprime();
       // System.out.println("Datos del alumno");
       
        System.out.println("Tipos de inscripciones: ");
        Inscripciones [] limites = Inscripciones.values();
        
        // se usa un for para acceder al total de los valores de enum
        for(int i=0;i<limites.length;i++){
            System.out.println(limites[i]);
        }
        
        /*Alumno alumno1 = new Alumno();
        alumno1.setNombre("Ricardo Alexis");
        alumno1.setApellidos("Molina Terrazas");
        alumno1.setFechaNac(2003);
        alumno1.setNC(21550296);
        alumno1.setGrupo("A");
        alumno1.setHorario(Horario.MAÑANA);
        alumno1.imprime();
        */
    }
    
}
   