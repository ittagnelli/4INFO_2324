public class Tree {
    private Node root = null;

    public void arrayToTree(int[] array){
        root = arrayToTreeRecursive(array, 0, array.length);
    }

    public boolean search(int value) {
        return searchRecursive(root, value);
    }

    private boolean searchRecursive(Node node, int value) {
        if (node == null) {
            return false;
        }

        if (node.valore == value) {
            return true;
        }

        return searchRecursive(node.left, value) || searchRecursive(node.right, value);
    }

    private Node arrayToTreeRecursive(int[] array, int start, int len){
        if(start >= len){
            return null;
        }
       
        Node nodo = new Node(array[start]);

        nodo.left =  arrayToTreeRecursive(array, 2 * start + 1, len);
        nodo.right = arrayToTreeRecursive(array, 2 * start + 2, len);
    
        return nodo;
    }
}

class Node {
    public int valore;
    public Node left;
    public Node right;

    Node(int valore){
        this.valore = valore;
    }
}

class Main {
    public static void main(String args[] ){
        int[] array = {20, 9, 50, 7, 11, 34, 54};
        Tree t = new Tree();
        t.arrayToTree(array);

        int valoreDaCercare = 11;
        boolean trovato = t.search(valoreDaCercare);
        if (trovato) {
            System.out.println("Il valore " + valoreDaCercare + " è presente");
        } else {
            System.out.println("Il valore " + valoreDaCercare + " non è presente");
        }
    }
}
