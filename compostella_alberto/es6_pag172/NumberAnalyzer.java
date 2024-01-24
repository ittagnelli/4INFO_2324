import java.util.ArrayList;
import java.util.Random;


public static boolean equalParity(ArrayList<Integer> numbers) {
        int evenCount = 0;
        int oddCount = 0;

        for (int num : numbers) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        return evenCount == oddCount;
    }
}
