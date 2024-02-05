import java.util.ArrayList;

public class Doppione {

    public static boolean controllaDuplicati(ArrayList<Integer> lista) {
        for (int i = 0; i < lista.size() - 1; i++) {
            for (int j = i + 1; j < lista.size(); j++) {
                if (lista.get(i).equals(lista.get(j))) {
                    System.out.println("Duplicato trovato: " + lista.get(i));
                    return true;
                }
            }
        }
        return false;
    }
}
