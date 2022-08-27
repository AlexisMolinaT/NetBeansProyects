// se toma como clase hija
// los atributos private de la super clase o clase padre NO se pueden utilizar en una subclase
public class EmpleadoBaseMasComision extends EmpleadoPorComision{

   /* private String primerNombre;

    private String apellidoPaterno;

    private String numeroSeguroSocial;

    private double ventasBrutas;

    private double tarifaComision;
*/
    private double salarioBase;

    public EmpleadoBaseMasComision(String nombre, String apellido, String nss, double ventas, double tarifa, double salario) {
      //llamada al cosntructor de la clase empleado por comision       
        super (nombre, apellido, nss, ventas, tarifa); //se aplica herencia 

       /* primerNombre = nombre;
        apellidoPaterno = apellido;
        numeroSeguroSocial = nss;
        ventasBrutas = ventas;
        tarifaComision= tarifa;
         salarioBase = salario; */
       
      // se apliac herencia (se valida y almacena el salario base)
       establecerSalarioBase(salario);
        
    }
    //se comentan los demas metodos ya que se aplica herencia
    /*
    public void establecerPrimerNombre(String nombre){
        primerNombre = nombre;
    }
    public String ObtenerPrimerNombre(){
        return primerNombre;
    }
    public void establecerApellido(String apellido){
        apellidoPaterno = apellido;
    }
    public String ObtenerApellido(){
        return apellidoPaterno;
    }
    public void establecerNumeroSeguroSocial(String nss){
        numeroSeguroSocial = nss;
    }
    public String ObtenerNumeroSeguroSocial(){
        return numeroSeguroSocial;
    }
    public void establecerVentasBrutas(double ventas){
        if (ventas >= 0.0)
            ventasBrutas = ventas;
        else
            throw new IllegalArgumentException("Las ventas brutas deben ser mayor o igual a 0.0");
    }
    public double ObtenerVentasBrutas(){
        return ventasBrutas;
    }
    public void establecerTarifaComision(double tarifa){
        if (tarifa > 0.0 && tarifa < 1.0)
            tarifaComision = tarifa;
        else
            throw new IllegalArgumentException("La tarifa debe ser mayor a 0.0 y menor a 1.0");
    }
    public double ObtenerTarifaComision(){
        return tarifaComision;
    }
*/ //metodo normal
    
    public void establecerSalarioBase(double salario){
        if (salario >=0.0)
            salarioBase = salario;
        else
            throw new IllegalArgumentException("El salario base debe ser mayor a 0.0");
    }
    public double ObtenerSalarioBase(){
        return salarioBase;
    }
    
    @Override
    public double ingresos(){
        return salarioBase+(tarifaComision*ventasBrutas);
    }
    /*
    public double establecerIngresos(){
        return salarioBase+(tarifaComision*ventasBrutas);
    } 
    */
    @Override
    
    public String toString(){
       return String.format("%s: %s%s\n%s: %s\n%s: %.2f\n%s:%.2f", "empleado por comision con sueldo BASE", primerNombre, apellidoPaterno, "Numero de seguro social", numeroSeguroSocial, "Ventas brutas", ventasBrutas, "Tarifa de comision", tarifaComision, "Salario base", salarioBase);
        // return String.format("empleado por comision con sueldo BASE", primerNombre, apellidoPaterno, "Numero de seguro social", numeroSeguroSocial, "Ventas brutas", ventasBrutas, "Tarifa de comision", tarifaComision, "Salario base", salarioBase);

    }
        
}
       