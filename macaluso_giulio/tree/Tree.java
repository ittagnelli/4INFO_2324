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

    public void visualizzaInOrder() {
        visualizzaInOrderRecorsive(root);
    }

    private void visualizzaInOrderRecorsive(Node nodo) {
        if(nodo != null) {
            visualizzaInOrderRecorsive(nodo.left);
            System.out.print(nodo.val + " - ");
            visualizzaInOrderRecorsive(nodo.right);
        }
    }

    public void visualizzaPreOrder() {
        visualizzaPreOderRecorsive(root);
    }

    private void visualizzaPreOderRecorsive(Node nodo) {
        if(nodo != null) {
            System.out.print(nodo.val + " - ");
            visualizzaPreOderRecorsive(nodo.left);
            visualizzaPreOderRecorsive(nodo.right);
        }
    }

    public void visualizzaPostOrder() {
        visualizzaPostOrderRecorsive(root);
    }

    private void visualizzaPostOrderRecorsive(Node nodo) {
        if(nodo != null) {
            visualizzaPostOrderRecorsive(nodo.left);
            visualizzaPostOrderRecorsive(nodo.right);
            System.out.print(nodo.val + " - ");

        }
    }

    public boolean find(int val) {
        return findRecorsive(val, root);
    }
    
    private boolean findRecorsive(int val, Node nodo) {
        if(nodo != null) {
            if(val < nodo.val) {
                return findRecorsive(val, nodo.left);
            } else if(val > nodo.val) {
                return findRecorsive(val, nodo.right);
            } else {
                return true;
            }
        }
        return false;
    }
}