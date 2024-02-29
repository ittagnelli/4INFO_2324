import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    
    public static final int parole = 3;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();  
        
        for(int i = 0; i < parole; i++){
            System.out.print("inserire una parola:");
            list.add(in.nextLine());
        }

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        in.close();
    }       
}