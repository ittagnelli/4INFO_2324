import java.util.Scanner;
import java.util.Vector;

public class gestisciVector {
    Scanner input = new Scanner(System.in);
    int num;

    public void riempiVector(Vector<Integer> v) {
        
        do {
            num = input.nextInt();
            if (num != 0) {
                v.add(num);
            }
        } while (num != 0);

        System.out.println("contenuto: " + v);
    }

}
