class StrumentoMusicale {
    private String nome;
    private String tipo;

    public StrumentoMusicale(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void suona() {
        System.out.println(nome + " è uno strumento musicale di tipo " + tipo + ".");
    }
}

class Pianoforte extends StrumentoMusicale {
    private int numeroTasti;

    public Pianoforte(String nome, int numeroTasti) {
        super(nome, "Pianoforte");
        this.numeroTasti = numeroTasti;
    }

    public int getNumeroTasti() {
        return numeroTasti;
    }

    public void accorda() {
        System.out.println(getNome() + " è stato accordato");
    }
  }
}
