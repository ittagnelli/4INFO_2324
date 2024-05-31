public class Persona {
    private String nome;
    private String cognome;

    Persona(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String toString() {
        return "Nome: " + nome + "\nCognome: " + cognome;
    }
}
