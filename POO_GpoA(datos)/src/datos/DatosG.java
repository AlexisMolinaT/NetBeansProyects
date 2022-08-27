package datos;

/**
 *
 * @author invitado
 */
public class DatosG {
    String nombre;
    int edad;
    String carrera;
    String materia;
    String numControl;

    public DatosG(String nombre,int edad, String carrera, String materia, String numControl) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
        this.materia = materia;
        this.numControl = numControl;
    }

    public String getNombre() {
        return  nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getEdad() {
        return  edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
      public String getNumControl() {
        return numControl;
    }

    public void setEdad(String numControl) {
        this.numControl = numControl;
    }
    
    
    
    
    
    
    
}
