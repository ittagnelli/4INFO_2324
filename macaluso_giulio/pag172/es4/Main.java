import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(2);
        array.add(1);
        array.add(3);

        duplicati d = new duplicati(array);
        System.out.println(d.cerca());
    }
}
