public class ProvaArray {
    public static void main(String[] args) {
        int[] array = {1, 4, 10, 2, 8};
        MyArray arr = new MyArray(array);
        int[] temp = arr.scramble();

        for(int i = 0; i < temp.length; i++){
            System.out.println(temp[i]);
        }
    }
}
