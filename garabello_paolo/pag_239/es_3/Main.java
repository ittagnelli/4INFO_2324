import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner in1 = null, in2 = null;
        FileWriter out = null;
        try{
            System.out.print("inserire il nome del primo file di input: ");
            in1 = new Scanner(new FileReader(in.nextLine()));
            System.out.print("inserire il nome del secondo file di input: ");
            in2 = new Scanner(new FileReader(in.nextLine()));
            System.out.print("inserire il nome del file di output: ");
            out = new FileWriter(in.nextLine());

        } catch(FileNotFoundException e){
            System.out.println("File non trovato");
            System.exit(1);
        } catch(IOException e){
            System.out.println("qualcosa è andato storto");
            System.exit(1);
        }

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        while (in1.hasNext()) {
            arrayList.add(in1.nextInt());
        }

        while (in2.hasNext()) {
            Integer num = in2.nextInt();
            if(!arrayList.contains(num))
                arrayList.add(num);
        }
        Integer[] arr = new Integer[1];
        arr = arrayList.toArray(arr);
        Arrays.sort(arr);

        for(int i = 0; i < arr.length; i++){
            try{
                out.write(Integer.toString(arr[i]) + " ");
            } catch(IOException e){
                System.out.println("c'è stato un errore");
                System.exit(1);
            }
        }

        for(int i = (arr.length-1); i >= (arr.length-21 < 0 ? 0 : arr.length-21); i--)
            System.out.println(arr[i]);
        in.close();
        in1.close();
        in2.close();
        try{
            out.close();
        }catch(IOException e){
            System.exit(1);
        }
    }
}