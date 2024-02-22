import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Operands {
    public static final String SUM = "+";
    public static final String SUB = "-";
    public static final String MUL = "*";
    public static final String DIV = "/";
    public static final String PRI1OP = "(";
    public static final String PRI1CL = ")";
    public static final String PRI2OP = "[";
    public static final String PRI2CL = "]";
    public static final String PRI3OP = "{";
    public static final String PRI3CL = "}";

    public static ArrayList<String> allowedOperands() {
        Field[] fields = Operands.class.getDeclaredFields();
            return Arrays.stream(fields).map(field -> {
                try{
                    return String.valueOf(field.get(fields));
                } catch(IllegalAccessException e) {
                    return null;
                }}).collect(Collectors.toCollection(ArrayList::new));
    }
}
