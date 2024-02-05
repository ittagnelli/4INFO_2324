public class Lista {
    
    private Nodo testa;
    
    Lista(){
        testa = null;
    }
    Lista(int value){
       testa = new Nodo(value);
    }

    public void addCoda(int value){
        if(testa != null){    
            Nodo node = testa;
            while(node.getNext() != null) {
                node = node.getNext();
            }
            node.setNext(new Nodo(value));
        } else {
            testa = new Nodo(value);
        }
    }

    public void addTesta(int value){
        testa = new Nodo(value, testa);
    }

    public void addAtIndex(int index, int value){
        int i = 0;
        Nodo node = testa;
        do{
            if((i) == (index-1)){
                if(index != 0)    
                    node.setNext(new Nodo(value, node.getNext())); 
                else{
                    testa = new Nodo(value, node.getNext()); 
                }
            }
            node = node.getNext();
            i++;
        }while(node.getNext() != null); 
    }

    public void removeAtIndex(int index){
        int i = 0;
        Nodo node = testa;
        if(index == 0){
            if(testa.getNext() == null)
                testa = null;
            else 
                testa = testa.getNext();
            return;
        }
        do{
            if((i) == (index-1)){
                node.setNext(node.getNext().getNext()); 
                }
            node = node.getNext();
            i++;
        }while(node != null && node.getNext() != null); 
    }

    public Nodo getTesta() {
        return testa;
    }

    public void removeEven(){
        int i = 0;
        Nodo node = testa;
        do{
            Nodo t = node.getNext();
            if((node.getValue() % 2) == 0){
                removeAtIndex(i);
                i--;
            }
            node = t;
            i++;
        }while(node != null);
                
    }

    @Override
    public String toString(){
        Nodo node = testa;
        String str = "[" + node.toString();
        while(node.getNext() != null) {
            node = node.getNext();
            str += " " + node;
        }

        str += "]";

        return str;
    }
}
