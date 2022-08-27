public class Multiplicacion extends Operaciones {

    public int Multi;

    public Multiplicacion(int n1, int n2) {
        super(n1, n2, '*');
        this.Multi = n1 * n2;
        this.setResultado(this.Multi);
    }
}
