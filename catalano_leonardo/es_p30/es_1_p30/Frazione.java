public class Frazione {
    private int numeratore;
    private int denominatore;

    public Frazione(int numeratore, int denominatore) {
        this.numeratore = numeratore;
        this.denominatore = denominatore;
    }

    public void setNumeratore(int numeratore) {
        this.numeratore = numeratore;
    }

    public void setDenominatore(int denominatore) {
        this.denominatore = denominatore;
    }

    public String toString() {
        return "numeratore: " + numeratore + ", denominatore: " + denominatore;
    }

    public Frazione somma(Frazione f2) {
        return new Frazione(numeratore + f2.numeratore, denominatore + f2.denominatore);
    }

    public Frazione moltiplicazione(Frazione f2) {
        return new Frazione(numeratore * f2.numeratore, denominatore * f2.denominatore);
    }

    public Frazione sottrazione(Frazione f2) {
        return new Frazione(numeratore - f2.numeratore, denominatore - f2.denominatore);
    }
}
