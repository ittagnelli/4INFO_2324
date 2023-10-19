package compito4;

public class es3 {
    public boolean controllaConso(String n1) {
        int lung = n1.length();
        
        for(int i = 0; i < lung; i++) {
            if (n1.charAt(i) != 'a' && n1.charAt(i) != 'e' && n1.charAt(i) != 'i' && n1.charAt(i) != 'o' && n1.charAt(i) != 'u') {
                i++;
            } else if(n1.charAt(i) != 'a' && n1.charAt(i) != 'e' && n1.charAt(i) != 'i' && n1.charAt(i) != 'o' && n1.charAt(i) != 'u') {
                i++;
            } else if(n1.charAt(i) != 'a' && n1.charAt(i) != 'e' && n1.charAt(i) != 'i' && n1.charAt(i) != 'o' && n1.charAt(i) != 'u') {
                i++;
            } else {
                System.out.println("\nnessun carattere è uguale");
                return false;
            }
        }

        return true;
    }
}
