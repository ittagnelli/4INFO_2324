public class Main {
    public static void main(String[] args) {
        String stringa1 = "Pippo";
        String stringa2 = "Caio";
        
        System.out.println(contieneVocaleMaiuscola(stringa1)); 
        System.out.println(contieneVocaleMaiuscola(stringa2)); 
    }

    public static boolean contieneVocaleMaiuscola(String s) {
        String vocaliMaiuscole = "AEIOU";

        for (int i = 0; i < s.length(); i++) {
            char carattere = s.charAt(i);
            if (vocaliMaiuscole.indexOf(carattere) != -1) {
                return true;
            }
        }

        return false;
    }
}
