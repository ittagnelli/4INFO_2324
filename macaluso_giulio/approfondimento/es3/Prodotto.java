public class Prodotto {
    private int codice;
    private String descrizione;
    protected float prezzo;

    Prodotto(int c, String d, float p) {
        codice = c;
        descrizione = d;
        prezzo = p;
    }

    public void setPrezzo(float p) {
        prezzo = p;
    }

    public void scontoTessera(String tessera) {
        if(tessera == "si") {
            prezzo = prezzo - (prezzo * 5 / 100);
            setPrezzo(prezzo);
        }
    }

    public void stampa() {
        System.out.println("Codice: " + codice);
        System.out.println("Descrizione: " + descrizione);
        System.out.println("Prezzo: " + prezzo);
    }
}
