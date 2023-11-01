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

public class AutoMezzo extends Auto {
    private int numeroPasseggeri;

    public AutoMezzo(String marca, String modello, String targa, int annoImmatricolazione, int numeroPasseggeri) {
        super(marca, modello, targa, annoImmatricolazione);
        this.numeroPasseggeri = numeroPasseggeri;
    }

    public int getNumeroPasseggeri() {
        return numeroPasseggeri;
    }

    @Override
    public void stampa() {
        super.stampa();
        System.out.println("Numero di passeggeri: " + numeroPasseggeri);
    }
}

public class Camion extends Auto {
    private double capacitaCarico;

    public Camion(String marca, String modello, String targa, int annoImmatricolazione, double capacitaCarico) {
        super(marca, modello, targa, annoImmatricolazione);
        this.capacitaCarico = capacitaCarico;
    }

    public double getCapacitaCarico() {
        return capacitaCarico;
    }

    @Override
    public void stampa() {
        super.stampa();
        System.out.println("Capacità di carico: " + capacitaCarico + " tonnellate");
    }
}
