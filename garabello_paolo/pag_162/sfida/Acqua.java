public class Acqua<T> {
    private T contenuto;

    Acqua(T t){
        contenuto = t;
    }

    public T getContenuto() {
        return contenuto;
    }
}
