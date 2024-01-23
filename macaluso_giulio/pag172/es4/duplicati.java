import java.util.ArrayList;

public class duplicati{
    private ArrayList<Integer> array;

    duplicati(ArrayList<Integer> a) {
        array = a;
    }
    
    public boolean cerca() {
        int occorrenze = 0;

        for(int i = 0; i < array.size(); i++) {
            for(int j = 0; j < array.size(); j++) {
                if(array.get(i) == array.get(j)) {
                    occorrenze++;
                }
            }
            if(occorrenze >= 2) {
                occorrenze = 0;
            } else {
                return false;
            }
        }
        return true;
    }
}
