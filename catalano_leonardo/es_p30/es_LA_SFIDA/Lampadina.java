public class Lampadina {
    private static final int SPENTA = 0;
    private static final int ACCESA = 1;
    public static final int ROTTA = 2;

    private int lampadinaStato;
    private int clickTotale;
    private int clickContatore;

    public Lampadina(int valoreContatore) {
        clickTotale = valoreContatore;
        lampadinaStato = SPENTA;
        clickContatore = 0;
    }

    public void click() {
        lampadinaStato = (lampadinaStato + 1) % 2;
        clickContatore++;

        if (clickContatore >= clickTotale) {
            lampadinaStato = ROTTA;
        }
    }

    public int getStato() {
        return lampadinaStato;
    }

    public String toString() {
        if (lampadinaStato == ACCESA) {
            return "accesa";
        } else if (lampadinaStato == SPENTA) {
            return "spenta";
        } else {
            return "rotta";
        }
    }
}
