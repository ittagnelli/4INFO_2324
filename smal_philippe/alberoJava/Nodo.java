public class Nodo {
    public int value;
    public Nodo dx, sx;

    Nodo(int value) {
        this.value = value;
        sx = null;
        dx = null;
    }

    public String toString() {
        String q = "";
        q += value;
        if(sx != null) q += "( "+ sx +" )";
        else q+= "()";
        if(dx != null) q += "( "+ dx +" )";
        else q+= "()";
        return q;
    }
}
