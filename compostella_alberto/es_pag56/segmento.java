public class Segmento {
    private Punto left, right;

    Segmento(Punto left, int lun) {
        this.left = left;
        right = new Punto(left.getX() - lun, left.getY());
    }

    Segmento(int lun) {
        left = new Punto(0, 0);
        right = new Punto(lun, 0);
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

    private float getPendenza() {
        int delta_y = left.getY() - right.getY();
        int delta_x = left.getX() - right.getX();
        return  delta_y / delta_x;
    }

    private boolean include(Segmento segmento) {
        return (left.getX() <= segmento.getLeft().getX()) && 
                (right.getX() >= segmento.getRight().getX());
    }

    public boolean inclusoIn(Segmento segmento) {
        if(getPendenza() == segmento.getPendenza()) {
            return include(segmento);
        }

        return false;
    }


}
