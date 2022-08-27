/*
 Se corre desde este main class java class Empleado por comision ACT. 1
 Aqui se corre la ACT.2
Aqui se corre la ACT.3
 */

/**
 *
 * @author alext
 */
public class PruebaEmpleadoComision {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //se instancia objeto para mostrar los valores de empleado por comision y empleado base mas comision
        EmpleadoPorComision empleado = new EmpleadoPorComision("Alexis ","Molina","abc-123",3500,.05);
        EmpleadoBaseMasComision empleado1 = new EmpleadoBaseMasComision("Ricardo ","Terrazas","abb-233",4000,0.9,2500);
        
        //valores para empleado por comision
        System.out.println("Informacion del empleado POR COMISION por medio de los metodos establecer");
        System.out.printf("%s%s\n","El primer nombre es: ",empleado.obtenerPrimerNombre());
        System.out.printf("%s%s\n","El apellido paterno es: ",empleado.obtenerApellidoPaterno());
        System.out.printf("%s%s\n","El primer nombre es: ",empleado.obtenerPrimerNombre());
        System.out.printf("%s%s\n","El numero de seguro social es: ",empleado.obtenerNumeroSeguroSocial());
        System.out.printf("%s%s\n","Las ventas brutas son: ",empleado.obetenerVentasBrutas());
        System.out.printf("%s%s\n","La tarifa de comision es: ",empleado.obtenerTarifaComision());
                
        //valores paar empleado base mas comision
        System.out.println("Informacion del empleado BASE MAS COMISION por medio de los metodos establecer");
        System.out.printf("%s%s\n","El primer nombre es: ",empleado1.primerNombre);
        System.out.printf("%s%s\n","El apellido paterno es: ",empleado1.apellidoPaterno);
        System.out.printf("%s%s\n","El primer nombre es: ",empleado1.primerNombre);
        System.out.printf("%s%s\n","El numero de seguro social es: ",empleado1.numeroSeguroSocial);
        System.out.printf("%s%s\n","Las ventas brutas son: ",empleado1.ventasBrutas);
        System.out.printf("%s%s\n","La tarifa de comision es: ",empleado1.tarifaComision);
        System.out.printf("%s%s\n","El salario base es: ",empleado1.ObtenerSalarioBase());
        
        //valores para empleado base
        empleado1.establecerSalarioBase(5000);
        System.out.printf("\n%s:\n\n%s\n","Informacion actualizada del empleado BASE la cual se obtuvo por medio del metodo toString",empleado1.toString());

        //valores para empleado por comision
        empleado.establecerVentasBrutas(500);
        empleado.establecerTarifaComision(.5);
        System.out.printf("\n%s:\n\n%s\n","Informacion actualizada del empleado la cual se obtuvo por medio del metodo toString",empleado);
    
        //se asignan valores para acceder a java class Articulos
        System.out.println("\n-------Datos del producto-------");
        Articulos art = new Articulos ("Zucaritas",2,50);
        art.imprimir();
        
        //se instancian objetos y argumentos o valores para usar java class Usuarios
        PruebaEmpleadoComision lista = new PruebaEmpleadoComision();
        Usuarios usr1,usr2;
        //se utiliza el cosntructor por omision
        usr1 = new Usuarios();
        lista.imprimirUsuario(usr1);
        
        //se utiliza el segundo constructor desarrollado en llava class Usuarios
        usr2 = new Usuarios("Alexis",19,"Sector independencia #804");
        lista.imprimirUsuario(usr2);
        
        //se utiliza al tercer constructor parametrizado
        usr1 = new Usuarios(usr2);
        usr1.setEdad(55);
        usr2.setEdad(30.44f);
        
        //se imprime informacion
        lista.imprimirUsuario(usr1);
        lista.imprimirUsuario(usr2);

        
    }
    //metodo imprimir usuario
    public void imprimirUsuario(Usuarios usr){
        System.out.println("\n Nombre: "+usr.nombre);
        System.out.println("Edad: "+usr.getEdad());
        System.out.println("La direccion es: "+usr.getDireccion()+"\n");
    }
}
