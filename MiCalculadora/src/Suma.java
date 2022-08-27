public class Suma extends Operaciones {

    public int suma;

    public Suma(int n1, int n2) {
        super(n1, n2, '+');
        this.suma=n1+n2;
        this.setResultado(this.suma);
    }
}
