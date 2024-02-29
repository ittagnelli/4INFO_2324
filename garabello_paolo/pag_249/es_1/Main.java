import java.io.*;

public class Main {

    private static void printMatrix(int[][] mat){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++)
                System.out.print(mat[i][j] + " ");
            System.out.println();
        }
    }
    public static void main(String[] args) throws FileNotFoundException, IOException {
        DataInputStream data = new DataInputStream(new FileInputStream("matrice.dat"));
        int[][] mat = new int[3][3];
        int[][] trasposta = new int[3][3];
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++)
                mat[i][j] = data.readInt();
            data.readChar();
        }

        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 3; j++)
                trasposta[j][i] = mat[i][j];

        System.out.println("normale");
        printMatrix(mat);
        System.out.println("trasposta");
        printMatrix(trasposta);

        data.close();
    }
}