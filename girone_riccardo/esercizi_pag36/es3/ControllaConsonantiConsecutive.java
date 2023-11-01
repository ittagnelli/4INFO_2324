public class ControllaConsonantiConsecutive {
    public static boolean contieneTreConsonantiConsecutive(String input) {
        int conteggioConsonantiConsecutive = 0;
        
        for (int i = 0; i < input.length(); i++) {
            char carattere = input.charAt(i);
            if (Character.isLetter(carattere) && !isVocale(carattere)) {
                conteggioConsonantiConsecutive++;
                if (conteggioConsonantiConsecutive >= 3) {
                    return true;
                }
            } else {
                conteggioConsonantiConsecutive = 0;
            }
        }
        return false;
    }

    public static boolean isVocale(char carattere) {
        char maiuscolo = Character.toUpperCase(carattere);
        return maiuscolo == 'A' || maiuscolo == 'E' || maiuscolo == 'I' || maiuscolo == 'O' || maiuscolo == 'U';
    }

    public static void main(String[] args) {
        String testString = "Ecco una Stringa di Test con Consonanti Consecutive";
        boolean contieneConsonantiConsecutive = contieneTreConsonantiConsecutive(testString);
        
        if (contieneConsonantiConsecutive) {
            System.out.println("La stringa contiene almeno tre consonanti consecutive.");
        } else {
            System.out.println("La stringa non contiene tre consonanti consecutive.");
        }
    }
}
