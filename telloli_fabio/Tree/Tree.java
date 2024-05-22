import java.util.List;

public class Tree {
    private Node root = null;
   


    public void arrayToTree(int[] array){
        root = array_To_Tree_Recursive(array, 0, array.length);
    }
 
    public Node array_To_Tree_Recursive(int[] array, int start, int len){
        Node nodo = new Node(array[start]);
        
        
        if(start >= len){
            return null;
        }

            nodo.left =  array_To_Tree_Recursive(array, 2 * start + 1, len);
            nodo.right = array_To_Tree_Recursive(array, 2 * start + 2, len);
    
            return nodo;
    }

    public void add(int valore) {
        root = addRicorsive(root, valore);
    }

    public Node addRicorsive(Node corrente, int valore) {
        
        if (corrente == null) {
            return new Node(valore);

        } 
        
        if (valore > corrente.val) {
            corrente.right = addRicorsive(corrente.right, valore);

        } else if (valore < corrente.val) {
            corrente.left = addRicorsive(corrente.left, valore);
        }
        return corrente;
        
    }

    public void DFS_inOrder() {
        this.DFS_inOrder(this.root);
    }

    public void DFS_inOrder(Node root) {
        if (root != null) {
            DFS_inOrder(root.left);
            System.out.println(root);
            DFS_inOrder(root.right);
        }
    }

    public void DFS_preOrder() {
        this.DFS_preOrder(this.root);
    }

    public void DFS_preOrder(Node root) {
        if (root != null) {
            System.out.println(root);
            DFS_preOrder(root.left);
            System.out.println(root);
            DFS_preOrder(root.right);
        }
    }

    public void DFS_postOrder() {
        this.DFS_postOrder(this.root);
    }

    public void DFS_postOrder(Node root) {
        if (root != null) {
            DFS_postOrder(root.left);
            DFS_postOrder(root.right);
            System.out.println(root);
        }
    }
}

class Node {
    public int val;
    public Node left;
    public Node right;

    Node(int val){
        this.val = val;
    }
}



class Main{
    public static void main(String args[] ){
        Tree t = new Tree();


        t.add(20);
        t.add(9);
        t.add(50);
        t.add(7);
        t.add(11);
        t.add(34);
        t.add(54);

        t.DFS_inOrder();
        t.DFS_preOrder();
        t.DFS_postOrder();
    }
}
