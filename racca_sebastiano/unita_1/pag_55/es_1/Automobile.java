public class Automobile {
    private String marca;
    private String modello;
    private String targa;
    private int immatricolazione;

    Automobile(String marca, String modello, String targa, int immatricolazione) {
        this.marca = marca;
        this.modello = modello;
        this.targa = targa;
        this.immatricolazione = immatricolazione;
    }

    public String toString() {
        return "Modello: " + modello + "\nMarca: " + marca + "\nTarga: " + targa + "Anno d'immatricolazione: " + immatricolazione;
    }
}