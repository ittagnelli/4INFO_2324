import java.util.Scanner;

public class Compositori {
    private Scanner in = new Scanner(System.in);

    public String creaTraccia(){
        System.out.println("inserire la traccia:");
        return in.nextLine();
    }

    public String creaTesto(){
        System.out.println("inserire il testo:");
        return in.nextLine();
    }

    public void close(){
        in.close();
    }
}
