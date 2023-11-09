public class Paziente {
    private int codice;
    private Medico medico;

    public Paziente(int codice, Medico medico) {
        this.codice = codice;
        this.medico = medico;
    }

    private boolean accessoRegistro(int codice) {
        return (this.codice == codice);
    }

    public String getMedico(int codice) {
        if(accessoRegistro(codice)) 
            return medico.getNominativo();

        return "Accesso negato";
    }
}
