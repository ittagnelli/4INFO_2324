public class Paziente {
    private int codice;
    private Medico medico;

    public Paziente(int codice, Medico medico) {
        this.codice = codice;
        this.medico = medico;
    }

    public int getCodice() {
        return codice;
    }

    public Medico getMedico() {
        return medico;
    }

    public void assegnaMedico(Medico medico) {
        this.medico = medico;
    }
}