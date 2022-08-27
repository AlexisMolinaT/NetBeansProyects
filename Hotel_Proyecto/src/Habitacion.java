public class Habitacion {

    public int NumCama;

    public float tarifa;
    
    public Habitacion (int NumCama, float tarifa){
        this.NumCama = NumCama;
        this.tarifa = tarifa;
        

    }
    
    public int getNumCama(){
        return NumCama;
    }
    
    public float getTarifa(){
        return tarifa;
    }
    

}
