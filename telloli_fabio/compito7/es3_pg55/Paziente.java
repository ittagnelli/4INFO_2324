package es3_pg55;

public class Paziente {
    private int codice;
    private Medico medicoCurante;

    public Paziente(int codice, Medico medicoCurante) {
        this.codice = codice;
        this.medicoCurante = medicoCurante;
    }

    public int getCodice() {
        return codice;
    }

    public Medico getMedicoCurante() {
        return medicoCurante;
    }

    public String toString() {
        return "Codice: " + codice + " - Medico Curante: " + medicoCurante; 
    }
}
