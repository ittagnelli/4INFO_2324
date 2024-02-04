import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<Integer>();
        l.addFirst(1);
        l.addFirst(2);
        l.addLast(3);
        System.out.println(l);
        ListIterator<Integer> lit = l.listIterator();
        lit.hasNext();
        lit.hasPrevious();
        l.remove();
        System.out.println(l);
    }
}