class Elettrodomestico {
    String nome;

    public Elettrodomestico(String nome) {
        this.nome = nome;
    }

    public void accendi() {
        System.out.println(nome + " è acceso.");
    }
}

class Cellulare extends Elettrodomestico {
    public Cellulare(String nome) {
        super(nome);
    }

    public void effettuaChiamata() {
        System.out.println(nome + " effettua una chiamata.");
    }
}

public class TestCellulare {
    public static void main(String[] args) {
        Cellulare cellulare = new Cellulare("iPhone 13");
        cellulare.accendi();
        cellulare.effettuaChiamata();
    }
}
