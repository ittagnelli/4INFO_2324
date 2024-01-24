import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> ls = new ArrayList<Integer>(1);
        ls.add(1);
        ls.add(1);
        ls.add(3);
        ls.add(3);
        ls.add(2);
        ls.add(0);
        ls.add(0);

        System.out.println(Lista.frequenza(ls));
        System.out.println(Lista.eliminaDuplicati(ls));
        System.out.println(Lista.seleziona(ls, 1));
        System.out.println(Lista.isOrdered(ls));
        System.out.println(Lista.sostituisci(ls, 1, 99));
    }
    
}
