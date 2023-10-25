import java.util.Arrays;

public class MyArray {
    private int[] mioArray;

    public MyArray(int[] array) {
        mioArray = array;
    }

    public boolean cerca(int n) {
        for (int elemento : mioArray) {
            if (elemento == n) {
                return true;
            }
        }
        return false;
    }

    public int[] single() {
        int[] arraySenzaDuplicati = Arrays.stream(mioArray).distinct().toArray();
        return arraySenzaDuplicati;
    }
}
