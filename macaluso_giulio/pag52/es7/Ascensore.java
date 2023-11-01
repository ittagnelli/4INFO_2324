public class Ascensore extends Montacarichi {
    private int piano;

    public Ascensore(int pa, int pi, int a) {
        super(pa, a);
        piano = pi;
    }

    public int spo() {
        return piano;
    }

    @Override
    public void stampa() {
        super.stampa();
        System.out.println("piano: " + piano);
    }
}
