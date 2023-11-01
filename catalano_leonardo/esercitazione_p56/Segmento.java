package esercizi_informatica;

public class Segmento {
    private Punto left, right;

    Segmento(Punto left, int lung) {
        this.left = left;
        right = new Punto(left.getX() + lung, left.getX());
    }

    Segmento(int lung) {
        left = new Punto(0, 0);
        right = new Punto(lung, 0);
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
    public int getLenth() {
        return (right.getX() - left.getX());
    }

    private float calcolaPendenza() {
        int delta_y = left.getY() - right.getY();
        int delta_x = left.getX() - right.getX();
        return  delta_y / delta_x;
    }

    private boolean include(Segmento seg) {
        return (left.getX() <= seg.getLeft().getX()) && 
                (right.getX() >= seg.getRight().getX());
    }

    public boolean inclusoIn(Segmento seg) {
        if(calcolaPendenza() == seg.calcolaPendenza()) {
            return include(seg);
        }

        return false;
    }

}