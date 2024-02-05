import java.util.LinkedList;
import java.util.Scanner;
import java.util.Iterator;

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


        Iterator<Integer> iterator = list.iterator();
        System.out.print("Inserisci il divisore: ");
        int divisore = scanner.nextInt();

        while (iterator.hasNext()) {
            int currentElement = iterator.next();
            if (currentElement % divisore == 0) {
                iterator.remove();
            }
        }

        System.out.println(list);

        scanner.close();
    }
}