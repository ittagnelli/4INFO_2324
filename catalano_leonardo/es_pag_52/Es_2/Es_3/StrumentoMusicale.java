public class StrumentoMusicale {
    private String nome;
    private String tipo;

    public StrumentoMusicale(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public void suona() {
        System.out.println("Suonando lo strumento musicale: " + nome);
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }
}
