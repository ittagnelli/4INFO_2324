import java.util.ArrayList;

class StampaSequenza {
    public static void stampa(ArrayList<Integer> sequenzaNumeri) {
        System.out.println("Sequenza di numeri generati:");
        for (int numero : sequenzaNumeri) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }
}
