enum Horario{
    MAÑANA,TARDE;
}

public class Alumno {

    private String nombre="";

    private String apellidos="";

    private String fechaNac;

    private int NC=0;

    private String grupo="";

    private Horario horario;
    
    // se crea constructor

    public void Alumno(String nombre, String apellidos, String fechaNac, int NC, String grupo, Horario horario) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNac = fechaNac;
        this.NC = NC;
        this.grupo = grupo;
        this.horario = horario;
    }
    

    public String dameGrupo() {
        return grupo;
    }

    public void ponGrupo(String nuevoGrupo, Horario nuevoHorario) {
        grupo = nuevoGrupo;
        horario = nuevoHorario;
    }
    
    public void imprime(){
        System.out.println("Datos del alumno: ");
       // System.out.println("el nombre es: "+nombre);
        System.out.println("los apellidos son: "+apellidos);
        //System.out.println("la fecha de nacimiento es: "+fechaNac);
       // System.out.println("el numero de control es: "+NC);
        System.out.println("el grupo es: "+dameGrupo());
        System.out.println("el horario es: "+horario);
        
    }
    /*public void agregarApellido(String primerApellido){
        apellidos=primerApellido;
    }*/
    
    public void agregarApellido(String...misApellidos){
        for(String apes:misApellidos)
            apellidos+=apes+" ";
    }
    
   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public int getNC() {
        return NC;
    }

    public void setNC(int NC) {
        this.NC = NC;
    }
    
}
