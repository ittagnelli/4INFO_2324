public class NonAlimentare extends Prodotto {
    private String materiale;
    private static String[] materiale_array = {"plastica", "carta", "vetro"};

    public NonAlimentare(String materiale, int codice, String descrizione, float prezzo) {
        super(codice, descrizione, prezzo);
        this.materiale = materiale;
    }

    @Override
    public void calcolaSconto(int index) {
        if(this.materiale == materiale_array[index]) {
            setPrezzo(prezzo - (prezzo * 10 / 100));
        }
    }
}