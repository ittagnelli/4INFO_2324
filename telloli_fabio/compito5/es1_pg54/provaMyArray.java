package es1_pg54;
import java.util.Scanner;

public class provaMyArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {5,4,3,2,1};

        MyArray myArray = new MyArray();

        System.out.println("\ninserisci il numero da cercare: ");
        int ncerca = scanner.nextInt();

        boolean win = myArray.cerca(array, ncerca);

        if(win) {
            System.out.println("\nil numero cercato è stato trovato");
        } else {
            System.out.println("\nil numero cercato non è stato trovato");
        }

        myArray.single(array);
        System.out.print(myArray.stampa(array));
        scanner.close();
    }
}
