package es6_pg52;

public class Quadrato extends Poligono {
    protected double lato;
    
    public Quadrato(double lato) {
        super(4, lato);
    }

    public double calcolaArea() {
        return lato * lato;
    }
}
