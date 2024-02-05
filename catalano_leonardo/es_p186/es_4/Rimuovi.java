import java.util.ArrayList;

public class Rimuovi{
    public void RimuoviElementi(ArrayList<Integer> numeri, int n) {
        ArrayList<Integer> toRemove = new ArrayList<>();
        for (int num : numeri) {
            if (num % n == 0) {
                toRemove.add(num);
            }
        }
        numeri.removeAll(toRemove);
    }
}
