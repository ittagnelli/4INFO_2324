public class Elettrodomestico {
    String marca;

    public Elettrodomestico(String marca) {
        marca = marca;
    }

    public void accendi() {
        System.out.println("L'elettrodomestico è stato acceso.");
    }

    public void spegni() {
        System.out.println("L'elettrodomestico è stato spento.");
    }
}
