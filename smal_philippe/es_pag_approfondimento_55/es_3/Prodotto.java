public class Prodotto {
    private int codice;
    private String descrizione;
    protected float prezzo;

    public Prodotto(int codice, String descrizione, float prezzo) {
        this.codice = codice;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
    }

    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;
    }

    public void calcolaSconto(int tessera) {
        if(tessera == 1) setPrezzo((prezzo - (prezzo * 5 / 100)));
    }

    public String toString() {
        return "\n\n\nCodice: " + codice +
                "\nDescrizione: " + descrizione + 
                "\nPrezzo: " + prezzo;
    }
}