public class Montacarichi {
    private int partenza;
    private int arrivo;

    public Montacarichi(int p, int a) {
        partenza = p;
        arrivo = a;
    }
    
    public int spostamento() {
        return arrivo;
    }

    public void stampa() {
        System.out.println("arrivo: " + arrivo);
    }
}
