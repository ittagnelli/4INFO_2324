public class Camion extends Automezzo{
    private int peso;

    public Camion(String targa, String marca, String modello, int anno_immatricolazione, int peso) {
        super(targa, marca, modello, anno_immatricolazione);
        this.peso = peso;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPESO : " + peso + " kg";
    }
}
