public class TriangoloIsoscele extends Poligono{
    private int base;
    private int altezza;
    private int latoObliquo;

    public TriangoloIsoscele(int base, int altezza, int latoObliquo){
        this.base = base;
        this.altezza = altezza;
        this.latoObliquo = latoObliquo;
        perimetro();
        area();
    }

    public void perimetro(){
        setPerimetro(base+(latoObliquo*2));
    }

    public void area(){
        setArea((float)(base*altezza/2));
    }
}
