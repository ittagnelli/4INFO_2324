import java.io.*;

public class FileGenerator {
    private DataOutputStream file;

    private static int MAXNUMS = 200;
    private static int MINNUMS = 100;
    private static int MAX = 20;
    private static int MIN = 0;

    FileGenerator() throws FileNotFoundException{
        file = new DataOutputStream(new FileOutputStream("numeri.dat"));
    }

    public void generate() throws IOException{
        int num = (int)Math.floor(Math.random() * (MAXNUMS - MINNUMS + 1) + MINNUMS);
        System.out.println("numero di interi generati = " + num);
        for(int i = 0; i < num; i++){
            file.writeInt((int)Math.floor(Math.random() * (MAX - MIN + 1) + MIN));
    }
    }
}