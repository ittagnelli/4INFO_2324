public class Animale {
    protected String nome;
    protected int peso;

    public void setNome(String nome_enter) {
        nome = nome_enter;
    }

    public void setPeso(int peso_enter) {
        peso = peso_enter;
    }

    public String getNome() {
        return nome;
    }

    public int getPeso() {
        return peso;
    }

    public String toString() {
        return "\nNome: " + nome + "\nPeso : " + peso + " kg";
    }
}
