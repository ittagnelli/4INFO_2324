public class Vocale{
    private String stringa;
    private int risultato;

    public Vocale(String string_enter) {
        stringa = string_enter;
        risultato = 1;
    }

    public void CalcolaVocale() {
        for(int i = 0; i < stringa.length(); i++) {
            if("AEOIU".indexOf(stringa.charAt(i)) >= 0) {
                risultato = 0;
                break;
            }
        }
    }

    public String toString(){
        return "Valore : " + risultato;
    }
}
