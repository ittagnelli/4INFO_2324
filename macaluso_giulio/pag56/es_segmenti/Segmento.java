public class Segmento {
    private Punto left, right;
    private int len;
    private float pendenza;

    Segmento(Punto left, int len) {
        this.left = left;
        right = new Punto(left.getx() + len, left.gety());
    }

    Segmento(int len) {
        left = new Punto(0, 0);
        right = new Punto(len, 0);
    }

    Segmento(Punto left, Punto right) {
        this.left = left;
        this.right = right;
    }

    public Punto getLeft() {
        return left;
    }

    public Punto getRight() {
        return right;
    }

    private float calcolaPendenza() {
        pendenza = ((right.gety() - left.gety()) / (right.getx() - left.getx()));
        return pendenza;
    }

    public boolean include(Segmento seg) {
        return (((left.getx() <= seg.getLeft().getx()) && (right.getx() >= seg.getRight().getx())) &&
        (calcolaPendenza() == seg.calcolaPendenza()) && 
        ((left.gety() <= seg.getLeft().gety()) && (right.gety() >= seg.getRight().gety())));
    }
}
