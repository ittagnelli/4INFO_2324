package compito3.es_4;

public class Telefono extends Elettrodomestico {
    public Telefono(String marca) {
        super(marca);
    }

    public void chiamare(int numero) {
        System.out.println("\nsto chiamando il numero: " + numero + "con il telefono: " + getMarca());
    }

    public void scrivere(int numero, String mess) {
        System.out.println("\nsto scrivendo al numero: " + numero + "questo messaggio: " + mess + "con il telefono: " + getMarca());
    }
}
