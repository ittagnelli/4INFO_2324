public class Studente {
    private String nome;
    private String cognome;
    private String id;

    Studente(String nome, String cognome, String id) {
        this.nome = nome;
        this.cognome = cognome;
        this.id = id;
    }

    public String getCognome() {
        return cognome;
    }

    public String getNome() {
        return nome;
    }

    public String getId() {
        return id;
    }

    public String toString() {
        return nome + ", " + cognome + " - " + id;
    }
}
