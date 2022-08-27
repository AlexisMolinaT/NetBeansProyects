/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author alext
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // se crean objetos con sus resoectivos valores
        
        Sencilla sen = new Sencilla(2,(float)1500,true);
        
        Doble dob = new Doble (2,(float)2500,true,false);
        
        Suit sui = new Suit (4,(float)3800,true,false,true);
        
        Cliente cl = new Cliente ("Checo Perez","Industrias 744",1453232);
        
        Reserva re = new Reserva ("el 2 de marzo de 2022",8,"el 10 de marzo de 2022");
        
        Esporadico esp = new Esporadico ("Ricardo Molina","Calle luis potosi 513",1491516,true);
        
        Habitual hab = new Habitual ("Alexis Molina","Calle felipe 513",1487575,(float)0.36);
        
        Hotel hot = new Hotel ("UWU el hotel ",5);
        
        //se muestra el nombre del hotel y del cliente
        hot.MostrarNombre();
        cl.MostrarCliente();
        
        //se muetsran todos los datos de la reservacion
        System.out.println("Datos de la reservacion: num de la reservacion 455");
        cl.MostrarCliente();
        re.Reserva();
        sui.mostrarS();
        
        //se coloca un ultimo sout para escrbir "Disfrute su instancia (iniciales del cliente)
        System.out.println("DISFRUTE SU INSTANCIA Mr.CP");
        
    }
    
    
    
}
