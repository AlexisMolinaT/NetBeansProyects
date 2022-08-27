public class Reserva {

    public String fecha_inicio;

    public int dias;

    public String fecha_fin;
    
      public Reserva (String fecha_inicio, int dias, String fecha_fin){
        this.fecha_inicio = fecha_inicio;
        this.dias = dias;
        this.fecha_fin = fecha_fin;
        

    }
    
    public String getFecha_inicio(){
        return fecha_inicio;
    }
    
    public float getDias(){
        return dias;
    }
    
    public String getFecha_fin(){
        return fecha_fin;
    }
    
    //este sout es para que salga la fecha en que empieza la reservacion y la fecha en la que termina
    public void Reserva(){
        System.out.println("Ingresa "+fecha_inicio+" Y sale "+fecha_fin);
    }
}
