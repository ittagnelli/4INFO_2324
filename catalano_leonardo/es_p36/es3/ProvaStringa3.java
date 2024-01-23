public class ProvaStringa3 {
    public static void main(String[] args) {
        String stringa = "ccc";

        boolean contieneTreConsonantiConsecutive = Stringa3.contieneTreConsonantiConsecutive(stringa);

        if (contieneTreConsonantiConsecutive) {
            System.out.println("la stringa ha almeno tre consonanti consecutive");
        } else {
            System.out.println("la stringa non ha almeno tre consonanti consecutive");
        }
    }
}
