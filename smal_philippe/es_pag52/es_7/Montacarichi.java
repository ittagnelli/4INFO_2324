public class Montacarichi {
    protected int partenza;
    protected int arrivo;

    public Montacarichi(int partenza_enter, int arrivo_enter) {
        partenza = partenza_enter;
        arrivo = arrivo_enter;
    }

    public String toString() {
        return "arrivo : " + arrivo + "\npartenza : " + partenza;
    }
}