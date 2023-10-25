public class FiguraGeometrica {
    public double calcolaArea() {
        return 0.0;
    }

    public double calcolaPerimetro() {
        return 0.0;
    }

    public int confronta(FiguraGeometrica altraFigura) {
        double area1 = this.calcolaArea();
        double area2 = altraFigura.calcolaArea();

        if (area1 > area2) {
            return 1;
        } else if (area1 < area2) {
            return -1;
        } else {
            return 0;
        }
    }
}

