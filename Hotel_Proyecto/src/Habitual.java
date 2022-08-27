public class Habitual extends Cliente {

    private float descuentos;
    
    public Habitual (String nombreC,String direccion,long telefono, float descuentos){
        super(nombreC,direccion,telefono);
        this.descuentos = descuentos;
    }
    
    
}
