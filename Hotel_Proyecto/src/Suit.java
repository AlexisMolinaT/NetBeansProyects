public class Suit extends Habitacion {

    public boolean banera;

    public boolean sauna;

    public boolean mirador;
    
     public Suit (int NumCama, float tarifa,boolean banera, boolean sauna, boolean mirador){
        super (NumCama,tarifa);
        this.banera = banera;
        this.sauna = sauna;
        this.mirador = mirador;
        
    }
     //este sout es para que en la consola aparezca que clase de habitacion tomo y su costo por noche 
     public void mostrarS(){
         System.out.println("Habitacion: SUIT, costo $"+tarifa+" por noche");
     }
}
