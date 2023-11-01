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
