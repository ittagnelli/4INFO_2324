public class Equazione {
    private double m;
    private double q;
    
    Equazione(double m, double q){
        this.m = m;
        this.q = q;
    }

    Equazione(double m){
        this.m = m;
    }

    public void setM(double m) {
        this.m = m;
    }

    public void setQ(double q) {
        this.q = q;
    }

    public double getM() {
        return m;
    }

    public double getQ() {
        return q;
    }

    public double getY(int x){
        return  (m * x) + q;
    }
}
