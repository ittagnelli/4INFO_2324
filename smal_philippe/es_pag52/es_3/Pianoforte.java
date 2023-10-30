public class Pianoforte extends Strumento{
    protected int eta;

    public void setEta(int eta_enter) {
        eta = eta_enter;
    }

    @Override
    public String toString() {
        return super.toString() + "\nEta : " + eta + "anni";
    }
}
