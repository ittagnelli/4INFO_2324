import java.util.ArrayList;
import java.util.Scanner;

public class DuplicatiArrayList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci una sequenza di numeri terminante con 0:");

        ArrayList<Integer> numeri = new ArrayList<>();
        int numero;
        while (true) {
            numero = scanner.nextInt();
            if (numero == 0) {
                break;
            }
            numeri.add(numero);
        }

        boolean tuttiDuplicati = verificaDuplicati(numeri);

        if (tuttiDuplicati) {
            System.out.println("Ciascun elemento è presente almeno due volte.");
        } else {
            System.out.println("Almeno un elemento non è presente almeno due volte.");
        }
    }

    private static boolean verificaDuplicati(ArrayList<Integer> numeri) {
        for (int i = 0; i < numeri.size(); i++) {
            int count = 0;
            for (int j = 0; j < numeri.size(); j++) {
                if (numeri.get(i).equals(numeri.get(j))) {
                    count++;
                }
            }
            if (count < 2) {
                return false; 
            }
        }
        return true; 
}
