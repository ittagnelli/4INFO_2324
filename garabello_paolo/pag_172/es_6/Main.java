import java.util.*;

public class Main {

    public static ArrayList<Integer> riempi(){
        Random rand = new Random();
        ArrayList<Integer> list = new ArrayList<Integer>();
        int num;
        do{
            num = rand.nextInt(20)+20;
                list.add(num);
        }while(num % 5 != 0);

        return list;
    }

    public static Boolean analyze(ArrayList<Integer> list){
        int len = list.size();
        int even = Arrays.stream(list.toArray(new Integer[1])).filter(x -> (x%2) == 0).toArray().length;
        return even == (len - even);  
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = riempi();
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(analyze(list));
    }
    
}