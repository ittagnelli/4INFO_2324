class Rettangolo extends Geometria {
    private double base;
    private double altezza;

    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    double calcolaArea() {
        return base * altezza;
    }

    @Override
    double calcolaPerimetro() {
        return 2 * (base + altezza);
    }
}