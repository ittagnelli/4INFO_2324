public class Studente {
    int id;
    String nome;

    public Studente(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Studente(" + "id=" + id +", nome=" + nome + '\'' +')';
    }
}
