import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        DataOutputStream outF;
        DataInputStream inF;
        FileOutputStream f = null;
        f = new FileOutputStream("primitivi.dat");
        outF = new DataOutputStream(f);
        inF = new DataInputStream(new FileInputStream("primitivi.dat"));

        outF.writeBoolean(false);
        outF.writeDouble(16.69);
        outF.writeChar('c');
        outF.writeLong(255);

        System.out.println("Valore boolean " + inF.readBoolean());
        System.out.println("Valore double " + inF.readDouble());
        System.out.println("Valore character " + inF.readChar());
        System.out.println("Valore long " + inF.readLong());


        f.close();
        inF.close();
        outF.close();
    }
    
}