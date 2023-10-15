package compito3.es_5;

public class CityCar extends Automobile {
    private int velocita;

    public CityCar(String marca, String modello, int anno, int porte, int veloce) {
        super(marca, modello, anno, porte);
        veloce = velocita;
    }

    public void dettagli(String marca, String modello, int anno, int porte, int veloce) {
        System.out.println("la macchina e' della: " + marca + "\nil modello e': " + modello + "\nl'anno di produzione e': " + anno + "\nha il seguente numero di porte: " + porte + "\ned una velocita' massima di: " + veloce);
    }
}
