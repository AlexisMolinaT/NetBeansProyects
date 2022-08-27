public class Hotel {

    public String nombre;

    public int estrellas;
    
    public Hotel (String nombre, int estrellas){
        this.nombre = nombre;
        this.estrellas = estrellas;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getEstrellas(){
        return estrellas;
    }
    
    public void MostrarNombre(){
    // este sout es para que en la consola aparezca el nombre del hotel y las estrellas que este tiene
        System.out.println("Nombre del hotel: "+nombre+" Numero de estrellas: "+estrellas);
    }
}
