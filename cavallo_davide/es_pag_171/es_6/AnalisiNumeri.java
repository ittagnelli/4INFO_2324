import java.util.ArrayList;
import java.util.Random;

public class AnalisiNumeri {

    public static void main(String[] args) {
        ArrayList<Integer> sequenzaNumeri = generaSequenzaCasuale();

        System.out.println("Sequenza generata: " + sequenzaNumeri);

        boolean pariUgualiDispari = verificaPariUgualiDispari(sequenzaNumeri);

        if (pariUgualiDispari) {
            System.out.println("I numeri pari sono in numero uguale a quelli dispari.");
        } else {
            System.out.println("I numeri pari non sono in numero uguale a quelli dispari.");
        }
    }

    private static ArrayList<Integer> generaSequenzaCasuale() {
        ArrayList<Integer> sequenzaNumeri = new ArrayList<>();
        Random random = new Random();

        while (true) {
            int numeroCasuale = random.nextInt(21) + 20; 
            sequenzaNumeri.add(numeroCasuale);

            if (numeroCasuale % 5 == 0) {
                break; 
            }
        }

        return sequenzaNumeri;
    }

    private static boolean verificaPariUgualiDispari(ArrayList<Integer> sequenzaNumeri) {
        int conteggioPari = 0;
        int conteggioDispari = 0;

        for (int numero : sequenzaNumeri) {
            if (numero % 2 == 0) {
                conteggioPari++;
            } else {
                conteggioDispari++;
            }
        }

        return conteggioPari == conteggioDispari;
    }
}
