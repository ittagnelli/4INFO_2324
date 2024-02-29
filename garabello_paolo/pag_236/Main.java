import java.io.IOException;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        System.out.print("inserire il nome del file: ");
        String name = in.nextLine();
        Write write = new Write(name);
        Read read = new Read(name); 
        byte bDati[] = {'6', '6', '7', '8', '5'};

        for(int i = 0; i < bDati.length; i++)
            write.write(bDati[i]);
        read.read2();    

        write.close();
        read.close();
        in.close();
   }
}

