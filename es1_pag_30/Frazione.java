public class Frazione {
    private int numeratore;
    private int denominatore;

    public Frazione(int numeratore, int denominatore) {
        numeratore = numeratore;
        denominatore = denominatore;
    }

    public void stampa() {
        System.out.println(numeratore + "/" + denominatore);
    }

    public Frazione somma(Frazione altra) {
        int nuovoDenominatore = denominatore * altra.denominatore;
        int nuovoNumeratore = (numeratore * altra.denominatore) + (altra.numeratore * denominatore);
        return new Frazione(nuovoNumeratore, nuovoDenominatore);
    }

    public Frazione differenza(Frazione altra) {
        int nuovoDenominatore = denominatore * altra.denominatore;
        int nuovoNumeratore = (numeratore * altra.denominatore) - (altra.numeratore * denominatore);
        return new Frazione(nuovoNumeratore, nuovoDenominatore);
    }

    public Frazione prodotto(Frazione altra) {
        int nuovoNumeratore = numeratore * altra.numeratore;
        int nuovoDenominatore = denominatore * altra.denominatore;
        return new Frazione(nuovoNumeratore, nuovoDenominatore);
    }
}
