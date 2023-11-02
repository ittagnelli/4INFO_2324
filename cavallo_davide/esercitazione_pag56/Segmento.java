public class Segmento {
    private Punto left;
    private Punto right;
    private int lunghezza;

    public Segmento(Punto left, int lunghezza) {
        this.left = left;
        this.right = new Punto(left.getX() + lunghezza, left.getY());
        this.lunghezza = lunghezza;
    }

    public Segmento(int lunghezza) {
        this.left = new Punto(0, 0);
        if (lunghezza > 0) {
            this.lunghezza = lunghezza;
            this.right = new Punto(lunghezza, 0);
        } else {
            this.lunghezza = 1;
            this.right = new Punto(1, 0);
        }
    }

    public Segmento(Punto left, Punto right) {
        this.left = left;
        this.right = right;
        this.lunghezza = Math.abs(right.getX() - left.getX());
    }

    public Punto getLeft() {
        return left;
    }

    public Punto getRight() {
        return right;
    }

    public int getLength() {
        return lunghezza;
    }

    public boolean inclusione(Segmento altroSegmento) {
        return this.left.getX() <= altroSegmento.getLeft().getX() &&
               this.right.getX() >= altroSegmento.getRight().getX() &&
               this.left.getY() == altroSegmento.getLeft().getY() &&
               this.right.getY() == altroSegmento.getRight().getY();
    }
    
    public double getPendenza() {
        if (right.getX() == left.getX()) {
            return Double.POSITIVE_INFINITY; 
        } else {
            return (double) (right.getY() - left.getY()) / (right.getX() - left.getX());
        }
    }
}
