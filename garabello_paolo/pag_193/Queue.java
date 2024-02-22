import java.util.*;

public class Queue<T> extends LinkedList<T>{
    
    public void enqueue(T t){
        super.addLast(t);
    }

    public T dequeue(){
        return super.removeFirst();
    }

    public T first(){
        return super.getFirst();
    }

    public T last(){
        return super.getLast();
    }

    public void clear(){
        if(!super.isEmpty())
            super.clear();
    }

    public boolean isFull(){
        return !super.isEmpty();
    }
}