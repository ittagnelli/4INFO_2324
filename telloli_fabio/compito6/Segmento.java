public class Segmento {
    private Punto dx, sx;

    public Segmento(Punto sx, int lung) {
        this.sx = sx;
        dx = new Punto(sx.getX() + lung, sx.getX());
    }

    public Segmento(Punto sx, Punto dx) {
        this.sx = sx;
        this.dx = dx;
    }

    public Punto getSx() {
        return sx;
    }

    public Punto getDx() {
        return dx;
    }

    public int getLung() {
        return (dx.getX() - sx.getX());
    }
    
    public boolean compreso(Segmento seg) {
        return (sx.getX() <= seg.getSx().getX()) && (dx.getX() >= seg.getDx().getX());
    }

}
