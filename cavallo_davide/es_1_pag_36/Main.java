public class Main {
    public static void main(String[] args) {
        String string1 = "ciao";
        String string2 = "ciap";
        
        int risultato = confrontaStringhe(string1, string2);
        
        if (risultato == 0) {
            System.out.println("Le stringhe sono identiche.");
        } else {
            System.out.println("Le stringhe differiscono per " + risultato + " caratteri.");
        }
    }

    public static int confrontaStringhe(String s1, String s2) {
        int lunghezzaMinima = Math.min(s1.length(), s2.length());
        int caratteriUgualiConsecutivi = 0;

        for (int i = 0; i < lunghezzaMinima; i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                caratteriUgualiConsecutivi++;
            } else {
                break;
            }
        }

        if (caratteriUgualiConsecutivi == Math.min(s1.length(), s2.length())) {
            return 0; 
        } else {
            return caratteriUgualiConsecutivi;
        }
    }
}
