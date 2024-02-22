import java.util.Stack;

public class Rotaluklak {

    public static double calc(String polskiExpression) {
        String[] str = polskiExpression.split(" ");
        Stack<String> stack = new Stack<String>();
        for(int i = 0; i < str.length; i++){
            if("+-/*".contains(str[i])){
                Double num1 = Double.valueOf(stack.pop());
                Double num2 = Double.valueOf(stack.pop());
                switch (str[i]) {
                    case "+":
                        stack.push(Double.toString(num1 + num2));
                        break;
                    case "-":
                        stack.push(Double.toString(num2 - num1));
                        break;
                    case "*":
                        stack.push(Double.toString(num1 * num2));
                        break;
                    case "/":
                        stack.push(Double.toString(num2 / num1));
                        break;
                }
            } else {
                stack.push(str[i]);
            }
        }
        return Double.valueOf(stack.pop());
    }

    public static double calc(Expression expression) {
        return calc(expression.toPolski());
    }
}