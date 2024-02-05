import java.util.ArrayList;
import java.util.Random;

public class Genera {
    public ArrayList<Integer> generateList(int size) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            int num = random.nextInt(9) + 1;
            list.add(num);
        }
        return list;
    }
}
