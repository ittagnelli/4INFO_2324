import java.util.Stack;

public class NotazioneInversa {

    public static String convertiInRPN(String espressione) {
        Stack<Character> stack = new Stack<>();
        StringBuilder rpn = new StringBuilder();

        for (char carattere : espressione.toCharArray()) {
            if (Character.isDigit(carattere)) {
                rpn.append(carattere);
                rpn.append(' ');
            } else if (carattere == '(') {
                stack.push(carattere);
            } else if (carattere == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    rpn.append(stack.pop());
                    rpn.append(' ');
                }
                stack.pop();
            } else if (carattere == '+' || carattere == '-' || carattere == '*' || carattere == '/') {
                while (!stack.isEmpty() && precedence(carattere, stack.peek())) {
                    rpn.append(stack.pop());
                    rpn.append(' ');
                }
                stack.push(carattere);
            }
        }

        while (!stack.isEmpty()) {
            rpn.append(stack.pop());
            rpn.append(' ');
        }

        return rpn.toString().trim();
    }

    private static boolean precedence(char op1, char op2) {
        if (op2 == '(' || op2 == ')') return false;
        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-')) return true;
        return false;
    }

    public static double calcolaRPN(String espressione) {
        Stack<Double> stack = new Stack<>();

        for (String token : espressione.split("\\s")) {
            if (token.matches("-?\\d+(\\.\\d+)?")) {
                stack.push(Double.parseDouble(token));
            } else {
                double operand2 = stack.pop();
                double operand1 = stack.pop();
                double risultato = eseguiOperazione(token.charAt(0), operand1, operand2);
                stack.push(risultato);
            }
        }

        return stack.pop();
    }

    private static double eseguiOperazione(char operatore, double operand1, double operand2) {
        switch (operatore) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            case '/':
                if (operand2 == 0) {
                    throw new ArithmeticException("Divisione per zero");
                }
                return operand1 / operand2;
            default:
                throw new IllegalArgumentException("Operatore non supportato: " + operatore);
        }
    }
}
