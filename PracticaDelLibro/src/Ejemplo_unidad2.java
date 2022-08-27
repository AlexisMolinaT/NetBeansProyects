/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alext
 */
public class Ejemplo_unidad2 {
    public static int mayor(int m, int n){
        if (m > n){
            return m;
        }
            return n;
     
    }
    public static void main (String [] args){
        int x, y, z;
        x = 3;
        y = 5;
        z = mayor (10 * x, 2 * y);
        System.out.println("El valor mayor es: "+z);
            
}
}