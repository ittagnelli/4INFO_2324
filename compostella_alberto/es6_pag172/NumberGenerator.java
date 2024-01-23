import java.util.ArrayList;
import java.util.Random;


class NumberGenerator {
    public static ArrayList<Integer> generateNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();


        while (true) {
            int num = random.nextInt(21) + 20; 
            numbers.add(num);

            if (num % 5 == 0) {
                break;
            }
        }

        System.out.println("Numeri generati: " + numbers);
        return numbers;
    }
}
