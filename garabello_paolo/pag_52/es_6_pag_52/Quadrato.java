public class Quadrato extends Poligono{
    private int lato;

    public Quadrato(int lato){
        this.lato = lato;
        perimetro();
        area();
    }

    public void perimetro(){
        setPerimetro(lato*4);
    }

    public void area(){
        setArea((float)(lato*lato));
    }

    
}
