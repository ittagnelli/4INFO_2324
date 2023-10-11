public class Stringa {
    private int contatore;
    private int contatoreVocali;
    private int contatoreConsonanti;
    private String frase;

    public Stringa(String parola) {
        contatoreVocali = 0;
        contatore = 0;
        contatoreConsonanti = 0;
    }

    public int controlloOccorrenze(char[] stringa, int lun, char lettera) {
        for(int i = 0; i < lun; i ++) {
            if(stringa[i] == lettera){
                contatore ++;
            }
        }
        return contatore;
    }

    public void controlloVocali() {
        for(int i = 0; i < frase.length(); i++) {
            if((Character.toLowerCase(frase.charAt(i)) == 'a') || 
            (Character.toLowerCase(frase.charAt(i)) == 'e') ||
            (Character.toLowerCase(frase.charAt(i)) == 'i') ||
            (Character.toLowerCase(frase.charAt(i)) == 'o') ||
            (Character.toLowerCase(frase.charAt(i)) == 'u')){
                contatoreVocali++;
            }
        }
    }

    public void controlloConsonanti() {
        for(int i = 0; i < frase.length(); i++) {
            if((Character.toLowerCase(frase.charAt(i)) != 'a') || 
            (Character.toLowerCase(frase.charAt(i)) != 'e') ||
            (Character.toLowerCase(frase.charAt(i)) != 'i') ||
            (Character.toLowerCase(frase.charAt(i)) != 'o') ||
            (Character.toLowerCase(frase.charAt(i)) != 'u')){
                contatoreConsonanti++;
            }
        }
    }
    
    public String toString() {
        return "Occorenze vocali: " + contatoreVocali +"Occorenze consonanti: " + contatoreConsonanti;
    }
}
