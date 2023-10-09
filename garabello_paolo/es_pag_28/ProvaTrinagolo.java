import java.util.Scanner;

public class ProvaTrinagolo {
    public static void main(String[] atgs){

        Scanner in = new Scanner(System.in);

        System.out.println("inserire il lato a");
        int a = in.nextInt();
        System.out.println("inserire il lato b");
        int b = in.nextInt();
        System.out.println("inserire il lato c");
        int c = in.nextInt();

        in.close();

        Triangolo triangolo = new Triangolo(a, b, c);

        System.out.println(triangolo);
    }    
}
