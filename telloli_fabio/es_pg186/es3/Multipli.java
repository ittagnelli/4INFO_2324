import java.util.LinkedList;
import java.util.ListIterator;

public class Multipli {
    private LinkedList<Integer> lista;
    int elem, n;

    Multipli(LinkedList<Integer> lista, int n) {
        this.lista = lista;
        this.n = n;
    }

    public void rimuoviMultipli() {
        ListIterator<Integer> iterator = lista.listIterator();
        
        while (iterator.hasNext()) {
            elem = iterator.next();
            if (elem % n == 0) {
                iterator.remove();
            }
        }
    }
    

}
