/*
se hace una sobrecarga de metodos
 */

/**
 *
 * @author alext
 */
public class Articulos {
    String nombre;
    int cantidad;
    int precio;

Articulos(String nom,int cant, int pre){
    nombre =nom;
    cantidad = cant;
    precio = pre;
}
Articulos(String  nom1, int costo){
    nombre = nom1;
    precio = costo;
    cantidad = precio/10;
}
public void imprimir(){
    System.out.println("El nombre del producto es: "+nombre);
    System.out.println("La cantidad es: "+cantidad);
    System.out.println("El precio es: "+precio);

}
    
}
