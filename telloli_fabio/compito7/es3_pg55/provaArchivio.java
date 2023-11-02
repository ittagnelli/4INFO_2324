package es3_pg55;

public class provaArchivio {
    public static void main(String[] args) {
        Medico medico1 = new Medico("Dott. Bruno");
        Medico medico2 = new Medico("dott. Alfredo");

        Paziente paziente1 = new Paziente(1, medico1);
        Paziente paziente2 = new Paziente(2, medico2);

        System.out.println("Info sui medici: ");
        System.out.println(medico1);
        System.out.println(medico2);

        System.out.println("\nInformazioni sui pazienti: ");
        System.out.println(paziente1);
        System.out.println(paziente2);
    }
}
