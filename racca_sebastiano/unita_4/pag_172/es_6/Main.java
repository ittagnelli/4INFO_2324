import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = generateSequence();
        System.out.println("Numeri generati: " + numbers);

        boolean result = analyzeNumbers(numbers);
        System.out.println("I numeri pari sono uguali ai numeri dispari? " + result);
    }

    private static ArrayList<Integer> generateSequence() {
        ArrayList<Integer> sequence = new ArrayList<>();
        Random random = new Random();

        int rand;

        do {
            rand = random.nextInt(21) + 20;
            sequence.add(rand);
        } while(rand % 5 != 0);

        return sequence;
    }

    private static boolean analyzeNumbers(ArrayList<Integer> numbers) {
        int evenCount = 0;
        int oddCount = 0;
        Iterator<Integer> iterator = numbers.iterator();

        while (iterator.hasNext()) {
            int number = iterator.next();

            if (number % 2 == 0)
                evenCount++;
            else
                oddCount++;
        }

        return evenCount == oddCount;
    }
}
