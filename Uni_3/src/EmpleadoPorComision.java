//Actividad 1 de unidad 3
public class EmpleadoPorComision extends Object {

    //private String primerNombre;  (SIN HERENCIA)
    protected String primerNombre;

    //private String apellidoPaterno; (SH)
    protected String apellidoPaterno;

    //private String numeroSeguroSocial; (SH)
    protected String numeroSeguroSocial;

    //private double ventasBrutas; (SH)
    protected double ventasBrutas;

    //private double tarifaComision; (SH)
    protected double tarifaComision;

    public EmpleadoPorComision(String nombre, String apellido, String nss, double ventas, double tarifa) {
        primerNombre = nombre;
        apellidoPaterno = apellido;
        numeroSeguroSocial = nss;
        establecerVentasBrutas(ventas);
        establecerTarifaComision(tarifa);
    }

    public void establecerPrimerNombre(String nombre) {
        primerNombre = nombre;
    }

    public String obtenerPrimerNombre() {
        return primerNombre;
    }

    public void establecerApellidoPaterno(String apellido) {
        apellidoPaterno = apellido;
    }

    public String obtenerApellidoPaterno() {
        return apellidoPaterno;
    }

    public void establecerNumeroSeguroSocial(String nss) {
        numeroSeguroSocial = nss;
    }

    public String obtenerNumeroSeguroSocial() {
        return numeroSeguroSocial;
    }

    public void establecerVentasBrutas(double ventas) {
        if (ventas >= 0.0)
            ventasBrutas = ventas;
        else
            throw new IllegalArgumentException("Las ventas brutas deben ser mayor o igual a 0.0");
    }

    public double obetenerVentasBrutas() {
        return ventasBrutas;
    }

    public void establecerTarifaComision(double tarifa) {
        if (tarifa > 0.0 && tarifa < 1.0)
            tarifaComision = tarifa;
        else
            throw new IllegalArgumentException("La tarifa debe ser mayor a 0.0 y menor a 1.0");
    }

    public double obtenerTarifaComision() {
        return tarifaComision;
    }

    public double ingresos() {
        return tarifaComision = ventasBrutas;
    }

    @Override
    public String toString() {
        return String.format("%s: %s%s\n%s: %s\n%s: %.2f\n%s: 5.2f", "empleado por comision", primerNombre, apellidoPaterno, "numero de seguro social", numeroSeguroSocial, "ventas brutas", ventasBrutas, "tarifa de comision", tarifaComision);
    }
}
