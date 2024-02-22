import java.util.*;

public class Calcolatrice extends Stack{

    private boolean compareToCharacter(char carattere) {
        return (!Character.isDigit(carattere) && compareToSymbolOpen(carattere));
    } 

    private boolean compareToSymbolOpen(char carattere) {
        return ((carattere != '(') && (carattere != '[')) && isSpace(carattere);
    }

    private boolean compareToSymbolClose(char carattere) {
        return ((carattere != ')') && (carattere != ']')) && isSpace(carattere);
    }

    private boolean isSpace(char carattere) {
        return carattere == ' ';
    }

    private char removeParenthesis() {
        Iterator it = super.iterator();
        char segno = '0';
        char carattere;

        while(it.hasNext()) {
            carattere = (char)it.next();
            if((carattere == '(') || (carattere == '[')) {
                segno = (char)super.pop();
                super.pop();
            };
        }

        return segno;
    }

    public String toNotazionePolaccaInversa(String str) {
        String strPolacca = "";
        for(int index = 0; index < str.length(); index++) {
            System.out.println(super.toString());
            if(compareToCharacter(str.charAt(index))) { // controllo che sia un carattere
                super.push(str.charAt(index));
            } else if(compareToSymbolClose(str.charAt(index))){ // controllo che sia una parantesi chiusa
                strPolacca += removeParenthesis() + " ";
                System.out.println(strPolacca); 
            } else {
                strPolacca += str.charAt((index)) + " ";
                System.out.println(strPolacca);
            }
        }

        return strPolacca;
    }
}
