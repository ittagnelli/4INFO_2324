import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static int TERMINATOR = 0;

    public static void main(String[] args) {
        ArrayList<Integer> numbers = readSequence();
        boolean result = checkDuplicate(numbers);
        System.out.println("Risultato: " + result);
    }

    private static ArrayList<Integer> readSequence() {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci una sequenza di numeri terminanti con "+ TERMINATOR + ":");
        
        int num;
        while ((num = scanner.nextInt()) != TERMINATOR) {
            numbers.add(num);
        }

        scanner.close();
        return numbers;
    }

    private static boolean checkDuplicate(ArrayList<Integer> numbers) {
        Iterator<Integer> iterator = numbers.iterator();
        Map<Integer, Integer> countMap = new HashMap<>();

        while (iterator.hasNext()) {
            int currentNumber = iterator.next();
            countMap.put(currentNumber, countMap.getOrDefault(currentNumber, 0) + 1);
        }

        for (int count : countMap.values()) {
            if (count < 2) {
                return false;
            }
        }

        return true;
    }
}
