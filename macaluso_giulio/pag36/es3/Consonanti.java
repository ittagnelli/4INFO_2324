public class Consonanti {
    private String stringa;
    private int risultato;

    public Consonanti(String stringa_enter) {
        stringa = stringa_enter;
        risultato = 0;
    }

    public void CalcolaConsonanti() {
        int valore = 0;

        for(int i = 0; i < stringa.length(); i++) {
            if((i + 3) < stringa.length()) {
                for(int j = i; j < (i + 3); j++)
                    if("AEOIU".indexOf(stringa.charAt(i)) >= 0) {
                        valore = 1;
                        break;
                    }
            }
            if(valore == 1) break;
            valore = 0;
        }

        if(valore == 0) risultato = 0;
    }

    public String toString(){
        return "Valore : " + risultato;
    }
}
