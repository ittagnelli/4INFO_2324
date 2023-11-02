public class Main {
    public static void main(String[] args) {
        Medico medico1 = new Medico("samuele");
        Paziente paziente1 = new Paziente(839953, "samuele");
        System.out.println(medico1.toString());
        System.out.println(paziente1.toString());
    }
}
