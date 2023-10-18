public class Punto {
    double x, y, z;

    public Punto(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static void parsePoints(char[] text, List<Punto> points) {
        StringBuilder coordinate = new StringBuilder();
        double x = 0, y = 0, z = 0;
        boolean puntoCompletato = false;

        for (char c : text) {
            if (c == ',') {
                if (coordinate.length() > 0) {
                    if (!puntoCompletato) {
                        x = Double.parseDouble(coordinate.toString());
                    } else {
                        y = Double.parseDouble(coordinate.toString());
                    }
                    coordinate.setLength(0);
                }
            } else if (c == ' ' || c == '\0') {
                if (coordinate.length() > 0) {
                    z = Double.parseDouble(coordinate.toString());
                }
                points.add(new Punto(x, y, z));
                puntoCompletato = false;
                coordinate.setLength(0);
            } else {
                coordinate.append(c);
                puntoCompletato = true;
            }
        }
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
}
