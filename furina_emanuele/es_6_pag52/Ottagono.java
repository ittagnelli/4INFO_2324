public class Ottagono extends FiguraGeometrica {
    private double lato;

    public Ottagono(double lato) {
        this.lato = lato;
    }

    @Override
    public double calcolaArea() {
        return 2 * lato * lato * (1 + Math.sqrt(2));
    }

    @Override
    public double calcolaPerimetro() {
        return 8 * lato;
    }
}