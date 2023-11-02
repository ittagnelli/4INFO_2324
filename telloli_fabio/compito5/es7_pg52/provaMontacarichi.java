package es7_pg52;
import java.util.Scanner;

public class provaMontacarichi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("inserisci il piano di partenza: ");
        int Desiderato = scanner.nextInt();

        if(Desiderato == 1) {
            for (int i = 1; i <= Desiderato; i++) {
                System.out.println("\nl'ascensore è al piano: " + i);
            }
        } else {
            Montacarichi ascensore = new Montacarichi();
            ascensore.Desinazione(Desiderato);
        }

        scanner.close();
    }
}
