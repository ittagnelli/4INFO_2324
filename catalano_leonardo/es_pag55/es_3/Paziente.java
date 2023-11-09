public class Paziente {
    private Medico medico;
    private int codice;

    public Paziente(int codice, Medico medico) {
        this.codice = codice;
        this.medico = medico;
    }

    public void stampa() {
        System.out.println("Codice: " + codice);
        System.out.println("Medico: " + medico.getNome());
    }
}
