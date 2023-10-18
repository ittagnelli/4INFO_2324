public class Stringa3 {
    public static boolean contieneTreConsonantiConsecutive(String s) {
        int conteggioConsonantiConsecutive = 0;

        for (int x = 0; x < s.length(); x++) {
            char carattere = s.charAt(x);

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

    private static boolean isVocale(char c) {

        return "AEaeiou".indexOf(c) != -1;
    }
}
