import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static Map<Integer, Integer> frequenza(ArrayList<Integer> array) {
        Iterator<Integer> iterator = array.iterator();
        Map<Integer, Integer> countMap = new HashMap<>();

        while (iterator.hasNext()) {
            int currentNumber = iterator.next();
            countMap.put(currentNumber, countMap.getOrDefault(currentNumber, 0) + 1);
        }

        return countMap;
    }

    public static ArrayList<Integer> eliminaDuplicati(ArrayList<Integer> array) {
        Iterator<Integer> iterator = array.iterator();

        while (iterator.hasNext()) {
            Integer num = iterator.next();
            if(array.indexOf(num) != array.lastIndexOf(num)) {
                iterator.remove();
            }
        }

        return array;
    }

    public static ArrayList<Integer> seleziona(ArrayList<Integer> array, int num) {
        array.removeIf(i -> i < num);
        return array;
    }

    public static boolean isOrdered(ArrayList<Integer> array) {
        ArrayList<Integer> copy = new ArrayList<Integer>(array);
        Collections.sort(copy);
        return copy.equals(array);
    }

    public static ArrayList<Integer> sostituisci(ArrayList<Integer> array, int num1, int num2) {
        Collections.replaceAll(array, num1, num2);
        return array;
    }

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>(Arrays.asList(1, 10, 1, 2, 2, 3, 3, 10, 3, 4, 5, 5));
        System.out.println(frequenza(lista));
        System.out.println(eliminaDuplicati(lista));
        System.out.println(seleziona(lista, 4));
        System.out.println(isOrdered(lista));
        System.out.println(sostituisci(lista, 10, -5));
    }
}