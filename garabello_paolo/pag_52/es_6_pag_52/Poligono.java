public class Poligono{
    private float area;
    private int perimetro;

    public void setArea(float area){
        this.area = area;
    }

    public void setPerimetro(int perimetro){
        this.perimetro = perimetro;
    }

    public float getArea(){
        return area;
    }

    public int getPerimetro(){
        return perimetro;
    }

    public void confronta(Ottagono poligono){
        System.out.println("Perimetro = " + getPerimetro() + " altro perimetro = " + poligono.getPerimetro());
        System.out.println("Area = " + getArea() + " altra Area = " + poligono.getArea());
    }

    public void confronta(Rettangolo poligono){
        System.out.println("Perimetro = " + getPerimetro() + " altro perimetro = " + poligono.getPerimetro());
        System.out.println("Area = " + getArea() + " altra Area = " + poligono.getArea());
    }

    public void confronta(Quadrato poligono){
        System.out.println("Perimetro = " + getPerimetro() + " altro perimetro = " + poligono.getPerimetro());
        System.out.println("Area = " + getArea() + " altra Area = " + poligono.getArea());
    }

    public void confronta(TriangoloIsoscele poligono){
        System.out.println("Perimetro = " + getPerimetro() + " altro perimetro = " + poligono.getPerimetro());
        System.out.println("Area = " + getArea() + " altra Area = " + poligono.getArea());
    }

}