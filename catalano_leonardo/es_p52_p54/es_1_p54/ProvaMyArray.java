import java.util.Arrays;
public class ProvaMyArray {
    public static void main(String[] args) {
        int[] array1 = { 4, 9, 7, 13, 9 };
        MyArray myArray1 = new MyArray(array1);
        System.out.println(Arrays.toString(myArray1.single()));

        int[] array2 = { 7, 4, 13, 7, 13, 5 };
        MyArray myArray2 = new MyArray(array2);
        System.out.println(Arrays.toString(myArray2.single()));
    }
}
