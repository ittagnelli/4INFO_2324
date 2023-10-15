class Elettrodomestico {
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
        System.out.println("L'elettrodomestico di marca " + marca + " e modello " + modello + " è stato acceso.");
    }

    public void spegni() {
        System.out.println("L'elettrodomestico di marca " + marca + " e modello " + modello + " è stato spento.");
    }
}

class TelefonoCellulare extends Elettrodomestico {
    private String numeroTelefono;

    public TelefonoCellulare(String marca, String modello, String numeroTelefono) {
        super(marca, modello);
        this.numeroTelefono = numeroTelefono;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void effettuaChiamata(String destinatario) {
        System.out.println("Il telefono cellulare di marca " + getMarca() + " e modello " + getModello() +
                " con numero " + numeroTelefono + " sta effettuando una chiamata a " + destinatario + ".");
    }

    public void inviaMessaggio(String destinatario, String messaggio) {
        System.out.println("Il telefono cellulare di marca " + getMarca() + " e modello " + getModello() +
                " con numero " + numeroTelefono + " ha inviato un messaggio a " + destinatario + ": " + messaggio);
    }
}

public class Main {
    public static void main(String[] args) {
        Elettrodomestico frigorifero = new Elettrodomestico("Samsung", "RF23M8570SG");
        TelefonoCellulare smartphone = new TelefonoCellulare("Apple", "iPhone 13", "+39 123 456 7890");

        frigorifero.accendi();
        frigorifero.spegni();

        smartphone.accendi();
        smartphone.effettuaChiamata("+39 987 654 3210");
        smartphone.inviaMessaggio("+39 987 654 3210", "Ciao");
        smartphone.spegni();
    }
}
