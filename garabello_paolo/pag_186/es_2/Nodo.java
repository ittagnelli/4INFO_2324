public class Nodo<T> {

    private T value;
    private Nodo<T> next;
    
    Nodo(){}
    Nodo(T value){
        this.value = value;
    }
    Nodo(T value, Nodo<T> next){
        this.value = value;
        this.next = next;
    }

    public Nodo<T> getNext() {
        return next;
    }

    public T getValue() {
        return value;
    }

    public void setNext(Nodo<T> next) {
        this.next = next;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString(){
        return value.toString();
    }
}