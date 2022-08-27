/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit 
this template
 */

/**
 *
 * @author alext
 */
public class AbstractMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /*    //se instancia y crea objeto "resultados"
        Operaciones resultados = new Operaciones();
        System.out.println("La suma es:" +resultados.Suma(10,5));
        System.out.println("La resta es:" +resultados.Resta(10,5));
        System.out.println("La multiplicacion es:" +resultados.Multiplicacion(10,5));
        System.out.println("La division es:" +resultados.Division(10,5));
    */
    //se instancian objetos para hacer uso de la clase Sistemas
    
    Sistemas tipo1 = new Sistemas();
    tipo1.setTipo("Decimal");
    tipo1.setTipo("Romano");
    tipo1.setTipo("Arabigo");
    
    System.out.println("El sistema numerico se ha utilizado: "+tipo1.getnumVeces()+" Veces");
    
    }
    
}
