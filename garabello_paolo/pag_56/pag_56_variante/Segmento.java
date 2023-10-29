public class Segmento {
    private Punto left;
    private Punto right;    

    Segmento(Punto p1, Punto p2){
       if(p1.getX() >= p2.getX()){
        right = p1;
        left = p2;
       }else {
        left = p1;
        right = p2;
       }
    }

    public Punto getLeft() {
        return left;
    }

    public Punto getRight() {
        return right;
    }

    public double getLenght(){
        return Math.sqrt(Math.pow(right.getX() - left.getX(), 2) + Math.pow(Math.abs(right.getY() - left.getY()), 2));
    }

    private static double pendenza(Segmento segm){
        //System.out.println("y1 = " + segm.getLeft().getY() + " y2 = " + segm.getRight().getY() + " x1 = " + segm.getLeft().getX() + " x2 = " + segm.getRight().getX());
        return (segm.getLeft().getY()-segm.getRight().getY())/(segm.getLeft().getX()-segm.getRight().getX());
    }

    public Equazione equation(){
        Equazione eq = new Equazione(pendenza(this));
        eq.setQ(left.getY() - (eq.getM() * left.getX()));
        return eq;
    }

    public Boolean includes(Segmento seg){
        if(pendenza(this) == pendenza(seg)){
            Equazione eq = equation();
            if(eq.getY(seg.getLeft().getX()) == seg.getLeft().getY()){
                if((seg.getLeft().getX() >= this.left.getX()) && (seg.getRight().getX() <= this.right.getX())){
                    return true;
                } 
            }
        }
        return false;
    }
}
