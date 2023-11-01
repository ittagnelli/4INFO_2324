public class Main {
    public static void main(String[] args) {
        Medico medico1 = new Medico("Dott. Rossi");
        Medico medico2 = new Medico("Dott. Bianchi");

        Paziente paziente1 = new Paziente(1, medico1);
        Paziente paziente2 = new Paziente(2, medico2);

        System.out.println("Medico di " + paziente1.getCodice() + ": " + paziente1.getMedico().getNominativo());
        System.out.println("Medico di " + paziente2.getCodice() + ": " + paziente2.getMedico().getNominativo());
        paziente1.assegnaMedico(medico2);
        System.out.println("\n\nMedico di " + paziente1.getCodice() + ": " + paziente1.getMedico().getNominativo());
    }
}
