class Ottagono extends Geometria {
    private double lato;

    public Ottagono(double lato) {
        this.lato = lato;
    }

    @Override
    double calcolaArea() {
        return 2 * Math.pow(lato, 2) * (1 + Math.sqrt(2));
    }

    @Override
    double calcolaPerimetro() {
        return 8 * lato;
    }
}
