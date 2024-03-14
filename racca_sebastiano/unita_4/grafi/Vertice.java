public class Vertice<T> {
    private T value;

    public Vertice(T value) {
        this.value = value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return this.value.toString();
    }

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object obj) {
        return obj == null ? false : ((Vertice<T>)obj).value == this.value;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
