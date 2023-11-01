public class Main {
    public static void main(String[] args) {
        Medico medico = new Medico("Enrico");
        Paziente paziente = new Paziente(4764, medico);
        paziente.stampa();
    }
}
