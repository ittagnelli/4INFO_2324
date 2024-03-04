import java.util.Set;
import java.util.Collection;
import java.util.Iterator;

public class BinaryTree<T extends Comparable<T>> implements Set<T> {
    private BinaryTreeNode<T> root;
    private int size;

    BinaryTree() {
        this.size = 0;
        this.root = null;
    }

    BinaryTree(Heap<T> heap) {
        this.heapToTree(heap);
    }

    private void heapToTree(Heap<T> heap) {
        this.root = this.recursiveHeapToTree(heap, 0);
    }

    private BinaryTreeNode<T> recursiveHeapToTree(Heap<T> heap, int start) {
        if(start >= heap.size()) {
            return null;
        }

        BinaryTreeNode<T> temp_root = new BinaryTreeNode<T>(heap.get(start));

        temp_root.setLeft(this.recursiveHeapToTree(heap, (2 * start) + 1));
        temp_root.setRight(this.recursiveHeapToTree(heap, (2 * start) + 2));

        return temp_root;
    }

    public boolean add(T value) {
        if (value == null) {
            throw new NullPointerException("BinaryTree does not support null elements");
        }
        
        if (root == null) {
            root = new BinaryTreeNode<>(value);
            this.size++;
            return true;
        }

        if (this.addRecursive(value, root)) {
            size++;
            return true;
        }
        return false;
    }

    private boolean addRecursive(T value, BinaryTreeNode<T> current) {
        if (current.getValue().equals(value))
            return false;

        if (value.compareTo(current.getValue()) < 0) {
            if (current.getLeft() == null) {
                current.setLeft(new BinaryTreeNode<>(value));
                return true;
            }

            return this.addRecursive(value, current.getLeft());
        }

        if (current.getRight() == null) {
            current.setRight(new BinaryTreeNode<>(value));
            return true;
        }

        return this.addRecursive(value, current.getRight());
    }
    
    @Override
    public boolean contains(Object o) {
        if (o == null || root == null)
            return false;
        try {
            @SuppressWarnings("unchecked")
            T value = (T) o;
            return this.containsValue(value, root);
        } catch (ClassCastException e) {
            return false;
        }
    }

    private boolean containsValue(T value, BinaryTreeNode<T> node) {
        if (node == null)
            return false;
        int comparison = value.compareTo(node.getValue());
        if (comparison == 0)
            return true;
        else if (comparison < 0)
            return containsValue(value, node.getLeft());
        else
            return containsValue(value, node.getRight());
    }

    @Override
    public Iterator<T> iterator() {
        throw new UnsupportedOperationException("Iterator not implemented for BinaryTree");
    }

    @Override
    public Object[] toArray() {
        throw new UnsupportedOperationException("toArray() not implemented for BinaryTree");
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        throw new UnsupportedOperationException("toArray(T1[] a) not implemented for BinaryTree");
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException("remove(Object o) not implemented for BinaryTree");
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        throw new UnsupportedOperationException("containsAll(Collection<?> c) not implemented for BinaryTree");
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        throw new UnsupportedOperationException("addAll(Collection<? extends T> c) not implemented for BinaryTree");
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException("retainAll(Collection<?> c) not implemented for BinaryTree");
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException("removeAll(Collection<?> c) not implemented for BinaryTree");
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("clear() not implemented for BinaryTree");
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        return root == null ? "Empty tree" : root.toString();
    }
}
