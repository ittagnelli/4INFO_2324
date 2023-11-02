public class Stringa2 {
    public static boolean contieneVocaleMaiuscola(String s) {
        for (int i = 0; i < s.length(); i++) {
            char carattere = s.charAt(i);
            if (Character.isUpperCase(carattere) && isVocale(carattere)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isVocale(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }
}

