import java.util.ArrayList;
import java.util.Random;

class NumeroCasualeGenerator {
    private int numeroCasuale;

    public ArrayList<Integer> generaSequenzaCasuale() {
        Random rand = new Random();
        ArrayList<Integer> sequenzaNumeri = new ArrayList<>();

        do {
            numeroCasuale = rand.nextInt(21) + 20;
            sequenzaNumeri.add(numeroCasuale);
        } while (numeroCasuale % 5 != 0);

        return sequenzaNumeri;
    }
}
