class TriangoloIsoscele extends Geometria {
    private double base;
    private double lato;

    public TriangoloIsoscele(double base, double lato) {
        this.base = base;
        this.lato = lato;
    }

    @Override
    double calcolaArea() {
        return 0.5 * base * Math.sqrt(Math.pow(lato, 2) - Math.pow(base / 2, 2));
    }

    @Override
    double calcolaPerimetro() {
        return 2 * lato + base;
    }
}
