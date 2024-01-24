import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static ArrayList<Integer> inserisci(){

        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        int num;
        do{
            System.out.print("inserire un numero, 0 per uscire:");
            if((num = in.nextInt()) != 0)
                list.add(num);
        }while(num != 0);

        in.close();

        return list;
    }

    public static Boolean analyze(ArrayList<Integer> list){

        if(list.size() < 2)
            return false;

        Object[] array = list.toArray();

        while (array.length > 0) {
            int len = array.length;
            Object value = array[0];
            array = Arrays.stream(array).filter(x -> x != value).toArray();
            if(array.length > len - 2)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {

        ArrayList<Integer> list = inserisci();
       
        System.out.println(list);
        System.out.println(analyze(list));

    }    
}