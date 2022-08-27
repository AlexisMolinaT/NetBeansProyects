public class Cliente {

    public String nombreC;

    public String direccion;

    public long telefono;
    
    
    public Cliente (String nombreC, String direccion, long telefono){
        this.nombreC = nombreC;
        this.direccion = direccion;
        this.telefono = telefono;
        

    }
    
    public String getNomnbreC(){
        return nombreC;
    }
    
    public String getDireccion(){
        return direccion;
    }
    
    public long getTelefono(){
        return telefono;
    }
    
    //este sout es para que nos muestre el nombre de nuestro cliente
    public void MostrarCliente(){
        System.out.println("Nombre del cliente: "+nombreC);
    }
    
  
}
