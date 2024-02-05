public class Nodo {
    int valore;
    Nodo successivo;
    Nodo precedente;

    public Nodo(int valore) {
        this.valore = valore;
        this.successivo = null;
        this.precedente = null;
    }
}
