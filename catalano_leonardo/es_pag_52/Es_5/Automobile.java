public class Automobile extends MezzoDiTrasporto {
    private int numeroPorte;

    public Automobile(String marca, String modello, int numeroPorte) {
        super(marca, modello);
        this.numeroPorte = numeroPorte;
    }

    public int getNumeroPorte() {
        return numeroPorte;
    }

    public void setNumeroPorte(int numeroPorte) {
        this.numeroPorte = numeroPorte;
    }

    
}
