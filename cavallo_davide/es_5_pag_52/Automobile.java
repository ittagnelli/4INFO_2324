public class Automobile extends MezzoDiTrasporto {
    int cilindrata;

    public Automobile(int cilindrata) {
        cilindrata = cilindrata;
    }

    public void accelera() {
        System.out.println("L'automobile sta accelerando.");
    }

    public void frena() {
        System.out.println("L'automobile sta frenando.");
    }
}
