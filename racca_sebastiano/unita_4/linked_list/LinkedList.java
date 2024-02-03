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
        Node<T> node = new Node<T>(data);
        Node<T> next = this.head;

        for(int i = 0; (i < position - 1) && next != null; i++) {
            next = next.getNext();
        }

        node.setNext(next.getNext());
        next.setNext(node);
    }


    public void removeFromTail() {
        Node<T> next = this.head;

        while(next != null) {
            if(next.getNext().getNext() == null) {
                next.setNext(null);
                break;
            }
            next = next.getNext();
        }
    }

    public void removeFromHead() {
        if(this.isEmpty()) return;

        this.head = this.head.getNext();
    }

    public void removeFromPosition(int position) {
        Node<T> next = this.head;

        for(int i = 0; i <= position && next != null; i++) {

            if(i == position-1) {
                next.setNext(next.getNext().getNext());
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
