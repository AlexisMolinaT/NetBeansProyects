/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package U3;

/**
 *
 * @author alext
 */
public class Valores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //se crea y se define el objeto
        Valores result = new Valores();
        result.intDiv(16, 3);

    }

    //se crea el metodo  intDiv()
    int intDiv(int m, int n) {
        //se imprimen valor de m y n
        System.out.println("m: "+m+"n: "+n);
        int x = m;
        int y = 0;
        while (x >= n) {
            x = x - n;
            y = y + 1;
            
            System.out.println("x: "+x+"y: "+y);
            System.out.println((y*n+x==m)+"in lopp"+y);
            
        }
        System.out.println((x<n)+"out of loop");
        return y;
    }

}
   
