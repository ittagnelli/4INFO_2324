import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();
        Scanner in = new Scanner(System.in);
        int num;
        do{
            System.out.print("inserire un numero: ");
            num = in.nextInt();
            if(num != 0)
                lista.addCoda(num);
        }while(num != 0);
        System.out.println(lista);

        System.out.print("inseire il numero di cui rimuovere i multipli: ");
        lista.removeMultiple(in.nextInt());
        System.out.println(lista);     

        in.close();
    }
}