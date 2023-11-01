public class Cellulare extends Elettrodomestico {
    String modello;

    public Cellulare(String marca, String modello) {
        marca = marca;
        modello = modello;
    }

    public void chiama(String numero) {
        System.out.println("Sto chiamando il numero " + numero);
    }

    public void inviaMessaggio(String destinatario, String messaggio) {
        System.out.println("Sto inviando un messaggio a " + destinatario + ": " + messaggio);
    }
}
