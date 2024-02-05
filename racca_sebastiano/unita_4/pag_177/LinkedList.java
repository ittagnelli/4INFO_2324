import java.util.function.Predicate;

public class LinkedList <T> {
    private Node<T> head;

    LinkedList() {
        this.head = null;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public void addToTail(T data) {
        Node<T> node = new Node<T>(data);

        if(this.isEmpty()) {
            this.head = node;
            return;
        }

        Node<T> next = this.head;

        while(next != null) {
            if(next.getNext() == null) {
                next.setNext(node);
                break;
            }
            next = next.getNext();
        }

    }

    public void addToHead(T data) {
        Node<T> node = new Node<T>(data);
        node.setNext(this.head);
        this.head = node;
    }

    public void addToPosition(T data, int position) {
        if(isEmpty()) {
            this.addToHead(data);
            return;
        }

        if(position == 0) {
            this.addToHead(data);
            return;
        }

        Node<T> node = new Node<T>(data);
        Node<T> next = this.head;

        for(int i = 0; (i < position - 1) && next != null; i++) {
            next = next.getNext();
        }

        node.setNext(next.getNext());
        next.setNext(node);
    }

    public T getNode(int index) {
        Node<T> node = this.head;

        for(int i = 0; i < index; i++) {
            node = node.getNext();
        }

        return node.getData();
    }

    public T getTail() {
        Node<T> node = this.head;

        while((node = node.getNext()) != null);

        return node == null ? null : node.getData();
    }

    public T getHead() {
        return this.head.getData();
    }

    public int findContition(Predicate<T> condition) {
        Node<T> node = this.head;
        int i = 0;
        
        while(node != null) {
            if(condition.test(node.getData())) {
                break;
            }
            node = node.getNext();
            i++;
        }

        return i;
    }


    public void removeFromTail() { // FIXME
        Node<T> next = this.head;

        while(next != null) {
            if(next.getNext() == null) {
                next.setNext(null);
                break;
            }
            next = next.getNext();
        }
    }


    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        Node<T> next = this.head;

        while(next != null) {
            res.append("[" + next.toString() + "]->");
            next = next.getNext();
        }

        return res.toString() + "NULL";
    }
}
