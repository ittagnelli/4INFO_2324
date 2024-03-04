public class BinaryTreeNode<T extends Comparable<T>> {
    private T value;
    private BinaryTreeNode<T> right;
    private BinaryTreeNode<T> left;

    BinaryTreeNode(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setRight(BinaryTreeNode<T> right) {
        this.right = right;
    }

    public BinaryTreeNode<T> getRight() {
        return right;
    }

    public void setLeft(BinaryTreeNode<T> left) {
        this.left = left;
    }

    public BinaryTreeNode<T> getLeft() {
        return left;
    }

    @Override
    public String toString() {
        return "Node(val: " + this.value + ", left: " + this.left +", rigth: " + this.right + ")";
    }
}
