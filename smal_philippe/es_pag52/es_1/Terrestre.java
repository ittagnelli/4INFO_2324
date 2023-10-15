public class Terrestre extends Animale {
    protected int num_zampe;

    public void setNumeroZampe(int zampe_enter) {
        num_zampe = zampe_enter;
    }

    public int getNumeroZampe() {
        return num_zampe;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNumero zampe : " + num_zampe;
    }

}

