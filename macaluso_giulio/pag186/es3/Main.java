import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<Integer>();
        int n, num;
        Scanner in = new Scanner(System.in);

        do {
            n = in.nextInt();
            l.addFirst(n);
        } while(n != 0);

        num = in.nextInt();

        rimuovi r = new rimuovi(l, num);
        System.out.println(l);
        r.rimuoviDuplicati();
        System.out.println(l);
        
        in.close();
    }
}