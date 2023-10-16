public class MezziDiTrasporto {
    private String[] luoghi;

    public MezziDiTrasporto(String luogoDiGuida) {
        luoghi = new String[] { luogoDiGuida };
    }

    public MezziDiTrasporto(String[] luoghiDiGuida) {
        luoghi = luoghiDiGuida;
    }

    public String toString() {
        String str = "Luoghi di guida: ";

        for (int i = 0; i < luoghi.length; i++) {
            str = str.concat(luoghi[i]);
            if (i < luoghi.length - 1) {
                str = str.concat(", "); // Add a comma and space between elements
            }
        }

        return str;
    }
}