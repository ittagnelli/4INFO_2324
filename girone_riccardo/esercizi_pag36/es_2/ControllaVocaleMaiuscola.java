public class ControllaVocaleMaiuscola {
    public static boolean contieneVocaleMaiuscola(String input) {
        for (int i = 0; i < input.length(); i++) {
            char carattere = input.charAt(i);
            if ("AEIOU".indexOf(carattere) >= 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String testString = "Ecco una Stringa di Test";
        boolean contieneMaiuscola = contieneVocaleMaiuscola(testString);
        
        if (contieneMaiuscola) {
            System.out.println("La stringa contiene almeno una vocale maiuscola.");
        } else {
            System.out.println("La stringa non contiene vocali maiuscole.");
        }
    }
}
