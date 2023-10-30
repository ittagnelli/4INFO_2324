public class ArrayProva {
    public static void main(String[] args) {
        int[] my_array_2 = {1, 2, 2, 3, 4, 4, 5};
        MyArray my_array = new MyArray(my_array_2);
        System.out.println("Il numero 4 e' presente? = " + my_array.cerca(4));
        System.out.println(my_array);
        my_array.single();
        System.out.println(my_array);
    }
}
