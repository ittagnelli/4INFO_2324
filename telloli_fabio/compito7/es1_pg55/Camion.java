package es1_pg55;

public class Camion extends Automezzo {
    private int carico;

    public Camion(String marca, String modello, String targa, int anno, int numeroPorte, int carico) {
        super(marca, modello, targa, anno, numeroPorte);
        this.carico = carico;
    }

    public void stampa() {
        super.stampa();
        System.out.println("la capacità del carico è: " + carico + "Kg");
    }
}
