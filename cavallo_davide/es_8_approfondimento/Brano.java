public class Brano {
    private String titolo;
    private CD cd;

    public Brano(String titolo, CD cd) {
        this.titolo = titolo;
        this.cd = cd;
    }

    public String getTitolo() {
        return titolo;
    }

    public CD getCD() {
        return cd;
    }
}
