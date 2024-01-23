import java.util.Random;
public class NumeriCasualiGenerator {
    public static int[] generaNumeriCasuali() {
        Random random = new Random();
        int[] numeriCasuali = new int[100];
        int index = 0;
        while (true) {
            int numeroCasuale = random.nextInt(21) + 20;
            numeriCasuali[index++] = numeroCasuale;
            if (numeroCasuale % 5 == 0) {
                break;
            }
        }
        int[] result = new int[index];
        System.arraycopy(numeriCasuali, 0, result, 0, index);

        return result;
    }
}
