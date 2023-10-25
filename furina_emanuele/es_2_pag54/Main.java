public class Main {
    public static void main(String[] args) {
        int[] array1 = {4, 1, 2, 8, 6};
        MyArray myArray1 = new MyArray(array1);
        myArray1.scramble();
        myArray1.printArray();
        int[] array2 = {12, 4, 7, 2, 8, 6};
        MyArray myArray2 = new MyArray(array2);
        myArray2.scramble();
        myArray2.printArray();
    }
}
