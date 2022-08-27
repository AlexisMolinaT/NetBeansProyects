public class Operaciones {

    public int n1;

    public int n2;

    public int resultado;

    private char operacion;

    public Operaciones(int n1, int n2, char operacion) {
        this.n1 = n1;
        this.n2 = n2;
        this.operacion = operacion;
    }

    public void mostrarResultado() {
        System.out.println(this.n1 + " " + this.operacion + " " + this.n2 + "=" + this.resultado);
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public char getOperacion() {
        return operacion;
    }

    public void setOperacion(char operacion) {
        this.operacion = operacion;
    }
}
