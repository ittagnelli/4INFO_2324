public class Animale {
    protected String nome;

    public void setNome(String n) {
        nome = n;
    }
    public String getNome() {
        return nome;
    }
    public void stampa() {
        System.out.println("\nnome: " + nome);
    }
}
