import java.io.*;

public class CreaMatrice {
    public static void main(String[] args) throws IOException{
        DataOutputStream outF;
        DataInputStream inF;
        FileOutputStream f = null;
        outF = new DataOutputStream(new FileOutputStream("matrice.dat"));
        inF = new DataInputStream(new FileInputStream("matrice.dat"));

        outF.writeInt(10);
        outF.writeInt(9);
        outF.writeInt(8);
        outF.writeChars(" ");
        outF.writeInt(7);
        outF.writeInt(6);
        outF.writeInt(5);
        outF.writeChars(" ");
        outF.writeInt(4);
        outF.writeInt(3);
        outF.writeInt(2);
        outF.writeChars(" ");

        for(int i = 0; i < 3; i++){
            System.out.println(inF.readInt());
            System.out.println(inF.readInt());
            System.out.println(inF.readInt());
            System.out.println(inF.readChar());
        }

        inF.close();
        outF.close();
    }
    
}