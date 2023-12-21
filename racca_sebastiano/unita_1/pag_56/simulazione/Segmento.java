public class Segmento {
    private Punto left, right;

    Segmento(Punto left, float len) {
        this.left = left;
        right = new Punto(left.getX() + len, left.getY());
    }

    Segmento(float len) {
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

    public float getLenght() {
        return right.getX() - left.getY();
    }

    public boolean inclusoIn(Segmento segm) {
        return (left.getX() <= segm.getLeft().getX()) && (right.getX() >= segm.getRight().getX());
    }    
    
    
}
