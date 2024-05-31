public class Segmento {
    private Punto left, right;

    Segmento(Punto p1, Punto p2) {
        
        if(p1.getX() >= p2.getX()) {
            right = p1;
            left = p2;
        } else {
            right = p2;
            left = p1;
        }

    }

    public Punto getLeft() {
        return left;
    }

    public Punto getRight() {
        return right;
    }

    public float getLenght() {
        if(left.getY() == right.getY())
            return right.getX() - left.getX();
        
        
        return (float) Math.sqrt(
            Math.pow(Math.abs(right.getX() - left.getX()), 2) +
            Math.pow(Math.abs(right.getY() - left.getY()), 2)
        );
    }

    public float getPendenza() {
        return (left.getX() - right.getX()) / left.getY() - right.getY();
    }


    public boolean includes(Segmento segm) {
        if(this.getPendenza() != segm.getPendenza())
            return false;

        if (this.left.getX() <= segm.getLeft().getX() &&
            this.right.getX() >= segm.getRight().getX() &&
            Math.min(this.left.getY(), this.right.getY()) <= Math.min(segm.getLeft().getY(), segm.getRight().getY()) &&
            Math.max(this.left.getY(), this.right.getY()) >= Math.max(segm.getLeft().getY(), segm.getRight().getY())
            ){
            return true;
        }

        return false;
    }

}
