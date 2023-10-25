public class MyArrayProva {
    public static void main(String[] args) {
        int[] my_array_2 = {1, 2, 3, 4, 5, 6, 7};
        MyArray my_array = new MyArray(my_array_2);
        System.out.println(my_array);
        my_array.scramble();
        System.out.println(my_array);
    }
}
