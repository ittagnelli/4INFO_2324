public class Segmento {
    private double x1, y1, x2, y2;

    public Segmento(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double getLunghezza() {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public boolean eInclusoIn(Segmento altro) {
        boolean inizioInterno = ePuntoInterno(altro.x1, altro.y1);
        boolean fineInterno = ePuntoInterno(altro.x2, altro.y2);

        return inizioInterno && fineInterno;
    }

    private boolean ePuntoInterno(double x, double y) {
        double minX = Math.min(x1, x2);
        double maxX = Math.max(x1, x2);
        double minY = Math.min(y1, y2);
        double maxY = Math.max(y1, y2);

        return (x >= minX && x <= maxX) && (y >= minY && y <= maxY);
    }
}
