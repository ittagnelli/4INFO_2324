import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> ls = new ArrayList<String>();
        ls.add("natura");
        ls.add("phil");
        ls.add("albero");
        ls.add("zona");
        ls.add("uccello");

        System.out.println(ls);
        Collections.sort(ls);
        System.out.println(ls);

    }
}
