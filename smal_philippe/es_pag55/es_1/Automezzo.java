public class Automezzo {
    protected String targa;
    protected String marca;
    protected String modello;
    protected int anno_immatricolazione;

    public Automezzo(String targa, String marca, String modello, int anno_immatricolazione) {
        this.anno_immatricolazione = anno_immatricolazione;
        this.marca = marca;
        this.modello = modello;
        this.targa = targa;
    }

    public String toString() {
        return "\n TARGA : " + targa +
                "\n MARCA : " + marca +
                "\n MODELLO : " + modello +
                "\n ANNO IMMATRICOLAZIONE : " + anno_immatricolazione;
    }
}
