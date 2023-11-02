public class automezzo {
    private double peso;
    private int cilindrata;
    public automezzo(double peso, int cilindrata){
        this.peso = peso;
        this.cilindrata = cilindrata;
    }   
    public int getCilindrata() {
        return cilindrata;
    }
    public double getPeso() {
        return peso;
    }
    @Override
    public String toString() {
        return "automezzo{peso: "+peso+", cilindrata: "+cilindrata+"}";
    }
}
