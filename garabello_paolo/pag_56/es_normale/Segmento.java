public class Segmento {
    private final static int LUNGHEZZA = 5;
    private Punto estremoSx;
    private Punto estremoDx;    
    private int lunghezza;

    public Segmento(Punto estremoSx, int lunghezza){
        this.estremoSx = estremoSx;
        this.lunghezza = lunghezza;
        this.estremoSx.setAll(estremoSx);;
        this.estremoDx.setAll(estremoSx);
        estremoDx.setX(estremoSx.getX() + lunghezza);
    }

    public Segmento(int lunghezza){
        estremoDx.setAll(0, 0);
        if(lunghezza != 0){
            estremoSx.setAll(lunghezza, 0);
            this.lunghezza = lunghezza;
        } else {
            estremoSx.setAll(LUNGHEZZA, 0);
            this.lunghezza = lunghezza;
        }
    }

    public Segmento(Punto left, Punto right){
        estremoSx.setAll(left);
        if(left.getY() == right.getY()){
            estremoDx.setAll(right);
            lunghezza = (right.getX() - left.getX());
        } else {
            estremoDx.setAll(left.getY(), LUNGHEZZA);
            lunghezza = LUNGHEZZA;
        }
    }

    public Punto getEstremoSx() {
        return estremoSx;
    }

    public Punto getEstremoDx() {
        return estremoDx;
    }

    public int getLunghezza() {
        return lunghezza;
    }

    public Boolean inclusoIn(Segmento segmento){
        if(segmento.getEstremoDx().getY() == this.estremoDx.getY())
           return (segmento.getEstremoSx().getX() < this.estremoSx.getX()) && (segmento.getEstremoDx().getX() > this.estremoDx.getX());
        return false;
    } 
}
