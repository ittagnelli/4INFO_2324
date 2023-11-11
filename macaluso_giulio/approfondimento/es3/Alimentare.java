public class Alimentare extends Prodotto {
    private int giorno;

    Alimentare(int g, int c, String d, float p) {
        super(c, d, p);
        giorno = g;
    }

    public void scontoScadenza(int g) {
        if((giorno - g) < 10) {
            prezzo = prezzo - (prezzo * 20 / 100);
            setPrezzo(prezzo);
        }
    }
}
