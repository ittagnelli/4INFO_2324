public class Punto {
    private int x;
    private int y;

    public Punto(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setAll(int x, int y){
        this.y = y;
        this.x = x;
    }

    public void setAll(Punto punto){
        setAll(punto.getX(), punto.getY());
    }
}
