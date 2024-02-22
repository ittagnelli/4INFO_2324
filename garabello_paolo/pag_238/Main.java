import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String word = "";
        Scanner in = new Scanner(System.in);
        FileWriter pari = null, dispari = null;

        try {
                pari = new FileWriter("filePari.txt");
                dispari = new FileWriter("FileDispari.txt");
            } catch(IOException e){
                System.exit(1);
            }

        do{
            System.out.print("inserisic una stringa:");
            word = in.nextLine();
            if(word.compareTo("FINE") != 0){
                try{
                    if((word.length() % 2) == 0)
                        pari.write(word + "");
                    else
                        dispari.write(word + "");
                } catch(IOException e){
                    System.out.println("Qualcosa è andato storto");
                }
            }
        }while(word.compareTo("FINE") != 0);

        in.close();
        try{
            pari.close();
            dispari.close();
        } catch(IOException e) {
            System.exit(1);
        }
    }
}