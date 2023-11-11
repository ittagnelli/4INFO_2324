public class Nonalimentare extends Prodotto {
    private String materiale;

    Nonalimentare(String m, int c, String d, float p) {
        super(c, d, p);
        materiale = m;
    }

    public void scontoMateriale(String m) {
        if(materiale == m) {
            prezzo = prezzo - (prezzo * 10 / 100);
            setPrezzo(prezzo);
        }
    }
}
