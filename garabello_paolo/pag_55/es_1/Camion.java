public class Camion extends Auto{
    private int nRuote;
    Camion(){};
    Camion(String marca, String modello, int anno, int nRuote){
        super(marca, modello, anno);
        this.nRuote = nRuote;
    }
    public void setnRuote(int nRuote) {
        this.nRuote = nRuote;
    }

    public int getnRuote() {
        return nRuote;
    }

    @Override
    public String toString(){
        return "marca: " + this.getMarca() + " modello: " + this.getModello() + " anno di immatricolazione: " + this.getAnno() + " numero di ruote: " + nRuote;
    }
}
