import java.util.Scanner;
import java.util.Stack;

public class Espressioni extends Stack {
    private Scanner scanner;
    private Stack stack;
    String stringa2;

    Espressioni() {
        scanner = new Scanner(System.in); 
        stack = new Stack();
        stringa2 = "";
    }
    
    private String inserisciStringa(String stringa) {
        return stringa = scanner.nextLine();
    }

    private void dividiStringa(String stringa) {
        for (int i = 0; i < stringa.length; i++) {
            if (Character.isDigit(stringa.charAt(i))) {
                stringa2 += stringa.charAt(i);            
            } else {
                stack.push(stringa.charAt(i));
            }
            
        }
    }

    private void stampaStringa() {
        System.out.println(stringa2);
        for (int i = 0; i < stack.length; i++) {
            if (stack.pop(i) == "+" || stack.pop(i) == "-" || stack.pop(i) == "*" || stack.pop(i) == "/") {
                return stack.pop(i);
            }
        }
    }




}
