class Artista {
    String nome;

    public Artista(String nome) {
        this.nome = nome;
    }

    public void esibizione() {
        System.out.println(nome + " si esibisce.");
    }
}

class Cantante extends Artista {
    public Cantante(String nome) {
        super(nome);
    }

    public void canta() {
        System.out.println(nome + " canta una canzone.");
    }
}

class Musicista extends Artista {
    public Musicista(String nome) {
        super(nome);
    }

    public void suonaStrumento() {
        System.out.println(nome + " suona uno strumento.");
    }
}

class Compositore extends Artista {
    public Compositore(String nome) {
        super(nome);
    }

    public void componeMusica() {
        System.out.println(nome + " compone musica.");
    }
}

public class TestCantante {
    public static void main(String[] args) {
        Cantante cantante = new Cantante("Alice");
        Musicista musicista = new Musicista("Bob");
        Compositore compositore = new Compositore("Charlie");

        cantante.esibizione();
        cantante.canta();

        musicista.esibizione();
        musicista.suonaStrumento();

        compositore.esibizione();
        compositore.componeMusica();
    }
}
