import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {        
        DataOutputStream outF = new DataOutputStream(new FileOutputStream("primitivi.dat"));

        outF.writeBoolean(false);
        outF.writeDouble(16.69);
        outF.writeChar('X');
        outF.writeLong(255);
        outF.close();

        
        DataInputStream inF = new DataInputStream(new FileInputStream("primitivi.dat"));

        System.out.println("Boolean: " + inF.readBoolean());
        System.out.println("Double: " + inF.readDouble());
        System.out.println("Char: " + inF.readChar());
        System.out.println("Long: " + inF.readLong());

        inF.close();

    }
}