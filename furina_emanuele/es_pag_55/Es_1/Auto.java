public class Auto {
    private String marca;
    private String modello;
    private String targa;
    private int annoImmatricolazione;

    public Auto(String marca, String modello, String targa, int annoImmatricolazione) {
        this.marca = marca;
        this.modello = modello;
        this.targa = targa;
        this.annoImmatricolazione = annoImmatricolazione;
    }

    public String getMarca() {
        return marca;
    }

    public String getModello() {
        return modello;
    }

    public String getTarga() {
        return targa;
    }

    public int getAnnoImmatricolazione() {
        return annoImmatricolazione;
    }

    public void stampa() {
        System.out.println("Auto: " + marca + " " + modello + " (" + targa + "), Anno di immatricolazione: " + annoImmatricolazione);
    }
}