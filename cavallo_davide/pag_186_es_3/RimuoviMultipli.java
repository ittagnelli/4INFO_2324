import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class RimuoviMultipli {

    public static void main(String[] args) {
        List<Integer> listaInteri = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int input;
        do {
            System.out.print("Inserisci un intero (0 per terminare): ");
            input = scanner.nextInt();
            if (input != 0) {
                listaInteri.add(input);
            }
        } while (input != 0);

        System.out.print("Inserisci l'intero per la rimozione dei multipli: ");
        int n = scanner.nextInt();

        Iterator<Integer> iterator = listaInteri.iterator();
        while (iterator.hasNext()) {
            int numero = iterator.next();
            if (numero % n == 0) {
                iterator.remove();
            }
        }

        System.out.println("Lista dopo la rimozione dei multipli di " + n + ": " + listaInteri);

        scanner.close();
    }
}
