public class ProvaFrazione {
    public static void main(String[] args) {

        Frazione frazione1 = new Frazione(1, 2);
        Frazione frazione2 = new Frazione(3, 4);

        System.out.println("Frazione 1: " + frazione1);
        System.out.println("Frazione 2: " + frazione2);

        Frazione somma = frazione1.somma(frazione2);
        Frazione differenza = frazione1.sottrazione(frazione2);
        Frazione prodotto = frazione1.moltiplicazione(frazione2);

        System.out.println("somma: " + somma);
        System.out.println("differenza: " + differenza);
        System.out.println("prodotto: " + prodotto);
    }
}
