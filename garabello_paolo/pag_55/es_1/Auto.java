public class Auto {
    private String marca;
    private String modello;
    private int anno;

    Auto(){}

    Auto(String marca, String modello, int anno){
        this.anno = anno;
        this.modello = modello;
        this.marca = marca;
    }

    public int getAnno() {
        return anno;
    }

    public String getMarca() {
        return marca;
    }

    public String getModello() {
        return modello;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public void setMarcha(String marca) {
        this.marca = marca;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    @Override
    public String toString(){
        return "marca: " + marca + " modello: " + modello + " anno di immatricolazione: " + anno;
    }
}
