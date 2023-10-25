public class ProvaArray {
    public static void main(String[] args) {
        int[] array = {2, 4, 5, 1, 1};
        MyArray arr = new MyArray(array);

        System.out.println(arr.cerca(2));
    }
}
