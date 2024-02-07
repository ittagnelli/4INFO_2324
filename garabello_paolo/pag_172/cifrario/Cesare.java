import java.util.*;

public class Cesare {

    private ArrayList<Character> alphabet, newAlphabet;
    Iterator<String> i;

    Cesare(int key, String parola){
        alphabet = fillAlphabet();
        newAlphabet = new ArrayList<Character>(alphabet);
        Collections.rotate(alphabet, key);
        setParola(parola);
    }
    
    private static ArrayList<Character> fillAlphabet(){
        ArrayList<Character> alphabet = new ArrayList<Character>();

        for(int i = (int)'A'; i <= (int)'Z'; i++){
            alphabet.add((char)i);
        }

        for(int i = (int)'a'; i <= (int)'z'; i++){
            alphabet.add((char)i);
        }

        return alphabet;
    }

    private String cifratura(ArrayList<Character> alph, ArrayList<Character> newAlph){
        String word = "";
        while(i.hasNext()){
            word += alph.get(newAlph.indexOf(i.next().charAt(0)))   ;
        }
        return word;
    }

    public String cifra(){
        return cifratura(newAlphabet, alphabet);
    }

    public String deCifra(){
        return cifratura(alphabet, newAlphabet);
    }

    public void setParola(String parola) {
        this.i = new ArrayList<String>(Arrays.asList(parola.split(""))).iterator();
    }
}
