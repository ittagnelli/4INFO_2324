import java.util.Stack;

public class Calcolatrice {
    
    private static boolean isOperatore(char carattere) {
        return carattere == '+' || carattere == '-' || carattere == '*' || carattere == '/';
    }

    private static int precedenza(char operatore) {
        switch (operatore) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return -1;
        }
    }

    public static String convertiInfix(String espressioneInfix) {
        StringBuilder risultato = new StringBuilder();
        Stack<Character> stackOperatori = new Stack<>();

        while (!stackOperatori.isEmpty()) {
        }

        return risultato.toString();
    }
}
