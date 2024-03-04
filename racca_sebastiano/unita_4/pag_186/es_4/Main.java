import java.util.LinkedList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        fill(list);

        System.out.println("LinkedList principale: " + list);

        LinkedList<Integer> listaPari = new LinkedList<>();

        list.removeIf(x -> addIfEven(x, listaPari));

        System.out.println("LinkedList principale dopo la rimozione degli elementi pari: " + list);
        System.out.println("LinkedList degli elementi pari: " + listaPari);
    }

    private static boolean addIfEven(int num, LinkedList<Integer> list) {
        if(num % 2 == 0) {
            list.add(num);
            return true;
        }
        return false;
    }

    private static void fill(LinkedList<Integer> list) {
        Random random = new Random();

        for (int i = 0; i < random.nextInt(10) + 10; i++) {
            list.add(random.nextInt(9) + 1);
        }
    }
}
