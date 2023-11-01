package es6_pg52;

public class TriangoloIsoscele extends Poligono {
    protected double base;
    protected double altezza;

    public TriangoloIsoscele(double bas, double alt, double lunghezza) {
        super(3, lunghezza);
        bas = base;
        alt = altezza;
    }

    public double calcolaArea() {
        return (base * altezza) / 2;
    }
}
