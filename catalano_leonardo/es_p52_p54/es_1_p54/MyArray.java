import java.util.ArrayList;

public class MyArray {
    private int[] mioArray;

    public MyArray(int[] array) {
        this.mioArray = array;
    }

    public boolean cerca(int n) {
        for (int elemento : mioArray) {
            if (elemento == n) {
                return true;
            }
        }
        return false;
    }

    public int[] single() {
        ArrayList<Integer> arraySingolo = new ArrayList<>();
        singleRicorsivo(0, arraySingolo);
        
        int[] risultato = new int[arraySingolo.size()];
        for (int x = 0; x < arraySingolo.size(); x++) {
            risultato[x] = arraySingolo.get(x);
        }
        return risultato;
    }

    private void singleRicorsivo(int indice, ArrayList<Integer> risultato) {
        if (indice == mioArray.length) {
            return;
        }

        int elementoCorrente = mioArray[indice];

        if (!risultato.contains(elementoCorrente)) {
            risultato.add(elementoCorrente);
        }

        singleRicorsivo(indice + 1, risultato);
    }
}