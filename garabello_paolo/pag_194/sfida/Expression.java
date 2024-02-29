import java.util.Stack;
import java.util.ArrayList;

public class Expression {
    private String expression;

    Expression(String expression) {
        this.expression = expression;
    }

    private boolean isNum(String str){
        try { 
            Integer.valueOf(str);
            return true;
        } catch(NumberFormatException e) {
            return false;
        }
    }

    public String toPolski() {

        Stack<String> stack = new Stack<String>();
        ArrayList<String> allowed = Operands.allowedOperands();
        String[] str = expression.split(" ");
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < str.length; i++){
            if(isNum(str[i])){
                result.append(str[i] + " ");
            }

            if(allowed.contains(str[i]))
                switch (str[i]) {
                    case Operands.SUM:  
                    case Operands.SUB:  
                    case Operands.MUL:  
                    case Operands.DIV:
                        stack.push(str[i]);
                        break;
                    case Operands.PRI1OP: 
                    case Operands.PRI2OP:  
                    case Operands.PRI3OP: 
                        stack.push(str[i]);
                        break;
                    case Operands.PRI1CL:  
                        while (!stack.peek().equals(Operands.PRI1OP)) {
                            result.append(stack.pop() + " ");
                        }
                        stack.pop();
                        break;
                    case Operands.PRI2CL: 
                        while (!stack.peek().equals(Operands.PRI2OP)) {
                            result.append(stack.pop() + " ");
                        }
                        stack.pop(); 
                        break;
                    case Operands.PRI3CL:
                        while (!stack.peek().equals(Operands.PRI3OP)) {
                            result.append(stack.pop() + " ");
                        }
                        stack.pop();  
                        break;
                }
           
        }
        while (!stack.empty()) {
            result.append(stack.pop() + " ");    
        }

        return result.toString();
    }

    @Override
    public String toString() {
        return this.expression;
    }
}
