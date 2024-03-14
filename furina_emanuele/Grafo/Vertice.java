import java.util.Objects;

public class Vertice {
    private String label;

    public Vertice(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vertice vertice = (Vertice) o;
        return label.equals(vertice.label);
    }

    @Override
    public int hashCode() {
        return label.hashCode();
    }
}