public class Comparazione{
    private String string;
    private int risultato;

    public Comparazione(String string_enter) {
        risultato = 0;
        string = string_enter;  
    }

    private int Equals_String(String string_1, String string_2) {
        int valore = string_1.indexOf(string_2);
        if(valore == 0)valore = 0;
        else if(valore < 0) valore *= -1;

        return valore;
    }

    public void CalcolaStringa(String string_2) {
        int valore_1 = Equals_String(string, string_2);
        int valore_2 = Equals_String(string_2, string);

        if(valore_1 == valore_2) risultato = 0;
        else risultato = string.length() - (valore_1 + valore_2);
    }

    public String toString(){
        return "Valore : " + risultato;
    }
}
