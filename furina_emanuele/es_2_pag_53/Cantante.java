class Artista {
    private String nome;
    private int eta;

    public Artista(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

    public String getNome() {
        return nome;
    }

    public int getEta() {
        return eta;
    }

    public void esegui() {
        System.out.println(nome + " sta eseguendo.");
    }
}

// Cantante è una specializzazione di Artista
class Cantante extends Artista {
    public Cantante(String nome, int eta) {
        super(nome, eta);
    }

    public void canta() {
        System.out.println(getNome() + " sta cantando.");
    }
}

class Musicista extends Artista {
    public Musicista(String nome, int eta) {
        super(nome, eta);
    }

    public void suona() {
        System.out.println(getNome() + " sta suonando uno strumento.");
    }
}

class Compositore extends Artista {
    public Compositore(String nome, int eta) {
        super(nome, eta);
    }

    public void compone() {
        System.out.println(getNome() + " sta componendo musica.");
    }
  }
}
