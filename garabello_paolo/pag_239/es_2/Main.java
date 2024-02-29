import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FileReader leggi;
        try{
            leggi = new FileReader("file.txt");
        } catch(FileNotFoundException e){
            System.out.println("il file non esite");
            System.exit(1);
        }
        Scanner in = new Scanner(leggi);
        int num = Integer.parseInt(args[0]);
        int count = 0;

        while (in.hasNextInt()) {
            if(in.nextInt() == num)
                count++;
        }

        System.out.println("Il numero " + num + " occorre " + count + " volte");

        in.close();
        try{
            leggi.close();
        } catch(IOException e){
            System.exit(1);
        }
    }
}