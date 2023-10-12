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

public class Main {
    public static void main(String[] args) {
        Frazione frazione1 = new Frazione(2, 2);
        Frazione frazione2 = new Frazione(2, 2);

        System.out.println("Frazione 1:");
        frazione1.stampa();

        System.out.println("\nFrazione 2:");
        frazione2.stampa();

        Frazione somma = frazione1.somma(frazione2);
        Frazione differenza = frazione1.differenza(frazione2);
        Frazione prodotto = frazione1.prodotto(frazione2);

        System.out.println("\nSomma:");
        somma.stampa();

        System.out.println("\nDifferenza:");
        differenza.stampa();

        System.out.println("\nProdotto:");
        prodotto.stampa();
    }
}
