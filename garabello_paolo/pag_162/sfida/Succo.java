public class Succo<T> {
    private T contenuto;

    Succo(T t){
        contenuto = t;
    }

    public T getContenuto() {
        return contenuto;
    }
}
