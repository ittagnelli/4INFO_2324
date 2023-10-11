import java.util.Scanner;

class Frazione {
    private int numeratore;
    private int denominatore;

    public Frazione(int numeratore, int denominatore) {
        this.numeratore = numeratore;
        if (denominatore != 0) {
            this.denominatore = denominatore;
        } else {
            throw new IllegalArgumentException("Il denominatore non può essere zero.");
        }
    }

    public Frazione somma(Frazione altraFrazione) {
        int nuovoDenominatore = this.denominatore * altraFrazione.denominatore;
        int nuovoNumeratore = (this.numeratore * altraFrazione.denominatore) + (altraFrazione.numeratore * this.denominatore);
        return new Frazione(nuovoNumeratore, nuovoDenominatore);
    }

    public Frazione differenza(Frazione altraFrazione) {
        int nuovoDenominatore = this.denominatore * altraFrazione.denominatore;
        int nuovoNumeratore = (this.numeratore * altraFrazione.denominatore) - (altraFrazione.numeratore * this.denominatore);
        return new Frazione(nuovoNumeratore, nuovoDenominatore);
    }

    public Frazione prodotto(Frazione altraFrazione) {
        int nuovoNumeratore = this.numeratore * altraFrazione.numeratore;
        int nuovoDenominatore = this.denominatore * altraFrazione.denominatore;
        return new Frazione(nuovoNumeratore, nuovoDenominatore);
    }

    public String toString() {
        return numeratore + "/" + denominatore;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il numeratore della prima frazione: ");
        int numeratore1 = scanner.nextInt();
        System.out.print("Inserisci il denominatore della prima frazione: ");
        int denominatore1 = scanner.nextInt();

        System.out.print("Inserisci il numeratore della seconda frazione: ");
        int numeratore2 = scanner.nextInt();
        System.out.print("Inserisci il denominatore della seconda frazione: ");
        int denominatore2 = scanner.nextInt();

        Frazione frazione1 = new Frazione(numeratore1, denominatore1);
        Frazione frazione2 = new Frazione(numeratore2, denominatore2);

        System.out.println("Frazione 1: " + frazione1);
        System.out.println("Frazione 2: " + frazione2);

        Frazione somma = frazione1.somma(frazione2);
        Frazione differenza = frazione1.differenza(frazione2);
        Frazione prodotto = frazione1.prodotto(frazione2);

        System.out.println("Somma: " + somma);
        System.out.println("Differenza: " + differenza);
        System.out.println("Prodotto: " + prodotto);

        scanner.close();
    }
}
