import java.util.Scanner;

public class NumeriReader {
    public static int[] leggiNumeri(Scanner scanner) {
        int maxSize = 1000;
        int[] numeri = new int[maxSize];
        int index = 0;
        while (true) {
            int numero = scanner.nextInt();
            if (numero == 0) {
                break;
            }
            numeri[index++] = numero;
        }
        int[] result = new int[index];
        System.arraycopy(numeri, 0, result, 0, index);
        return result;
    }
}
