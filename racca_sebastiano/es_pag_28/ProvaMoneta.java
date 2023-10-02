import java.util.Scanner;

public class ProvaMoneta {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testa = 0;

        System.out.print("Scegli testa (0) o croce (1): ");
        int scelta = in.nextInt();

        Moneta moneta = new Moneta();

        for(int i = 0; i < 5; i++) {
            moneta.lancia();

            System.out.println("E' uscito: " + moneta.toString());

            if(moneta.isTesta()) {
                testa++;
            }
            
        }

        if((scelta == 0 && testa >= 3) || (scelta == 1 && testa < 3)) {
            System.out.println("Il giocatore ha vinto!");
        } else {
            System.out.print("Il computer ha vinto");
        }

        in.close();
    }
}
