public class Paziente {
    private int codice;
    private Medico medico;

    Paziente(){}
    Paziente(int codice, Medico medico){
        this.codice = codice;
        this.medico = medico;
    }

    public void setCodice(int codice) {
        this.codice = codice;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public int getCodice() {
        return codice;
    }

    public Medico getMedico() {
        return medico;
    }

    @Override
    public String toString() {
        return "codice: " + codice + " medico curante: " + medico;
    }
}
