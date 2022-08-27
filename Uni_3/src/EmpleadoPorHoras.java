/*
Hereda de EMPLEADO
 */

/**
 *
 * @author alext
 */
public class EmpleadoPorHoras extends Empleado{
    
    private double sueldo;
    private double horas;
    
    //se establece/crea constructor ahora con 5 parametros
    
    public EmpleadoPorHoras(String nombre, String apellido, String nss, double sueldoPorHoras,double horasTrabajadas){
        super(nombre,apellido,nss);
        //se instancian los metodos que se generan en esta java class
        establecerSueldo(sueldoPorHoras);
        establecerHoras(horasTrabajadas);
    }
    
    public void establecerSueldo(double sueldoPorHoras){
        if(sueldoPorHoras>=0.0)
            sueldo=sueldoPorHoras;
        else
            throw new IllegalArgumentException("El sueldo por horas debe ser mayor o igual a cero");
    }
    public double obtenerSueldo(){
        return sueldo;
    }
    public void establecerHoras(double horasTrabajadas){
        if(horasTrabajadas>=0.0&&(horasTrabajadas<=168.0))
            horas = horasTrabajadas;
            else
            throw new IllegalArgumentException("Las horas trabajas deben ser mayore o iguale a cero y menore o iguale a 168.0");
    }
    public double obtenerHoras(){
        return horas;
    }
    //completar o usar el Override
    @Override
    public double ingresos(){
        if (obtenerHoras()<=40)
            return obtenerSueldo()*obtenerHoras();
        else
            return 40*obtenerSueldo()+(obtenerHoras()-40)*obtenerSueldo()*1.5;
    }
    @Override
    public String toString(){
        return String.format("Empleado por horas: %s\n%s:  $5,.2f: %s: %,.2f",super.toString(),"Sueldo por hora: ",obtenerSueldo(),"Horas trabajadas: ",obtenerHoras());
    }

}
