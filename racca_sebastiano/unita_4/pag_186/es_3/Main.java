import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<Integer>();

        Integer num = 0;

        do {
            System.out.print("Inserisci un numero: ");
            num = scanner.nextInt();

            if(num != 0) {
                list.addLast(num);
            }

        } while(num != 0);

        System.out.print("Inserisci il divisore: ");
        int divisore = scanner.nextInt();

        list.removeIf(x -> x % divisore == 0);

        System.out.println(list);

        scanner.close();
    }
}