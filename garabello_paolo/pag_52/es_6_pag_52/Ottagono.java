public class Ottagono extends Poligono{
    private int lato;

    public Ottagono(int lato){
        this.lato = lato;
        perimetro();
        area();
    }

    public void perimetro(){
        setPerimetro(lato*8);
    }

    public void area(){
        setArea((float)(lato*lato*4.828));
    }

    
}
