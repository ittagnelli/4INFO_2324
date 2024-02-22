public class Panino<T> {
    private T contenuto;
    
    Panino(T t){
        contenuto = t;
    }
    
    public T getContenuto() {
        return contenuto;
    }
}
