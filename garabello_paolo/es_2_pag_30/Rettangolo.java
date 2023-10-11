public class Rettangolo {
    private int bas;
    private int height;
    private int perimetro;
    private int area;

    public Rettangolo(){
        bas = 0;
        height = 0;
        calcArea();
        calcPerimetro();
    }

    public Rettangolo(int base, int altezza){
        setBase(base);
        setAltezza(altezza);
        calcArea();
        calcPerimetro();
    }

    public void setBase(int base){
        bas = base;
        calcArea();
        calcPerimetro();
    }

    public void setAltezza(int altezza){
        height = altezza;
        calcArea();
        calcPerimetro();
    }

    public int getBase(){
        return bas;
    }


    public int getAltezza(){
        return height;
    }

    private void calcPerimetro(){
        perimetro = 2 * (bas + height);
    }

    private void calcArea(){
        area = bas * height;
    }

    public int getPerimetro(){
        return perimetro;
    }


    public int getArea(){
        return area;
    }
}
