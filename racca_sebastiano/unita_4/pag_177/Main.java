import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        Scanner scanner = new Scanner(System.in);

        int num = 1;

        for(; num != 0;) {
            System.out.print("Inserisci un numero: ");
            num = scanner.nextInt();

            final int current = num;

            int biggerIndex = list.findContition(s -> s > current);

            list.addToPosition(current, biggerIndex);

            System.out.println(list.toString());
        }

        scanner.close();

    }
}