public class Nodo {
    public int info;
    public Nodo next;


    Nodo() {
        info = 0;
        next = null;
    }


    Nodo(int number) {
        info = number;
        next = null;
    }


    Nodo(int number, Nodo next) {
        info = number;
        this.next = next;
    }

    public int getInfo() {
        return info;
    }

    public void setInfo(int number) {
        info =  number;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo link) {
        next = link;
    }

    @Override
    public String toString() {
        if(next != null) return "[" + info + "] -> " + next;
        else return "[" + info + "] -> NULL";
    }
}