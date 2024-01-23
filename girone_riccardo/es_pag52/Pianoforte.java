class StrumentoMusicale {
    String nome;

    public StrumentoMusicale(String nome) {
        this.nome = nome;
    }

    public void suona() {
        System.out.println(nome + " produce musica.");
    }
}

class Pianoforte extends StrumentoMusicale {
    public Pianoforte(String nome) {
        super(nome);
    }

    public void suonaTasti() {
        System.out.println(nome + " suona i tasti.");
    }
}

public class TestPianoforte {
    public static void main(String[] args) {
        Pianoforte pianoforte = new Pianoforte("Yamaha Grand");
        pianoforte.suona();
        pianoforte.suonaTasti();
    }
}
