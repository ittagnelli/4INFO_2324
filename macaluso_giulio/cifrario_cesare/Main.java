public class Main {
    public static void main(String[] args) {
        encode cs = new encode();
        String msg_encode = cs.codifica("ciao");
        System.out.println(msg_encode);
        String msg_decode = cs.decode(msg_encode);
        System.out.println(msg_decode);
    }
    
}
