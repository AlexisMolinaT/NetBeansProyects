/*
se genera sobrecarga de metodos
 */

/**
 *
 * @author alext
 */
public class Usuarios {
    
    String nombre;
    int edad;
    String direccion;
    
    //se genera sobrecarga de metodos (constructor)
    
    Usuarios(){
        nombre = null;
        edad = 0;
        direccion = null;
    }
    Usuarios(String nombre, int edad, String direccion){
         this.nombre = nombre;
         this.edad = edad;
         this.direccion = direccion;
    }
    Usuarios(Usuarios usr){
        nombre = usr.getNombre();
        edad = usr.getEdad();
        direccion = usr.getDireccion();
    }
    public void setNombre(String n){
        nombre = n;
    }
    public String getNombre(){
        return nombre;
    }
   //generar sobrecarga en metodo simple Edad
    public void setEdad(int e){
        edad = e;
    }
        public void setEdad(float e){
        edad = (int)e;
    }
        public int getEdad(){
            return edad;
        }
        public void setDireccion(String d){
            direccion = d;
        }
        public String getDireccion(){
            return direccion;
        }
}
