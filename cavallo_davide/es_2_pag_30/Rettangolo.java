public class Rettangolo {
    private double lunghezza;
    private double larghezza;

    public Rettangolo(double lunghezza, double larghezza) {
        setLunghezza(lunghezza);
        setLarghezza(larghezza);
    }

    public double calcolaArea() {
        return lunghezza * larghezza;
    }

    public double calcolaPerimetro() {
        return 2 * (lunghezza + larghezza);
    }

    public void setLunghezza(double nuovaLunghezza) {
        if (nuovaLunghezza > 0) {
            lunghezza = nuovaLunghezza;
        } else {
            System.out.println("La lunghezza deve essere un valore positivo.");
        }
    }

    public void setLarghezza(double nuovaLarghezza) {
        if (nuovaLarghezza > 0) {
            larghezza = nuovaLarghezza;
        } else {
            System.out.println("La larghezza deve essere un valore positivo.");
        }
    }

    public double getLunghezza() {
        return lunghezza;
    }

    public double getLarghezza() {
        return larghezza;
    }
}
