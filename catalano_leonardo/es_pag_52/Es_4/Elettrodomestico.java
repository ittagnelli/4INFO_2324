public class Elettrodomestico {
    private String marca;
    private String modello;

    public Elettrodomestico(String marca, String modello) {
        this.marca = marca;
        this.modello = modello;
    }
    public String getMarca() {
        return marca;
    }

    public String getModello() {
        return modello;
    }

    public void accendi() {
        System.out.println("accendi: " + marca + " " + modello);
    }

    public void spegni() {
        System.out.println("spegni: " + marca + " " + modello);
    }
}
