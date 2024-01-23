package compito3.es_4;

public class Elettrodomestico {
    private String marca;

    public Elettrodomestico(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void accendi() {
        System.out.println("il " + marca + " è acceso");
    }

    public void spegni() {
        System.out.println("il " + marca + " è spento");
    }
}
