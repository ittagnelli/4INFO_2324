import java.util.LinkedList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<Integer>();
        Random random = new Random();

        for(int i = 0; i < 10; i++) {
            l.addFirst(random.nextInt(9) + 1);
        }

        rimuovi r = new rimuovi(l);
        System.out.println(r.rimuoviERiempi());
        System.out.println(l);
    }
}