import java.util.LinkedList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        fill(list);

        System.out.println("LinkedList principale: " + list);

        LinkedList<Integer> listaPari = new LinkedList<>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                listaPari.add(list.remove(i));
                i--;
            }
        }

        System.out.println("LinkedList principale dopo la rimozione degli elementi pari: " + list);
        System.out.println("LinkedList degli elementi pari: " + listaPari);
    }

    private static void fill(LinkedList<Integer> list) {
        Random random = new Random();

        for (int i = 0; i < random.nextInt(10) + 10; i++) {
            list.add(random.nextInt(9) + 1);
        }
    }
}
