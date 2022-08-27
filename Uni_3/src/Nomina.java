/*

 */

/**
 *
 * @author alext
 */
public class Nomina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // instanciar objetos 
        EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado("Alexis","Molina","123",350.0);
        EmpleadoPorHoras empleadoPorHoras = new EmpleadoPorHoras("Ricardo","Terrazas","234",55.5,40);
        EmpleadoPorComision empleadoPorComision = new EmpleadoPorComision("Valeria","Perez","687",1800,.08);
        EmpleadoBaseMasComision empleadoBaseMasComision = new EmpleadoBaseMasComision("Karely","Perez","890",3000,.04,500);
        
        System.out.println("----->Muestra informacion de empleados (sin polimorfismo)<----- ");
        System.out.printf("%s\n%s: $%,.2f\n\n", empleadoAsalariado,"Ingresos",empleadoAsalariado.ingresos());
        System.out.printf("%s\n%s: $%,.2f\n\n", empleadoPorHoras,"Ingresos",empleadoPorHoras.ingresos());
        System.out.printf("%s\n%s: $%,.2f\n\n", empleadoPorComision,"Ingresos",empleadoPorComision.ingresos());
        System.out.printf("%s\n%s: $%,.2f\n\n", empleadoBaseMasComision,"Ingresos",empleadoBaseMasComision.ingresos());

        //se crea arreglo tamaño 4, inicializar el arreglo con objeto empleado
        Empleado[]empleados = new Empleado[4]; //manejo de memoria estatica
        empleados[0]=empleadoAsalariado;
        empleados[1]=empleadoPorHoras;
        empleados[2]=empleadoPorComision;         //falta adaptar
        empleados[3]=empleadoBaseMasComision;     //falta adaptar
        
        System.out.println("----->Informacion de empleados aplicando PLIMORFISMO<-----");
        
        for(Empleado empleadoActual:empleados){
          System.out.println(empleadoActual); //invoca toString
        //determinatr si el elemento es un empeladoBaseMasComision
        if(empleadoActual instanceOf EmpleadoBaseMasComision){
        //conversion descendente de la referencia Empleado
        EmpleadoBaseMasComision empleado = (EmpleadoBaseMasComision)empleadoActual;
        empleado.establecerSalarioBase(1.10*empleado.ObtenerSalarioBase());
        System.out.printf("El nuevo salario base con incremento del 10%% es: $%,.2f\n",empleado.ObtenerSalarioBase());
        
        }
        
        System.out.printf("Los ingresos son por: $%,.2f",empleadoActual.ingresos());
                
    }
        //se obtiene el nombre del tipo en cada objeto en el arreglo de empleados
        for(int j=0;j<empleados.length;j++)
            System.out.printf("El empleado %d es un %s\n",j,empleados[j].getClass().getName());
    
}
}
