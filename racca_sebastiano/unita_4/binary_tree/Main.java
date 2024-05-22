import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Heap<Integer> heap = new Heap<Integer>(Arrays.asList(new Integer[] {20, 9, 50, 7, 11, 34, 54}));
        BinaryTree<Integer> tree = new BinaryTree<Integer>(heap);
        
        tree.add(15);

        System.out.println(tree);
    }
}