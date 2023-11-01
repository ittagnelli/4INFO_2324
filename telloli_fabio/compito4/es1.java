package compito4;

public class es1 {
    private int contatore;

    public es1() {
        contatore = 0;
    }

    public boolean stringheUguali(String n1, String n2) {
        return n1.equals(n2);
    }
    
    public int caratteriConsecutivi(String n1, String n2) {
        int lung1 = n1.length();
        int lung2 = n2.length();

        for(int i = 0; i < lung1 && i < lung2; i++) {
            if (n1.charAt(i) == n2.charAt(i)) {
                contatore++;
            } else {
                System.out.println("\nnessun carattere è uguale");
            }
        }

        return contatore;
    }
}
