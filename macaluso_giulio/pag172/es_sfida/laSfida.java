import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

public class laSfida {
    ArrayList<Integer> array;

    laSfida(ArrayList<Integer> a) {
        array = a;
    }

    public ArrayList<Integer> frequenza() {
        ArrayList<Integer> occorrenze = new ArrayList<Integer>();
        Iterator<Integer> i = array.iterator();

        while(i.hasNext()) {
            occorrenze.add(Collections.frequency(array, i.next()));
        }
        return occorrenze;
    }

    public ArrayList<Integer> eleminaDuplicati() {
        ArrayList<Integer> senzaDuplicati = new ArrayList<Integer>();

        Collections.sort(array);
        System.out.println(array);
        for(int j = 0; j < array.size() - 1; j++) {
            if(array.get(j) == array.get(j + 1)) {
                senzaDuplicati.add(array.get(j));
            }
        }
        return senzaDuplicati;
    }

    public ArrayList<Integer> seleziona(int n, ArrayList<Integer> a) {
        Iterator<Integer> i = array.iterator();

        while (i.hasNext()) {
            if(i.next() < n) {
                i.remove();
            }
        }
        return a;
    }

    public boolean isOrdered(ArrayList<Integer> a) {
        for(int i = 0; i < a.size() - 1; i++) {
            if(a.get(i) > a.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public ArrayList<Integer> sostituisci(ArrayList<Integer> a, int n1, int n2) {
        Collections.replaceAll(a, n1, n2);
        return a;
    }
}
