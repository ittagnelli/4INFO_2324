public class Auto extends Automezzo{
    private String colore;

    public Auto(String targa, String marca, String modello, int anno_immatricolazione, String colore) {
        super(targa, marca, modello, anno_immatricolazione);
        this.colore = colore;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCOLORE : " + colore;
    }
}