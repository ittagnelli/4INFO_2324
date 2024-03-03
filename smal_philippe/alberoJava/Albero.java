import java.util.LinkedList;

public class Albero {
    private Nodo root;

    public void add(int value) {
        root = addRecorsive(value, root);
    }

    private Nodo addRecorsive(int value, Nodo nodino) {
        if(nodino == null) return new Nodo(value);
        if(nodino.value > value) nodino.dx  = addRecorsive(value, nodino.dx);
        if(nodino.value < value) nodino.sx =  addRecorsive(value, nodino.sx);
        return nodino;
    }

    private boolean isNull(Nodo nodino) {
        return nodino != null;
    }

    public String visualizzaBFS() {
        LinkedList<Nodo> ls = new LinkedList<Nodo>();
        String msg = "";
        ls.add(root);

        while (!ls.isEmpty()) {
            Nodo nodino = ls.removeFirst();
            msg += nodino.value + " - ";
            if(isNull(nodino.dx)) ls.add(nodino.dx);
            if(isNull(nodino.sx)) ls.add(nodino.sx);
        }

        return msg;
    }
}
