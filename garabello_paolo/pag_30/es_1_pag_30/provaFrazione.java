public class provaFrazione {
    public static void main(String[] args){
        Frazione f1 = new Frazione(25, 10);
        Frazione f2 = new Frazione(5, 25);
        System.out.println("somma = " + f1.somma(f2) + "\n");
        System.out.println("sottrazione = " + f1.sottrazione(f2) + "\n");
        System.out.println("moltiplicazione = " + f1.moltiplicazione(f2) + "\n");
    }
}
