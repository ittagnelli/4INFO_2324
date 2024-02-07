import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        FileReader leggi;
        FileWriter scrivi;
        try{
            scrivi = new FileWriter("nomi2.txt");
        } catch(FileNotFoundException e){
            System.out.println("il file nomi.txt non esiste");
            System.exit(1);
        } catch(IOException e) {
            System.exit(1);
        }
        Scanner in = new Scanner(leggi);

        while (in.hasNextLine()) {
            try{
                scrivi.write(in.nextLine().toUpperCase() + "\n");
            } catch(IOException e){
                System.out.println("qualcosa è andato storto");
            }
        }
        in.close();
        try{
            leggi.close();
            scrivi.close();
        } catch(IOException e){
            System.exit(1);
        }
    }
}