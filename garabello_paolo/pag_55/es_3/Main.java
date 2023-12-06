public class Main {
    public static void main(String[] args) {
        Medico medico = new Medico("Gianni");
        Paziente paziente = new Paziente(12, medico);

        System.out.println(medico);
        System.out.println(paziente);
    }
}
