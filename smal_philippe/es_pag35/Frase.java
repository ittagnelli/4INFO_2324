public class Frase {
    private int num_vocali;
    private int num_consonanti;
    private String frase;

    public Frase(String frase_enter) {
        frase = frase_enter;
        num_vocali = 0;
        num_consonanti = 0;
    } 

    public void numVocali() {
        for(int i = 0; i < frase.length(); i ++) {
            if((Character.toLowerCase(frase.charAt(i)) == 'a') ||
                    (Character.toLowerCase(frase.charAt(i)) == 'e') ||
                    (Character.toLowerCase(frase.charAt(i)) == 'i') ||
                    (Character.toLowerCase(frase.charAt(i)) == 'u') || 
                    (Character.toLowerCase(frase.charAt(i)) == 'o')) num_vocali ++;
        }
    }

    public void numConsonanti() {
        for(int i = 0; i < frase.length(); i ++) {
            if((Character.toLowerCase(frase.charAt(i)) != 'a') &&
                    (Character.toLowerCase(frase.charAt(i)) != 'e') &&
                    (Character.toLowerCase(frase.charAt(i)) != 'i') &&
                    (Character.toLowerCase(frase.charAt(i)) != 'u') &&
                    (Character.toLowerCase(frase.charAt(i)) != 'o')) num_consonanti ++;
        }
    }

    public String toString() {
        return "Numero di vocali : " + num_vocali + "\nNumero di consonanti : " + num_consonanti;
    }
}
