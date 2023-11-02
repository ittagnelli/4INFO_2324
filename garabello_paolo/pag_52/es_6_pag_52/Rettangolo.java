public class Rettangolo extends Poligono{
    private int altezza;
    private int base;

    public Rettangolo(int altezza, int base){
        this.altezza = altezza;
        this.base = base;
        perimetro();
        area();
    }

    public void perimetro(){
        setPerimetro((base+altezza)*2);
    }

    public void area(){
        setArea((float)(base*altezza));
    }

    
}
