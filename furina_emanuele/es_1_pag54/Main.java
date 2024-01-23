import java.util.Arrays;

public class Main {
        public static void main(String[] args) {
        int[] array1 = {4, 9, 7, 13, 9};
        MyArray myArray1 = new MyArray(array1);

        int numeroCercato = 7;
        boolean trovato = myArray1.cerca(numeroCercato);
        System.out.println("Il numero " + numeroCercato + " è stato trovato nel mioArray: " + trovato);

        int[] arraySenzaDuplicati = myArray1.single();
        System.out.println("Array senza duplicati: " + Arrays.toString(arraySenzaDuplicati));

        int[] array2 = {7, 4, 13, 7, 13, 5};
        MyArray myArray2 = new MyArray(array2);

        numeroCercato = 10;
        trovato = myArray2.cerca(numeroCercato);
        System.out.println("Il numero " + numeroCercato + " è stato trovato nel mioArray: " + trovato);

        arraySenzaDuplicati = myArray2.single();
        System.out.println("Array senza duplicati: " + Arrays.toString(arraySenzaDuplicati));
    }
}
