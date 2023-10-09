import java.util.Scanner;

public class LampadinaProva {
    public static void main(String[] args) {
        Lampadina lampadina_1 = new Lampadina(6);
        Scanner in = new Scanner(System.in);
        int scelta;
        boolean exit_prog = false;

        while (!exit_prog) {
            System.out.println("\n\n[0] : visualizza stato lampadina\n[1] : esci dal programma");
            scelta = in.nextInt();
            if(scelta == 0) {
                System.out.println("\nStato lampadina : " + lampadina_1);
            } else if (scelta == 1) {
                exit_prog = true;
            }
            lampadina_1.click();
        }

        in.close();

    }
}
