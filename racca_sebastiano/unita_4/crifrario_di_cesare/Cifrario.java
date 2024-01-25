import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Cifrario {
    private int key;

    private ArrayList<Character> alphabet = new ArrayList<Character>();

    Cifrario(int key) {
        this.key = key;
        this.fillAlphabet();
    }

    private void fillAlphabet() {
        for(int i = (int) 'A'; i <= (int) 'Z'; i++) {
            this.alphabet.add(Character.valueOf((char) i));
            this.alphabet.add(Character.valueOf((char) (i + (int) 'a' - (int) 'A')));
        }

        Collections.sort(this.alphabet);
    }

    private String code(String str, ArrayList<Character> shifedCharacters) {
        Iterator<String> caratteri = new ArrayList<String>(Arrays.asList(str.split(""))).iterator();
        StringBuilder res = new StringBuilder();

        while (caratteri.hasNext()) {
            res.append(shifedCharacters.get(this.alphabet.indexOf(caratteri.next().charAt(0))));
        }
        
        return res.toString();
    }

    public String decode(String str) {
        ArrayList<Character> shiftedAlphabet = new ArrayList<Character>(this.alphabet);
        Collections.rotate(shiftedAlphabet, key);

        return this.code(str, shiftedAlphabet);
    }

    public String encode(String str) {
        ArrayList<Character> shiftedAlphabet = new ArrayList<Character>(this.alphabet);
        Collections.rotate(shiftedAlphabet, -key);

        return this.code(str, shiftedAlphabet);
    }
}
