public class Main {
    public static void main(String[] args) {
        String stringa1 = "Pippo";
        String stringa2 = "Caio";
        
        System.out.println(contieneTreConsonantiConsecutive(stringa1)); 
        System.out.println(contieneTreConsonantiConsecutive(stringa2)); 
    }

    public static boolean contieneTreConsonantiConsecutive(String s) {
        String consonanti = "BCDFGHJKLMNPQRSTVWXYZ";

        for (int i = 0; i < s.length() - 2; i++) {
            boolean consecutivo = true;
            for (int j = 0; j < 3; j++) {
                if (consonanti.indexOf(Character.toUpperCase(s.charAt(i + j))) == -1) {
                    consecutivo = false;
                    break;
                }
            }
            if (consecutivo) {
                return true;
            }
        }

        return false;
    }
}
