public class Alimentare extends Prodotto {
    private int scadenza;
    private static int scadenza_sconto = 10;

    public Alimentare(int scadenza, int codice, String descrizione, float prezzo) {
        super(codice, descrizione, prezzo);
        this.scadenza = scadenza;
    }

    @Override
    public void calcolaSconto(int giorno) {
        if((scadenza - giorno) < scadenza_sconto) setPrezzo(prezzo - (prezzo * 20 / 100));
    }
}