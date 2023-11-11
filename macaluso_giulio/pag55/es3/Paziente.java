public class Paziente {
    private Medico m;
    private int codice;

    Paziente(int c, Medico med) {
        codice = c;
        m = med;
    }

    public void stampa() {
        System.out.println("Codice: " + codice);
        System.out.println("Medico: " + m.getNome());
    }
}
