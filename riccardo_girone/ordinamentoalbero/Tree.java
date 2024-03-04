package ordinamentoalbero;

public class Tree {
    private Node root = null;

    public void heapToTree(int[] array) {
        root = heapToTreeRecorsive(array, 0, array.length);
    }

    public Node heapToTreeRecorsive(int[] array, int start, int len) {
        if(start >= len) {
            return null;
        }

        Node nodo = new Node(array[0]);
            
        nodo.left = heapToTreeRecorsive(array, 2 * start + 1, len);
        nodo.right = heapToTreeRecorsive(array, 2 * start + 2, len);

        return nodo;
    }

    public void addTree(int dato) {
        root = addTreeRecorsive(dato, root);
    }

    public Node addTreeRecorsive(int dato, Node nodo) {
        if(nodo == null) {
            return new Node(dato);
        }
        if(dato < nodo.val) {
            nodo.left = addTreeRecorsive(dato, nodo.left);
        } else if (dato > nodo.val) {
            nodo.right = addTreeRecorsive(dato, nodo.right);
        }
       return nodo;
    }

    public void DFS_inorder(Node nodo) {
        if(nodo != null) {
            DFS_inorder(nodo.left);
            System.out.println(nodo);
            DFS_inorder(nodo.right);
        }
    }
    
    public void DFS_postorder(Node nodo) {
        if(nodo != null) {
            DFS_inorder(nodo.left);
            DFS_inorder(nodo.right);
            System.out.println(nodo);
        }
    }
    
    public void DFS_preorder(Node nodo) {
        if(nodo != null) {
            System.out.println(nodo);
            DFS_inorder(nodo.left);
            System.out.println(nodo);
            DFS_inorder(nodo.right);
            System.out.println(nodo);
        }
    }

    public boolean find(int dato) {
        return findRecorisive(dato, root);
    }

    private boolean findRecorisive(int dato, Node nodo) {
        if(nodo != null) {
            if(dato < nodo.val) {
                return findRecorisive(dato, nodo.left);
            } else if (dato > nodo.val) {
                return findRecorisive(dato, nodo.right);
            } else return true;
        }

       return false;
    }
}