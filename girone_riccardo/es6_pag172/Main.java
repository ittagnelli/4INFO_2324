import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        NumeroCasualeGenerator generator = new NumeroCasualeGenerator();
        ArrayList<Integer> sequenzaNumeri = generator.generaSequenzaCasuale();
        
        StampaSequenza.stampa(sequenzaNumeri);

        ConfrontoPariDispari confronto = new ConfrontoPariDispari();
        boolean pariUgualiDispari = confronto.confrontaPariDispari(sequenzaNumeri);

        if (pariUgualiDispari) {
            System.out.println("Il numero di numeri pari è uguale al numero di numeri dispari.");
        } else {
            System.out.println("Il numero di numeri pari non è uguale al numero di numeri dispari.");
        }
    }
}
