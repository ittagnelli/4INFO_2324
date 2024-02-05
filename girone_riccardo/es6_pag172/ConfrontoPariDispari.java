import java.util.ArrayList;

class ConfrontoPariDispari {
    private int numeriPari = 0;
    private int numeriDispari = 0;

    public boolean confrontaPariDispari(ArrayList<Integer> sequenzaNumeri) {

        for (int numero : sequenzaNumeri) {
            if (numero % 2 == 0) {
                numeriPari++;
            } else {
                numeriDispari++;
            }
        }

        return numeriPari == numeriDispari;
    }
}
