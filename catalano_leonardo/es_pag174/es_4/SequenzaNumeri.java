import java.util.ArrayList;
import java.util.Scanner;

public class SequenzaNumeri {

    public static void main(String[] args) {

        ArrayList<Integer> numeri = leggiNumeri();

        boolean risultato = verificaDuplicati(numeri);

        System.out.println("Ogni elemento è presente almeno due volte: " + risultato);
    }

    private static ArrayList<Integer> leggiNumeri() {
        ArrayList<Integer> numeri = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci  sequenza  numeri terminanti con 0");

        while (true) {
            int numero = scanner.nextInt();
            if (numero == 0) {
                break;
            }
            numeri.add(numero);
        }

        return numeri;
    }

    private static boolean verificaDuplicati(ArrayList<Integer> numeri) {

        for (int i = 0; i < numeri.size(); i++) {
            int elementoCorrente = numeri.get(i);
            int conteggio = 0;

            for (int j = 0; j < numeri.size(); j++) {
                if (elementoCorrente == numeri.get(j)) {
                    conteggio++;
                }
            }

            if (conteggio < 2) {
                return false;
            }
        }

        return true;
    }
}
