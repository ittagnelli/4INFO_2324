public class frazione {
    private int numeratore;
    private int denominatore;
    private int den;
    private int num;
    
    public frazione() {
        numeratore = 0;
        denominatore = 0;
    }
    public void setNumeratore(int x) {
        numeratore = x;
    }
    public void setDenominatore(int x) {
        denominatore = x;
    }
    public int getNumeratore() {
        return numeratore;
    }
    public int getDenominatore() {
        return denominatore;
    }

    public void somma(int n1, int d1, int n2, int d2) {
        den = d1 * d2;
        num = (d2 * n1) + (d1 * n2);

        System.out.println("\nsomma\n" + num);
        System.out.print("" + den);
    }

    public void sottrazione(int n1, int d1, int n2, int d2) {
        den = d1 * d2;
        num = (d2 * n1) - (d1 * n2);

        System.out.println("\nsottrazione\n" + num);
        System.out.print("" + den);
    }

    public void prodotto(int n1, int d1, int n2, int d2) {
        num = n1 * n2;
        den = d1 * d2;

        System.out.println("\nprodotto\n" + num);
        System.out.print("" + den);
    }

    public void stampa() {
        System.out.println("\n" + numeratore);
        System.out.print("" + denominatore);
    }
}
