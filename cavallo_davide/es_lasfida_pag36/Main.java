import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        char[] testo = "0.12, 1.3,2 1.2, 1.3,4 1.8,2.5, 1.6".toCharArray();
        List<Punto> points = new ArrayList<>();

        Punto.parsePoints(testo, points);

        for (Punto punto : points) {
            System.out.println(punto);
        }
    }
}
