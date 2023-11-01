package compito4;

public class es2 {
    public boolean controlloVocale(String n1) {
        for(int i = 0; i < n1.length(); i++) {
            
            if(n1.charAt(i) == 'A' || n1.charAt(i) == 'E' || n1.charAt(i) == 'I' || n1.charAt(i) == 'O' || n1.charAt(i) == 'U') {
                return true;
            }
        }
        return false;
    }
}
