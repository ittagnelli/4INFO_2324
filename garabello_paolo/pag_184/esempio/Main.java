import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        MyHashTable table = new MyHashTable();
        for(int i = 0; i < 30; i++) {
            table.add(random.nextInt(100));
        }
        table.view();
    }
}
