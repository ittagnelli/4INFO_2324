import java.util.Arrays;

public class ProvaMyArray2 {
    public static void main(String[] args) {
        int[] array1 = { 4, 1, 2, 8, 6 };
        MyArray2 myArray1 = new MyArray2(array1);
        myArray1.scramble();
        System.out.println(Arrays.toString(myArray1.getMioArray()));

        int[] array2 = { 12, 4, 7, 2, 8, 6 };
        MyArray2 myArray2 = new MyArray2(array2);
        myArray2.scramble();
        System.out.println(Arrays.toString(myArray2.getMioArray()));
    }
}
