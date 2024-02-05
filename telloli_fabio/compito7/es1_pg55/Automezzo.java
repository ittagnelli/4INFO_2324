package es1_pg55;

public class Automezzo extends Auto {
    private int numeroPorte;

    public Automezzo(String marca, String modello, String targa, int anno, int numeroPorte) {
        super(marca, modello, targa, anno);
        this.numeroPorte = numeroPorte;
    }

    public void stampa() {
        super.Stampa();
        System.out.println("il numero di porte è: " + numeroPorte);
    }
}
