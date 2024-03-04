import java.util.LinkedList;

public class Albero {
    private Nodo root;

    public void add(int value) {
        root = addRecorsive(value, root);
    }

    private Nodo addRecorsive(int value, Nodo nodino) {
        if(nodino == null) return new Nodo(value);
        if(value < nodino.value) nodino.sx = addRecorsive(value, nodino.sx);
        else if(value > nodino.value) nodino.dx = addRecorsive(value, nodino.dx);
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

    public void visualizzaInOrder() {
        visualizzaInOrderRecorsive(root);
    }

    private void visualizzaInOrderRecorsive(Nodo nodino) {
        if(nodino != null) {
            visualizzaInOrderRecorsive(nodino.sx);
            System.out.print(nodino.value + " - ");
            visualizzaInOrderRecorsive(nodino.dx);
        }
        
    }

    public void visualizzaPreOrder() {
        visualizzaPreOrderRecorsive(root);
    }

    private void visualizzaPreOrderRecorsive(Nodo nodino) {
        if(nodino != null) {
            System.out.print(nodino.value + " - ");
            visualizzaPreOrderRecorsive(nodino.sx);
            visualizzaPreOrderRecorsive(nodino.dx);
        }
    }

    public void visualizzaPostOrder() {
        visualizzaPostOrderRecorsive(root);
    }

    private void visualizzaPostOrderRecorsive(Nodo nodino) {
        if(nodino != null) {
            visualizzaPostOrderRecorsive(nodino.sx);
            visualizzaPostOrderRecorsive(nodino.dx);
            System.out.print(nodino.value + " - ");
        }
    }

    public boolean find(int value) {
        return findRecorsive(value, root);
    }

    private boolean findRecorsive(int value, Nodo nodino) {
        if(nodino != null){
            if(value < nodino.value) return findRecorsive(value, nodino.sx);
            else if(value > nodino.value) return findRecorsive(value, nodino.dx);
            else return true;
        }
        return false;
    }
}
