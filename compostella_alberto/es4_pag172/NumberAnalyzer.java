import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class NumberAnalyzer {
    public static boolean hasDuplicates(ArrayList<Integer> numbers) {
        Map<Integer, Integer> occurrences = new HashMap<>();

        for (int num : numbers) {
            occurrences.put(num, occurrences.getOrDefault(num, 0) + 1);
        }

        for (int count : occurrences.values()) {
            if (count < 2) {
                return false;
            }
        }

        return true;
    }
}
