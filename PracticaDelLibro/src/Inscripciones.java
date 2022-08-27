public enum Inscripciones {

    ORDINARIAS(300,600), EXTEMPORANEAS(100,200);
    
    private int InsMin;
    private int InsMax;

    private Inscripciones(int InsMin, int InsMax) {
        this.InsMin = InsMin;
        this.InsMax = InsMax;
    }

    @Override
    public String toString() {
        return "Tipo Inscripcion{" + "InsMin=" + InsMin + ", InsMax=" + InsMax + '}';
    }
    
    
}
