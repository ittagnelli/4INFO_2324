import java.util.*;

public class Cesare {
    private final int KEY = 5;
    private ArrayList<Character> alfabeto;
    private final int A_min = 97;
    private final int Z_min = 122;
    private final int SPAZIO = 32;

    Cesare() {
        alfabeto = new ArrayList<Character>(1);
        inizializzazione();
    }

    private void inizializzazione() {
        for (int index = A_min; index <= Z_min; index++) {
            alfabeto.add((char)index);
        }
    }

    private void shiftAlfabeto(ArrayList<Character> ls, int num_posizioni) {
        Collections.rotate(ls, num_posizioni);
    }

    public String encode(String msg_enter) {
        ArrayList<Character> alfabetoShiftato = new ArrayList<Character>(alfabeto);
        shiftAlfabeto(alfabetoShiftato, -KEY +1);
        String msg = "";
        int index_char;

        for (int i = 0; i < msg_enter.length(); i++) {
            index_char = msg_enter.charAt(i);
            if(index_char != SPAZIO) msg += alfabetoShiftato.get(index_char - A_min);
            else msg += " ";
        }

        return msg;

    }

    public String decode(String msg_enter) {
        ArrayList<Character> alfabetoShiftato = new ArrayList<Character>(alfabeto);
        shiftAlfabeto(alfabetoShiftato, -KEY +1);
        String msg = "";
        int index_char;

        for (int i = 0; i < msg_enter.length(); i++) {
            index_char = msg_enter.charAt(i);
            if(index_char != SPAZIO) {
                index_char = alfabetoShiftato.indexOf((char)index_char);
                msg += alfabeto.get(index_char);
            } else msg += " ";

        }

        return msg;

    }
}
