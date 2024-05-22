import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Lista {
    private List<Object> elements;

    public Lista() {
        elements = new ArrayList<>();
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public boolean ctrOrdinata() {
        for (int i = 1; i < elements.size(); i++) {
            Comparable current = (Comparable) elements.get(i);
            Comparable previous = (Comparable) elements.get(i - 1);
            if (current.compareTo(previous) < 0) {
                return false;
            }
        }
        return true;
    }

    public Object getFirst() {
        if (!isEmpty()) {
            return elements.get(0);
        }
        return null;
    }

    public Object getLast() {
        if (!isEmpty()) {
            return elements.get(elements.size() - 1);
        }
        return null;
    }

    public Object removeFirst() {
        if (!isEmpty()) {
            return elements.remove(0);
        }
        return null;
    }

    public Object ritornaCoda() {
        if (!isEmpty()) {
            List<Object> coda = new ArrayList<>(elements.subList(1, elements.size()));
            return coda;
        }
        return null;
    }

    public Object removeLast() {
        if (!isEmpty()) {
            return elements.remove(elements.size() - 1);
        }
        return null;
    }

    public void ordinaLista() {
        Collections.sort(elements);
    }

    public void generaRandom(int quanti) {
        Random rand = new Random();
        for (int i = 0; i < quanti; i++) {
            elements.add(rand.nextInt());
        }
    }

    public void fondiListe(Lista altraLista) {
        elements.addAll(altraLista.elements);
    }

    public void ribalta() {
        Collections.reverse(elements);
    }
}