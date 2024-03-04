import java.util.LinkedList;

public class Queue<T> extends LinkedList<T> {
    public void enqueue(T data) {
        super.addLast(data);
    }

    public T dequeue() {
        return super.removeFirst();
    }

    public T first() {
        return super.getFirst();
    }

    public T last() {
        return super.getLast();
    }

    public boolean isFull() {
        return !super.isEmpty();
    }

    public void clear() {
        if(this.isFull()) {
            super.clear();
        }
    }
}
