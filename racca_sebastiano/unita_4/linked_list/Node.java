public class Node<T> {
    private Node<T> next;
    private T data;

    Node(T data) {
        this.data = data;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public T getData() {
        return data;
    }

    @Override
    public String toString() {
        return this.data.toString();
    }

}
