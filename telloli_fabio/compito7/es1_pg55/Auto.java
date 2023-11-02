package es1_pg55;

public class Auto {
    private String marca;
    private String modello;
    private String targa;
    private int anno;

    public Auto(String marca, String modello, String targa, int anno) {
        this.marca = marca;
        this.modello = modello;
        this.targa = targa;
        this.anno = anno;
    }

    public void Stampa() {
        System.out.println("\nla marca è: " + marca);
        System.out.println("il modello è: " + modello);
        System.out.println("la targa è: " + targa);
        System.out.println("l'anno di immatricolazione è: " + anno);
    }
}
