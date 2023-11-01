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