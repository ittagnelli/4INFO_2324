public class ProvaMedico {
    public static void main(String[] args) {
        Medico medico = new Medico("giorgia");
        Paziente paziente = new Paziente(34, medico);
        paziente.stampa();
    }
}
