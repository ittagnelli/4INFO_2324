import java.util.*;

public class Lista {
    private ArrayList<Integer> ls;
    private Random ran;
    private final int TERMINATORE = 5;
    private final int MIN = 20;
    private final int MAX = 40;
    Lista() {
        ls = new ArrayList<Integer>(1);
        ran = new Random();
    }

    public void riempi() {
        int numero;

        do {
            numero = ran.nextInt(MAX - MIN) + MIN;
            if((numero % TERMINATORE) != 0) ls.add(numero);
            
        } while ((numero % TERMINATORE) != 0);
    }

    public boolean compareEven() {
        int con_even = 0;

        for (int i = 0; i < ls.size(); i++) {
            if((ls.get(i) % 2) == 0) con_even ++;
        }

        if(con_even  == ls.size()/2) return true;
        else return false;
    }

    public void getLista() {
        System.out.println(ls);
    }
}
