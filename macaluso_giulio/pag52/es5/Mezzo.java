public class Mezzo {
    private int ruote;
    private int porte;

    public void setRuote(int r) {
        ruote = r;
    }
    public void setPorte(int p) {
        porte = p;
    }
    public void stampa() {
        System.out.println("\nRuote: " + ruote);
        System.out.println("Porte: " + porte);
    }
}
