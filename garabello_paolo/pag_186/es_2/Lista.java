public class Lista<T> {
    
    private Nodo<T> testa;
    private int ind = 0;
    
    Lista(){
        testa = null;
    }
    Lista(T value){
       testa = new Nodo<T>(value);
    }

    public Nodo<T> getCurrent(){
        Nodo<T> node = testa;
        for(int i = 0; i < ind; i++)
            node = node.getNext();
        return node;
    }

    public void next(){
        ind++;
    }

    public void previous(){
        ind--;
    }

    public void removeCurrent(){
        this.removeAtIndex(ind);
        ind--;
    }

    public Boolean isEmpty(){
        return testa == null;
    }

    public void addCoda(T value){
        if(testa != null){    
            Nodo<T> node = testa;
            while(node.getNext() != null) {
                node = node.getNext();
            }
            node.setNext(new Nodo<T>(value));
        } else {
            testa = new Nodo<T>(value);
        }
    }

    public void addTesta(T value){
        testa = new Nodo<T>(value, testa);
    }

    public void addAtIndex(int index, T value){
        int i = 0;
        Nodo<T> node = testa;
        do{
            if((i) == (index-1)){
                if(index != 0)    
                    node.setNext(new Nodo<T>(value, node.getNext())); 
                else{
                    testa = new Nodo<T>(value, node.getNext()); 
                }
            }
            node = node.getNext();
            i++;
        }while(node.getNext() != null); 
    }

    public void removeAtIndex(int index){
        int i = 0;
        Nodo<T> node = testa;
        do{
            if((i) == (index-1)){
                if(index != 0)    
                    node.setNext(node.getNext().getNext()); 
                else{
                    testa = new Nodo<T>(); 
                }
            }
            node = node.getNext();
            i++;
        }while(node.getNext() != null); 
    }

    public void togliTesta() {
        if(this.isEmpty())
            return;
        testa = testa.getNext();
    }

    public void togliCoda() {
        if(testa != null){    
            Nodo<T> node = testa;
            while(node.getNext().getNext() != null) {
                node = node.getNext();
            }
            node.setNext(null);
        }
    }

    public Nodo<T> getTesta() {
        return testa;
    }

    public void seeAll(){
        System.out.println(this);
    }

    @Override
    public String toString(){
        Nodo<T> node = testa;
        String str = "[" + node.toString();
        while(node.getNext() != null) {
            node = node.getNext();
            str += " " + node;
        }

        str += "]";

        return str;
    }
}
