public class Main {
    public static void main(String[] args) {
        Queue<String> coda = new Queue<String>();

        coda.enqueue("Giacommo");

        coda.enqueue("Giovanna");

        coda.dequeue();

        coda.enqueue("Karen");

        System.out.println("Karen dice: 'Posso passare io?'");
        System.out.println("Giovanna dice di no");

        System.out.println(coda);

        coda.dequeue();

        System.out.println("Le poste chiudono");
        coda.clear();

        System.out.println(coda);
    }
}