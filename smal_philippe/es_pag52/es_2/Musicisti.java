public class Musicisti {
    private String nome;

    public void setNome(String nome_enter) {
        nome = nome_enter;
    }

    public String getNome() {
        return nome;
    }

    public String toString() {
        return "\nNome musicista: " + nome;
    }
}
