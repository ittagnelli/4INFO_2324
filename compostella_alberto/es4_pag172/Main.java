import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = readNumbers();

        boolean result = NumberAnalyzer.hasDuplicates(numbers);
        System.out.println("Ogni elemento è presente almeno due volte? " + result);
    }

    private static ArrayList<Integer> readNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);


        while (true) {
            int num = scanner.nextInt();

            if (num == 0) {
                break;
            }

            numbers.add(num);
        }

        return numbers;
    }
}
