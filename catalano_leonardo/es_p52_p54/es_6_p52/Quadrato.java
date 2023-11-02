class Quadrato extends Geometria {
    private double lato;

    public Quadrato(double lato) {
        this.lato = lato;
    }

    @Override
    double calcolaArea() {
        return Math.pow(lato, 2);
    }

    @Override
    double calcolaPerimetro() {
        return 4 * lato;
    }
}