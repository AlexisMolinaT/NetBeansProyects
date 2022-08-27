public class Division extends Operaciones {

    public int div = 0;

    public Division(int n1, int n2) {
        super(n1, n2, '/');
        if (n2 == 0)
            System.err.println("No se puede dividir entre creo");
        else
            this.div = n1 / n2;
        this.setResultado(this.div);
    }
}
