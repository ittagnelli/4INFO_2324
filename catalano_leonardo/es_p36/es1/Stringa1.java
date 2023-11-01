public class Stringa1 {
    public int confrontaStringhe(String s1, String s2) {
        int lunghezzaMinima = Math.min(s1.length(), s2.length());

        for (int x = 0; x < lunghezzaMinima; x++) {
            if (s1.charAt(x) != s2.charAt(x)) {
                return x;
            }
        }
        return s1.length() == s2.length() ? 0 : lunghezzaMinima;
    }
}
