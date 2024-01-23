public class Terrestre extends Animale {
    protected int zampe;

    public void setZampe(int z) {
        zampe = z;
    }
    public int getZampe() {
        return zampe;
    }
    @Override
    public void stampa() {
        super.stampa();
        System.out.println("numero zampe: " + zampe);
    }

}
