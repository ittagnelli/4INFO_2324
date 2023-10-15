class Animale {
    String nome;

    public Animale(String nome) {
        this.nome = nome;
    }

    public void emettiSuono() {
        System.out.println("Questo animale emette un suono.");
    }
}

class Mammifero extends Animale {
    public Mammifero(String nome) {
        super(nome);
    }

    public void cammina() {
        System.out.println(this.nome + " cammina.");
    }
}

class Bovino extends Mammifero {
    public Bovino(String nome) {
        super(nome);
    }

    public void mangia() {
        System.out.println(this.nome + " mangia.");
    }
}

class Mucca extends Bovino {
    public Mucca(String nome) {
        super(nome);
    }

    public void muggisce() {
        System.out.println(this.nome + " muggisce");
    }
  }
}
