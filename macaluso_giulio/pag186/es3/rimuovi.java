import java.util.LinkedList;
import java.util.ListIterator;

public class rimuovi {
    int n;
    LinkedList<Integer> l;
    ListIterator<Integer> lit;

    rimuovi(LinkedList<Integer> list, int num) {
        n = num;
        l = list;
        lit = l.listIterator();
    }

    public void rimuoviDuplicati() {
        while (lit.hasNext()) {
            
            if(lit.next() % n == 0) {
                lit.remove();
            }
        }
    }
}