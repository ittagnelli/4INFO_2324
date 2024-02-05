public class Nodo {

    private int value;
    private Nodo next;
    
    Nodo(){}
    Nodo(int value){
        this.value = value;
    }
    Nodo(int value, Nodo next){
        this.value = value;
        this.next = next;
    }

    public Nodo getNext() {
        return next;
    }

    public int getValue() {
        return value;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString(){
        return String.valueOf(value);
    }
}