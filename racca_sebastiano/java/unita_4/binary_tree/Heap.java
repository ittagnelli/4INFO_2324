import java.util.ArrayList;
import java.util.List;

public class Heap<T extends Comparable<T>> extends ArrayList<T> {
    Heap() { }
    
    Heap(List<T> list) {
        super(list);
    }
}
