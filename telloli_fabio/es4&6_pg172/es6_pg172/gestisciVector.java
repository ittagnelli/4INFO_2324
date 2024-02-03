import java.util.Random;
import java.util.Vector;

public class gestisciVector {
    Random random;
    int numeroCas;
    
    gestisciVector() {
        random = new Random();
    }
    
    
    public void riempiVector(Vector<Integer> v) {
        do {
            numeroCas = random.nextInt(21) + 20;
            v.add(numeroCas);
        } while (numeroCas % 5 != 0);
        System.out.println(v);
        
    }
}
