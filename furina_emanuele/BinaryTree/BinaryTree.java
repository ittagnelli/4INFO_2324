import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    Node root;

    public BinaryTree() {
        root = null;
    }

    public void BinaryBulder(int[] heap) {
        root = BinaryTreeRecursive(heap, 0, heap.length - 1);
    }

    private Node BinaryTreeRecursive(int[] heap, int start, int end) {
        if (start > end) {
            return null;
        }

        int minIndex = start;
        for (int i = start + 1; i <= end; i++) {
            if (heap[i] < heap[minIndex]) {
                minIndex = i;
            }
        }

        Node node = new Node(heap[minIndex]);

        node.left = BinaryTreeRecursive(heap, start, minIndex - 1);
        node.right = BinaryTreeRecursive(heap, minIndex + 1, end);

        return node;
    }

    public void addNode(int value) {
        root = addRecursive(root, value);
    }

    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        }
        return current;
    }

    public void BFSVisit() {
        if (root == null) {
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node currentNode = queue.poll();
            System.out.println(currentNode.value + "");

            if (currentNode.left != null) {
                queue.add(currentNode.left);
            }

            if (currentNode.right != null) {
                queue.add(currentNode.right);
            }
            System.out.println();
        }
    }

    public void BtsInOrder(Node root) {
        this.root = null;
    }

    public void BtsInorderRecursive(Node node) {
        if (node == null)
            return;
        BtsInorderRecursive(node.left);
        System.out.println(node.value);
        BtsInorderRecursive(node.right);
    }

    public void BtsPreOrder() {
        this.root = null;
    }

    public void BtsPreOrderRecursive(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node.value);
        BtsPreOrderRecursive(node.left);
        BtsPreOrderRecursive(node.right);
    }

    public void BtsPostOrder() {
        this.root = null;
    }

    public void BtsPostOrderRecursive(Node node) {
        if (node == null) {
            return;
        }
        BtsPreOrderRecursive(node.left);
        BtsPreOrderRecursive(node.right);
        System.out.println(node.value);
    }

    public boolean BtsSearch(Node node, int val){
        if (node == null) {
            return false;   
        }
        if (BtsSearch(node.left, val)) {
            return true;
        }
        if (node.value == val) {
            return true;
        }
        return BtsSearch(node.right, val);
    }
}
