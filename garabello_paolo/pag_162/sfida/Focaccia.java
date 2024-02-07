public class Focaccia<T> {
    private T contenuto;

    Focaccia(T t){
        contenuto = t;
    }

    public T getContenuto() {
        return contenuto;
    }
}
