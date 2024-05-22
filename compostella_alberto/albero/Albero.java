
public class Albero {
    private Nodo root = null;

    public void heapToTree(int[] array){
        root = heapToTreeRecorsive(array, 0, array.length);     
        
    }

    public Nodo heapToTreeRecorsive(int[] array, int start, int len){
        if(start <= len) {
            return null;
        }
            Nodo nodo = new Nodo(array[0]);
            
                root.sx = heapToTreeRecorsive(array, 2 * start + 1, len);
                root.dx = heapToTreeRecorsive(array, 2 * start + 2, len);

                return nodo;
            
        
    }

    public void add(int dato){
        root = addTreeRecorsive(dato,root);
    }

    public Nodo addTreeRecorsive(int dato, Nodo nodo){
        if(nodo == null){
            return new Nodo(dato);
        }else if(dato < nodo.dato){
            nodo.sx = addTreeRecorsive(dato, nodo.sx);
        }else if(dato > nodo.dato){
            nodo.dx = addTreeRecorsive(dato, nodo.dx);
        }
            return nodo;
        
        
    }

    public boolean Search(int dato){
        return SearchTreeRecorsive(dato, root);
    }
    
    private boolean SearchTreeRecorsive(int dato, Nodo nodo){
        if(nodo != null){
            if(dato < nodo.dato){
                return SearchTreeRecorsive(dato, nodo.sx);
            }else if(dato > nodo.dato){
                return SearchTreeRecorsive(dato, nodo.dx);
            } else return true;
            }
            return false;
        
        
    }
    


}
