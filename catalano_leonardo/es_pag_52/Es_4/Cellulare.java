public class Cellulare extends Elettrodomestico {
    private String sistemaoperativo;

    public Cellulare(String marca, String modello, String sistemaoperativo) {
        super(marca, modello);
        this.sistemaoperativo = sistemaoperativo;
    }

    public void chiamare() {
        System.out.println("chiamata con il cellulare: " + getMarca() + " " + getModello());
    }

    public void inviareMessaggio() {
        System.out.println(" messaggio con il cellulare: " + getMarca() + " " + getModello());
    }
}
