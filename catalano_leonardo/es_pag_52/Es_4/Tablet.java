public class Tablet extends Elettrodomestico {
    private String sistemaoperativo;

    public Tablet(String marca, String modello, String sistemaoperativo) {
        super(marca, modello);
        this.sistemaoperativo = sistemaoperativo;
    }

    public void navigareInternet() {
        System.out.println("Sto navigando su Internet con il tablet: " + getMarca() + " " + getModello());
    }

    public void guardareVideo() {
        System.out.println("Sto guardando un video sul tablet: " + getMarca() + " " + getModello());
    }
}
