public class Doble extends Habitacion {

    public boolean camaMatrimonio;

    public boolean camaSencilla;
    
    public Doble (int NumCama, float tarifa,boolean camaMatrimonio,boolean camaSencilla){
        super (NumCama,tarifa);
        this.camaMatrimonio = camaMatrimonio;
        this.camaSencilla = camaSencilla;
        
    }
}
