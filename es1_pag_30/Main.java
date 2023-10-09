public class Main {
    public static void main(String[] args) {
        Frazione frazione1 = new Frazione(1, 2);
        Frazione frazione2 = new Frazione(3, 4);

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
