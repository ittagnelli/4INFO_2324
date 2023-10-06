public class ProvaFrazione {
    public static void main(String[] args) {
        Frazione fraz = new Frazione(40, 20);
        System.out.println("La prima frazione è di: "+fraz.getValue());
        Frazione fraz2 = new Frazione(80, 10);
        System.out.println("La seconda frazione è di: "+fraz2.getValue());
        
        System.out.println("Il risultato della somma delle due frazioni è di: "+(fraz.getValue() + fraz2.getValue()));
        System.out.println("Il risultato della differenza delle due frazioni è di: "+(fraz.getValue() - fraz2.getValue()));
        System.out.println("Il risultato del prodotto delle due frazioni è di: "+(fraz.getValue() * fraz2.getValue()));
    }

}
