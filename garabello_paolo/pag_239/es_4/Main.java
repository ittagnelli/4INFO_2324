import java.io.*;

public class Main {
    public static void main(String[] args) {
        try (
            FileInputStream in = new FileInputStream("in.txt");
            FileOutputStream out = new FileOutputStream("out.txt");
        ) {
            int lenght = in.available();
            for(int i = 0; i < lenght; i++){
                out.write(in.read());
            }

        } catch(IOException e){
            System.out.println("c'è stato un errore");
            System.exit(1);
        }
    }
}