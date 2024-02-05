import java.util.HashMap;
public class DuplicatiChecker {
    public static boolean verificaDuplicati(int[] numeri) {
        HashMap<Integer, Integer> conteggio = new HashMap<>();
        for (int numero : numeri) {
            conteggio.put(numero, conteggio.getOrDefault(numero, 0) + 1);
        }
        for (int count : conteggio.values()) {
            if (count < 2) {
                return false;
            }
        }
        return true;
    }
}
