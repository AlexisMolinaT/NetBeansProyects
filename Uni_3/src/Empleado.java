/*
Se desarrolla java class Empleado para utilizarJFrame...
se adapta codigo base para generar una clase abstracta empleado
 */

/**
 *
 * @author alext
 */
//se antepone abstract
public abstract class Empleado {
    //String nombre;
    //String apellido;
    private String primerNombre;
    private String apellidoPaterno;
    //String correo;
    private String numeroSeguroSocial;

    //int celular;
    
    /*public Empleado(){
        this.nombre = "";
        this.apellido = "";
        this.correo = "";
        this.celular = 0;
    }
    */
    //se crea constructor para aplicar polimorfismo
    public Empleado(String nombre, String apellido,String nss){
        primerNombre=nombre;
        apellidoPaterno=apellido;
        numeroSeguroSocial=nss;
    }
    
    public void establecerPirmerNombre(String nombre){
        primerNombre=nombre;
    }
    public String obtenerPrimerNombre(){
        return primerNombre;
    }
    public void establecerApellidoPaterno(String apellido){
        apellidoPaterno=apellido;
    }
    public String obtenerApellidoPaterno(){
        return apellidoPaterno;
    }
    public void establecerNumeroSeguroSocial(String nss){
        numeroSeguroSocial=nss;
    }
    public String obtenerNumeroSeguroSocial(){
        return numeroSeguroSocial;
    }
    //se sobreescribe metodos y devuelve el valor del objeto empleado
    @Override
    public String toString(){
        return String.format("%s%s\nNumero de seguro social:  %s",obtenerPrimerNombre(),obtenerApellidoPaterno(),obtenerNumeroSeguroSocial());
    }
    // se crea metodo abstracto sobreescrito por la clase hija (subclase)
    public abstract double ingresos(); // aqui no hay implementacion, solo es la invocacion
    
    /* codigo referente uso de JFrame 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }  */
    
}
