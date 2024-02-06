import java.util.Random;

public class Studente {
    private int id;
    private String nome;

    Studente(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    Studente(String nome) {
        this.id = (new Random()).nextInt(1000);
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
        return "{id: " + this.id + ", nome: " + this.nome + "}";
    }
}
