public class Ascensore extends Montacarichi {
    private int piano;

    public Ascensore(int partenza_enter, int piano_enter, int arrivo_enter) {
        super(partenza_enter, arrivo_enter);
        piano = piano_enter;
    }

    private boolean senso_ascenzore() {
        if(partenza < arrivo) return true;
        else return false;
    }

    public void spostamento() {
        if(senso_ascenzore()) {
            for(int i = partenza; i < arrivo; i++) {
                if(i == piano) break;
            }
        } else {
            for(int i = partenza; i < arrivo; i++) {
                if(i == piano) break;
            }
        }
    }
}
