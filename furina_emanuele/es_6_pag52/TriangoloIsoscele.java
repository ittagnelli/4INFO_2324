
public class TriangoloIsoscele extends FiguraGeometrica {
    private double base;
    private double lato;

    public TriangoloIsoscele(double base, double lato) {
        this.base = base;
        this.lato = lato;
    }

    @Override
    public double calcolaArea() {
        return (base * lato) / 2;
    }

    @Override
    public double calcolaPerimetro() {
        return 2 * lato + base;
    }
}