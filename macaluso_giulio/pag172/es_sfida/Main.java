import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(6);
        array.add(5);
        
        laSfida l = new laSfida(array);
        System.out.println(l.frequenza());
        System.out.println(l.eleminaDuplicati());
        System.out.println(l.seleziona(3, array));
        System.out.println(l.isOrdered(array));
        System.out.println(l.sostituisci(array, 3, 8));
    }
}
