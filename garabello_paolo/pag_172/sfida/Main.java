import java.util.*;

public class Main {

    public static ArrayList<Integer> frequenza(ArrayList<Integer> List){
        ArrayList<Integer> frequenza = new ArrayList<Integer>();
        ArrayList<Integer> list = new ArrayList<Integer>(List);

        while (list.size() > 0) {
            frequenza.add(Collections.frequency(list, list.get(0)));
            list.removeIf(x -> x == list.get(0));  
        }
        return frequenza;
    }

    public static ArrayList<Integer> eliminaDuplicati(ArrayList<Integer> list){
        Set<Integer> set = new HashSet<Integer>();
        set.addAll(Arrays.asList(list.toArray(new Integer[0])));
        list = new ArrayList<Integer>();
        list.addAll(set);
        return list;
    }
    
    public static ArrayList<Integer> seleziona(ArrayList<Integer> List, int num){
        ArrayList<Integer> list = new ArrayList<Integer>(List);
        list.removeIf(x -> x < num);
        return list;
    }

    public static Boolean isOrdered(ArrayList<Integer> list){
        ArrayList<Integer> orderedList = new ArrayList<Integer>(list);
        Collections.sort(orderedList);
        return orderedList.equals(list);
    }

    public static ArrayList<Integer> sostituisci(ArrayList<Integer> List, int num1, int num2){
        ArrayList<Integer> list = new ArrayList<Integer>(List);
        Collections.replaceAll(list, num1, num2);
        return list;
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 3, 4, 5, 6, 2, 3 ,5, 7, 8, 4 ,2));
        System.out.println(frequenza(list));
        System.out.println(eliminaDuplicati(list));
        System.out.println(sostituisci(list, 2, 22));
        System.out.println(seleziona(list, 5));
        System.out.println(isOrdered(list));
        Collections.sort(list);
        System.out.println(isOrdered(list));
    }
}