public class MiaSequenza <T>{
    private int num = 3;
    private T[] elementi;

    MiaSequenza(){
        elementi = (T[])new Object[10];
    }

    public void setElenco(int x, T valore){
        elementi[x] = valore;
    }

    public T getElemento(int x){
        return elementi[x];
    }

    public void visualizza(){
        for(T t : elementi){
            System.out.println(t.toString());
        }
    }
    
    public static void main(String[] args) {
        MiaSequenza<Integer> sec = new MiaSequenza<Integer>();
        sec.setElenco(0, 5);
        sec.setElenco(1, 2);
        sec.setElenco(2, 7);
        sec.visualizza();
    }
}