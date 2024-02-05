import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = NumberGenerator.generateNumbers();

        boolean result = NumberAnalyzer.equalParity(numbers);
        System.out.println("I numeri pari sono in numero uguale a quelli dispari? " + result);
    }
}
