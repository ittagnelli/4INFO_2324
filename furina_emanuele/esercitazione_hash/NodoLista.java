public class NodoLista<T extends Comparable<T>> {
    T chiave;
    NodoLista<T> prossimo;

    public NodoLista(T chiave) {
        this.chiave = chiave;
    }
}
