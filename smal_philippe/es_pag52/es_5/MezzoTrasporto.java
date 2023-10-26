public class MezzoTrasporto {
    protected int num_ruote;

    public void setNumeroRuote(int num_ruote_enter) {
        num_ruote = num_ruote_enter;
    }

    public String toString() {
        return "\nRuote: " + num_ruote;
    }
}