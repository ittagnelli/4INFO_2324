import java.util.LinkedList;
import java.util.ListIterator;

public class rimuovi {
    LinkedList<Integer> listaD;
    LinkedList<Integer> listaP = new LinkedList<Integer>();
    ListIterator<Integer> lit;
    int n;

    rimuovi(LinkedList<Integer> l1) {
        listaD = l1;
        lit = listaD.listIterator();
    }

    public LinkedList<Integer> rimuoviERiempi() {
        while (lit.hasNext()) {
            n = lit.next();
            if(n % 2 == 0) {
                listaP.addFirst(n);
                lit.remove();
            }
        }
        return listaP;
    }
}
