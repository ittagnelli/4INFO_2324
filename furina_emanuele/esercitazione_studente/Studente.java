import java.util.Objects;

public class Studente {
    private String nome;
    private int matricola;

    public Studente(String nome, int matricola) {
        this.nome = nome;
        this.matricola = matricola;
    }

    public String getNome() {
        return nome;
    }

    public int getMatricola() {
        return matricola;
    }

    // Override di equals e hashCode per permettere il confronto basato sulla matricola
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Studente other = (Studente) obj;
        return matricola == other.matricola;
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricola);
    }
}
