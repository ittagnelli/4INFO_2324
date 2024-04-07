import java.util.LinkedList;

public class ListaOrdinata<T extends Comparable<T>> {
    private NodoLista<T> testa;

    public ListaOrdinata() {
        testa = null;
    }

    public void inserisci(T chiave) {
        NodoLista<T> nuovoNodo = new NodoLista<>(chiave);
        
        if (testa == null || chiave.compareTo(testa.chiave) <  0) {
            nuovoNodo.prossimo = testa;
            testa = nuovoNodo;
        } else {
            NodoLista<T> corrente = testa;
            while (corrente.prossimo != null && chiave.compareTo(corrente.prossimo.chiave) >  0) {
                corrente = corrente.prossimo;
            }
            nuovoNodo.prossimo = corrente.prossimo;
            corrente.prossimo = nuovoNodo;
        }
    }

    public boolean contiene(T chiave) {
        NodoLista<T> corrente = testa;
        while (corrente != null) {
            if (chiave.equals(corrente.chiave)) {
                return true;
            }
            corrente = corrente.prossimo;
        }
        return false;
    }

    public void stampa() {
        NodoLista<T> corrente = testa;
        while (corrente != null) {
            System.out.print(corrente.chiave + " -> ");
            corrente = corrente.prossimo;
        }
        System.out.println("null");
    }
}
