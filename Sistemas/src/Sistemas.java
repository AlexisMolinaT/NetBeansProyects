/*
se crea javaclass para implementar metodo
 */

/**
 *
 * @author alext
 */
public class Sistemas {
    // declaracion de variables
    private String Tipo;
    private int numVeces=0;
    
    public String getTipo(){
        return Tipo;
    }
    
    public void setTipo(String Tipo){
        if("Decimal".equals(Tipo)||"Octal".equals(Tipo)||"Binario".equals(Tipo)){
        // se usa this para referirse a la variables de instancia de la clase
        this.Tipo=Tipo;
        numVeces++;
    }else{
            System.out.println("Sistema numerico NO disponible");
        }
    }
    
    public int getnumVeces(){
        return numVeces;
    }
    
    
    
    
}
