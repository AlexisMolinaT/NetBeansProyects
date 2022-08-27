/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author alext
 */

public class Aplicaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1=5;
        int n2=5;
        // instanciar clases
        Suma sumas = new Suma(n1,n2);
        sumas.mostrarResultado();
        
        Resta restas = new Resta(n1,n2);
        restas.mostrarResultado();
        
        Multiplicacion multi = new Multiplicacion(n1,n2);
        multi.mostrarResultado();
        
        Division div = new Division(n1,n2);
        div.mostrarResultado();
        
    }
    
}
